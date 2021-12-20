
/*Задача 3 знания Lambda выражений
        создать List Integer-ов и записать в него значения от 1 до 7 одной строкой (желательно)
        далее с помощью Lambda
        1 вывести все значения
        2 вывести все значения > 3
        3 вывести квадрат каждого элемента списка
        4 вывести количество елементов списка, значение которых больше 2

        создать List String-ов и записать в него три любыйх месяца, одну пустую строку и одну строку null
        далее с помощью Lambda
        1 вывести все значения, содержащие букву "а"
        2 вывести все значения, в названии которых больше 4-х букв.*/


import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Job3 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7);
        System.out.println("List<Integer>");
        System.out.println("вывести все значения");
        integerList.forEach(number -> System.out.println(number));
        System.out.println("вывести все значения > 3");
        integerList.forEach( number -> {
                                if (number > 3) {
                                    System.out.println(number);}
                             });
        System.out.println("вывести квадрат каждого элемента списка");
        integerList.forEach(number -> System.out.println(number*number));
        System.out.println("вывести количество елементов списка, з;начение которых больше 2");
        long count = integerList.stream()
                .filter(i -> i > 2)
                .count();
        System.out.println(count);
        System.out.println("");

        System.out.println("List<String");
        List<String> stringList = Arrays.asList("agust", "Septembe", "Februery", "", null);
        stringList.forEach(System.out::println);
        System.out.println("вывести все значения, содержащие букву \"а\"");
        stringList.stream()
            .filter(Objects::nonNull)
            .filter(str -> !str.isEmpty() && str.contains("a"))
            .forEach(System.out::println);
        System.out.println("вывести все значения, в названии которых больше 4-х букв");
        stringList.stream()
                .filter(Objects::nonNull)
                .filter(str -> !str.isEmpty() && str.length()>4)
                .forEach(System.out::println);
    }

}
