/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

/**
 *
 * @author Alvaro
 */
public class Calculador {

    private int[] numerosGenerados;
    private int sumasAcertadas;
    private int restasAcertadas;
    private int divisionesAcertadas;
    private int multiplicacionesAcertadas;
    private int combinadasAcertadas;
    private int cotaInferior;
    private int cotaSuperior;
    private LibroRecord libro;

    public Calculador(LibroRecord libroRecord) {
        this.numerosGenerados = new int[40];
        this.sumasAcertadas = 0;
        this.restasAcertadas = 0;
        this.divisionesAcertadas = 0;
        this.multiplicacionesAcertadas = 0;
        this.combinadasAcertadas = 0;
        this.cotaInferior = 0;
        this.cotaSuperior = 0;
        this.libro = libroRecord;
    }

    public int generadorNumeroAleatorio(int cotaSuperior, int cotaInferior) {
        int numero = 0;
        numero = cotaInferior + (int) (Math.random() * (cotaSuperior - cotaInferior));
        return numero;
    }

    public boolean comprobarSumaAcertada(int a, int b, int resultado) {
        if (a + b == resultado) {
            sumasAcertadas++;
            return true;
        } else {
            return false;
        }

    }

    public boolean comprobarRecordSuma(double tiempo) {
        if (tiempo < libro.getRecordSumas()) {
            libro.setRecordSumas(tiempo);
            //Guarda el record 
            libro.guardarDatosPartido();
            return true;
        } else {
            return false;
        }
    }

    public boolean comprobarRestaAcertada(int a, int b, int resultado) {
        if (a - b == resultado) {
            restasAcertadas++;
            return true;
        } else {
            return false;
        }

    }

    public boolean comprobarRecordResta(double tiempo) {
        if (tiempo < libro.getRecordRestas()) {
            libro.setRecordRestas(tiempo);
            //Guarda el record
            libro.guardarDatosPartido();
            return true;
        } else {
            return false;
        }
    }

    public boolean comprobarMultiplicacionAcertada(int a, int b, int resultado) {
        if (a * b == resultado) {
            multiplicacionesAcertadas++;
            return true;
        } else {
            return false;
        }

    }

    public boolean comprobarRecordMultiplicacion(double tiempo) {
        if (tiempo < libro.getRecordMultiplicaciones()) {
            libro.setRecordMultiplicaciones(tiempo);
            //Guarda el record
            libro.guardarDatosPartido();
            return true;
        } else {
            return false;
        }
    }

    public boolean comprobarDivisionAcertada(int a, int b, int resultado) {
        if (a / b == resultado) {
            multiplicacionesAcertadas++;
            return true;
        } else {
            return false;
        }

    }

    public boolean comprobarRecordDivision(double tiempo) {
        if (tiempo < libro.getRecordDivisiones()) {
            libro.setRecordDivisiones(tiempo);
            //Guarda el record
            libro.guardarDatosPartido();
            return true;
        } else {
            return false;
        }
    }

    //Getter y Setter
    public int[] getNumerosGenerados() {
        return numerosGenerados;
    }

    public void setNumerosGenerados(int[] numerosGenerados) {
        this.numerosGenerados = numerosGenerados;
    }

    public int getSumasAcertadas() {
        return sumasAcertadas;
    }

    public void setSumasAcertadas(int sumasAcertadas) {
        this.sumasAcertadas = sumasAcertadas;
    }

    public int getRestasAcertadas() {
        return restasAcertadas;
    }

    public void setRestasAcertadas(int restasAcertadas) {
        this.restasAcertadas = restasAcertadas;
    }

    public int getDivisionesAcertadas() {
        return divisionesAcertadas;
    }

    public void setDivisionesAcertadas(int divisionesAcertadas) {
        this.divisionesAcertadas = divisionesAcertadas;
    }

    public int getMultiplicacionesAcertadas() {
        return multiplicacionesAcertadas;
    }

    public void setMultiplicacionesAcertadas(int multiplicacionesAcertadas) {
        this.multiplicacionesAcertadas = multiplicacionesAcertadas;
    }

    public int getCotaInferior() {
        return cotaInferior;
    }

    public void setCotaInferior(int cotaInferior) {
        this.cotaInferior = cotaInferior;
    }

    public int getCotaSuperior() {
        return cotaSuperior;
    }

    public void setCotaSuperior(int cotaSuperior) {
        this.cotaSuperior = cotaSuperior;
    }

    public int getCombinadasAcertadas() {
        return combinadasAcertadas;
    }

    public void setCombinadasAcertadas(int combinadasAcertadas) {
        this.combinadasAcertadas = combinadasAcertadas;
    }

    public LibroRecord getLibro() {
        return libro;
    }

}
