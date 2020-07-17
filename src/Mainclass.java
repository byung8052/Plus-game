import java.util.ArrayList;


public class Mainclass {

	public static void main(String[] args) {
//		//class 선언
//		Myclass a = new Myclass();
//		//System.out.println(a);
//		a.method();
//		a.food();
//		
//		
//		Myclass2 aa = new Myclass2();
//		aa.dad();
		
//		Myclass3 b = new Myclass3();
//		int i= b.r1();
//		System.out.println(i);
//		String j = b.r2();
//		System.out.println(j);
		
		//클래스 만들고 메소드 만들기
		//더하기 달인 기능을 별도로 만들어
		//더하기 출력 해주는 메소드
		//더하기 값을 전달 해주는 메소드
		//메인에서 메소드만 이용해서 출력 또는 답을 비교
		
		Myclass4 aa = new Myclass4();
//		int b= aa.plus();
//		int c= aa.myans();
//		
//		
//		if(aa.sum(b, c) == true) {
//			System.out.println("정답");
//		}
//		else {
//			System.out.println("오답");
//		}
//			
//			
	ArrayList<Integer> bb =  aa.rndNumList();
	//aa.rndNumList를 bb로 저장
	int a= bb.get(0); //0번쨰 숫자 출력
	int b= bb.get(1); //1번쨰 숫자 출력
	
	
	aa.duhagi(a, b);
	}	
}

