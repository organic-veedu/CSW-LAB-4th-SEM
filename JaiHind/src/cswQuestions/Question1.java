package cswQuestions;
class ArrFun{
	public int SumArr(int arr[]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
	public int SrchArr(int u, int arr[]) {
		int indx = -1;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==u) {
				indx = i;
				break;
			}
		}
		return indx;
	}
}
public class Question1 {
	
	public static void main(String[] args) {
		ArrFun obj = new ArrFun();
		int arr1[] = {1,2,3,5,14,6,4,155,65,66,69,25,23};
		System.out.println("Sum of Array is :: " + obj.SumArr(arr1));
		System.out.println("Searching Number 999 :: " + obj.SrchArr(999, arr1));
	}

}
