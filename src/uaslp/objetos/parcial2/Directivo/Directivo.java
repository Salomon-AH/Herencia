package uaslp.objetos.parcial2.Directivo;

import uaslp.objetos.parcial2.Empleado.Empleado;

public class Directivo extends Empleado {
    private String categoria;

    public void mostrar(){
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
