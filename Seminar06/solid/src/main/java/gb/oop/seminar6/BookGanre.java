package gb.oop.seminar6;

public class BookGanre implements GenreInterface{
    protected String name;
    protected String description;

    public BookGanre(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "BookGanre{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public BookGanre() {
        name = "Genre";
        description = "Lorem ipsum";
    }

    @Override
    public String getGanre() {
        return name;
    }
}
