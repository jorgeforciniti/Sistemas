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
public class Articulo {
    public Articulo (){
        
    }
   
      
    private int codProducto;
    private String cdBarras;
    private String codInterno;
    private java.util.Date fechaIng = new java.util.Date();
    private String Nombre;
    private float deposito1;
    private float deposito2;
    private float deposito3;
    private float deposito4;
    private float exisMayor;
    private float exisInicial;
    private float stockMin;
    private float precioCompra;
    private float precioVenta1; /*Minorista*/
    private float precioVenta2; /*Mayorista*/
    private float precioVenta3; /*Mayorista diferencial*/
    private int codProveedor;
    private int codRubro;
    private int CodUsuario;
    private float comision;
    private java.util.Date ultimoMovimiento = new java.util.Date();
    private java.util.Date fcPrecio_v1 = new java.util.Date();
    private java.util.Date fcPrecio_v2 = new java.util.Date();
    private java.util.Date fcPrecio_v3 = new java.util.Date();

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getCdBarras() {
        return cdBarras;
    }

    public void setCdBarras(String cdBarras) {
        this.cdBarras = cdBarras;
    }

    public String getCodInterno() {
        return codInterno;
    }

    public void setCodInterno(String codInterno) {
        this.codInterno = codInterno;
    }

    public Date getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(Date fechaIng) {
        this.fechaIng = fechaIng;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getDeposito1() {
        return deposito1;
    }

    public void setDeposito1(float deposito1) {
        this.deposito1 = deposito1;
    }

    public float getDeposito2() {
        return deposito2;
    }

    public void setDeposito2(float deposito2) {
        this.deposito2 = deposito2;
    }

    public float getDeposito3() {
        return deposito3;
    }

    public void setDeposito3(float deposito3) {
        this.deposito3 = deposito3;
    }

    public float getDeposito4() {
        return deposito4;
    }

    public void setDeposito4(float deposito4) {
        this.deposito4 = deposito4;
    }

    public float getExisMayor() {
        return exisMayor;
    }

    public void setExisMayor(float exisMayor) {
        this.exisMayor = exisMayor;
    }

    public float getExisInicial() {
        return exisInicial;
    }

    public void setExisInicial(float exisInicial) {
        this.exisInicial = exisInicial;
    }

    public float getStockMin() {
        return stockMin;
    }

    public void setStockMin(float stockMin) {
        this.stockMin = stockMin;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getPrecioVenta1() {
        return precioVenta1;
    }

    public void setPrecioVenta1(float precioVenta1) {
        this.precioVenta1 = precioVenta1;
    }

    public float getPrecioVenta2() {
        return precioVenta2;
    }

    public void setPrecioVenta2(float precioVenta2) {
        this.precioVenta2 = precioVenta2;
    }

    public float getPrecioVenta3() {
        return precioVenta3;
    }

    public void setPrecioVenta3(float precioVenta3) {
        this.precioVenta3 = precioVenta3;
    }

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
    }

    public int getCodRubro() {
        return codRubro;
    }

    public void setCodRubro(int codRubro) {
        this.codRubro = codRubro;
    }

    public int getCodUsuario() {
        return CodUsuario;
    }

    public void setCodUsuario(int CodUsuario) {
        this.CodUsuario = CodUsuario;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public Date getUltimoMovimiento() {
        return ultimoMovimiento;
    }

    public void setUltimoMovimiento(Date ultimoMovimiento) {
        this.ultimoMovimiento = ultimoMovimiento;
    }

    public Date getFcPrecio_v1() {
        return fcPrecio_v1;
    }

    public void setFcPrecio_v1(Date fcPrecio_v1) {
        this.fcPrecio_v1 = fcPrecio_v1;
    }

    public Date getFcPrecio_v2() {
        return fcPrecio_v2;
    }

    public void setFcPrecio_v2(Date fcPrecio_v2) {
        this.fcPrecio_v2 = fcPrecio_v2;
    }

    public Date getFcPrecio_v3() {
        return fcPrecio_v3;
    }

    public void setFcPrecio_v3(Date fcPrecio_v3) {
        this.fcPrecio_v3 = fcPrecio_v3;
    }

    
   
}
