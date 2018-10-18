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
public class TestStrategy {
    public static void main(String[] args) {
        Calculadora calc = new CalculadoraSoma();
        System.out.println("Resultado da Operação Soma é: " + 
         calc.definirOperacao(new Soma()).realizarOperacao(5.5, 3));
        System.out.println("Resultado da Operação Multiplicação é: " + 
         calc.definirOperacao(new Multiplicacao()).realizarOperacao(5.5, 3));
        System.out.println("Resultado da Operação Exponencial é: " + 
         calc.definirOperacao(new Exponencial()).realizarOperacao(5.5, 3)+ "\n");
        
        System.out.println("Polimorfismo");
        //Padrão Strategy utilizado pelo GoF
        Calculadora calc1 = new CalculadoraSoma();
        System.out.println("Resultado da Operação Soma é: " + 
         calc1.realizarOperacao(5.5, 3));
        
        Calculadora calc2 = new CalculadoraMultiplicacao();
        System.out.println("Resultado da Operação Multiplicação é: " + 
         calc2.realizarOperacao(5.5, 3));
        
        Calculadora calc3 = new CalculadoraExponencial();
        System.out.println("Resultado da Operação Exponencial é: " + 
         calc3.realizarOperacao(5.5, 3));
    }
}
 