package com.marcos.locadora;

public abstract class Veiculo {

    private String modelo;
    private String marca;
    private String placa;
    private int ano;
    private double valordiaria;

    public Veiculo(String modelo, String marca, String placa, int ano, double valordiaria){
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
        this.valordiaria = valordiaria;
    }

    // getters e setters

    public String getModelo() {
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public String getPlaca(){
        return placa;
    }

    public String getMarca(){
        return marca;
    }

    public void setValordiaria(double valordiaria) {
        this.valordiaria = valordiaria;
    }
}
