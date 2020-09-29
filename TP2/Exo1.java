public class Exo1 {
    public static void main(String[] args) {

        var s = "toto";
        System.out.println(s.length());
        // Le type de s est String. Le compilateur sait que la méthode length existe car String est compris dans la package initiaux de java

        var s1 = "toto";
        var s2 = s1;
        var s3 = new String(s1);

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        // Le code affiche true et false car la première possède la même référence que la deuxième tandis que la troisième est une nouvelle chaîne avec une nouvelle référence

        var s4 = "toto";
        var s5 = new String(s4);

        System.out.println(s4.equals(s5));
        // La méthode à utiliser est this.equals(String other)

        var s6 = "toto";
        var s7 = "toto";

        System.out.println(s6 == s7);
        // Le code affiche true car "toto" est déjà présent dans le tas du coup la variable s6 et s7 pointe sur le meme endroit
        // String ne doit pas être mutable car puisque l'on manipule que des adresses on risquerait de modifié les valeurs d'autres variables

        var s8 = "hello";
        s8.toUpperCase();
        System.out.println(s8);
        // le code affiche "hello" car s8 est immutable
    }
}
