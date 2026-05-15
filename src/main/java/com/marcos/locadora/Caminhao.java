package com.marcos.locadora;

public class Caminhao extends Veiculo implements Locavel {

    private String tipoCarga;

    public Caminhao(String modelo, String marca, String placa, int ano, double valordiaria, String tipoCarga){

        super(modelo, marca, placa, ano, valordiaria);
        this.tipoCarga = tipoCarga;
    }

    @Override
    public double calculoDiaria(int dias){
        return getValordiaria() * dias;
    }

    @Override
    public void alugar(){
        if(isDisponivel()){
            setDisponivel(false);
            System.out.println("Caminhão alugado!");
        } else {
            System.out.println("Caminhão indisponivel!");
        }
    }

    public void devolver(){
        setDisponivel(true);
        System.out.println("Caminhão devolvido com sucesso! Tenha um ótimo dia!");
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
