/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.associacao.controle.heranca;

/**
 *
 * @author Silvio
 */
public abstract  class Veiculo {
    
    private String nome;
    private double valor;
    private String placa;    
    
    public abstract double calcularIpva(double valorVeiculo);
//    metodos gettes e settes   
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
    
}
