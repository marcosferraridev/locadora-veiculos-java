package com.marcos.locadora;

public abstract class Veiculo {

    private String modelo;
    private String marca;
    private String placa;
    private int ano;
    private double valordiaria;
    private boolean disponivel = true;

    public Veiculo(String modelo, String marca, String placa, int ano, double valordiaria){
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.ano = ano;
        this.valordiaria = valordiaria;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    protected void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void exibirDisponibilidade() {
        if (isDisponivel()) {
            System.out.println("Veículo disponível!");
        } else {
            System.out.println("Veículo alugado!");
        }
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

    public double getValordiaria(){
        return valordiaria;
    }

    public void setValordiaria(double valordiaria) {
        this.valordiaria = valordiaria;
    }

    //metodo para exibir as informaçoes
    public abstract void exibir();
}
