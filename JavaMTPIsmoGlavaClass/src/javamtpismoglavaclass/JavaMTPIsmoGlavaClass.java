
package javamtpismoglavaclass;

import java.util.Scanner;


public class JavaMTPIsmoGlavaClass {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int brojBacanja;
        Brojac brojacPisama = new Brojac();
        Brojac brojacGlava = new Brojac();
        
        System.out.println("  Unesite broj bacanja novcica: ");
        brojBacanja = input.nextInt();
        
        while(brojBacanja >0){
        brojacPisama.reset();
        brojacGlava.reset();
        
        for(int i = 0; i< brojBacanja; i++){
            if(Math.random()<0.5)
                brojacPisama.uvecaj();
            else
                brojacGlava.uvecaj();
        }
            System.out.println("U "+ brojBacanja + " bacanja, palo je: ");
            System.out.println(brojacPisama.getBroj()+ " pisama");
            System.out.println("U "+ brojBacanja + " bacanja, palo je: ");
            System.out.println(brojacGlava.getBroj() + " "
                    + "glava");
            System.out.println();
            System.out.println("Unesite broj bacanja: ");
            brojBacanja = input.nextInt();
            
        
        }
        
      
        
    }
    
}
