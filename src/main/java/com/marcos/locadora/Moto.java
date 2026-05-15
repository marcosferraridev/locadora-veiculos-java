package com.marcos.locadora;

public class Moto extends Veiculo{

    private int cilindrada;

    public Moto(String modelo, String marca, String placa, int ano, double valordiaria, int cilindrada){

        super(modelo, marca, placa, ano, valordiaria);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibir(){
        System.out.println("--MOTO--");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano: " + getAno());
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Valor da diária: " + getValordiaria());
    }
}
