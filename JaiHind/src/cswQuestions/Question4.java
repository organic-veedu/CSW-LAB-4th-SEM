package cswQuestions;
class Rotate{
	public int[] roArr(int arr[], int k){
		int tArr[] = arr;
		//reducing k
		if(k > arr.length)
			k = k%(arr.length);
		
		// Now rotating the array
		for(int i =0; i<k; i++) {
			int temp = arr[0];
			for(int j =0; j<(arr.length-1); j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
		return tArr;
	}
}

public class Question4 {

	public static void main(String[] args) {
		Rotate obj = new Rotate();
		int a[] = {1,2,3,4,5};
		int t[] = obj.roArr(a, 50);
		for(int i = 0; i < t.length; i++) {
			System.out.print(t[i]+",");
		}
	}

}
