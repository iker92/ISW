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
public interface AbstractFactoryBiglietti {

    public Biglietto90Min CreaBiglietto90Min();

    public Biglietto120Min CreaBiglietto120Min();

    public String getMin(String min);
}
