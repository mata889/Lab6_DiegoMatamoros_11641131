
package lab6_diegomatamoros_11641131;

public class carretera extends Lugar{
    int unico;
    double distancia;

    public carretera() {
        super();
    }

    public carretera(int unico, double distancia, String nombre, String direccion, carretera salida, int nivel) {
        super(nombre, direccion, salida, nivel);
        this.unico = unico;
        this.distancia = distancia;
    }
    
    
    
}
