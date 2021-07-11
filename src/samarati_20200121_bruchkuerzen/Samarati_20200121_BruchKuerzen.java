package samarati_20200121_bruchkuerzen;

import java.util.Scanner;

public class Samarati_20200121_BruchKuerzen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int zaehlerUK, nennerUK, zaehlerK, nennerK, max, min, rest, bruchstrich_zaehlerUK, bruchstrich_nennerUK, bruchstrich_zaehlerK, bruchstrich_nennerK, zeichnen;
        int anzahl = 0;
        System.out.println("Brüche mit ganzzahligem Zähler- bzw. Nennerwert kürzen - Ende bei Eingabe Zählerwert 0! ");
        while(true){
            System.out.println("Zähler ? ");
            s = sc.next();
            zaehlerUK = Integer.parseInt(s);
            bruchstrich_zaehlerUK = s.length();
            if(zaehlerUK==0) break;
            do{
                System.out.println("Nenner ? ");
                s = sc.next();
                nennerUK = Integer.parseInt(s);
                bruchstrich_nennerUK = s.length();
                if(nennerUK==0) System.out.println("Null im Nenner ist nicht erlaubt! ");
            }while(nennerUK==0);
            if(zaehlerUK<nennerUK){
                max = nennerUK;
            }else{
                max = zaehlerUK;
            }
            if(zaehlerUK<nennerUK){
                min = zaehlerUK;
            }else{
                min = nennerUK;
            }
            rest = 1;
            while(rest!=0){
                rest = max % min;   
                max = min;  
                min = rest; 
            }
            zaehlerK = zaehlerUK/max;
            s = Integer.toString(zaehlerK);
            bruchstrich_zaehlerK = s.length();
            nennerK = nennerUK/max;
            s = Integer.toString(nennerK);
            bruchstrich_nennerK = s.length();
            anzahl = anzahl+1;
            System.out.print(zaehlerUK);
            if(bruchstrich_zaehlerUK<bruchstrich_nennerUK){
                zeichnen = bruchstrich_nennerUK-bruchstrich_zaehlerUK;
                for(int i=0;i<zeichnen;i++){System.out.print(" ");}
            }
            System.out.print("   ");
            System.out.print(zaehlerK);
            System.out.println("");
            if(bruchstrich_zaehlerUK>bruchstrich_nennerUK){
                for(int i=0;bruchstrich_zaehlerUK>i;i++){
                    System.out.print("-");
                }
            }else{
                for(int i=0;bruchstrich_nennerUK>i;i++){
                    System.out.print("-");
                }
            }
            System.out.print(" = ");
            if(bruchstrich_zaehlerK>bruchstrich_nennerK){
                for(int i=0;bruchstrich_zaehlerK>i;i++){
                    System.out.print("-");
                }
                System.out.println("");
            }else{
                for(int i=0;bruchstrich_nennerK>i;i++){
                    System.out.print("-");
                }
                System.out.println("");
            }
            System.out.print(nennerUK);
            if(bruchstrich_zaehlerUK>bruchstrich_nennerUK){
                zeichnen = bruchstrich_zaehlerUK-bruchstrich_nennerUK;
                for(int i=0;i<zeichnen;i++){System.out.print(" ");}
            }
            System.out.print("   ");
            System.out.print(nennerK);
            System.out.println("");
        }
        System.out.println("Es wurden insgesamt "+anzahl+" Brüche gekürzt - Aufwiedersehen! ");  
        
    }
    
}// (c) Samarati
