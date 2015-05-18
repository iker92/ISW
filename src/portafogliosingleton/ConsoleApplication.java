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

    static Obliteratrice obliter;
//chain of responsability
    private static void setChainObliteratrice() {
        obliter = new ObliteratriceCTM();
        obliter.SetNext(new ObliteratriceARST());

    }

    public static AbstractFactoryBiglietti factory;

    //public static PortafoglioSingleton PortafoglioSingleton.getInstance()=PortafoglioSingleton.getInstance();
    public static void main(String[] args) {

        Biglietto bigl = null;
        setChainObliteratrice();
        PortafoglioSingleton.getInstance().addObserver(new ObserverBiglietti());
        boolean flag = true;
        while (flag) {
            System.out.println("1)Vuoi acquistare un biglietto?");
            String acquisto;
            Scanner scan = new Scanner(System.in);

            acquisto = scan.nextLine();

            if (acquisto.equals("si")) {
                flag = true;
                System.out.println("Quale biglietto vuoi acquistare? 1) Ctm  2) Arst\n");

                String companyName;
                Scanner scanI = new Scanner(System.in);
                companyName = scanI.nextLine();
                if (companyName.equals("1")) {
                    factory = new CreatoreBigliettiCtm();
                } else if (companyName.equals("2")) {
                    factory = new CreatoreBigliettiArst();
                }
                System.out.println("Quale biglietto vuoi acquistare? 1) 90Min 2) 120Min");
                String ticketMin;

                Scanner scanTicket = new Scanner(System.in);
                ticketMin = scanTicket.nextLine();

                if (ticketMin.equals("1")) {
                    bigl = factory.CreaBiglietto90Min();
                } else if (ticketMin.equals("2")) {
                    bigl = factory.CreaBiglietto120Min();
                }

                if (bigl != null) {
                    PortafoglioSingleton.getInstance().addBiglietto(bigl);
                }
            }

            if (acquisto.equals("no")) {

                System.out.println("1) Visualizzazione biglietti acquistati\n2) Oblitera\n3) Esci");
                String ticket;

                Scanner scanTicket = new Scanner(System.in);
                ticket = scanTicket.nextLine();
                if (ticket.equals("1")) {
                    System.out.println("1) Visualizza tutti i biglietti\n2) Visualizza biglietti 90Min\n3) Visualizza biglietti 120Min");

                    String ticket1;

                    Scanner scanTicket1 = new Scanner(System.in);
                    ticket1 = scanTicket1.nextLine();
                    if (ticket1.equals("1")) {
                        PortafoglioSingleton.getInstance().GetIterator();
                    }
                    if (ticket1.equals("2")) {
                        PortafoglioSingleton.getInstance().GetIterator90Min();
                    }

                    if (ticket1.equals("3")) {
                        PortafoglioSingleton.getInstance().GetIterator120Min();
                    }
                }

                if (ticket.equals("2")) {

                    bigl = PortafoglioSingleton.getInstance().UtilizzaBiglietto();
                    System.out.println(obliter.Oblitera(bigl));

                }

                if (ticket.equals("3")) {

                    flag = false;
                }
            }

        }
        Scanner scn = new Scanner(System.in);
        scn.close();

    }
}
