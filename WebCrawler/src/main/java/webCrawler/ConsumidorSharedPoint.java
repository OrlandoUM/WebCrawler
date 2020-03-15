package webCrawler;

public class ConsumidorSharedPoint {
	
	private static int out = 0;
	
	private ConsumidorSharedPoint() {}

	public static int getOut() {
		return out;
	}

	public static void setOut(int out) {
		ConsumidorSharedPoint.out = out;
	}
	
}