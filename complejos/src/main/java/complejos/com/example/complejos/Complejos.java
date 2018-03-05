package complejos.com.example.complejos;

public class Complejos {
    //declaración de atributos
    public double real, imaginario;

    //declaración de constructor
    public Complejos(double real, double imaginario) {
        this.real= real;
        this.imaginario= imaginario;
    }

    //declaración de métodos
    /** Transcribe el complejo a String.
     * @returnun string con la parte entera y la imaginaria
     */

    public String toString() {
        return real + "+"+ imaginario + "i";
    }

    /** Suma al complejo de este objeto otro complejo.
     * @param v  el complejo que sumamos
     */

    public void suma(Complejos v) {
        real = real + v.real;
        imaginario = imaginario + v.imaginario;
    }

    public void suma(double re, double im) {
        real = real + re;
        imaginario = imaginario + im;
    }

    public void suma(double re) {
        real = real + re;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }
}

