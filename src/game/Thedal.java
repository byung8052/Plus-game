package game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import vo.Numvo;

public class Thedal {
	//멤버 변수
	private Scanner sc;//생성이 되지 않은 상태 = new로 사용 가능하게 해줘야 한다
	private Numvo numvo;
	private int op; // 더하기 빼기 등 정해주는 변수(1이면 +,2면 - 등)
	private int o;
	private int x;
	//private = class 안에서만 사용할 수 있게 해줌

	
	
//	private int num1;
//	private int num2;
	
	public Thedal() {               // 강제로 스캐너가 실행 될 수 있게 끔 만들어줌
		sc=new Scanner(System.in);
		numvo = new Numvo();
	}

	public void menu() {
		System.out.print("1: 더하기, 2:빼기, 3:곱하기, 4:나누기 0: 종료 >> ");		
		op = sc.nextInt();
		// 여기에 쓰지 않고도 return을 이용하여 외부에서 받아오기가 가능
		System.out.println("선택 번호: "+op);
	}

	//문제 생성
	public void munje(int su) {
		for(int i = 0; i<su; i++) {
		
		rnum();
		
		if (op == 1) {
			bigyo(add());
		}else if (op ==2) {
			bigyo(sub());
		}else if (op ==3) {
			bigyo(mul());
		}else if (op ==4) {
			bigyo(div());
		}
		}
	}
	
	//빼기 or 나누기때 num1과 num2를 바꾸는 메소드
	public void chnum(int a,int b) {
		numvo.setNum1(Math.max(a, b));   // 큰 숫자
		numvo.setNum2(Math.min(a, b));   // 작은 숫자
		
		
	}
	
	public void dab() {
		int c = numvo.getNum1()+numvo.getNum2();
	}
	
		public void bigyo(int dab) {
			int i = sc.nextInt();
			System.out.println("내 답: "+i);
			if (dab == i) {
				System.out.println("정답");
				o++;
			} else {
				System.out.println("오답");
				x++;
			}	
	}
		
//맞은 갯수,틀린 갯수 출력
		public void ox() {
			System.out.println("맞은 갯수: "+o);
			System.out.println("틀린 갯수: "+x);
		}
		
//더하기
	public int add() {
		System.out.println(numvo.getNum1()+"+"+numvo.getNum2()+"=");
		return numvo.getNum1() + numvo.getNum2();
	}
//빼기
	public int sub() {
		chnum(numvo.getNum1(), numvo.getNum2());
		System.out.println(numvo.getNum1()+"-"+numvo.getNum2()+"=");
		return numvo.getNum1() - numvo.getNum2();
	}
//곱하기
	public int mul() {
		System.out.println(numvo.getNum1()+"*"+numvo.getNum2()+"=");
		return numvo.getNum1() * numvo.getNum2();
	}
//나누기
	public int div() {
		for (;;) {    // 나누어 떨어지기 않게 나오면 무한 반복
		chnum(numvo.getNum1(), numvo.getNum2());
		if(ddul(numvo.getNum1(),numvo.getNum2())) {
			break;
		} else {
				rnum();
			}
		}
		System.out.println(numvo.getNum1()+"/"+numvo.getNum2()+"=");
		return numvo.getNum1() / numvo.getNum2();
	}
	
//나누기를 나누어 떨어지게 만들기
	public boolean ddul(int a,int b) {
		if(a % b == 0) {  // 나머지가 0 일때
			return true;
		}else {
			return false;
		}
	}
//랜덤 숫자 만들기
	public void rnum() {
		Random rnd = new Random();
		numvo.setNum1(rnd.nextInt(89) + 10);
		numvo.setNum2(rnd.nextInt(89) + 10);
	}
}
