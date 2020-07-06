package consumers;

import models.SharedPoint;

public class Consumidor implements Runnable{
	
	public synchronized void run() {
		
		try {
			
				while(SharedPoint.getCounter() == 0);
				
				if(SharedPoint.getJ()) wait();
				SharedPoint.setJ(true);
				
				
				//------------------------------------------
				System.out.println("Sede: " + SharedPoint.getArrayFromIndex(ConsumidorSharedPoint.getOut()).getSede());
				System.out.println("Ano: " + SharedPoint.getArrayFromIndex(ConsumidorSharedPoint.getOut()).getAno());
				System.out.println("Campeão: " + SharedPoint.getArrayFromIndex(ConsumidorSharedPoint.getOut()).getCampeao());
				System.out.println("Vice: " + SharedPoint.getArrayFromIndex(ConsumidorSharedPoint.getOut()).getVice());
				System.out.println("Terceiro: " + SharedPoint.getArrayFromIndex(ConsumidorSharedPoint.getOut()).getTerceiro());
				System.out.println("Quarto: " + SharedPoint.getArrayFromIndex(ConsumidorSharedPoint.getOut()).getQuarto());
				System.out.println("Publico Total: " + SharedPoint.getArrayFromIndex(ConsumidorSharedPoint.getOut()).getPublicoTotal());
				System.out.println("______________________________________");
				//------------------------------------------
				
				
				ConsumidorSharedPoint.setOut((ConsumidorSharedPoint.getOut() + 1));
				SharedPoint.setCounter(SharedPoint.getCounter() - 1);
				SharedPoint.setJ(false);
				notifyAll();
				
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}