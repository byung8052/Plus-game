import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Myclass4 {

	public int plus() {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		for(int i=10; i<99; i++) {
			numList.add(i);
		}
		
		Random rnd = new Random();
		int a = rnd.nextInt(numList.size());
		int b = rnd.nextInt(numList.size());

		System.out.println(a+"+"+b+"= ?");
		return a+b;
	}
	
	public ArrayList<Integer> rndNumList() {
		ArrayList<Integer> list =new ArrayList<Integer>();
		Random rnd = new Random();
		list.add(rnd.nextInt(80)+10);
		list.add(rnd.nextInt(80)+10);
		System.out.println(list);
		return list;
	}
	
	public int duhagi(int a,int b) {
		System.out.println(a+b);
		return a+b;
	}
	
	
	public int myans() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정답은?: ");
		int c = sc.nextInt();
		return c;
	}

	public boolean sum(int b,int c) {
		while (true) {
			if(b == c) {
//				System.out.println("정답");
				return true;
			} else {
//				System.out.println("오답");
				return false;
			}
		}	
	}
}
