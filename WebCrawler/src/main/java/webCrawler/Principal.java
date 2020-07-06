package webCrawler;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import org.jsoup.select.Elements;

import consumers.Consumidor;
import producers.Produtor;

public class Principal {

	static Elements newsHeadlines = null;
	
	  public static void main(String[] args) {
	  
		  ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		  
		  for(int i = 1; i <= Integer.parseInt(PropertiesFile.getInstance().getProperty("QTD")); i++) { //21 edições
			  	Produtor p = new Produtor(); 
			  	p.run();
			  	Consumidor c = new Consumidor(); 
			  	c.run();
		  }
		  executor.shutdown();
	  
		  System.out.println("\nFim do Programa");
		  
	  }
	 
}