package banco;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miriampescadorrojas
 */
//
public interface OperacionesBancaLinea extends Operaciones {
    void generarEstadoCuenta(int mes, int anio);
    boolean aumentarLineaCredito();
    boolean pagoServicios(long numReferencia,double cantidad);
    void gestionarCuentas(String tipo);
}
