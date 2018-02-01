/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

/**
 *
 * @author HP
 */
public class Nodos {
    int dato;
    Nodos enlace;
    public Nodos (int x){
        dato=x;
        enlace =null;
    }

    public int getDato() {
        return dato;
    }

    public Nodos getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodos enlace) {
        this.enlace = enlace;
}     
}
