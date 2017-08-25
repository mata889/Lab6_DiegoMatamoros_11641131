
package lab6_diegomatamoros_11641131;

import java.util.ArrayList;


public class Lugar {
    String nombre,direccion;
    carretera salida;
    int nivel;
    ArrayList <carretera> entrada=new ArrayList();

    public Lugar() {
    }

    public Lugar(String nombre, String direccion, carretera salida, int nivel) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salida = salida;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public carretera getSalida() {
        return salida;
    }

    public void setSalida(carretera salida) {
        this.salida = salida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<carretera> getEntrada() {
        return entrada;
    }

    public void setEntrada(ArrayList<carretera> entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return nombre;
    }

   
    
}
