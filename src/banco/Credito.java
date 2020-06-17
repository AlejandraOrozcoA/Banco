package banco;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miriampescadorrojas
 */
public interface Credito {
    public final double iva = 16.0;
    public final double isr = 30.0;
    
    void revisarHistorial();
    void otorgarCredito(double monto);
    String verTipoCredito();
}
