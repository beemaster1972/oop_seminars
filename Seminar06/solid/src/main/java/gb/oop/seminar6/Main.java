package gb.oop.seminar6;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book);
        Book ebook = new ElectronBook();
        System.out.println(ebook);
        Formatter formatter = new HtmlFormat();
        formatter.getFormatted(new Book());
        formatter = new JsonFormat();
        formatter.getFormatted(book);
        formatter = new TxtFormat();
        formatter.getFormatted(ebook);
    }


}