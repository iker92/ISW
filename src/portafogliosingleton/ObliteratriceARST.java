/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.*/
package portafogliosingleton;

import java.util.Calendar;

/**
 *
 * @author Alessio
 */
public class ObliteratriceARST implements Obliteratrice {

    Obliteratrice next = null;

    @Override
    public String Oblitera(Biglietto b) {
        if (b instanceof Biglietto90MinArst || b instanceof Biglietto120MinArst) {
            Calendar now = Calendar.getInstance();
            return "Arst: " + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE);
        }//To change body of generated methods, choose Tools | Templates.
        else if (next != null) {
            return next.Oblitera(b);
        }
        return "Non posso gestirlo";
    }

    @Override
    public void SetNext(Obliteratrice o) {
        this.next = o;
    }

}
