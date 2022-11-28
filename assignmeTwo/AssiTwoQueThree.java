package assignmeTwo;

public class AssiTwoQueThree {
	
	  public static void main(String[] args) {
		  	//Bubble Short
		    int[] a = { 7, 5, 2, 3, 1, 4, 6 };
		    for (int i = 0; i < a.length; i++) {
		      for (int j = 1; j < a.length - i; j++) {
		        if (a[j] < a[j - 1]) {
		          int tempVar = a[j];
		          a[j] = a[j - 1];
		          a[j - 1] = tempVar;
		        }
		      }
		    }
		    for (int i : a) {
		      System.out.print(i+" ");
		    }
		  }


}
