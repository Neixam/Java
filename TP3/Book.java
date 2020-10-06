import java.util.Objects;
import java.lang.Override;

public record Book(String title, String author) {
/*  Pour empêcher la prise de champs null  
    public Book(String title, String author) {
        this.title = Objects.requireNonNull(title);
        this.author = Objects.requireNonNull(author);
    }
*/
    public Book {
        Objects.requireNonNull(title);
        Objects.requireNonNull(author);
    }
    public Book(String title) {
        this(title, "<no_author>");
    }
    // Le compilateur prend au plus simple s'il doit faire un cast ou autre il évitera il choisira donc selon les arguments de l'appelle.
    public Book withTitle(String title) {
        return (new Book(title, this.author()));
    }
    // Cela ne fonctionne pas car title est final avec le record
    public boolean isFromTheSameAuthor(Book other) {
        return (this.author().equals(other.author()));
    }
    // L'annotation Override indique si la méthode juste en dessous est une redéfinition
    @Override
    public String toString() {
        if (!(this.getClass() == Book.class))
            return "";
        Book b = (Book) this;
        return (b.title() + " by " + b.author());
    }
    public static void main(String[] args) {
        var book = new Book("Da Vinci Code", "Dan Brown");
        System.out.println(book.title + ' ' + book.author);
        // Les champs title et author ont été créer lors du record ils existent donc.
    }
}
