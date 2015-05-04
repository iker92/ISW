
package portafogliosingleton;

import java.util.*;


public class PortafoglioSingleton extends Observable{

    private static PortafoglioSingleton portafoglio;
    
        private PortafoglioSingleton(){};
    
        public static PortafoglioSingleton getInstance(){
            
            if (portafoglio == null){
                   
                portafoglio = new PortafoglioSingleton();
                                }      
        return portafoglio; 
        }
        
    public  ArrayList<Biglietto> lista=new ArrayList<Biglietto>();
    
    
       public  void addBiglietto(Biglietto bigl){
        this.lista.add(bigl);
    }
       
      
      
       
       
       public Biglietto UtilizzaBiglietto(){
           
           
           Biglietto b=lista.get(0);
           
           
           //System.out.println(lista.get(0).toString());
          
          lista.remove(0);
           setChanged();
           notifyObservers(lista.size());
           
           return b;
       }
       
       public void GetIterator(){
           
   Iterator<Biglietto> bigl=new BigliettiIterator();
        
        bigl =lista.iterator();
       
while(bigl.hasNext()) { 
Object element =bigl.next();
 
        
if (element instanceof Biglietto) {
System.out.print(element + " \n"); 
}

} 
} 
       
       
       
       public void GetIterator90Min(){
        Iterator<Biglietto> bigl=new Biglietti90MinIterator();
        
        bigl =lista.iterator();
       
while(bigl.hasNext()) { 
Object element =bigl.next();
 
        
if (element instanceof Biglietto90Min) {
System.out.print(element + " \n"); 
}

} 
       
           
           
       }
       
       
       
       
              public void GetIterator120Min(){
        Iterator<Biglietto> bigl=new Biglietti120MinIterator();
        
        bigl =lista.iterator();
       
while(bigl.hasNext()) { 
Object element =bigl.next();
 
        
if (element instanceof Biglietto120Min) {
System.out.print(element + " \n"); 
}

} 
       
           
           
       }
       
       
}
       
       
       
       
       
       
       
    
    

     