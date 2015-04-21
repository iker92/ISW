/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafogliosingleton;

/**
 *
 * @author HP-Paviliong6
 */
public class CreatoreBigliettiArst implements AbstractFactoryBiglietti{
    public static String min0;
    public Biglietto90Min CreaBiglietto90Min(){
        
            return new Biglietto90MinArst(); }
    
    public Biglietto120Min CreaBiglietto120Min(){
        
            return new Biglietto120MinArst();}
    public String getMin(String min){
        min0=min;
        return min0;
                }
    
             public String toString(){
    
    return "Biglietto Arst "+min0;
    
            
    };
}