
package lab6_diegomatamoros_11641131;

public class cancha extends Lugar {
    String categoria;
    char estado;

    public cancha() {
        super();
    }

    public cancha(String categoria, char estado, String nombre, String direccion, int nivel) {
        super(nombre, direccion, nivel);
        this.categoria = categoria;
        this.estado = estado;
    }

    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
}
