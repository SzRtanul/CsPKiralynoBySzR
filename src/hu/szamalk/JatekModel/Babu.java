/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.szamalk.JatekModel;

/**
 *
 * @author szabo.roland
 */
public class Babu {
    private int ero;
    private String szin;
    
    public Babu(String szin){
        this(1, szin);
    }
    
    public Babu(int ero, String szin){
        this.ero = ero>0 && ero < 10 ? ero : 1;
        this.szin = szin;
    }
    public int getEro() {
        return ero;
    }

    public String getSzin() {
        return szin;
    }
    
   
}
