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

    public boolean isInversion() {
        return inversion;
    }

    public void setInversion(boolean inversion) {
        this.inversion = inversion;
    }

    public boolean isInteresInversion() {
        return interesInversion;
    }

    public void setInteresInversion(boolean interesInversion) {
        this.interesInversion = interesInversion;
    }

    public double getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
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
    public boolean pagoServicios(long numReferencia, double cantidad) {
         if (super.retiro(cantidad)) {
            Calendar fecha = Calendar.getInstance();
            TipoMovto mov = TipoMovto.PAGO_SERVICIO;
            Movimiento mvto = new Movimiento(mov ,fecha, String.valueOf(numReferencia), cantidad, this.getSaldoActual());
            this.registrarMovtos(mvto);
            return true;
         }
        return false;
    }

    @Override
    public void gestionarCuentas(String tipo) {
        
    }

    @Override
    public boolean transferencia(Cuenta cuentaDestino, double cantidad) {
         if (super.retiro(cantidad)) {
            Calendar fecha = Calendar.getInstance();
            TipoMovto mov = TipoMovto.TRANSFERENCIA;
            Movimiento mvto = new Movimiento(mov ,fecha, "transferncia de cuenta", cantidad, this.getSaldoActual());
            this.registrarMovtos(mvto);
            if (cuentaDestino.deposito(cantidad)) {
                TipoMovto mov2 = TipoMovto.TRANSFERENCIA;
                Movimiento mvto2 = new Movimiento(mov2 ,fecha, "transferncia de cuenta", cantidad, cuentaDestino.getSaldoActual());
                cuentaDestino.registrarMovtos(mvto2);
                return true;
            }
        }
        return false;
    }
}
