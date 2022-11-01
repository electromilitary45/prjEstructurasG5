package prjestructurag5;

import javax.swing.JOptionPane;

public class ListaES {

    private Nodo inicio;

    public ListaES() {
        this.inicio = null;
    }

    public boolean VaciasLista() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }//fin Vacia()

    //-----------------------------METODOS---------------------------------
    public void agregarUsuario() {
        //--instacia
        Dato d = new Dato();
        //--
        d.setNombre(JOptionPane.showInputDialog("DIGITE UN NOMBRE"));
        d.setUsuario(JOptionPane.showInputDialog("DIGITE UN NOMBRE DE USUARIO:"));

        d.setApellido(JOptionPane.showInputDialog("DIGITE UN APELLIDO:"));
        d.setContrasena(JOptionPane.showInputDialog("DIGITE UNA CONTRASEÑA:"));
        d.setEstado(true);

        Nodo nuevo = new Nodo();
        nuevo.setElemento(d);

        if (VaciasLista()) {//se pone al inicio
            inicio = nuevo;
        } else if (d.getNombre().compareTo(inicio.getElemento().getNombre()) < 0) { // se pone a la derecha
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        } else if (inicio.getSiguiente() == null) {//se pone a la izquierda 
            inicio.setSiguiente(nuevo);
        } else {//se pone en medio
            Nodo aux = inicio;
            while ((aux.getSiguiente() != null) && (aux.getSiguiente().getElemento().getUsuario().
                    compareTo(d.getUsuario()) < 0)) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }//fin agregarUsuario

    public void desactivarUsuario() {
        
        String usuario = JOptionPane.showInputDialog("DIGITE EL USUARIO A ELIMINAR");
        if (!VaciasLista()) {
            if (inicio.getElemento().getUsuario().equals(usuario)) {
                inicio = inicio.getSiguiente();
                JOptionPane.showMessageDialog(null,
                        "¡Se desactivo el cliente con exito!");
            } else {
                Nodo anterior;
                Nodo auxiliar;
                anterior = inicio;
                auxiliar = inicio.getSiguiente();
                while ((auxiliar != null) && (!auxiliar.getElemento()
                        .getUsuario().equals(usuario))) {
                    anterior = anterior.getSiguiente();
                    auxiliar = auxiliar.getSiguiente();
                }
                if (auxiliar != null) {
                    anterior.setSiguiente(auxiliar.getSiguiente());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "La lista esta vacia");
        }
    }//fin desactivar

    public void mostrarUsuarios() {
        if (!VaciasLista()) {
            String s = "";
            String a = "";
            Nodo aux = inicio;
            while (aux != null) {
                if (aux.getElemento().isEstado() == true) {
                    a = "Usuario Activo";
                } else {
                    a = "Usuario Inactivo";
                }
                s = s + "Usuario:" + aux.getElemento().getUsuario() + "--" + aux.getElemento().getNombre() + aux.getElemento().getApellido()
                        + "--" + aux.getElemento().getContrasena() + "--" + a + "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, s);
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados, no se puede mostrar");
        }
    }

}//fin clase LISTAES(){}
