/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.szamalk.JatekModel;

/**
 *
 * @author szabo.roland
 */
public class LogikaiJatek extends Jatek {
    private Babu[][] tabla;
    private int[] sorrend;
    private int babuDb ;

    public Babu[][] getTabla() {
        return tabla;
    }

    public int[] getSorrend() {
        return sorrend;
    }

    public int getBabuDb() {
        return babuDb;
    }

    public LogikaiJatek(){
        this(3);
    }
    
    public LogikaiJatek(int babuDb){
        super();
        this.babuDb = babuDb >= 2 && babuDb < 16 ? babuDb : 2;
        tabla = new Babu[4][5];
        sorrend = new int[10];
    }
    
    public boolean vanefelettero(){
        return false;
    }

    @Override
    public void kezd() {
        System.out.println("Kezdés");
    }

    @Override
    public void ment() {
        System.out.println("Mentés");
    }

    @Override
    public void vege() {
        System.out.println("Vége");
    }
    
    public String toString(){
        return "";
    }
}
