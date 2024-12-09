/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hu.szamalk.cspf1byszr;

import hu.szamalk.JatekModel.LogikaiJatek;
import hu.szamalk.model.Tabla;

/**
 *
 * @author szabo.roland
 */
public class CsPf1BySzR {

    public static void main(String[] args) {
        Tabla tabla = new Tabla('*');
        
        tabla.Megjelenit();
        tabla.doElhelyez(8);
        tabla.Megjelenit();
        
        LogikaiJatek j1 = new LogikaiJatek();
        LogikaiJatek j2 = new LogikaiJatek(10);
    }
}
