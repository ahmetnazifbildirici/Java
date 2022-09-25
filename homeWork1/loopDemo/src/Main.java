public class Main {
    public static void main(String[] args) {
        //For
        for(int i=1;i<=13;i=i+2){
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti. Döngüdeki tek sayılar yazdırıldı.");

        //While
        int i =2;
        while(i<10){
            System.out.println(i);
            i=i+2;

        }
        System.out.println("While döngüsü bitti. Döngüdeki çift sayılar yazdırıldı.");

        //Do-While
        int j =1;
       do {
           System.out.println(j);
           j+=2;
       }while (j<10);
           System.out.println("Do-While döngüsü bitti.");

    }
}


///VİDEO NOTLARI
//for döngüsünde i yi tanımlamak zorundasın.
//++ bir artır demektir. -- de bir azalt demektir.
//Noktalı virgüle kadar olan kısıma sayaç diyoruz.
// Noktalı virgülden sonra şart tanımlanır.
// Son kısımda sayaç kaçar kaçar artacak demektir.
//Listeler de çok iyimize yarayacak.
//Bir değişken sadece tanımlandığı blokta geçerlidir.
//Do-While log atmak için kullanılır.
//Şart sağlanmadığı sürece bir kez çalışan şart sağlandığında ise whileden hiç bir farkı olmayan.