public class Morse {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.print(s + " Stop. ");
        }
        System.out.println();
        // Il permet d'avoir une chaîne mutable
        // Car elle crée une nouvelle chaîne et donc par soucis de ne pas remplir le tas
        
        StringBuilder ret = new StringBuilder();
        for (String s1 : args) {
            ret.append(s1);
            ret.append(" Stop. ");
        }
        System.out.println(ret);
        // Pour éviter un accès répété au fichier de sortie
        
        // On en déduit qu'il crée une chaîne à chaque passage de boucle

        // On utiliserai append plutôt que + durant des itérations

        // Car un StringBuilder est déjà lourd en mémoire alors si l'on en crée plusieurs qui se stack inutilement
    }
}
