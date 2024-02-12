package gb.oop.seminar6;

public class ElectronBook extends Book{
    private String format;
    private Integer size;

    public ElectronBook() {
        format = "FB2";
        size = 1024;
        typeOfBook = TypeOfBook.EBOOK;
    }

    public ElectronBook(String name, String author, TypeOfBook typeOfBook, String format, Integer size) {
        super(name, author, typeOfBook);
        this.format = format;
        this.size = size;
        this.typeOfBook = TypeOfBook.EBOOK;
    }

    public String getFormat() {
        return format;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "ElectronBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", typeOfBook=" + typeOfBook +
                ", bookGanre=" + bookGanre +
                ", format='" + format + '\'' +
                ", size=" + size +
                '}';
    }
}
