package icehs.science.chapter08;

public class OddEvenIndexSumTest {

	public static void main(String[] args) {
		
		int[] arr = {12, 53, 24, 10, 22, 38, 64, 39};
		
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if((i % 2) == 0) {
				oddSum += arr[i];
			}
			if((i % 2) == 1) {
				evenSum += arr[i];
			}
		}
		
		System.out.print("배열 데이터 : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("홀수 번째 정수의 합 : " + oddSum);
		System.out.println("짝수 번째 정수의 합 : " + evenSum);
		
	}

}
