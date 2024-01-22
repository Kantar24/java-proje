import java.util.Scanner;

public class sekilolusturma {

    public static void main(String[] args){

    int i,k;
    
    int sembol=1;
        
        for(k=0; k<4; k++) {
    
            for (i=0; i <sembol; i++) {
    
                System.out.print("*");
    
            }
    
            System.out.println("");
            sembol++;
    
        }

        for(k=0; k<8; k++) {
            
            for (i=0; i <sembol; i++) {
                
                System.out.print("*");
            
            }
            
            System.out.println("");
            sembol--;
        
        }

    }

}