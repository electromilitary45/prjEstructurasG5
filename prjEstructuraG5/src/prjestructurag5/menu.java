/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjestructurag5;

import javax.swing.JOptionPane;

/**
 *
 * @author Derek
 */
public class menu {

    public void inicioSesion() {
        char ini = ' ';
        while (ini != 'S') {

            String user = JOptionPane.showInputDialog("Digite un usuario: (admin)");
            String pass = JOptionPane.showInputDialog("Digite un contraseña: (admin)");

            if (user.equals("admin") && pass.equals("admin")) {
                JOptionPane.showMessageDialog(null, "BIENVENIDO USUARIO ADMINISTRADOR");
                menuP();
            }

            ini = JOptionPane.showInputDialog("Desea salir:"
                    + "SI || NO").toUpperCase().charAt(0);

        }

    }//fin inicioSesion(){}

    public void menuP() {
        //---INSTACIAS--

        //----VARIABLES---
        char op1 = ' ';
        while (op1 != 'S') {
            ListaES LES = new ListaES();
            char op2 = ' ';
            op1 = JOptionPane.showInputDialog("A. MODULO 1 (USUARIOS)"
                    + "\nB. MODULO 2 (EVENTOS Y ASIENTOS)"
                    + "\nC. MODULO 3 (VENTAS)"
                    + "\nD. MODULO 4 (CAJAS)"
                    + "\nS. SALIR").toUpperCase().charAt(0);
            switch (op1) {
                case 'A': //MODULO USUARIOS

                    while (op2 != 'S') {
                        op2 = JOptionPane.showInputDialog("SELECCION LA OPCION:"
                                + "\nA. REGISTRO USUARIOS"
                                + "\nB. DESACTIVAR USUARIOS"
                                + "\nC. MOSTRAR USUARIOS"
                                + "\nS. SALIR").toUpperCase().charAt(0);
                        switch (op2) {
                            case 'A':
                                LES.agregarUsuario();
                                break;
                            case 'B':
                                LES.desactivarUsuario();
                                break;
                            case 'C':
                                LES.mostrarUsuarios();
                                break;
                            case 'S':
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
                        }
                    }
                    break;//-----------------------
                case 'B'://MODULO EVENTOS
                    while (op2 != 'S') {
                        op2 = JOptionPane.showInputDialog("SELECCIONE LA OPCION:"
                                + "\nA. AGREGAR EVENTO"
                                + "\nB. MOSTRAR EVENTOS"
                                + "\nC. EDITAR EVENTO"
                                + "\nD. INACTIVAR EVENTO"
                                + "\nE. AGREGAR ASIENTOS"
                                + "\nF. MOSTRAR ASIENTOS"
                                + "\nS. SALIR").toUpperCase().charAt(0);
                        switch (op2) {
                            case 'A':
                                LES.agregarEvento();
                                break;
                            case 'B':
                                LES.mostrarEvento();
                                break;
                            case 'C':
                                LES.editarEvento();
                                break;
                            case 'D':
                                LES.inactivarEvento();
                                break;
                            case 'E':
                                LES.agregarAsientos();
                                break;
                            case 'F':
                                LES.mostrarAsientos();
                                break;
                            case 'S':
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
                        }
                    }
                    break;//-----------------------
                case 'C'://MODULO VENTAS
                    while (op2 != 'S') {
                        op2 = JOptionPane.showInputDialog("SELECCIONE LA OPCION:"
                                + "\nA. AGREGAR VENTA"
                                + "\nB. MOSTRAR VENTA"
                                + "\nS. SALIR").toUpperCase().charAt(0);

                        switch (op2) {
                            case 'A':
                                LES.agregarVenta();
                                break;
                            case 'B':
                                LES.mostrarRaiz();
                                break;
                            case 'S':
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
                        }
                    }

                    break;//-----------------------
                case 'D'://MODULO CAJAS
                    while (op2 != 'S') {
                        op2 = JOptionPane.showInputDialog("SELECCION LA OPCION:"
                                + "\nA. CONTAR INGRESOS"
                                + "\nB. MOSTRAR INGRESOS"
                                + "\nS. SALIR").toUpperCase().charAt(0);
                        switch (op2) {
                            case 'A':
                                LES.Ingreso();
                                break;
                            case 'B':
                                LES.mostrarIngresos();
                                break;
                            case 'S':
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
                        }
                    }

                    break;//-----------------------
                case 'S'://SALIR
                    inicioSesion();
                    break;//-----------------------
                default:
                    JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
            }
        }
    }//fin menuP(){}

    public void menuP2() {
        char op1 = ' ';
        while (op1 != 'S') {
            ListaES LES = new ListaES();
            op1 = JOptionPane.showInputDialog("DIGITE LA OPCION"
                    + "\n----MODULO 1 (USUARIOS)----"
                    + "\nA. REGISTRO USUARIOS"
                    + "\nB. DESACTIVAR USUARIOS"
                    + "\nC. MOSTRAR USUARIOS"
                    + "\n----MODULO 2 (EVENTOS Y ASIENTOS)----"
                    + "\nD. AGREGAR EVENTO"
                    + "\nE. MOSTRAR EVENTOS"
                    + "\nF. EDITAR EVENTO"
                    + "\nG. INACTIVAR EVENTO"
                    + "\nH. AGREGAR ASIENTOS"
                    + "\nI. MOSTRAR ASIENTOS"
                    + "\n----MODULO 3 (ASIENTOS)----"
                    + "\nJ. AGREGAR VENTA"
                    + "\nK. MOSTRAR VENTA"
                    + "\n----MODULO 4 (CAJAS)----"
                    + "\nL. CONTAR INGRESOS"
                    + "\nM. MOSTRAR INGRESOS").toUpperCase().charAt(0);

            switch (op1) {
                case 'A':
                    LES.agregarUsuario();
                    break;
                case 'B':
                    LES.desactivarUsuario();
                    break;
                case 'C':
                    LES.mostrarUsuarios();
                    break;
                case 'D':
                    LES.agregarEvento();
                    break;
                case 'E':
                    LES.mostrarEvento();
                    break;
                case 'F':
                    LES.editarEvento();
                    break;
                case 'G':
                    LES.inactivarEvento();
                    break;
                case 'H':
                    LES.agregarAsientos();
                    break;
                //---MODULO3
                case 'I':
                    LES.mostrarAsientos();
                    break;
                case 'J':
                    LES.agregarVenta();
                    break;
                case 'K':
                    LES.mostrarRaiz();
                    break;
                case 'L':
                    LES.Ingreso();
                    break;

                case 'M':
                    LES.mostrarIngresos();
                    break;
                case 'S':
                    inicioSesion();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
            }
        }
    }

}//fin menu class{}
