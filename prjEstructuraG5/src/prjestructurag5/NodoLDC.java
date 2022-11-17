/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjestructurag5;

/**
 *
 * @author Derek
 */
public class NodoLDC {
    private dAsientos elemento;
    private NodoLDC siguiente ;
    private NodoLDC anterior;

    public NodoLDC() {
        this.siguiente=null;
        this.anterior=null;
    }

    public dAsientos getElemento() {
        return elemento;
    }

    public void setElemento(dAsientos elemento) {
        this.elemento = elemento;
    }

    public NodoLDC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLDC siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLDC getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoLDC anterior) {
        this.anterior = anterior;
    }
    
    
    
}
