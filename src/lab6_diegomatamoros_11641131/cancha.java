
package lab6_diegomatamoros_11641131;

public class cancha extends Lugar {
    String categoria;
    String estado;
    

    public cancha() {
        super();
    }

    public cancha(String nombre,String direccion,  int nivel,String categoria, String estado) {
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
    
}
