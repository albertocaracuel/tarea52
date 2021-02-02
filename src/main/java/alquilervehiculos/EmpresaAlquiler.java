/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilervehiculos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/**
 *
 * @author alber
 */
public class EmpresaAlquiler {
        private ArrayList<Cliente> clientes;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<VehiculoAlquilado> alquilados;
    private String cif;
    private String nombre;
    private String paginaWeb;

    EmpresaAlquiler() {

    }

    //te dice el cuantos clientes y vehículos hay
    

    EmpresaAlquiler(String cif, String nombre, String paginaWeb) {
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.clientes = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.alquilados = new ArrayList<>();
    }
    public void registrarCliente(Cliente nuevo) {
        clientes.add(nuevo);
    }

    public void registrarVehiculo(Vehiculo nuevo) {
        vehiculos.add(nuevo);
    }

    public void listaAlquilados() {
        if(alquilados.isEmpty()){
            System.out.println("La lista está vacía");
        }else{
            for(int i = 0; i< alquilados.size();i++){
            System.out.println(this.alquilados.get(i).toString());
        }
        } 
    }
    

    public void ordenarPorNif() {
        Collections.sort(clientes, (c1, c2) -> c1.getNif().compareTo(c2.getNif()));
    }

    public int buscarPorNif(Cliente c) {
        ordenarPorNif();
      return  Collections.binarySearch(clientes, c, (c1, c2) -> c1.getNif().compareTo(c2.getNif()));
       
    }

    
    public void listaClientes() {
        System.out.println("NIF cliente\tNombre\n");

        clientes.forEach(System.out::println);
    }

    
    public int buscarVehiculo(String matricula) {

        int contadorPos = 0;

        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getMatricula().compareToIgnoreCase(matricula) == 0) {
                return contadorPos;
            }

            contadorPos++;

        }

        //si el titulo no existe en la lista
        return -1;

    }


    
    public void listaVehiculos() {
        System.out.println("Matricula\tModelo\tColor\tImporte\tDisponible\n");
        vehiculos.forEach(System.out::println);
    }

    public void disponibilidadVehiculo(String matricula) {

        Vehiculo vehiculo = vehiculos.get(buscarVehiculo(matricula));

            if (vehiculo != null)

	vehiculo.setDisponible(true);
        
    }
    
    public void alquilerFecha(){
    LocalDate fecha = LocalDate.now();
    for(VehiculoAlquilado vehiculo : alquilados){
        fecha = fecha.plusDays(vehiculo.getTotalDiasAlquiler());
        System.out.println("El coche con matrícula: " + vehiculo.getVehiculo().getMatricula() + "Y con fecha " + fecha);
    
    }
    }

    
    

}
