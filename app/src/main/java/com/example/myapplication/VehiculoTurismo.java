package com.example.myapplication;


public class VehiculoTurismo extends Vehiculo {
    private int puertas;

    public VehiculoTurismo(int puertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String mostrarDatos(){
        return "matricula: "+matricula+"\nmarca: "+marca+"\nmodelo: "+modelo+"\npuertas: "+puertas;

    }
}
