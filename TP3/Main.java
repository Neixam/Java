public class Main {
    public static void main(String[] args) {
        /* EXERCICE 1 */
        var book = new Book("Da Vinci Code", "Dan Brown");
        System.out.println(book.title() + ' ' + book.author());
        //var weirdBook = new Book(null, "oops");
        book = book.withTitle("truc bidule");
        System.out.println(book.title() + ' ' + book.author());
        // Le problème est que les champs sont privés et sont donc inaccessible en dehors de la classe Book.
        // Pour corriger il suffit d'utiliser les méthode get créer par le record

        /* EXERCICE 2 */
        var b1 = new Book("Da Java Code", "Duke Brown");
        var b2 = b1;
        var b3 = new Book("Da Java Code", "Duke Brown");

        System.out.println((b1.title().equals(b2.title()) && b1.author().equals(b2.author())));
        System.out.println((b1.title().equals(b2.title()) && b1.author().equals(b2.author())));
        // L'opérateur '==' compare les références et pas les valeurs des variables
        // Pour savoir si les deux objets ont les mêmes valeurs est en comparant champs par champs les égalités
        var book1 = new Book("Da Vinci Code", "Dan Brown");
        var book2 = new Book("Angels & Demons", new String("Dan Brown"));
        System.out.println(book1.isFromTheSameAuthor(book2));
        var javaBook = new Book("Da Java Code", "Duke Brown");
        System.out.println(javaBook);
    }
}
