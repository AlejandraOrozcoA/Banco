/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miriampescadorrojas
 */
public interface Operaciones {
     boolean retiro(double cantidad);
     void deposito(double cantidad);
     public void transferencia(Cuenta cuentaDestino, double cantidad);
    //public void metodo1();
}
