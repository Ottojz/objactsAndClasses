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
}
