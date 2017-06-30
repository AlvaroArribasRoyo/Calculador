/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

import GUI.Principal;

/**
 *
 * @author Alvaro
 */
public class ProgramaPrincipal {

    public static Calculador calcula;
    private static LibroRecord libro;

    public static void main(String[] args) {
        libro = new LibroRecord();
        calcula = new Calculador(libro);
        Principal vista = new Principal();
        vista.setVisible(true);
        try {
            libro.recuperarDatos();
        } catch (Exception e) {
            System.out.println("Error al cargar los datos , los registros no pudieron ser restaurados.");
        }
      

    }

}
