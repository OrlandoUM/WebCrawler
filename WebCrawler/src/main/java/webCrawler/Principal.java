package webCrawler;

//import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;

public class Principal {
	
	/*public static void main(String[] args) {
		Document doc = null;
		try {
			doc = Jsoup.connect("https://en.wikipedia.org/").get(); //URL
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(doc.title());
		Elements newsHeadlines = doc.select("#mp-itn b a"); //#mp-itn => id da tag 'div' contendo 
															//8 links que estão em negrito na página
															//Link esses que estão dentro da tag 'b' e 'a'
		for (Element headline : newsHeadlines) {
			System.out.println(headline.attr("title")); //Atributo 'title' da tag 'a' dentro de 'b' dentro da div com id #mp-itn
			System.out.println("\t"+headline.absUrl("href")); //Atributo 'href' da tag 'a' dentro de 'b' dentro da div com id #mp-itn
			System.out.println();
		}
	}*/
	
	public static void main(String[] args) {
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
		
		for(int i = 1; i <= 21; i++) {
			Produtor p = new Produtor();
			executor.execute(p);
		}
		for(int i = 1; i <= 21; i++) {
			Consumidor c = new Consumidor();
			executor.execute(c);
		}
		executor.shutdown();
		
		System.out.println("\nFim do Programa");
	}
	
}