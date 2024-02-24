package com.example.myapplication;



public class VehiculoAereo extends Vehiculo{
    private int capacidad;

    public VehiculoAereo(int capacidad, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    @Override
    public String mostrarDatos(){
        return "matricula: "+matricula+"\nmarca: "+marca+"\nmodelo: "+modelo+"\ncapacidad: "+capacidad;

    }

}

