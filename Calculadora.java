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
public abstract class Calculadora {
    private Operacao operacao;
    
    //Construtor da classe Calculadora
    public Calculadora(Operacao operacao){
        this.operacao = operacao;
    }
    //Construtor padrão
    public Calculadora(){
    }
    
    public Calculadora definirOperacao(Operacao operacao){
        this.operacao = operacao;
        return this;
    }
    //Metodo realzar Operação
    public double realizarOperacao(double n1, double n2){
        return this.operacao.fazerOperacao(n1,n2);
    }
}
