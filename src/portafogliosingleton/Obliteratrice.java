/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafogliosingleton;



/**
 *
 * @author Alessio
 */
public interface Obliteratrice {

    public String Oblitera(Biglietto b);

    public void SetNext(Obliteratrice o);
    

}
