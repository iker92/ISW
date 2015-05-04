/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package portafogliosingleton;
import java.util.*;
import java.lang.*;

public class ConsoleApplication {
    //ObserverBiglietti observers=new ObserverBiglietti();
   
    public static String ticketMinType;
    public static AbstractFactoryBiglietti fact;
   //public static PortafoglioSingleton PortafoglioSingleton.getInstance()=PortafoglioSingleton.getInstance();
    public static void main(String[] args) {
        
        PortafoglioSingleton.getInstance().addObserver(new ObserverBiglietti());
        boolean flag=true;
        while(flag){
        System.out.println("1)Vuoi acquistare un biglietto?");
        String cosaDaleggere;
        Scanner scan = new Scanner(System.in);
       
       cosaDaleggere= scan.nextLine();
           
       if (cosaDaleggere.equals("si"))
       { flag=true;
           System.out.println("Quale biglietto vuoi acquistare? 1)Ctm 2) Arst\n");
           
                String companyName;
                String companyNumber;
                Scanner scanI = new Scanner(System.in);
                companyName= scanI.nextLine();
                if (companyName.equals("1")){ 
                    fact=new CreatoreBigliettiCtm();
                }
                else if (companyName.equals("2")){ 
                   fact=new CreatoreBigliettiArst();
                }
              System.out.println("Quale biglietto vuoi acquistare? 1) 90Min 2) 120Min");
              String ticketMin;
              
              Scanner scanTicket = new Scanner(System.in);
              ticketMin= scanTicket.nextLine();
             
              Biglietto b=null;
              if (ticketMin.equals("1")){ 
                   b=fact.CreaBiglietto90Min();
              }
              
              else if (ticketMin.equals("2")){
                  b=fact.CreaBiglietto120Min();
              }
               
               if (b!=null)
                PortafoglioSingleton.getInstance().addBiglietto(b);     } 
       
       
       if(cosaDaleggere.equals("no")){
           
           System.out.println("1))Visualizzazione biglietti acquistati\n2)Esci");
            String ticket;
              
              Scanner scanTicket = new Scanner(System.in);
              ticket= scanTicket.nextLine();
              if(ticket.equals("1")){
           System.out.println("1)Visualizza tutti i biglietti\n2)Visualizza biglietti 90Min\n3)Visualizza biglietti 120Min");
       
            String ticket1;
              
              Scanner scanTicket1 = new Scanner(System.in);
              ticket1= scanTicket1.nextLine();
              if(ticket1.equals("1")){
           PortafoglioSingleton.getInstance().GetIterator();}
              if(ticket1.equals("2")){
           PortafoglioSingleton.getInstance().GetIterator90Min();}
       
               if(ticket1.equals("3")){
           PortafoglioSingleton.getInstance().GetIterator120Min();}
       }
       
       
        if (ticket.equals("2"))
       { flag=false;   }}
        
      
                            }
        Scanner scn=new Scanner(System.in);
        scn.close();
       
         
 
               
       
               
      
       
 
  
}
    }

