import java.util.Scanner;

public class ex02_�ִ��ּ�������� {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "��° �Է� : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.print("�Էµ� ���� : ");
		for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		
		// �ְ� ���� ���ϱ�
		int max = 0;
				
		for(int i=0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("�ְ� ���� : " + max);
		
		// ���� ���� ���ϱ�
		int min = 999999999;
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("���� ���� : " + min);
		
		// ������ ���� ���ϱ�
		int sum = 0;
		
		for(int i = 0; i <arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("���� ���� : " + sum);
		
		// ������ ��� ���ϱ�
		System.out.println("���� ��� : " + sum/arr.length);
	}

}
