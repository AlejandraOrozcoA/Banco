package banco;
import java.util.ArrayList;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miriampescadorrojas
 */
public class CuentaCredito extends Cuenta{
    private double montoCredito;
    private double interesAnual;
    private final double comision = 5.0; //
    private String fCorte, fLimite;

    public CuentaCredito(long num, Calendar fecha, Cliente titular, double monto) {
        super(num, fecha, titular);
        montoCredito = monto;
    }
   
    public CuentaCredito(long num, Calendar fecha, Cliente titular, double monto, double saldoActual,String fCorte,String fLimite) {
        super(num, fecha, titular);
        montoCredito = monto;
        this.saldoActual = saldoActual;
        this.fCorte= fCorte;
        this.fLimite= fLimite;
    }

    public double getMontoCredito() {
        return montoCredito;
    }

    public void setMontoCredito(double montoCredito) {
        this.montoCredito = montoCredito;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public String getfCorte() {
        return fCorte;
    }

    public void setfCorte(String fCorte) {
        this.fCorte = fCorte;
    }

    public String getfLimite() {
        return fLimite;
    }

    public void setfLimite(String fLimite) {
        this.fLimite = fLimite;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Calendar getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Calendar fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public ArrayList<Movimiento> getMovtos() {
        return movtos;
    }

    public void setMovtos(ArrayList<Movimiento> movtos) {
        this.movtos = movtos;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
    
    public String verFechaCorte(){
        return null;
    }
    
    public String verFechaLimitePago(){
        return null;
    }

    @Override
    public void revisarHistorial() {
    }

    @Override
    public void otorgarCredito(double monto) {
    }

    @Override
    public String verTipoCredito() {
        return null;
    }

    

    @Override
    public boolean aumentarLineaCredito() {
        return true;
    }

    

    @Override
    public void gestionarCuentas(String tipo) {
    
    }

    @Override // se puede eliminar
    public boolean retiro(double cantidad) {
        /*
        //REIMPLEMENTANDO
        if(cantidad + comision <= saldoActual){
            saldoActual -= cantidad+comision;
            return true;
        }
        return false;
        
        */
        
        /*if(super.retiro(cantidad+comision))
            return true;
        return false;*/
        
        //EXTENSIÓN 
        return super.retiro(cantidad+comision);
    }
    
    /*@Override
    public void deposito(double cantidad) {
        
    }*/
    
    @Override
    public void transferencia(Cuenta cuentaDestino, double cantidad) {
        super.retiro(cantidad*interesAnual);
        cuentaDestino.deposito(cantidad);
    }
}
