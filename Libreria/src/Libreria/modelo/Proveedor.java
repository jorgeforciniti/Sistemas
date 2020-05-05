/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria.modelo;
import java.util.Date;
/**
 *
 * @author forci
 */
public class Proveedor {

    public Proveedor() {
    }
    private int codProveedor;
    private java.util.Date fechaIng = new java.util.Date();
    private String apynom; /*Nombre y apellido*/
    private String domicilio;
    private String localidad;
    private String provincia;
    private String codpostal;
    private String telefono;
    private String cuit;
    private char condicionIva; /* (C)Cons.Final, (I) Inscripto, (M) Monotributo, (E) Exento */
    private String tipoFactura;
    private int CodUsuario;
    private float saldo;
    private java.util.Date fechaUltMov = new java.util.Date();
    private String observaciones;

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
    }

    public Date getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(Date fechaIng) {
        this.fechaIng = fechaIng;
    }

    public String getApynom() {
        return apynom;
    }

    public void setApynom(String apynom) {
        this.apynom = apynom;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public char getCondicionIva() {
        return condicionIva;
    }

    public void setCondicionIva(char condicionIva) {
        this.condicionIva = condicionIva;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public int getCodUsuario() {
        return CodUsuario;
    }

    public void setCodUsuario(int CodUsuario) {
        this.CodUsuario = CodUsuario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Date getFechaUltMov() {
        return fechaUltMov;
    }

    public void setFechaUltMov(Date fechaUltMov) {
        this.fechaUltMov = fechaUltMov;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

 
    }