import java.util.Scanner;

public class sayisaloranibulma{

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int büyüktoplamsayi = 0;
    int küçüktoplamsayi = 0;

    for (int i = 1; i <= 10; i++) {

      System.out.print(i + ". Sayı: (0-100 Arası) ");

      int sayı = scanner.nextInt();

      if (sayı >= 0 && sayı <= 100) {

        if (sayı >= 50) {
          büyüktoplamsayi += sayı;
        } else {
          küçüktoplamsayi += sayı;
        }
      } else {

        System.out.println(" Lütfen 0-100 arasında bir sayı girin.");
        
        i--;
        
      }

    }

    double oran = (büyüktoplamsayi > 0) ? (double) küçüktoplamsayi / büyüktoplamsayi : 0;

    System.out.println("50 ve üstünde olan sayıların toplamı: " + büyüktoplamsayi);
    System.out.println("50'den küçük olan sayıların toplamı: " + küçüktoplamsayi);
    System.out.println("Sayıların oranı: " + oran);

    scanner.close();

  }

}