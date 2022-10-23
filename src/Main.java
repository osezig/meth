public class Main {

    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + "не является високосным");
        }
    }

    public static void main(String[]args) {
        System.out.println("Методы. Задача 1");
        int year = 2020;
        printIsLeapYear(year);
    }
}


