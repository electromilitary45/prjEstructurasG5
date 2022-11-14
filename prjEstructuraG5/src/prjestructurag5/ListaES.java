package prjestructurag5;

import javax.swing.JOptionPane;

public class ListaES {

    //----ATRIBUTOS MODULO 1-------
    private Nodo inicio;
    //----ATRIBUTOS MODULO 2-------
    private NodoSC inicioSC;
    private NodoSC finSC;

    //------CONSTRUCTOR--------
    public ListaES() {
        this.inicio = null;//EnlazadaSimple
        this.inicioSC = null;//SimpleCircular
        this.finSC = null;//simpleCircular
    }

    //------METODOS GENERALES-----
    public boolean VaciasLista() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }//fin VaciaES()

    public boolean vaciaSC() {
        if (inicioSC == null) {
            return true;
        } else {
            return false;
        }
    }//fin vaciaSC

    //-----------------------------METODOS MODULO 1---------------------------------
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

    public void eliminarUsuario() {

        String usuario = JOptionPane.showInputDialog("DIGITE EL USUARIO A ELIMINAR");
        if (!VaciasLista()) {
            if (inicio.getElemento().getUsuario().equals(usuario)) {
                inicio = inicio.getSiguiente();
                JOptionPane.showMessageDialog(null,
                        "¡Se elimino el cliente con exito!");
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
    }//fin eliminar

    //inicio desactivar usuario
    public void desactivarUsuario() {
        Dato d = new Dato();
        String usuario = JOptionPane.showInputDialog("DIGITE EL USUARIO A DESACTIVAR");
        if (!VaciasLista()) {
            if (inicio.getElemento().getUsuario().equals(usuario) == true) {
                //inicio = inicio.getSiguiente();
                d.setEstado(false);
                inicio.getElemento().setEstado(false);
                //JOptionPane.showMessageDialog(null,
                //"¡Se desactivo el cliente con exito!");
                JOptionPane.showMessageDialog(null,
                        "Usuario: " + usuario + " descativado con exito");
            } else {

                JOptionPane.showMessageDialog(null, "Usuario no encontrado");

                //todo esto esta comentado porque no tiene uso, pero no se si se pude quitar o no.
                //Nodo anterior;
                //Nodo auxiliar;
                //anterior = inicio;
                //auxiliar = inicio.getSiguiente();
                //while ((auxiliar != null) && (!auxiliar.getElemento()
                //        .getUsuario().equals(usuario))) {
                //   d.setEstado(false);
                //    anterior = anterior.getSiguiente();
                //    auxiliar = auxiliar.getSiguiente();
                //}
                //if (auxiliar != null) {
                //    anterior.setSiguiente(auxiliar.getSiguiente());
                //}
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "La lista esta vacia");
        }
    }//fin desactivar usario

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
                s = s + "Usuario: " + aux.getElemento().getUsuario() + "--" + aux.getElemento().getNombre() + " " + aux.getElemento().getApellido()
                        + "--" + aux.getElemento().getContrasena() + "--" + a + "\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, s);
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados, no se puede mostrar");
        }
    }

    //-----------------------------METODOS MODULO 2---------------------------------
    //Inicio de modulo agregar evento
    public void agregarEvento() {
        try {
            dEventosSC DE = new dEventosSC();
            DE.setNombre(JOptionPane.showInputDialog("Digite el nombre del evento:"));
            DE.setCiudad(JOptionPane.showInputDialog("Digite el nombre de la Ciudad"));
            char op = ' ';
            String lugar = "";
            while (op != 'A' && op != 'B' && op != 'C') {

                op = JOptionPane.showInputDialog("Seleccione un lugar"
                        + "\nA. ESTADIO"
                        + "\nB. ANFITEATRO"
                        + "\nC. TEATRO").toUpperCase().charAt(0);
            }
            switch (op) {
                case 'A':
                    lugar = "ESTADIO";
                    break;
                case 'B':
                    lugar = "ANFITEATRO";
                    break;
                case 'C':
                    lugar = "TEATRO";
                    break;
            }
            DE.setLugar(lugar);
            DE.setDireccion("Digite una direccion");
            DE.setFecha(JOptionPane.showInputDialog("Digite la fecha del evento con el siguiente formato dd/mm/yyyy"));
            DE.setStatus(true);

            //se crea nodo
            NodoSC nuevo = new NodoSC();
            //se almacena 
            nuevo.setDato(DE);

            //INICIO DE LOGICA DE AGREGAR
            if (vaciaSC()) {
                inicioSC = nuevo;
                finSC = nuevo;
                finSC.setSiguiente(inicioSC);
            } else if (DE.getNombre().compareTo(inicioSC.getDato().getNombre()) < 0) {
                nuevo.setSiguiente(inicioSC);
                inicioSC = nuevo;
                finSC.setSiguiente(inicioSC);
            } else if (DE.getNombre().compareTo(finSC.getDato().getNombre()) >= 0) {
                finSC.setSiguiente(nuevo);
                finSC = nuevo;
                finSC.setSiguiente(inicioSC);
            } else {
                NodoSC aux = inicioSC;
                while (aux.getSiguiente().getDato().
                        getNombre().compareTo(DE.getNombre()) <= 0) {
                    aux = aux.getSiguiente();
                }
                nuevo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(nuevo);
            }

            //------RECURSIVIDAD--------
            char r = JOptionPane.showInputDialog("Desea ingresar otro evento?"
                    + "\nSI || NO").toUpperCase().charAt(0);
            if (r == 'S') {
                agregarEvento();
            } else {
                JOptionPane.showMessageDialog(null, "Evento agregado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar evento"
                    + "\n" + e.getMessage());
            char r = JOptionPane.showInputDialog("Desea intentar de nuevo?"
                    + "\nSI || NO").toUpperCase().charAt(0);
            if (r == 'S') {
                agregarEvento();
            }
        }

    }//Fin de metodo de agregar

    public void mostrarEvento() {
        if (!vaciaSC()) {
            String s = "";
            NodoSC aux = inicioSC;
            s = s + aux.getDato().getNombre() + "--" + aux.getDato().getFecha()
                    + "--" + aux.getDato().getCiudad() + aux.getDato().getLugar() + "--" + aux.getDato().getDireccion() + "--" + aux.getDato().isStatus() + "-->";
            aux = aux.getSiguiente();
            while (aux != inicioSC) {
                s = s + aux.getDato().getNombre() + "--" + aux.getDato().getFecha()
                        + "--" + aux.getDato().getCiudad() + aux.getDato().getLugar() + "--" + aux.getDato().isStatus() + "-->";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, s);
        } else {
            JOptionPane.showMessageDialog(null, "NO EXISTEN DATOS");
        }
    }//fin mostrarEvento

    public void editarEvento() {
        try {
            //------RECURSIVIDAD--------
            char r = JOptionPane.showInputDialog("Desea editar otro evento?"
                    + "\nSI || NO").toUpperCase().charAt(0);
            if (r == 'S') {
                String fechaEvent=JOptionPane.showInputDialog(null,
                        "Digite la fecha del evento a cambiar: ");
                if(inicioSC.getDato().getFecha().equals(fechaEvent)){
                    int cambio=Integer.parseInt((JOptionPane.showInputDialog(null, 
                    "Que desea editar del evento de fecha "+inicioSC.getDato().getFecha()+":\n"
                    + "1. El nombre\n"
                    + "2. La ciudad\n"
                    + "3. La Direccion\n"
                    + "4. La Fecha\n"
                    + "5. Salir del modo de edición\n"
                    + "Digite lo que desea editar:")));
                    switch(cambio){
                        case 1:
                            inicioSC.getDato().setNombre(JOptionPane.showInputDialog(null,
                                    "Digite el nombre:"));
                            break;
                        case 2:
                            inicioSC.getDato().setCiudad(JOptionPane.showInputDialog(null,
                                    "Digite la ciudad:"));
                            break;
                        case 3:
                            inicioSC.getDato().setDireccion(JOptionPane.showInputDialog(null,
                                    "Digite la direccion:"));
                            break;
                        case 4:
                            inicioSC.getDato().setFecha(JOptionPane.showInputDialog(null,
                                    "Digite la fecha:"));
                            break;
                        case 5:
                            System.exit(0);
                            break;
                    }  
                }
                JOptionPane.showMessageDialog(null,"Se ha editado el evento");
            } else {
                JOptionPane.showMessageDialog(null, "Evento editado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar evento"
                    + "\n" + e.getMessage());
            char r = JOptionPane.showInputDialog("Desea intentar de nuevo?"
                    + "\nSI || NO").toUpperCase().charAt(0);
            if (r == 'S') {
                editarEvento();
            }
        }
    }//fin editarEvento(){}

    public void inactivarEvento() {
        try {
            //------RECURSIVIDAD--------
            char r = JOptionPane.showInputDialog("Desea desactivar otro evento?"
                    + "\nSI || NO").toUpperCase().charAt(0);
            if (r == 'S') {
                String fechaEvent=JOptionPane.showInputDialog(null,
                        "Digite la fecha del evento a desactivar: ");
                if(inicioSC.getDato().getFecha().equals(fechaEvent)==true){
                    JOptionPane.showMessageDialog(null,
                    "Se desactivara el evento de fecha "+inicioSC.getDato().getFecha());
                    inicioSC.getDato().setStatus(false);
                    JOptionPane.showMessageDialog(null,"Se desactivo el evento con exito");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Evento desactivado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al desactivar evento"
                    + "\n" + e.getMessage());
            char r = JOptionPane.showInputDialog("Desea intentar de nuevo?"
                    + "\nSI || NO").toUpperCase().charAt(0);
            if (r == 'S') {
                inactivarEvento();
            }
        }
    }//fin inactivarEvvento(){}

}//fin clase LISTAES(){}

