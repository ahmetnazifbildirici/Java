public class Main {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel geçtiniz.");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi geçtiniz.");
                break;

            case 'D':
                System.out.println("Kötü,geçtiniz.");
                break;

            case 'F':
                System.out.println("Malaalesef kaldınız.");
                break;
            default:
                System.out.println("Geçersiz not girdiniz.");

        }
    }
}


///Video NOTLARI
//if bloklarına göre çok az kullanılır.
//Temiz kodu suistimal eder.
//Dallandırma yapıyoruz.
//Kodu bitirmek için "break" kullanırız.
//Defoul else gibi
//CTRL + SHIFT + ALT + L ile bütün kodları düzeltecektir.