package org.example;

public class controlstatements {
    //switch
//selection statements
    public static void main(String[] args) {
        int week = 4;
        String weeknumber;
        switch (week) {
            case 1:
                weeknumber = "Monday";
                break;
            case 2:
                weeknumber = "Tuesday";
                break;
            case 3:
                weeknumber = "Wednesday";
                break;
            case 4:
                weeknumber = "Thrusday";
                break;
            default:
                weeknumber = "Invalid week";
                break;
        }
        System.out.println(weeknumber);


    }

    public static class WhileExample {
        public static void main(String[] args) {
            int a = 8;
            while (a < 10) {
                System.out.println("value of a " + a);
                a++;
                System.out.println("\n");
            }
        }
    }

    public static class DoWhileExample {
        public static void main(String[] args) {
            int a = 8;
            do {
                System.out.println("value of a " + a);
                a++;
            } while (a < 10);
        }
    }
}
