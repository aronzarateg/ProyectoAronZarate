/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Claces;

/**
 *
 * @author aron
 */
public class Persona {
    private int idpersona;
    private int iddistrito;
    private String nombreapellidos;
    private String direccion;
    private String telefono;
    private String estado;

    public Persona() {
    }
//no lo ponemos un  constructor a estado por que  nosotros lo vamos a generar
    public Persona(int iddistrito, String nombreapellidos, String direccion, String telefono) {
        this.iddistrito = iddistrito;
        this.nombreapellidos = nombreapellidos;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public int getIddistrito() {
        return iddistrito;
    }

    public void setIddistrito(int iddistrito) {
        this.iddistrito = iddistrito;
    }

    public String getNombreapellidos() {
        return nombreapellidos;
    }

    public void setNombreapellidos(String nombreapellidos) {
        this.nombreapellidos = nombreapellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
