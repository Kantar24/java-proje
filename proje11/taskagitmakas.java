package proje11;
import java.util.Random;
import java.util.Scanner;

public class taskagitmakas {

	public static void main(String[] args) {

		int kisi,pc;
		
		Random rnd=new Random();
		pc=rnd.nextInt(2)+1; 
		System.out.println("Bilgisayarın Seçimi >" + - pc);
		System.out.println("0 - Taş");
		System.out.println("1 - Kağıt");
		System.out.println("2 - Makas");
		System.out.println("Lütfen Seçiminizi Yapınız");
		Scanner glnok=new Scanner(System.in);
		kisi=glnok.nextInt();

		if(kisi!=0 && kisi!=1 && kisi!=2)
		{
			System.out.println("Yanlış Bir Seçim Yapılmış Lütfen Tekrar Deneyin");
		}

		else 
		{ 
			
			if(pc==kisi)
			{
				System.out.println("BERABERE");
			}
			if(pc==0 &&kisi==1)
			{
				System.out.println("KULLANICI KAZANDI");
			}
			if(pc==0 && kisi==2)
			{
				System.out.println("BİLGİSAYAR KAZANDI");
			}
			if(pc==1 && kisi==0)
			{
				System.out.println("KULLANICI KAZANDI");
			}			
			if(pc==1 && kisi==2)
			{
				System.out.println("BİLGİSAYAR KAZANDI");
			}
			if(pc==2 && kisi==0)
			{
				System.out.println("KULLANICI KAZANDI");
			}
			if(pc==2 && kisi==1)
			{
				System.out.println("BİLGİSAYAR KAZANDI");
			}
			
		}

	}

}