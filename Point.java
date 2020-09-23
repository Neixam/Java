import java.lang.Integer;
// à compiler avec javac --enable-preview --release 15 Point.java
// à éxécuter avec java --enable-preview Point
// Statique pour une méthode consiste à pouvoir utilisé la méthode à partir de la classe elle-meme et pas d'un objet
// un problème de typage
public record Point (int x, int y) {
    public double distance(Point other) {
        return (Math.sqrt((other.x - this.x) * (other.x - this.x) + (other.y - this.y) * (other.y - this.y)));
    }
    
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		Point p = new Point(x, y);
        Point origine = new Point(0, 0);
		System.out.println("x = " + p.x);
		System.out.println("y = " + p.y);
        System.out.println(p.distance(origine));
	}
}
