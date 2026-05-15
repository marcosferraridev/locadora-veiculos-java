package com.marcos.locadora;

public class Caminhao extends Veiculo{

    private String tipoCarga;

    public Caminhao(String modelo, String marca, String placa, int ano, double valordiaria, String tipoCarga){

        super(modelo, marca, placa, ano, valordiaria);
        this.tipoCarga = tipoCarga;
    }

    @Override
    public void exibir(){
        System.out.println("--CAMINHÃO--");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Ano: " + getAno());
        System.out.println("Carga: " + tipoCarga);
        System.out.println("Valor da diária: " + getValordiaria());
    }
}
