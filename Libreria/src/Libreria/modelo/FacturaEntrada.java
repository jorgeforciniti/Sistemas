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
public class FacturaEntrada {

    public FacturaEntrada() {
    }
private java.util.Date fecha = new java.util.Date();
private String factura;
private String tipoFactura; /*(FA,FB,FC,NA,NB,NC, etc)*/
private char condicionIva; /* (C)Cons.Final, (I) Inscripto, (M) Monotributo, (E) Exento */
private float neto;  /*sin IVA ni impuestos*/
private float exento; /*para facturas exentas, no va nada en neto, IVA, etc*/
private float mongrav; 
private float retencion;
private float iva21;
private float iva125;
private float total;
private float anticipo;
private float contado;
private float ctacte;
private float tarDb;
private float tarCr;
private float cheque;
private int codProveedor;
private String condicion;
private boolean pagada;
private java.util.Date fechaPago = new java.util.Date();
private int remito;
private float descuento;
private boolean anulada;
private int codUsuario;
private int codVendedor;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public char getCondicionIva() {
        return condicionIva;
    }

    public void setCondicionIva(char condicionIva) {
        this.condicionIva = condicionIva;
    }

    public float getNeto() {
        return neto;
    }

    public void setNeto(float neto) {
        this.neto = neto;
    }

    public float getExento() {
        return exento;
    }

    public void setExento(float exento) {
        this.exento = exento;
    }

    public float getMongrav() {
        return mongrav;
    }

    public void setMongrav(float mongrav) {
        this.mongrav = mongrav;
    }

    public float getRetencion() {
        return retencion;
    }

    public void setRetencion(float retencion) {
        this.retencion = retencion;
    }

    public float getIva21() {
        return iva21;
    }

    public void setIva21(float iva21) {
        this.iva21 = iva21;
    }

    public float getIva125() {
        return iva125;
    }

    public void setIva125(float iva125) {
        this.iva125 = iva125;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(float anticipo) {
        this.anticipo = anticipo;
    }

    public float getContado() {
        return contado;
    }

    public void setContado(float contado) {
        this.contado = contado;
    }

    public float getCtacte() {
        return ctacte;
    }

    public void setCtacte(float ctacte) {
        this.ctacte = ctacte;
    }

    public float getTarDb() {
        return tarDb;
    }

    public void setTarDb(float tarDb) {
        this.tarDb = tarDb;
    }

    public float getTarCr() {
        return tarCr;
    }

    public void setTarCr(float tarCr) {
        this.tarCr = tarCr;
    }

    public float getCheque() {
        return cheque;
    }

    public void setCheque(float cheque) {
        this.cheque = cheque;
    }

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public int getRemito() {
        return remito;
    }

    public void setRemito(int remito) {
        this.remito = remito;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public boolean isAnulada() {
        return anulada;
    }

    public void setAnulada(boolean anulada) {
        this.anulada = anulada;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }
}