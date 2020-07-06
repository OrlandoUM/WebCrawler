package producers;

public class ProdutorSharedPoint{
	
	private static int in = 0;
	
	private ProdutorSharedPoint() {}

	public static int getIn() {
		return in;
	}

	public static void setIn(int in) {
		ProdutorSharedPoint.in = in;
	}
	
	
}