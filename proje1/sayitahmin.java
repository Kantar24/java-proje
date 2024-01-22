import java.util.Scanner;
import java.util.Random;

public class sayitahmin{

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int rastgeles = random.nextInt(100) + 1;

    System.out.println("1-100 Arası Bir Sayı Seçimi Yapıldı. Lütfen Seçilen Sayıyı Bulunuz");

    int tahmin;
    int denemes = 0;

    do {

      System.out.print("Tahmininiz: ");
      tahmin = scanner.nextInt();
      denemes++;

      if (tahmin > rastgeles) {
        System.out.println("Daha Küçük Sayı Girin");
      } else if (tahmin < rastgeles) {
        System.out.println("Daha Büyük Sayı Girin");
      } 
      
      else {
        if (denemes == 1) {
          System.out.println("TEBRİKLERRR! SAYIYI İLK DENEMEDE BULDUNUZ");
        } else {
          System.out.println("Tebrik Ederiz Seçilen Sayıyı " + denemes + " Deneme Sonrası Buldunuz.");
        }

      }

    } 
    
    while (tahmin != rastgeles);

    scanner.close();

  }

}