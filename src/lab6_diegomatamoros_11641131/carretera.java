
package lab6_diegomatamoros_11641131;

public class carretera extends Lugar{
    int unico;
    double distancia;
    Lugar entra,sal;

    public carretera() {
        super();
    }

    public carretera(int unico, double distancia, Lugar entrada, Lugar salida, String nombre, String direccion, int nivel) {
        super(nombre, direccion, nivel);
        this.unico = unico;
        this.distancia = distancia;
        this.entra = entrada;
        this.sal = salida;
    }

    public int getUnico() {
        return unico;
    }

    public void setUnico(int unico) {
        this.unico = unico;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Lugar getEntra() {
        return entra;
    }

    public void setEntrada(Lugar entrada) {
        this.entra = entrada;
    }

    public Lugar getSal() {
        return sal;
    }

    public void setSalida(Lugar salida) {
        this.sal = salida;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    

    
    
    
    
}
