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
public class Moto extends Veiculo{

    @Override
    public double calcularIpva(double valorVeiculo) {
        return valorVeiculo * 0.02;
    }

  
    
}
