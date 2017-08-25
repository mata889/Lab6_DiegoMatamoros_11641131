
package lab6_diegomatamoros_11641131;

public class carretera {
    int unico;
    double distancia;
    Lugar entra,sal;

    public carretera() {
        
    }

    public carretera(int unico, double distancia, Lugar entra, Lugar sal) {
        this.unico = unico;
        this.distancia = distancia;
        this.entra = entra;
        this.sal = sal;
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

    public void setEntra(Lugar entra) {
        this.entra = entra;
    }

    public Lugar getSal() {
        return sal;
    }

    public void setSal(Lugar sal) {
        this.sal = sal;
    }

    

    @Override
    public String toString() {
        return super.toString();
    }

    

    
    
    
    
}
