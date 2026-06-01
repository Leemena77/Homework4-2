//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний");
        }
        int age1 = 17;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен 18, то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен 17, то он  еще  не достиг совершеннолетия," +
                    " но нужно немного подождать");
        }

        System.out.println("Задача № 2");
        int t = 4;
        if (t < 5) {
            System.out.println("На улице 4 градуса, нужно надеть шапку");
        } else {
            System.out.println("Не надевать шапку");
        }

        int t2 = 6;
        if (t2 > 5) {
            System.out.println("На улице 6 градусов, можно идти без шапки ");
        } else {
            System.out.println("Надеть шапку");
        }

        System.out.println("Задача № 3 ");

        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + "  км /ч, то придется заплатить штраф");
        } else {
            System.out.println("Не нужно платить штраф");
        }
        int speedАllowed = 50;
        if (speedАllowed < 60) {
            System.out.println("Если скорость " + speedАllowed + "  км /ч, то можно ехать спокойно");
        } else {
            System.out.println("Нужно сбавить скорость");
        }

        System.out.println("Задача № 4 ");

        int ageHuman = 17;
        if (ageHuman >= 2 && ageHuman < 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить  в детский сад");
        } else if (ageHuman >= 7 && age1 < 18) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить  в школу");
        } else if (ageHuman >= 18 && ageHuman < 24) {
            System.out.println("Если возраст человека равен " + ageHuman+ ", то ему нужно ходить в университет");
        } else if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу");
        }

        System.out.println("Задача № 5");


        int ageFromLessThan5 = 4;
        if (ageFromLessThan5 < 5) {
            System.out.println("Если возраст  ребенка равен " + ageFromLessThan5 + ", то  ему нельзя кататься на аттракционе.");
        } else {
            System.out.println("Если больше 5 лет, то может каталься на аттракционев в присутвствии взрослого");
        }

        int ageFrom5To14 = 6;
        if (ageFrom5To14 > 5 && ageFrom5To14 < 14) {
            System.out.println("Если возраст  ребенка равен " + ageFrom5To14 + ", то ему можно кататься на аттракционе в сопровождении  взрослого.");
        } else {
            System.out.println("Если больше 14 лет, то может кататься без  сопровождения взрослого");
        }

        int ageFromMoreThan14 = 14;
        if (ageFromMoreThan14 >= 14) {
            System.out.println("Если возраст  ребенка равен " + ageFromMoreThan14 + ", то  ему можно кататься на " +
                    "аттракционе  без  сопровождения взрослого.");
        } else {
            System.out.println("Если меньше 14 лет, то может кататься, но в  сопровождении взрослого ");
        }

        System.out.println("Задача № 6 ");

        int place = 61;
        if (place > 60) {
            System.out.println("Если место под номером " + place + ", то  место стоячее");
        } else if (place <= 60 && place!= 0) {
            System.out.println("Если место под номером " + place + ", то место сидячее");
        } else if (place > 102) {
            System.out.println("Если мест " + place + ", то вагон уже полностью забит ");
        }

        System.out.println("Задание № 7");
        int one = 10;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Максимальное число равное " + one);
        } else if (two > one && two > three) {
            System.out.println("Максимальное число равное " + two);
        } else if (three > one && three > two) {
            System.out.println("Максимальное число равное " + three);
        }
    }
}