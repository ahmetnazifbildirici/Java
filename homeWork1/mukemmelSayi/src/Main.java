public class Main {
    public static void main(String[] args) {
        //6 --> 1,2,3
        //28 --> 1,2,4,7,14
        int toplam = 0;
        int number = 6;

        for(int i =1; i<number;i++){
            if(number % i ==0){
                toplam +=i;

            }
        }
        if(number== toplam){
            System.out.println("Sayı mükkemmeldir.");
        }else {
            System.out.println("Sayı mükemmel değildir.");
        }





    }
}