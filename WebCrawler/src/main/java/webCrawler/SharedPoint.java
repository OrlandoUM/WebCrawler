package webCrawler;

//import java.util.ArrayList;

public class SharedPoint {
	
	private static boolean j = false;
	private static String[] array = new String [21];
	private static int counter = 0;
	
	private SharedPoint() {}
	
	public static int getCounter() {
		return counter;
	}
	
	public static void setCounter(int i) {
		counter = i;
	}
	
	public static boolean getJ() {
		
		return j;
	}
	
	public static void setJ(boolean b) {
		
		j = b;
	}
	
	public static String[] getArray(){
		
		return array;
	}
	
	public static String getArrayFromIndex(int i) {
		String s = array[i];
		String[] arrayCopy = new String[21];
		
		for(int j = 0; j < arrayCopy.length; j++) {
			if(!(array[j].contentEquals(array[i]))) {
				arrayCopy[j] = array[j];
			}
			else {
				j++;
			}
		}
		
		return s;
	}
	
	
	public static void setArray(String array) {
		SharedPoint.array[counter] = array;
	}
	
}
