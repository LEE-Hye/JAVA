import java.util.Scanner;

public class ex02_최대최소총합평균 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "번째 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("입력된 점수 : ");
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		
		// 최고 점수 구하기
		int max = 0;
				
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최고 점수 : " + max);
		
		// 최저 점수 구하기
		int min = 999999999;
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최저 점수 : " + min);
		
		// 점수의 총합 구하기
		int sum = 0;
		
		for(int i = 0; i <arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("점수 총합 : " + sum);
		
		// 점수의 평균 구하기
		System.out.println("점수 평균 : " + sum/arr.length);
	}

}
