package complejos.com.example.complejos;

/**
 * Created by Victor on 07/02/2018.
 */

public class ComplejoAmpliado extends Complejos {
    private boolean esReal;

    public ComplejoAmpliado(double re, double im) {
        super(re, im);
        esReal = im ==0;
    }

    public ComplejoAmpliado(double re) {
        super(re, 0);
        esReal= true;
    }

    @Override
    public void suma(Complejos v) {
        esReal = imaginario == - v.imaginario;
        super.suma(v);
    }

    @Override
    public String toString() {
        if(esReal) {
            return getReal() + " ¡real!";
        } else{
            return super.toString();
        }
    }

    public boolean esReal(){
        return esReal;
    }

}
