import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.Integer;

public class Exo3 {
    public static byte[] is_ipv4_valid(String test) {
        byte[] ret = new byte[4];
        Pattern p = Pattern.compile("^([0-9]{1,3}).([0-9]{1,3}).([0-9]{1,3}).([0-9]{1,3})$");
        Matcher m = p.matcher(test);

        if (m.matches()) {
            int i = 1;
            int j;
            while (i < 5) {
                j = Integer.parseInt(m.group(i));
                if (j > 255 || j < 0)
                    return (null);
                ret[i - 1] = (byte)(j - 128);
                i++;
            }
        }
        return (ret); 
    }
    public static void main(String[] args) {
        Matcher m;
        Pattern p = Pattern.compile("[0-9]+");
        for (String s : args) {
            m = p.matcher(s);
            if (m.matches()) {
                System.out.println(s);
            }
        }
        Pattern q = Pattern.compile("([A-Za-z]*)([0-9]+)");
        for (String s1 : args) {
            m = q.matcher(s1);
            if (m.matches()) {
                System.out.println(m.group(2));
            }
        }
        byte[] ret = Exo3.is_ipv4_valid(args[0]);
        if (ret != null) {
             System.out.println("VALIDE");
        }
        else {
             System.out.println("NON VALIDE");
        }
        // compile permet de créer une expression régulière à partir d'une chaîne de caractère
        // Matcher permet de manipulé ces expressions régulières et de savoir si une chaîne match avec l'expression
    }
}
