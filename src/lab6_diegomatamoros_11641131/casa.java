
package lab6_diegomatamoros_11641131;

import java.util.ArrayList;

public class casa extends Lugar{

    public casa() {
        super();
    }
    
    //aqui no hay ningun atributo xd xd

    public casa(String nombre, String direccion, int nivel) {
        super(nombre, direccion, nivel);
    }

    

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public carretera getSalida() {
        return salida;
    }

    @Override
    public void setSalida(carretera salida) {
        this.salida = salida;
    }

    @Override
    public int getNivel() {
        return nivel;
    }

    @Override
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public ArrayList<carretera> getEntrada() {
        return entrada;
    }

    @Override
    public void setEntrada(ArrayList<carretera> entrada) {
        this.entrada = entrada;
    }
    
}
