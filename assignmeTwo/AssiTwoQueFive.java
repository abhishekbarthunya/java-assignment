package assignmeTwo;

public class AssiTwoQueFive {
	// Selection Short
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {7, 5, 2, 3, 1, 4, 6};
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp =arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for (int i : arr) {
            
        	 System.out.print(i+" ");
        }
	}
}
