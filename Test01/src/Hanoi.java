

public class Hanoi {

	public static void main(String[] args) {
		int nDisks = 1;
	    doTowers(nDisks, 'A', 'B', 'C');
	}
	
	public static void doTowers(int topN, char from, char temp, char to) {
	    if (topN == 1){
	      System.out.println("Disk 1 from " + from + " to " + to);
	    }else {
	    	// do recursion here
	    	//Hello
	    }
	  }
}
