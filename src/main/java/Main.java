import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Olya","Smirnova",56));
        persons.add(new Person("Denis","Denisov-Smirnov",23));
        persons.add(new Person("Ivan","Victorov",17));
        persons.add(new Person("Victor","Smirnov-Victorov",60));
        persons.add(new Person("Vladimir","Smirnov-Denisov-Victorov",9));

        persons.removeIf(person -> person.getAge() < 18);

        persons.forEach(System.out::println);
    }

}
