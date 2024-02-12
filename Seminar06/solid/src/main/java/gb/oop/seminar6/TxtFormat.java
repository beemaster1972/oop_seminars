package gb.oop.seminar6;

public class TxtFormat implements Formatter{
    @Override
    public void getFormatted(Book book) {
        System.out.println(book+" отформатирован в TXT");
    }
}
