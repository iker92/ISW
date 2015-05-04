/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafogliosingleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Alessio
 */
public class ObserverBiglietti implements Observer{
    
    ArrayList<Observer> obList=new ArrayList<Observer>();
    
    @Override
    public String toString(){
    return "Biglietto";
    }
    
    
    public void update(Observable o,Object arg){
        
        if(arg!=null){
        int num=(int) arg;
        if(num==0){
        System.out.println("Hai finito i biglietti");}
        
        }
            
       
    }
    
    
   
}
