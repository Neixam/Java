import java.util.Scanner;

public class Calc {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer 2 valeurs entière");
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        int sum = val1 + val2;
        int dif = val1 - val2;
        int pro = val1 * val2;
        double quo;
        int res;
        if (val2 != 0) {
            quo = val1 / val2;
            res = val1 % val2;
        }
        else {
            quo = 0;
            res = 0;
        }
        System.out.println(sum);
        System.out.println(dif);
        System.out.println(pro);
        System.out.println(quo);
        System.out.println(res);
    }
}

// 3) nextInt n'est pas une fonction car il n'est utilisable que lorsqu'une variable de la classe existe nextInt est une méthode

// 4) Il importe le package java util avec Scanner
