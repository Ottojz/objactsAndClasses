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
    public String getAuthor () {
        return (this.author.getName() + " " + this.author.getSurname());
    }

    //Геттер года публикации
    public short getYear () {
        return this.year;
    }

    //Сеттер года публикации
    public void setYear(short year) {
        this.year = year;
    }
}
