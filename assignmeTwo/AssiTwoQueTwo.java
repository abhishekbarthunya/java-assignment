package assignmeTwo;

public class AssiTwoQueTwo {
// Quick Short
	public static int partition(int arr[],int low,int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<pivot){
                i++;
                // swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp =arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    public static void quickShort(int arr[], int low, int high) {
        if(low < high){
            int pidx = partition(arr,low,high);
            quickShort(arr, low, pidx-1);
            quickShort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        int [] arr = {7, 5, 2, 3, 1, 4, 6 };
        int n = arr.length;
        quickShort(arr, 0, n-1);
        for (int i : arr) {
		      System.out.print(i+" ");
		    }
        System.out.println();
    }

}
