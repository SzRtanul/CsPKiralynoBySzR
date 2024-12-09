/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.szamalk.JatekModel;

/**
 *
 * @author szabo.roland
 */
public abstract class Jatek {
    private static int jatekDB = 0;
    
    public int getJatekDB(){
        return jatekDB;
    }
    
    public Jatek(){
        jatekDB++;
    }
    
    public abstract void kezd();
    public abstract void ment();
    public abstract void vege();
}


