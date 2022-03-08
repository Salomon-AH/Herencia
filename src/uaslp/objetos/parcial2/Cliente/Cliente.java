package uaslp.objetos.parcial2.Cliente;

import uaslp.objetos.parcial2.Persona.Persona;

public class Cliente extends Persona {
    private String telefonoDeContacto;

    public void mostrar(){
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }
}
