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
public class FactoryBiglietti {
    
    public static AbstractFactoryBiglietti getTicketType(String type){
    
        if(type.equals("ctm")){
            return new CreatoreBigliettiCtm();
        }
        else if(type.equals("arst")) {
            return new CreatoreBigliettiArst();
        
        }
    
         return null;
    } 
       
    public static Biglietto getTicketMin(String min){
    
        if(min.equals("90Min")){
            
            return new Biglietto90Min();
            
        }
        else if(min.equals("120Min")) {
            return new Biglietto120Min();
        
        }
    
         return null;
    } 
}
