package com.marcos.locadora;

public class Carro extends Veiculo {

    public Carro(String modelo, String marca, String placa, int ano, double valordiaria){

        super(modelo, marca, placa, ano, valordiaria);
    }

    //sobscreve o metodo da classe abstrata
    @Override
    public void exibir(){
        System.out.println("--CARRO--");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano: " + getAno());
        System.out.println("Valor da diária: " + getValordiaria());
    }
}
