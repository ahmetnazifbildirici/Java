public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2, 1.5, 2.6, 8.3, 7.8};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam = " + total);
        System.out.println("En büyük = " + max);

    }
}


//VİDEO NOTLARI
//Dizlileri istersek {1,2,4} gibide yazabiliriz.