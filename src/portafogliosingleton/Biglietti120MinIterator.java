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
public class Biglietti120MinIterator implements java.util.Iterator<Biglietto>{
    
     

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Biglietto next() {
    
         Iterator<Biglietto> itr =PortafoglioSingleton.getInstance().lista.iterator();
        Object element =itr.next();
        
if (element instanceof Biglietto120Min) {
    return itr.next();
}
    
     return null;    
    }
    
}
