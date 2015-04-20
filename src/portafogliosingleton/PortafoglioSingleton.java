
package portafogliosingleton;

import java.util.*;


public class PortafoglioSingleton{

    private static PortafoglioSingleton portafoglio;
    
        private PortafoglioSingleton(){};
    
        public static PortafoglioSingleton getInstance(){
            
            if (portafoglio == null){
                   
                portafoglio = new PortafoglioSingleton();
                                }      
        return portafoglio; 
        }
        
    public static ArrayList<AbstractFactoryBiglietti> lista=new ArrayList<AbstractFactoryBiglietti>();
    
    
       public static void addBiglietto(AbstractFactoryBiglietti bigl){
        lista.add(bigl);
    }
    
    }
    

        /*List<Biglietto> lista;
            System.out.println(lista.getInstance());*/
    


/* Metodo addTicket() con ticket Public */

