import java.time.LocalDate;

public class Main {
    public static void recommendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviceOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceOld) {
            System.out.print("lite ");
        }
        System.out.println("версию для ");
        if (clientOS == 0) {
            System.out.println("iOS");
        } else {
            System.out.println("Android");
        }
    }
    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }
    public static void main(String[] args) {
        System.out.println("Методы. Задача 2");
        int deviceYear = 2020;
        int clientOS = 0;
        recommendApplicationVersion(clientOS, deviceYear);
    }
}





