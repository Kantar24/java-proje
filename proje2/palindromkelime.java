import java.util.Scanner;
 
public class palindromkelime {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int sayac = 0;

        System.out.print("Bir Kelime Giriniz: ");

        String kelime = scan.nextLine();

        String yenikelime = "";
        
        for(int i = (kelime.length()-1); i >= 0; i--)
        {

            yenikelime += kelime.charAt(i);
        }


        if(yenikelime.equals(kelime)) {

            System.out.println("Girilen Kelime Palindrom Bir Kelimedir.");

        }

        else {

            System.out.println("Girdiginiz Kelime Palindrom Bir Kelime Değildir.");

        }

    }

}