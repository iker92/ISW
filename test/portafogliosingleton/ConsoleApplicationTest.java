/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafogliosingleton;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import junit.framework.Assert;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alessio
 */
public class ConsoleApplicationTest {
    
  
    @Test
    public void testAggiunta() {
        
        //test aggiunta biglietto
        Biglietto b=new Biglietto90MinCtm();
        PortafoglioSingleton.getInstance().lista.add(b);
        //ArrayList<Biglietto> list=new ArrayList<Biglietto>();
        //list.add(new Biglietto90MinCtm());
        Assert.assertEquals(PortafoglioSingleton.getInstance().lista.size(), 1);
   
    }
    @Test
                public void testRimuovi(){
        //test rimozione biglietto
        Biglietto b=new Biglietto90MinCtm();
        Obliteratrice ob=new ObliteratriceCTM();
       b=PortafoglioSingleton.getInstance().UtilizzaBiglietto();
     ob.Oblitera(b);
     Assert.assertEquals(PortafoglioSingleton.getInstance().lista.size(), 0);
                }
     @Test
      
    public void callPrivateConstructorsForCodeCoverage() throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException{
        Class<?>[] classesToConstruct = {PortafoglioSingleton.class};
        for(Class<?> clazz : classesToConstruct)
        {
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            assertNotNull(constructor.newInstance());
        }
    }
     
     
    @Test
    
    public void TestIterator(){

        ArrayList<Biglietto> list=new ArrayList<Biglietto>();
        
        list.add(new Biglietto90MinCtm());
        list.add(new Biglietto90MinArst());
        
        PortafoglioSingleton.getInstance().lista.add(new Biglietto90MinCtm());
        PortafoglioSingleton.getInstance().lista.add(new Biglietto90MinArst());
        
      
        
        
Assert.assertEquals(PortafoglioSingleton.getInstance().GetIterator(),"Biglietto 90Min Ctm\nBiglietto90MinArst");
    
    
    
    
    
    }
    }
    
    
    
     
                
        
        
    
    

