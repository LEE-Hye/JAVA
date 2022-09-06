package ArrayList;

import java.util.ArrayList;

public class ex01_ArrayList {

	public static void main(String[] args) {


		// 1. ���� �� ����
		// �迭
		int[] arr = new int[5];

		// ArrayList(��������Ʈ)
		// ���׸����
		// ArrayList<������Ÿ��> ������ = new ArrayList<������Ÿ��>();
		// - Ŭ���� �����̱� ������ import �ؾ���
		// () : �޼ҵ带 ����ؼ� ����
		// ������ Ÿ�� -> ��üŸ������ ����. int -> Integer
		// ���� �ÿ� ũ�� ����X
		ArrayList<Integer> arrList = new ArrayList<Integer>();

		System.out.println("�迭�� ���� : " + arr.length);
		System.out.println("ArrayList ���� : " + arrList.size());

		// 2. �� �߰�
		// �迭
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;

		// ArrayList -> ������.add(��);
		// -> ������.add(�ε���, ��);
		arrList.add(0);
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		System.out.println("�� �߰� �� ArrayList ũ�� : " + arrList.size());

		// 3. �� ��ȸ
		// �迭
		System.out.println("�迭 0��° : " + arr[0]);

		// ArrayList
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println("ArrayList " + i + "��° : " + arrList.get(i));
		}

		// 4. �� ����
		// ArrayList -> ������.remove(�ε���);
		// -> ������.clear(); , ������.removeAll();
		arrList.remove(2);
		System.out.println(arrList.get(2));

		arrList.clear();
		System.out.println(arrList.size());

	}

}
//<ArrayList>
//1. ���� �� ����
//- ArrayList<������Ÿ��> ������ = new ArrayList<������Ÿ��>();
//
//2. �� �߰�
//- ������.add(��);
//- ������.add(�ε���, ��);
//
//3. �� ��ȸ
//- ������.get(�ε���);
//
//4. �� ����
//- ������.remove(�ε���);
//- ������.clear();
//
//5. ArrayList�� ũ��
//- ������.size()