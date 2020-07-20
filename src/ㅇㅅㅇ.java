import java.util.Random;
import java.util.Scanner;

public class ㅇㅅㅇ {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int a = rnd.nextInt(10) + 10;
		int b = rnd.nextInt(10) + 10;
		
		int c = a + b;
		int d = a - b;
		int e = a * b;
		float f = a / b;
		
		
		for (;;) {
			Scanner scan = new Scanner(System.in);
			System.out.print("1: 더하기, 2:빼기, 3:곱하기, 4:나누기 0: 종료 >> ");
			int input = scan.nextInt();
			if (input == 1) {
				Scanner scn = new Scanner(System.in);
				System.out.print(a + "+" + b + "=");
				int a1 = scn.nextInt();
				if (a1 == c) {
					System.out.println("정답입니다.");
				}
				else {
					System.out.println("틀렸습니다.답은: " + (a+b));
				}
			} 
			else if (input == 2) {
				Scanner scn = new Scanner(System.in);
				System.out.print(a + "-" + b + "=");
				int a1 = scn.nextInt();
				if (a1 == d) {
					System.out.println("정답입니다.");
				}
				else {
					System.out.println("틀렸습니다.답은: " + (a-b));
				}
			} 
			else if (input == 3) {
				Scanner scn = new Scanner(System.in);
				System.out.print(a + "x" + b + "=");
				int a1 = scn.nextInt();
				if (a1 == e) {
					System.out.println("정답입니다.");
				}
				else {
					System.out.println("틀렸습니다. 답은: " + (a*b));
				}
			} 
			else if (input == 4) {
				Scanner scn = new Scanner(System.in);
				System.out.print(a + "/" + b + "=");
				float a1 = scn.nextFloat();
				if (a1 == f) {
					System.out.println("정답입니다.");
				}
				else {
					System.out.println("틀렸습니다.답은: " + (a/b));
				}
			}
			else if (input == 0) {
				System.out.println("종료");
				break;
			}
		}
	}
}