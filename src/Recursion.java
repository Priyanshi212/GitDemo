
public class Recursion {
	public static void printNumb(int n) {
		if(n>0) {
			System.out.println(n);
			printNumb(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumb(5);

	}

}

