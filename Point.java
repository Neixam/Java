import java.lang.Integer;

public record Point (int x, int y) {
	public static void main(String[] args) {
		int x = parseInt(args[0]);
		int y = parseInt(args[1]);
		Point p = new Point(s, y);
		System.out.println("x = " + p.x);
		System.out.println("y = " + p.y);
	}
}