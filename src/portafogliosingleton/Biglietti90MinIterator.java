/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafogliosingleton;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alessio
 */
public class Biglietti90MinIterator implements java.util.Iterator<Biglietto>{
 
     
    
        

    @Override
    public boolean hasNext() {
        
    if (PortafoglioSingleton.getInstance().lista.iterator().hasNext()) {
        System.out.println("true");
        return true;} 
    else return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Biglietto next() {
        Iterator<Biglietto> itr =PortafoglioSingleton.getInstance().lista.iterator();
        Object element =itr.next();
        
if (element instanceof Biglietto90Min) {
    return itr.next();
}
    
else return null;
    }
      
        
    
    
    
}
