/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafogliosingleton;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Alessio
 */
public class ObserverObliteratrice implements Observer {

    
 static int numARST=0; static int numCTM=0;static int num=0;
    @Override
    public String toString() {
        return "Obliteratrice";
    }
    
    public static int getNumARST(){
        return numARST;
    }
      public static int getNumCTM(){
        return numCTM;
    }
    public static int getNum(){

    return num;
    }

    public void update(Observable o, Object arg) {

        if (arg != null) {
            num = (int) arg;
           
            
            if (o instanceof ObliteratriceARST )
            {
                numARST+=1;
            }
            
            if (o instanceof ObliteratriceCTM )
            {
                numCTM+=1;
            }


        }

    }
    
    
}
