import java.util.Scanner;

public class asalsayi{
 
    public static void main(String[] args) 
    
    { 
        
        System.out.println("1'den 20'ye Kadar Olan Tüm Asal Sayılar"); 
    
        int sayac = 0;
        for(int sayi=2;sayi<=20;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                } 
            }
                
            if(kontrol==0)
            {
                System.out.print(sayi+"\n");
                sayac++; 
            }
        }
    }    
        
}