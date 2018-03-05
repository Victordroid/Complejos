package complejos.com.example.complejos;


/**
 * Created by Victor on 07/02/2018.
 */

public class Principal {
    int i;

    public static void main(String[] main) {
        Object lista[] = new Object[4];
        GeoPuntoAlt alto = new GeoPuntoAlt(-6.2684345, 36.5008762, 3000);
        lista[0] = new Complejos(5, -1);
        lista[1] = new GeoPunto(-5.9591776, 37.3914105);
        lista[2] = new GeoPuntoAlt(5.9591776, 37.3914105, 5000);
        lista[3] = new GeoPuntoAlt(-6.2684345, 36.5008762, 3000);
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] instanceof GeoPuntoAlt) {
                alto = ((GeoPuntoAlt) lista[i]);
                if (alto.altura > 1000) {
                    System.out.println("Punto Alto");
                }

            }
        }


    }
}
        /*

        Complejos z, w;
        z = new ComplejoAmpliado(10, 1);
        w = new ComplejoAmpliado(22, -1);
        z.suma(w);
        z.suma(w.real);
        z.suma(w.real,w.imaginario);
        System.out.println(z.toString());*/



