package buildup;

public class ex02_ArrayOut {

	public static void main(String[] args) {


		int[] array = new int[2];
		
		System.out.println(array[1]);
		
		try {
			System.out.println(array[1]);
			System.out.println(100/0);
		
//		} catch (Exception e) {
//			System.out.println("�ε��� ����");
//		}catch (Exception e) {
//			System.out.println("0���� �����׿�~"){
//				e.printStackTrace(); catch ������ ������ 
		}catch (Exception e) {
			e.printStackTrace(); // � ������ �߻��ߴ��� �ܼ�â�� ���
		}finally {
			System.out.println("�ѹ��� ������ �����ϴ� ����");
		}	
		System.out.println("��");
		
	}

}
