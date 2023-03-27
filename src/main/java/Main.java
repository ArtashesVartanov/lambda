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

        Collections.sort(persons, (o1, o2) -> {
            int length1 = o1.getSurname().split("-").length;
            int length2 = o2.getSurname().split("-").length;
            if (length1 < length2) {
                return -1;
            }
            if (length1 > length2) {
                return 1;
            }
            return o1.getAge() - o2.getAge();
        });

        persons.forEach(System.out::println);
    }

}
