package assignmeTwo;

public class AssiTwoQueOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find duplicates
		int arr [] = {1, 2, 8, 4, 2, 7, 8, 3, 3};
		for(int i=0; i<arr.length; i++){
			for(int j=(i+1); j<arr.length; j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
				}
			}
		}
	}

}
