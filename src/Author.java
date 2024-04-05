import java.util.Objects;

public class Author {
    //Данные, атрибуты
    private String name;
    private String surname;

    //Конструктор
    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //Геттер имени
    public String getName () {
        return this.name;
    }

    //Геттер фамилии
    public String getSurname () {
        return this.surname;
    }

    //toString - позволяет выдавать имя автора, вместо Class@hashCode
    @Override
    public String toString () {return this.name + " " + this.surname; }

    //equals - позволяет считать объекты равными, если совпадают назначенные данные этих объектов
    @Override
    public boolean equals (Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author a2 = (Author) other;
        return name.equals(a2.name);
    }

    //hashCode - превращает объект в число
    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

}
