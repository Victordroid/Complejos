package complejos.com.example.complejos;

/**
 * Created by Victor on 08/02/2018.
 */

public class GeoPuntoAlt extends GeoPunto {

    public double altura; //nuevo atributo para almacenar la altura
    public double d;

    public GeoPuntoAlt(double rlongitud, double rlatitud, double altura) {
        super(rlongitud, rlatitud);
        this.altura = altura;
    }

    public double distancia2 (GeoPuntoAlt punto){
        System.out.println("Distancia2");
        d = Math.sqrt(Math.pow(super.distancia(punto),(2))+ Math.pow((altura-punto.altura),(2)));
        d=d/1000;
        return d;
    }
}
