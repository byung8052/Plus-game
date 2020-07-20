package game;

public class Gamestart {
	public static void start() {
		Thedal td = new Thedal();
		td.menu();
		td.munje(3);   // 문제 수 넣기
		td.ox();
	}
}
