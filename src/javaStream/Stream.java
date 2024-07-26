package javaStream;
import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.Optional;
        import java.util.stream.Collectors;

public class Stream {
    public static void main(String...args){
        List<String> animals = Arrays.asList("Dog", "Monkey", "Elephant", "Horse", "Cow");

        List<String> studentNames = new ArrayList<String>();
        studentNames.add("Dada");
        studentNames.add("Supo");
        studentNames.add("Lekwa");
        studentNames.add("Tunde");
        studentNames.add("Shogo");

//       animals.forEach(System.out::println);

        List<String> dAnimals = animals.stream().filter(x -> x.startsWith("D")).collect(Collectors.toList());
//        System.out.println(dAnimals);
//        dAnimals.forEach(System.out::println);

//        String animalString = animals.stream().reduce("", (a, b) -> a + " " + b);
//        System.out.println(animalString);

//        long count = animals.stream().count();
//        System.out.println(count);

//        boolean allAnimalHasD = animals.stream().allMatch(x -> x.startsWith("D"));
//        System.out.println(allAnimalHasD);

//        boolean someAnimalHasD = animals.stream().anyMatch(x -> x.startsWith("D"));
//        System.out.println(someAnimalHasD);

        Optional<String> firstName = animals.stream().findFirst();
        firstName.ifPresent(System.out::println);

    }
}

