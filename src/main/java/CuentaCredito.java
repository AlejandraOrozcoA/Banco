
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
   
    public CuentaCredito(long num, Calendar fecha, Cliente titular, double monto, double saldoActual) {
        super(num, fecha, titular);
        montoCredito = monto;
        this.saldoActual = saldoActual;
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
