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
    public void agregarUsuario(String nombre, String apellido, String usuario, String contrasena){
        JOptionPane.showMessageDialog(null, usuario+"-"+apellido+"-"+usuario+"-"+contrasena);
    }//fin agregarUsuario
    
    public void desactivarUsuario(String usuario){
        JOptionPane.showMessageDialog(null, usuario);
    }//fin desactivar
    
    public void mostrarUsuarios(){
        JOptionPane.showMessageDialog(null, "AQUI SE MOSTRARAN LOS USUARIOS");
    }
    
    
}//fin clase LISTAES(){}
