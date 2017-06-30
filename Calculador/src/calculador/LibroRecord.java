/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alvaro
 */
public class LibroRecord implements Serializable {

    private double[] registro;

    public LibroRecord() {
       
        this.registro = new double[5];
        this.registro[0] = 999;//registro de sumas
        this.registro[1] = 999;//regisro de restas  
        this.registro[2] = 999;//registro de multiplicaciones
        this.registro[3] = 999;//registro de divisiones
        this.registro[4] = 999;//registro de combinadas
    }

    public void guardarDatosPartido() {
        try {
            //Creamos el stream en el que vamos a escribir bits
            FileOutputStream streamSalida = new FileOutputStream("registroRecords.dat");
            //Creamos el objeto donde vamos a escribir aquello que queremos guardar
            ObjectOutputStream objetoSalida = new ObjectOutputStream(streamSalida);
            //Escribimos en nuestro objeto aquello que le pasamos por parametro
            objetoSalida.writeObject(registro);//Guardamos el jugador que hayamos modificado
            //Cerramos el stream de salida  
            streamSalida.close();
        } catch (Exception e) {
            System.out.println("Error al serializar, los datos no fueron guardados.");
        }

    }

    public void recuperarDatos() {
        try {
            //Creamos el stream de entrada para leer datos
            FileInputStream streamRecord = new FileInputStream("registroRecords.dat");
            //Creamos el objeto que nos permite leer el fichero
            ObjectInputStream objetoRecords = new ObjectInputStream(streamRecord);
            try {
                //Recuperamos la lista con la plantilla
                while (true) {
                    //Añadimos a nuestra plantilla todos los objetos jugador que habiamos guardado
                    registro = (double[]) objetoRecords.readObject();
                }
            } catch (EOFException e) {
                System.out.println("Historico de records recuperados correctamnete");
            }
            streamRecord.close();
        } catch (Exception e) {
            System.out.println("Error al acceder a los datos, no se pudieron cargar correctamente.");
        }

    }

    public double getRecordSumas() {
        return registro[0];
    }

    public void setRecordSumas(double recordSumas) {
        this.registro[0] = recordSumas;
    }

    public double getRecordRestas() {
        return registro[1];
    }

    public void setRecordRestas(double recordRestas) {
        this.registro[1] = recordRestas;
    }

    public double getRecordMultiplicaciones() {
        return registro[2];
    }

    public void setRecordMultiplicaciones(double recordMultiplicaciones) {
        this.registro[2] = recordMultiplicaciones;
    }

    public double getRecordDivisiones() {
        return registro[3];
    }

    public void setRecordDivisiones(double recordDivisiones) {
        this.registro[3]= recordDivisiones;
    }

    public double getRecordCombinadas() {
        return registro[4];
    }

    public void setRecordCombinadas(double recordCombinadas) {
        this.registro[4] = recordCombinadas;
    }

}
