import java.util.Objects;

public class Book {
    //Данные, атрибуты
    private String name;
    private Author author;
    private short year;

    //Конструктор
    public Book (String name, Author author, short year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    //Геттер названия
    public String getName() {
        return this.name;
    }

    //Геттер автора
    public Author getAuthor () { return this.author; }

    //Геттер года публикации
    public short getYear () {
        return this.year;
    }

    //Сеттер года публикации
    public void setYear(short year) {
        this.year = year;
    }

    //toString - позволяет выдавать имя автора, вместо Class@hashCode
    @Override
    public String toString () { return (this.name + " // " + this.author + " // " + this.year); }

    //equals - позволяет считать объекты равными, если совпадают назначенные данные этих объектов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name);
    }

    //hashCode - превращает объект в число
    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
