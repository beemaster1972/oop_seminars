package gb.oop.seminar6;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable{
    List<Book> books;

    @Override
    public List<Book> authorSearch(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book: books){
            if (book.author.equals(author)){
                result.add(book);
            }
        }
        return result;
    }
}
