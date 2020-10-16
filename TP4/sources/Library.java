import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Iterator;
/*  Exercice 3  */
// 2) Il utilise une table de Hachage
//    On peut ranger les livres dans une table de hachage pour que les livres soit indexer
//    La nouvelle compléxiter serait O(1)
// 4) Car on a besoin que les champs soit mutable et donc pas final
// 5) On a besoin de la méthode forEach()
// 6) Puisque LinkedHashMap est une sous-classe on peut utiliser les méthode de hashmap dans un objet LinkedHashMap on peut donc remplacer le champs initial HashMap par celui-ci
// 7) Le code lève une exception car il supprime des éléments en même temps qu'il parcours et vu la construction d'une hashmap ça perturbe le fonctionnement du forEach

public class Library {
  /*  private ArrayList<Book> books;
    public Library() {
        books = new ArrayList<Book>();
    }
    public void add(Book b) {
        if (b == null)
            return ;
        books.add(b);
    }
    // La complexité de la méthode findByTitle() est O(n)
    public Book findByTitle(String title) {
        for (var b : books) { // La classe ArrayList implémente l'interface Iterator qui permet d'accéder au suivant avec ses méthodes hasnext() et next()
            if (b.title().equals(title))
                return (b);
        }
        return (null);
    }
    @Override
    public String   toString() {
        StringBuilder  ret = new StringBuilder();
        for (var b : books) {
            ret.append(b);
            ret.append("\n");
        }
        return (ret.toString());
    }
    */
    private LinkedHashMap<String, Book> books;
    public Library() {
        books = new LinkedHashMap<String, Book>(); 
    }
    public  Book findByTitle(String title) {
        return ((Book)books.get(title));
    }
    public void add(Book b) {
        if (b == null)
            return ;
        books.put(b.title(), b);
    }
    public void removeAllBooksFromAuthor(String author) {
        books.values().removeIf(n -> n.author().equals(author));
/*      * Avec LinkedHashMap *
        books.forEach((k, v) -> {
            if (author.equals(v.author())) {
                books.remove(k);
            }
        }); // Relève une exception
        * Avec Iterator *
        Iterator it = books.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry)it.next();
            if (author.equals(((Book)me.getValue()).author())) {
                it.remove();
            }
        }
*/
    }
    @Override
    public String   toString() {
        StringBuilder ret = new StringBuilder();
        books.forEach((k, v) -> ret.append(v + "\n"));
        return (ret.toString());
    }
    public static void  main(String[] args) {
        var library = new Library();
        var book = new Book("Da Vinci Co", "Jean-Jacques");
        library.add(book);
        System.out.println(library.findByTitle("Da Vinci Code"));
        var library2 = new Library();
        library2.add(new Book("Da Vinci Code", "Dan Brown"));
        library2.add(new Book("Angels & Demons", "Dan Brown"));
        library2.removeAllBooksFromAuthor("Dan Brown");
        System.out.println(library2);
    }
}
