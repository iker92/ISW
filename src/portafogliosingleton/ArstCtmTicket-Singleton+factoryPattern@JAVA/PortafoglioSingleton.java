
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
        
    public  ArrayList<AbstractFactoryBiglietti> lista=new ArrayList<AbstractFactoryBiglietti>();
    
    
       public  void addBiglietto(AbstractFactoryBiglietti bigl){
        this.lista.add(bigl);
    }
    
    }
    

        /*List<Biglietto> lista;
            System.out.println(lista.getInstance());*/
    


/* Metodo addTicket() con ticket Public */

