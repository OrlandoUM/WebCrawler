package webCrawler;

public class Consumidor implements Runnable{
	
	public Consumidor () { run(); }
	
	public synchronized void run() {
		
		try {
			
				while(SharedPoint.getCounter() == 0);
				
				if(SharedPoint.getJ()) wait();
				SharedPoint.setJ(true);
				
				System.out.println("Consumiu " + SharedPoint.getArrayFromIndex(ConsumidorSharedPoint.getOut()));
				
				ConsumidorSharedPoint.setOut(ConsumidorSharedPoint.getOut() + 1) ;
				
				SharedPoint.setCounter(SharedPoint.getCounter() - 1);
				SharedPoint.setJ(false);
				notify();
				
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
