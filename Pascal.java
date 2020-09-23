// On peut expliquer la différence de temps par le fait que java est exécuter sur une machine virtuelle et qui a donc toutes ses capacité pour son exécution

public class Pascal {
    public static void main(String[] args) {
        int tab[] = new int[30001];
        tab[0] = 1;
        int n = 1;
        int i;
        while (n <= 30000) {
            tab[n] = 1;
            i = n - 1;
            while (i > 0) {
                tab[i] = tab[i - 1] + tab[i];
                i--;
            }
            n++;
        }
        System.out.println(" Cn, p = " + tab[250]);
    }
}
