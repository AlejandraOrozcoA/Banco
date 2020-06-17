package banco;
import java.util.Calendar;
import java.util.Random;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miriampescadorrojas
 */
public class Principal {
    public static Cliente clientes[] = new Cliente[5];
    public static Calendar fecha[] = new Calendar[60];
    public static ArrayList<Cuenta> cuentas = new ArrayList();
    public static boolean bandera;

    public static ArrayList<Cuenta> getCuentas(){
        return cuentas;
    }
    
    public static void creaInstanciasClientes(){
        /**
         * **************** Instancias de Clientes ***************
         */
        clientes[0] = new Cliente(212728, "Mariana", "Perez", "Vazquez");
        clientes[1] = new Cliente(8934734, "Victor Adrian", "Hernandez", "Lopez");
        clientes[2] = new Cliente(3423738, "Alejandra", "Ramirez", "Ruiz");
        clientes[3] = new Cliente(1034774, "Roberto", "Quiroz", "Patiño");
        clientes[4] = new Cliente(4385950, "Carolina", "Soto", "Alvarez");
        
        /**
         * ******************** Login (acceso) ***********
         */
        clientes[0].creaLogin("marianita", "12345");
        clientes[1].creaLogin("vic@123", "password");
        clientes[2].creaLogin("ale1975", "54321");
        clientes[3].creaLogin("robert89", "quiroz10");
        clientes[4].creaLogin("carol", "sotoalv");
    }
    
    public static void creaInstanciasCuentas(){
        int anio, mes, dia;
        Random random = new Random();
        /**
         * *************** Fechas *******************
         */
        for (int i = 0; i < 60; i++) {
            fecha[i] = Calendar.getInstance();
            anio = random.nextInt((2020 - 2000) + 1) + 2000;
            mes = random.nextInt((12 - 1) + 1) + 1;
            dia = random.nextInt((28 - 1) + 1) + 1;
            fecha[i].set(anio, mes, dia);
            System.out.println(fecha[i].getTime().toString());
        }

        /**
         * **************** Instancias de Cuentas ***************
         */

        cuentas.add(new CuentaDebito(67498474, fecha[0], clientes[0], 1500.0,2500.0));
        //cuentas.get(0).setSaldoActual(2500.0);
        cuentas.add(new CuentaDebito(92367467, fecha[1], clientes[0], 2000.0,3000.0));
        cuentas.add( new CuentaCredito(15374774, fecha[2], clientes[0], 7000.0,24000.0, "12/07/2020","12/08/2020"));

        cuentas.add(new CuentaDebito(27484758, fecha[3], clientes[1], 2500.0,2500.0));
        cuentas.add(new CuentaCredito(38934834, fecha[4], clientes[1], 20000.0,2700.0, "11/06/2020","11/07/2020"));

        cuentas.add(new CuentaDebito(11536485, fecha[5], clientes[2], 3000.0,5000.0));

        cuentas.add(new CuentaDebito(7894894, fecha[6], clientes[3], 3000.0,7000.0));
        cuentas.add(new CuentaCredito(482339849, fecha[7], clientes[3], 45000.0,6500.0, "05/08/2020","05/09/2020"));

        cuentas.add(new CuentaDebito(66928034, fecha[8], clientes[4], 2500.0,8500.0));
        cuentas.add(new CuentaCredito(832674398, fecha[9], clientes[4], 120000.0,7008.0, "15/06/2020","15/07/2020"));
    }
    
     public static void creaInstanciasMovimientos(){
      /* **************** Instancias de Movimientos ***************
         */
        String conceptosComunes[] = {"deposito en cajero", "retiro en cajero", "transferencia",
            "pago de servicios", "generar estado de cuenta"};
        String conceptosCredito[] = {"aumentar linea de credito", ""};
        String conceptosDebito[] = {"solicita prestamo", ""};
        Movimiento movtos[] = new Movimiento[50];
        movtos[0] = new Movimiento(TipoMovto.DEPOSITO, fecha[10], "aumentar linea de credito", 1200.0,13000.0);;

        for (int i = 1; i < 50; i++) {
            movtos[i] = new Movimiento(TipoMovto.DEPOSITO, fecha[i + 10], conceptosComunes[i % 5], 1200.0, 250*1);
        }

        int j = 0;
        for (int i = 0; i < 10; i++) {
            cuentas.get(i).registrarMovtos(movtos[j]);
            cuentas.get(i).registrarMovtos(movtos[j + 1]);
            cuentas.get(i).registrarMovtos(movtos[j + 2]);
            j += 3;
        }

        /*imprime movimientos de la clase cuenta serializable*/
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        try {
            //Se crea el fichero

            fos = new FileOutputStream("cuentas.dat");
            salida = new ObjectOutputStream(fos);
            //Se escribe el objeto en el fichero
            for (int i = 0; i < 10; i++) {
                salida.writeObject(cuentas.get(i));
            }

        } catch (FileNotFoundException e) {
            System.out.println("1" + e.getMessage());
        } catch (IOException e) {
            System.out.println("2" + e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println("error de lectura" + e.getMessage());
            }
        }
     }
    
     public static boolean acceso(){
        /**
         * **
         */
        JTextField userField = new JTextField(5);
        JPasswordField passField = new JPasswordField(5);
   

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("usuario:"));
        myPanel.add(userField);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("contraseña:"));
        myPanel.add(passField);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Introduzca usuario y contraseña", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String user, password;
            user = userField.getText();
            password = passField.getText();
            
            System.out.println(user);
            System.out.println(password);
            
            for (int i = 0; i < 5; i++) {
                if (user.equals(clientes[i].getAcceso().getUsuario())
                        && password.equals(clientes[i].getAcceso().getContrasenia())) {
                    new BancaLinea(clientes[i]).setVisible(true); // mandando una instancia de la clase Cliente
                    //new BancaLinea().setVisible(true)
                    return true;
                }
            }
            JOptionPane.showMessageDialog(null, "El usuario y contraseña no coinciden", "Error de acceso", JOptionPane.WARNING_MESSAGE);
            
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        creaInstanciasClientes();
        creaInstanciasCuentas();
        //creaInstanciasMovimientos(); // 
        

        /*asocia las cuentas y los clientes*/
        clientes[0].setCuentas(cuentas.subList(0, 3));
        clientes[1].setCuentas(cuentas.subList(3, 5));
        clientes[2].setCuentas(cuentas.subList(5, 6));
        clientes[3].setCuentas(cuentas.subList(6, 8));
        clientes[4].setCuentas(cuentas.subList(8, 10));
        
        creaInstanciasMovimientos();
        bandera = false;
        do{
            bandera = acceso();
        }
        while(!bandera);
            

        

    }

}
