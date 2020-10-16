import java.util.Objects;
import java.lang.Override;

public record Book(String title, String author) {
  public Book {
    Objects.requireNonNull(title);
    Objects.requireNonNull(author);
  }
 
  @Override
  public String toString() {
    return title + " by " + author;
  }
}
