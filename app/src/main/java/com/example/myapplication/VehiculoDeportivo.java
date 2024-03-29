package com.example.myapplication;


public class VehiculoDeportivo extends Vehiculo {
    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarDatos(){
        return "matricula: "+matricula+"\nmarca: "+marca+"\nmodelo: "+modelo+"\ncilindrada: "+cilindrada;

    }
}

