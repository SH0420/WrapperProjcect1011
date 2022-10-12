//2022-10-11 p351
public class WrapperTest {

	public static void main(String[] args) {
		
		//Wrapper Class : 기본형과 참조형간 형변환(박싱,언박싱) 오토박싱
		//박싱: 기본형 - > 참조형
		//언박싱 : 참조형 -> 기본형
		
		int i = 10;
		Integer intg = i;//박싱  //(Integer)i;//new Integer(i);
		
		Integer intg2 = new Integer(10);
		int i2 = intg2; // 언박싱 
		
		System.out.println(intg2 + i2);
		
		Object obj = (Object)i; //박싱
		//int i3 = obj; //Object는 박싱은 가능하지만 언박싱은 불가
		
		String str = "50";
		int i4 = Integer.parseInt(str);
		
		System.out.println(i4);//Number FormatException; ->문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환시 발생

	}

}
