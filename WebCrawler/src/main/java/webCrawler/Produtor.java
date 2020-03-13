package webCrawler;

public class Produtor implements Runnable{
	private String name;
	
	public Produtor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void run() {
		
		System.out.println("Executando: " + this.name);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
