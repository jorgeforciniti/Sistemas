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
public class Caja {
    public Caja(){
        
    }
    private Date fecha;
    private int hora;
    private int cantidad;
    private String detalle;
    private float precio;
    private float ingreso;
    private int caja;
    private int codigoConcepto;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getIngreso() {
        return ingreso;
    }

    public void setIngreso(float ingreso) {
        this.ingreso = ingreso;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public int getCodigoConcepto() {
        return codigoConcepto;
    }

    public void setCodigoConcepto(int codigoConcepto) {
        this.codigoConcepto = codigoConcepto;
    }

   
            
}
