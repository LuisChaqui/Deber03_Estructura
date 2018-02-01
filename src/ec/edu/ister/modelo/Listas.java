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
public class Listas {
    protected Nodos primero;
    public Listas(){
        primero=null;
    }
    public Listas insertarCabezaLista(int entrada){
        Nodos nuevo;
        nuevo=new Nodos(entrada);
        nuevo.enlace=primero;
        primero=nuevo;
        return this;   
    }
    public void visualizar(){
        Nodos n;
        int k=0;
        n=primero;
        while(n!=null){
            System.out.print(n.dato+" ");
            n=n.enlace;
            k++;
            System.out.print((k%15!=0?" ":"\n"));
        }
    }
    public boolean ListaVacia () {
        return(primero==null)?true:false;
    }
}  

