package producers;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import models.Copa;
import models.SharedPoint;
import webCrawler.PropertiesFile;

public class Produtor implements Runnable{
	
	
	public synchronized void run() {
		ArrayList<String> array = new ArrayList<String>();
		Copa c = new Copa();
		Document doc = null;
		Elements newsHeadlines = null;
		
		try {
			
				while(SharedPoint.getCounter() == Integer.parseInt(PropertiesFile.getInstance().getProperty("QTD")));
				
				if(SharedPoint.getJ()) wait();
				SharedPoint.setJ(true);
				
				try {
					doc = Jsoup.connect(PropertiesFile.getInstance().getProperty("Copa" + (ProdutorSharedPoint.getIn()+1))).get(); // URL
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				//------------------------------------------------------------------
				newsHeadlines = doc.select("table.infobox_v2 tbody tr td");
				for (Element headline : newsHeadlines) {
					if (!(headline.text().contentEquals("")))
						array.add(headline.text());
				}
				
				for(int i = 0; i < array.size(); i++) {
					if(array.get(i).contentEquals("Campeão")) {
						c.setCampeao(array.get(i+1).substring(0, array.get(i+1).indexOf(" ")));
						i++;
					}else if(array.get(i).contentEquals("Anfitrião")) {
						c.setSede(array.get(i+1));
						i++;
					}else if(array.get(i).contentEquals("Vice-campeão")) {
						c.setVice(array.get(i+1));
						i++;
					}else if(array.get(i).contentEquals("3.º colocado")) {
						c.setTerceiro(array.get(i+1));
						i++;
					}else if(array.get(i).contentEquals("4.º colocado")) {
						c.setQuarto(array.get(i+1));
						i++;
					}else if(array.get(i).contentEquals("Público")) {
						c.setPublicoTotal(Integer.parseInt(array.get(i+1).replace(" ", "")));
						i++;
					}
				}
				c.setAno(Integer.parseInt(doc.title().substring(22, 26)));

				array.clear();
				//---------------------------------------------------
				
				
				SharedPoint.incrementArray(c);
				ProdutorSharedPoint.setIn((ProdutorSharedPoint.getIn() + 1));
				SharedPoint.setCounter(SharedPoint.getCounter() + 1);
				SharedPoint.setJ(false);
				notifyAll();
			
		} catch (InterruptedException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}