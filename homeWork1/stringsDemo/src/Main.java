public class Main {
    public static void main(String[] args) {
        String mesaj = "    Bügün hava çok güzel    ";
        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5. Eleman : " + mesaj.charAt(4));
        System.out.println(mesaj.concat(" Bugün hava çok güzel yasasın"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("L"));
        char[] karakterler = new char[5];
        mesaj.getChars(0 , 5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("va"));
        System.out.println(mesaj.lastIndexOf("a"));
*/
        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,7));

        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());

    }
}


//Video NOTLARI
//Stringler birer chardır.
//length kaç eleman var
//charAt kaçıncı eleman nedir
//concat birlestirmek
//starsWith ne ile baslıyor sorusu true false döndürür. endsWith ne ile bitiyor.
//char[] karakterler = new char[5]; mesaj.getChars(0 , 5,karakterler,0);  System.out.println(karakterler);
//indexOf bastan mesajın kaçıncı eleman olduğunu bulmaya yarar. Metin de aranabilir. CTRL F olayı
//lastIndexOf sondan arar
//replace metin içersindeki karakterleri değistirme
//substiring parçalamak nereden parçalayacak.
//Split kelimeleri nereden ayırmak isyip altalta yazdırmak istememizdir.
//toLowerCase metnin bütün harflarini küçük harfe çevirme toUpperCase büyük harf -- veri tabanına arama gönderildiğinde kullanılır.
//trim boslukları atmak