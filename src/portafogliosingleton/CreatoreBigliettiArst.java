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
public class CreatoreBigliettiArst implements AbstractFactoryBiglietti {

    public static String min;

    public Biglietto90Min CreaBiglietto90Min() {

        return new Biglietto90MinArst();
    }

    public Biglietto120Min CreaBiglietto120Min() {

        return new Biglietto120MinArst();
    }

    public String getMin(String min) {
        this.min = min;
        return this.min;
    }

    public String toString() {

        return "Biglietto Arst " + this.min;

    }
;
}
