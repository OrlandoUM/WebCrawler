package webCrawler;

public class Produtor implements Runnable{
	
	public Produtor() { run(); }
	
	public synchronized void run() {
		
		try {
			
				while(SharedPoint.getCounter() == SharedPoint.getArray().length);
				
				if(SharedPoint.getJ()) wait();
				SharedPoint.setJ(true);
				
				SharedPoint.setArray("Thread" + ProdutorSharedPoint.getIn());
				System.out.println("Produziu Thread" + ProdutorSharedPoint.getIn());
				
				ProdutorSharedPoint.setIn(ProdutorSharedPoint.getIn() + 1) ;
				
				SharedPoint.setCounter(SharedPoint.getCounter() + 1);
				SharedPoint.setJ(false);
				notify();
				
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}