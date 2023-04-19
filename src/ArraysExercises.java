
import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] peopleArray, Person newPerson){
        Person[] newPersonArray = Arrays.copyOf(peopleArray, peopleArray.length + 1);
        newPersonArray[newPersonArray.length -1] = newPerson;
        return newPersonArray;
    }
    public static void main(String[] args) {


     Person doug = new Person("Doug");
     Person han = new Person("Han");
     Person terrold = new Person("Terrold");

     Person[] people = {doug, han, terrold};

     Person brooke = new Person("Brooke");

        Person[] newPersonArray = addPerson(people, brooke);
        for (Person person : newPersonArray){
            System.out.println(person.getName());
        }

    }
}
