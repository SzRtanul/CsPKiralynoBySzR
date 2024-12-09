/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.szamalk.model;

/**
 *
 * @author szabo.roland
 */
public class Tabla {
    private char[][] T;
    private char uresCella;
    
    public Tabla(char uresCella){
        T = new char[8][8];
        this.uresCella = uresCella;
        
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = this.uresCella;
            }
        }
    }
    
    public int getUresOszlopokSzama(){
        return 0;
    }
    
    public int getUresSorokSzama(){
        return 0;
    }
    
    public boolean doElhelyez(int N){
        boolean mem = false;
        boolean helyezett = false;
        int helyY, helyX;
        int i;
        for (i = 0; i < N; i++) {
            helyezett = mem;
            helyY = (int)(Math.random() * T.length);
            helyX = (int)(Math.random() * T[helyY].length);
            mem = T[helyY][helyX] == this.uresCella;
            if(mem){
                T[helyY][helyX] = 'K';
            }
            else if(helyezett && !mem) i--;
        }
        return (i ^ N) == 0;
    }
    
    public void Megjelenit(){
        System.out.println(getTabla());
    }
    
    public String getTabla(){
        String tabla = "";
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                tabla += T[i][j] + " ";
            }
            tabla += "\n";
        }
        return tabla;
    }
}
