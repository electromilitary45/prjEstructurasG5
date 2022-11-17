package prjestructurag5;

public class NodoP {

    private dIngresos elemento;
    private NodoP siguiente;

    public NodoP() {
        this.siguiente = null;
    }

    public dIngresos getElemento() {
        return elemento;
    }

    public void setElemento(dIngresos elemento) {
        this.elemento = elemento;
    }

    public NodoP getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoP siguiente) {
        this.siguiente = siguiente;
    }

}
