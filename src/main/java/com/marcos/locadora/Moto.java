package com.marcos.locadora;

public class Moto extends Veiculo implements Locavel {

    private int cilindrada;

    public Moto(String modelo, String marca, String placa, int ano, double valordiaria, int cilindrada){

        super(modelo, marca, placa, ano, valordiaria);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calculoDiaria(int dias){
        return getValordiaria() * dias;
    }

    @Override
    public void alugar(){
        if(isDisponivel()){
            setDisponivel(false);
            System.out.println("Moto alugada!");
        } else {
            System.out.println("Moto indisponivel!");
        }
    }

    @Override
    public void devolver(){
        setDisponivel(true);
        System.out.println("Moto devolvida com sucesso! Tenha um ótimo dia");
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
