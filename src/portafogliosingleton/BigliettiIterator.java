/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafogliosingleton;

import java.util.List;

/**
 *
 * @author Alessio
 */
public class BigliettiIterator implements java.util.Iterator<Biglietto>{
    
    

    @Override
    public boolean hasNext() {
       if(PortafoglioSingleton.getInstance().lista.iterator().hasNext()) {return true;}
       else return false;
    }

    @Override
    public Biglietto next() {
         return PortafoglioSingleton.getInstance().lista.iterator().next();
    }
    
}


