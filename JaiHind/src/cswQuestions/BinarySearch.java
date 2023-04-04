package cswQuestions;
class BS{
	public int Srch(int arr[], int l, int r, int x) {
		if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return Srch(arr, l, mid - 1, x);
            return Srch(arr, mid + 1, r, x);
		}
		return -1;
	}
}

public class BinarySearch {

	public static void main(String[] args) {
		BS obj = new BS();
		int arr[] = {1,2,3,5,6,7,8,9,10,11,12,13,16};
		System.out.println("Searched Element is at Index :: " + obj.Srch(arr,0,arr.length,10));
	}

}
