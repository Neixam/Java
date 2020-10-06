import java.lang.Override;

public class Book2 {
    private final String title;
    private final String author;

    public Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o.getClass() == Book2.class))
            return (false);
        Book2 b = (Book2) o;
        return (this.title.equals(b.title) && this.author.equals(b.author));
    }
    // La méthode utiliser pour le equals actuelle est celle de Object qui ne compare que les références et pas les valeurs
    public static void main(String[] args) {
        var book1 = new Book2("Da Vinci Code", "Dan Brown");
        var book2 = new Book2("Da Vinci Code", "Dan Brown");
        System.out.println(book1.equals(book2));
    }
}
