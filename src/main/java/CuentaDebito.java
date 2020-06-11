
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
public class CuentaDebito extends Cuenta {
    private boolean inversion;
    private boolean interesInversion;
    private double saldoMinimo;

    public CuentaDebito(long num, Calendar fecha, Cliente titular, double saldoMin) {
        super(num, fecha, titular);
        saldoMinimo = saldoMin;
    }

    public CuentaDebito(long num, Calendar fecha, Cliente titular, double saldoMin, double saldoActual) {
        super(num, fecha, titular);
        saldoMinimo = saldoMin;
        this.saldoActual = saldoActual;
    }
   
    
    
    public ArrayList<String> RevisarPromociones(){
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
    public void generarEstadoCuenta(int mes, int anio) {
        
    }

    @Override
    public boolean aumentarLineaCredito() {
       return true;
    }

    @Override
    public void pagoServicios(long numReferencia) {
        
    }

    @Override
    public void gestionarCuentas(String tipo) {
        
    }

    @Override
    public void transferencia(Cuenta cuentaDestino, double cantidad) {
        if(this.retiro(cantidad))
            cuentaDestino.deposito(cantidad);
        System.out.println("No tienes saldo suficiente");
    }
}
