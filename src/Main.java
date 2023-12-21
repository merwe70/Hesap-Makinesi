import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1, number2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        number1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        number2 = input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz :\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçim Yapınız : ");
        select = input.nextInt();

        switch (select) {
            case (1):
                System.out.println("Sonuç : " + (number1 + number2));
                break;
            case (2):
                System.out.println("Sonuç : " + (number1 - number2));
                break;
            case(3):
                System.out.println("Sonuç : " + (number1*number2));
                break;
            default:
                System.out.println("Sonuç : " + (number1/number2));
                break;

        }
    }
}
