import java.util.Scanner;

public class seslisessizharf{

	public static void main(String[] args){

		String isim;
		int sesliharf;

		Scanner scan = new Scanner(System.in);
		System.out.println("Metin Giriniz: ");
		isim = scan.nextLine();

		for(int i=0; i<isim.length(); i++){

			char c = isim.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='ı' || c=='o' || c=='ö' || c=='u' || c=='ü'){

				sesliharf++;

			};

			System.out.println("Sesli Harf Sayısı: " + sesliharf);
			System.out.println("Sessiz Harf Sayısı: " + isim.length()-sesliharf);

		}

	}

};