package gb.oop.seminar6;

public class Book {
    protected String name;
    protected String author;
    protected TypeOfBook typeOfBook;
    protected BookGanre bookGanre;


    public Book(String name, String author, TypeOfBook typeOfBook) {
        this.name = name;
        this.author = author;
        this.typeOfBook = typeOfBook;
    }

    @Override
    public java.lang.String toString() {
        return "Book{" +
                "name=" + name +
                ", author=" + author +
                ", typeOfBook=" + typeOfBook +
                ", bookGenre="+ bookGanre+
                '}';
    }

    public Book() {
        name ="Book";
        author ="Tolstoy";
        typeOfBook = TypeOfBook.PAPER;
        bookGanre = new BookGanre();

    }
}
