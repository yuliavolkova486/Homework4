public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int ageOfThePerson = 12;
        if (ageOfThePerson >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (ageOfThePerson < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать!");
        }

        // Задача 2
        System.out.println("Задача 2");
        if (ageOfThePerson >= 7 && ageOfThePerson < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (ageOfThePerson >= 18 && ageOfThePerson < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (ageOfThePerson >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задача 3
        System.out.println("Задача 3");
        int trainCarCapacity = 102;
        int seatingPlaces = 60;
        int standingPlaces = trainCarCapacity - seatingPlaces;
        int seatTicket = 47;
        int standTicket = 12;
        if (seatTicket < seatingPlaces) {
            System.out.println("Сидячих мест " + (seatingPlaces - seatTicket));
        }
        if (standTicket < standingPlaces) {
            System.out.println("Стоячих мест " + (standingPlaces - standTicket));
        }
        if (seatTicket >= seatingPlaces) {
            System.out.println("Сидячих мест нет");
        }
        if (standTicket >= standingPlaces) {
            System.out.println("Стоячих мест нет");
        }

        // Задача 4
        System.out.println("Задача 4");
        int ageOfMajority1 = 12;
        if (ageOfMajority1 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать!");
        }

        // Задача 5
        System.out.println("Задача 5");
        int ageOfThePerson1 = 17;
        if (ageOfThePerson1 >= 7 && ageOfThePerson1 < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        else if (ageOfThePerson1 >= 18 && ageOfThePerson1 < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        else if (ageOfThePerson1 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задача 6
        System.out.println("Задача 6");
        int trainCarCapacity1 = 102;
        int seatingPosition1 = 60;
        int standingPlaces1 = trainCarCapacity1 - seatingPosition1;
        int seatTicket1 = 60;
        int standTicket1 = 12;
        if (seatTicket1 < seatingPosition1) {
            System.out.println("Сидячих мест " + (seatingPosition1 - seatTicket1));
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (standTicket1 < standingPlaces1) {
            System.out.println("Стоячих мест " + (standingPlaces1 - standTicket1));
        } else {
            System.out.println("Стоячих мест нет");
        }

        // Задача 7
        System.out.println("Задача 7");
        int age = 18;
        if (age >= 2 && age <= 6) {
            System.out.println("Если человеку " +(age)+ " , то ему нужно ходить в детский сад");
        } else if (age >=7 && age < 18) {
            System.out.println("Если человеку " +(age)+ " , то ему нужно ходить в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если человеку " +(age)+ " , то его место в университете");
        } else if (age >= 24) {
            System.out.println("Если человеку " +(age)+ " , то ему пора ходить на работу");
        }

        // Задача 8
        System.out.println("Задача 8");
        int age1 = 15;
        if (age1 < 5) {
            System.out.println("Если ребенку " +(age1)+ " , то он не может кататься на аттракционе");
        } else if (age1 >= 5 && age1 < 14) {
            System.out.println("Если ребенку " +(age1)+ " , то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (age1 > 14) {
            System.out.println("Если ребенку " +(age1)+ " , то он может кататься без сопровождения взрослого");
        }

        // Задача 9
        System.out.println("Задача 9");
        int one = 118;
        int two = -768;
        int three = 14;
        if (one > two && one > three) {
            System.out.println("Максимальное число " +(one));
        } else if (two > one && two > three) {
            System.out.println("Максимальное число " +(two));
        } else if (three > one && three > two) {
            System.out.println("Максимальное число " +(three));
        } else if (two == one && two > three) {
            System.out.println("Максимальное число " +(two)+ " и " +(one));
        } else if (three == one && three > two) {
            System.out.println("Максимальное число " +(three)+ " и " +(one));
        } else if (three == two && one > two) {
            System.out.println("Максимальное число " + (three) + " и " + (two));
        } else if (three == two && two > one) {
            System.out.println("Максимальное число " + (three) + " и " + (two));
        } else {
            System.out.println("Все три числа равны");
        }

    }
}