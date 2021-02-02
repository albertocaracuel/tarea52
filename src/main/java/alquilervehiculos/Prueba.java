/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculos;

/**
 *
 * @author alber
 */
public class Prueba {
    public static void main(String[] args) {
         EmpresaAlquiler rentacar = new EmpresaAlquiler();
       
        // registro de los clientes de la empresa
        rentacar.registrarCliente(new Cliente("74642577x","pepe", "gil López"));
        rentacar.registrarCliente(new Cliente("34566325Y","jose", "garcia Gómez"));
        
        // registro de los vehículos de la empresa 
        rentacar.registrarVehiculo(new Vehiculo("3542 TUR", "Skoda", "Fabia", "Blanco", 90.0, false));
        rentacar.registrarVehiculo(new Vehiculo("4320 CHY", "Ford", "Mustang","Rojo", 150.0, true));
        rentacar.registrarVehiculo(new Vehiculo("8799 MDT", "VW", "GTI","Azul", 110.0, false));
        rentacar.registrarVehiculo(new Vehiculo("6660 CGE", "SEAT", "Ibiza","Blanco", 90.0, false));
        rentacar.registrarVehiculo(new Vehiculo("0000 MLF", "Fiat", "Ducato", "Azul", 80.0, true));
        
        rentacar.listaAlquilados();
        
        rentacar.alquilerFecha();
        
    }
}
