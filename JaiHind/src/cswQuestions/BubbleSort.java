package cswQuestions;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[] = {5,4,6,3,1,2};
		int flag = 1;
		for(int i = 0; i<arr.length && (flag == 1); i++) {
			
			flag = 1;
			for(int j = 0; j<(arr.length-i-1); j++) {
				flag = 0;
				if(arr[j]>arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					flag = 1;
				}
			}
		}

	}

}
