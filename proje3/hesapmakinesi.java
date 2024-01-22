import java.util.Scanner;
 
public class hesapmakinesi {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("1. Sayıyı Giriniz: ");

        int sayi1 = scan.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");

        int sayi2 = scan.nextInt();
        
        System.out.println("Yapılacak İşlem İçin Sayı Seçiniz");
        System.out.println("1. Toplama İşlemi");
        System.out.println("2. Çıkarma İşlemi");
        System.out.println("3. Çarpma İşlemi");
        System.out.println("4. Bölme İşlemi");
        
        System.out.print("Yapılacak İşlem İçin Seçtiğiniz Sayıyı Giriniz: ");
        int secim = scan.nextInt();
        
        if(secim == 1) {System.out.println("Toplama İşleminin Sonucu -> = " + (sayi1 + sayi2));}
        else if(secim == 2) {System.out.println("Çıkarma İşleminin Sonucu = " + (sayi1 - sayi2));}
        else if(secim == 3) {System.out.println("Carpma İşleminin Sonucu = " + (sayi1 * sayi2));}
        else if(secim == 4) {System.out.println("Bölme İşleminin Sonucu = " + (float)sayi1 / sayi2);}
        else {System.out.println("Hata Meydana Geldi. Lütfen Tekrar Deneyiniz.");}

    }

}