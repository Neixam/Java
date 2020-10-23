package fr.umlv.fight;

public class Arena {
    public static Robot fight(Robot b1, Robot b2) {
        while (true) {
            b1.fire(b2);
            if (b2.isDead())
                return (b1);
            b2.fire(b1);
            if (b1.isDead())
                return (b2);
        }
    }

    public static void main(String[] args) {
        Robot b1 = new Robot("D2R2");
        Robot b2 = new Robot("Data");
        Robot win = Arena.fight(b1, b2);
        System.out.println(win + " a détruit son adversaire !");
        var john = new Fighter("John", 1);
        var jane = new Fighter("Jane", 2);
        System.out.println(Arena.fight(john, jane) + " wins");
    }
}