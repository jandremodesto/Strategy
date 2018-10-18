package br.metodista.dp.strategy;
/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado
 * Tópico Avançado em Programação III
 * Padrão de projeto Strategy
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 * 25/09/2018 - terça-feira
 */
public class Exponencial implements Operacao {
    
    @Override
    public double fazerOperacao(double n1, double n2) {
        double resultado =1;
        for(int i=1; i<=n2; i++){
        resultado *= n1;
        }
        return resultado;   
    }
}
