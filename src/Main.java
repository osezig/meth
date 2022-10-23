public class Main {

    public static void calculateDeliveryDays(int deliveryDistance) {
        int deliveryDistanse = 95;

        int deliveryDays = 1;

        if (deliveryDistanse > 20) {
            deliveryDays++;
        }
        if (deliveryDistanse > 60 && deliveryDistance <= 100) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays);}
    }

        public static void main (String[]args){
            System.out.println("Методы. Задача 3");
            int deliveryDistance = 50;
            calculateDeliveryDays(deliveryDistance);
        }
    }


