package com.marcos.locadora;

public class Carro extends Veiculo implements Locavel {


    public Carro(String modelo, String marca, String placa, int ano, double valordiaria){

        super(modelo, marca, placa, ano, valordiaria);
    }

    @Override
    public double calculoDiaria(int dias){
        return getValordiaria() * dias;
    }

    @Override
    public void alugar(){
        if(isDisponivel()){
            setDisponivel(false);
            System.out.println("Carro alugado!");
        } else {
            System.out.println("Carro indisponivel!");
        }
    }

    @Override
    public void devolver(){
        setDisponivel(true);
        System.out.println("Carro devolvido com sucesso! tenha um ótimo dia!");
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
