/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.modelo;

/**
 *
 * @author yo
 */
public class Rubro {
    private int codRubro;
    private String Nombre;
    private int CodUsuario;

    public Rubro(int codRubro, String Nombre, int CodUsuario) {
        this.codRubro = codRubro;
        this.Nombre = Nombre;
        this.CodUsuario = CodUsuario;
    }
    
    public int getCodRubro() {
        return codRubro;
    }

    public void setCodRubro(int codRubro) {
        this.codRubro = codRubro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCodUsuario() {
        return CodUsuario;
    }

    public void setCodUsuario(int CodUsuario) {
        this.CodUsuario = CodUsuario;
    }
    
    
}
