
/*Задача 2 логическая
        Даны две переменные - a и b. Например, они равны a=3; b=5.
        Необходимо поменять местами эти числа (то есть, что б стало так a=5, b=3).
        Но не используя третью переменную!
        вывести в консоль значение обеих переменных до и после, пример:
        a = 3 b = 5
        a = 5 b = 3*/


public class Job2 {
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
