//2022-10-11 p351
public class WrapperTest {

	public static void main(String[] args) {
		
		//Wrapper Class : �⺻���� �������� ����ȯ(�ڽ�,��ڽ�) ����ڽ�
		//�ڽ�: �⺻�� - > ������
		//��ڽ� : ������ -> �⺻��
		
		int i = 10;
		Integer intg = i;//�ڽ�  //(Integer)i;//new Integer(i);
		
		Integer intg2 = new Integer(10);
		int i2 = intg2; // ��ڽ� 
		
		System.out.println(intg2 + i2);
		
		Object obj = (Object)i; //�ڽ�
		//int i3 = obj; //Object�� �ڽ��� ���������� ��ڽ��� �Ұ�
		
		String str = "50";
		int i4 = Integer.parseInt(str);
		
		System.out.println(i4);//Number FormatException; ->���ڿ��� ��Ÿ���� ���ڿ� ��ġ���� �ʴ� Ÿ���� ���ڷ� ��ȯ�� �߻�

	}

}
