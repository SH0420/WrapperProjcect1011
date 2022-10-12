//2022-10-11 373P, P323
import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		
//		Calendar c = Calendar.getInstance(); 
//		System.out.println(c.get(Calendar.YEAR)+ "��");
//		System.out.println((c.get(Calendar.MONTH)+1) + "��");//0~11
//		System.out.println(c.get(Calendar.DATE)+ "��");
//		System.out.println(c.get(Calendar.HOUR)+ "��");
//		System.out.println(c.get(Calendar.MINUTE)+ "��");
//		System.out.println(c.get(Calendar.SECOND)+ "��");
//		System.out.println(c.get(Calendar.DAY_OF_WEEK)+ "����"); //1.�Ͽ��� 1 ~ 7
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�");
		int year = sc.nextInt(); //2022
		System.out.println("���� �Է�");
		int month = sc.nextInt();//10
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year,month-1,1); //�����ϴ� ���� 1�ϳ�¥�� �ʱ�ȭ
		eDay.set(year,month,1);   //������ 1�� ��¥�� �ʱ�ȭ
		
		eDay.add(Calendar.DATE, -1); //������ ������ ��¥
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); //7:�����
		END_DAY = eDay.get(Calendar.DATE); // 31
		
		System.out.println("      " + year +"��" + month +"��");//6ĭ
		System.out.println(" SU MO TU WE TH FR SA"); //1ĭ
		
		for(int i=1;i<START_DAY_OF_WEEK;i++) {
			System.out.print("   "); //3ĭ
		}
		
		for(int i=1,n=START_DAY_OF_WEEK;i<= END_DAY;i++,n++) {
			System.out.print((i < 10 ? "  "+ i: " "+ i));
			if(n % 7 == 0) {
				System.out.println();
			}
		}

		
		
		
		
		
	}

}
