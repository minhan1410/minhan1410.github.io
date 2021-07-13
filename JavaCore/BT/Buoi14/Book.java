public class Book {
    private Long id;
    private String name, nhaSb;
    private int year;

    public Book(String name, String nhaSb, int year) {
        this.id = IdGenerator.getIdBook();
        this.name = name;
        this.nhaSb = nhaSb;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNhaSb() {
        return nhaSb;
    }

    public void setNhaSb(String nhaSb) {
        this.nhaSb = nhaSb;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", nhaSb=" + nhaSb + ", year=" + year + "]";
    }
}
