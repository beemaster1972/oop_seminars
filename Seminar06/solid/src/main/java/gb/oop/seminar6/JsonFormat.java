package gb.oop.seminar6;

public class JsonFormat implements Formatter{
    @Override
    public void getFormatted(Book book) {
        System.out.println(book+" отформатирован в JSON");
    }
}
