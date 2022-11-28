package assignmeTwo;

public class AssiTwoQueSix {
  //Sub set of array
    public static void main(String[] args) {
        // WAP to find the duplicates present in an array .
          
        int[] a = { 7, 5, 2, 3, 1, 4, 6 };
        int[] b = { 7, 5, 2, 3 };
        for (int i = 0; i < a.length; i++) {
          for (int j = 1; j < a.length - i; j++) {
            if (a[j] < a[j - 1]) {
              int tempVar = a[j];
              a[j] = a[j - 1];
              a[j - 1] = tempVar;
            }
          }
        }
        for (int i = 0; i < b.length-1; i++) {
          for (int j = 1; j < b.length - i; j++) {
            if (b[j] < b[j - 1]) {
              int tempVar = b[j];
              b[j] = b[j - 1];
              b[j - 1] = tempVar;
            }
          }
        }
        for (int i : a) {
          System.out.print(i+" ");
        }
        System.out.println();
        for (int i : b) {
          System.out.print(i+" ");
        }
       
        boolean flag = false;
        for (int i = 0; i < b.length; i++) {
          for (int j = 0; j < a.length; j++) {
            if(b[i]==a[j]){
              System.out.println(b[i]+"=="+a[j]);
              break;
            }
            if(j==a.length-1){
              flag = true;
            }
          }
        }
      if(flag==true){
        System.out.println("array b is not subset of array a");
      }else if(flag==false){
        System.out.println("array b is subset of array a");
      }
      }
}
