
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
public class Movimiento {
    private TipoMovto tipo;
    private Calendar fecha; 
    private String concepto;
    private double monto;
    private double saldoHistorico;

    public Movimiento() {
    }

    public Movimiento(TipoMovto tipo, Calendar fecha, String concepto, double monto, double saldoHistorico) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.concepto = concepto;
        this.monto = monto;
        this.saldoHistorico = saldoHistorico;
    }
    
    

    public Movimiento(TipoMovto tipo, Calendar fecha, String concepto, double monto) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.concepto = concepto;
        this.monto = monto;
    }

    /**
     * @return the tipo
     */
    public TipoMovto getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoMovto tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the fecha
     */
    public Calendar getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    /**
     * @return the saldoHistorico
     */
    public double getSaldoHistorico() {
        return saldoHistorico;
    }

    /**
     * @param saldoHistorico the saldoHistorico to set
     */
    public void setSaldoHistorico(double saldoHistorico) {
        this.saldoHistorico = saldoHistorico;
    }
    
    
    
}
