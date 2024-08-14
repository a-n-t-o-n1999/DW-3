public class Main {
    public static void main(String[] args) {
        //task1
        int age = 40;
        if (age >= 18)
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        else
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        //task2
        int temperature = 3;
        if (temperature < 5) System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        else System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        //task3
        int speed = 300;
        if (speed > 60) System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        else System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        //task4
        if (age >= 2 && age <= 6)
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        if (age >= 7 && age <= 17)
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        if (age >= 18 && age <= 24)
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        if (age >= 25) System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        //task5
        if (age < 5)
            System.out.println("Если возраст ребенка равен " + age + " то он не может кататься на аттракционе");
        if (age >= 5 && age < 14)
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься только в сопровождении взрослого");
        if (age >= 14)
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься без сопровождения взрослого");
        //task6
        int carCapacity = 102;
        int seating = 60;
        int quantityPeople = 62;
        if (quantityPeople <= carCapacity) {
            if (quantityPeople < seating)
                System.out.println("Если в вагоне " + quantityPeople + " человек, то есть сидячие места");
            else System.out.println("Если в вагоне " + quantityPeople + " человек, то сидячих мест нет");
        } else System.out.println("Если в вагоне " + quantityPeople + " то вагон забит");
        //task7
        int one = 10;
        int two = 20;
        int three = 3;
        if (one > two && one > three) System.out.println(one + " самое большое число");
        else if (two > one && two > three) System.out.println(two + " самое большое число");
        else System.out.println(three + " самое большое число");
        //task8


    }
}