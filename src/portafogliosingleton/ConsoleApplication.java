/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package portafogliosingleton;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.*;
import java.lang.*;

public class ConsoleApplication {
   
    public static void main(String[] args) {
        
        boolean flag=true;
        while(flag){
        System.out.println("Vuoi acquistare biglietto?\n");
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
                if (companyName.equals("1")){ companyNumber="ctm";}
                else if (companyName.equals("2")){ companyNumber="arst";}
                else companyNumber="";
                
            AbstractFactoryBiglietti biglietti=FactoryBiglietti.getTicketType(companyNumber);
         
           
              System.out.println("Quale biglietto vuoi acquistare? 1) 90Min 2) 120Min");
              String ticketMin;
              String ticketMinType;
              Scanner scanTicket = new Scanner(System.in);
              ticketMin= scanTicket.nextLine();
              
              if (ticketMin.equals("1")){ ticketMinType="90Min";}
              else if (ticketMin.equals("2")){ ticketMinType="120Min";}
              else ticketMinType="";
               
               Biglietto bigliettiMin =FactoryBiglietti.getTicketMin(ticketMin);
               PortafoglioSingleton.addBiglietto(biglietti);}
               
         
        if (cosaDaleggere.equals("no"))
       { flag=false;   } }
        Scanner scn=new Scanner(System.in);
        scn.close();
       int i=PortafoglioSingleton.lista.size();
       System.out.println(i);
       
}
}

