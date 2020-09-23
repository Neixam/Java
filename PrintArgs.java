public class PrintArgs {
    public static void main(String[] arg) {
/*      Partie I
        int i = 0;
        while (i < arg.length) {
            System.out.println(arg[i]);
            i++;
        }
*/
        for (String s : arg) {
            System.out.println(s);
        }
    }
}
