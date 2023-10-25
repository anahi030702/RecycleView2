package com.example.recycleview2.Models;

public class Carro {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String modelo;

    public Carro(String color, String modelo) {
        this.color = color;
        this.modelo = modelo;
    }
}
