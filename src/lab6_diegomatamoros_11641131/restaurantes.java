package lab6_diegomatamoros_11641131;

public class restaurantes extends Lugar {

    String categoria;
    int calificacion;

    public restaurantes() {
        super();
    }

    public restaurantes(String nombre, String direccion, int nivel, String categoria, int calificacion) {
        super(nombre, direccion, nivel);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
