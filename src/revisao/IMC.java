package revisao;

import java.util.Scanner;


public class IMC {

 
    public static void main(String[] args) {
        // TODO code application logic here
        /*
    Como é calculado?
    O IMC é a relação entre peso e altura e o cálculo é feito de acordo 
    com a fórmula: IMC = peso/ (altura x altura), devendo o peso estar 
    em kg e a altura em metro, e o resultado é dado em kg/m2. 
    Depois de obter o resultado, é possível verificar em que faixa o IMC 
    se encontra, podendo indicar:
        
    Magreza, quando o resultado é menor que 18,5 kg/m2;
    Normal, quando o resultado está entre 18,5 e 24,9 kg/m2;
    Sobrepeso, quando o resultado está entre 24,9 e 30 kg/m2;
    Obesidade, quando o resultado é maior que 30 kg/m2.
     */
        Scanner ler = new Scanner (System.in);
        float peso, altura, imc;
        String nome;
        
        System.out.println("---- Calculadora IMC ----");
        System.out.println("");
        System.out.println("Informe seu nome: ");
        nome = ler.nextLine();
         System.out.println("Informe seu peso em kg: ");
        peso = ler.nextFloat();
        System.out.println("Informe sua altura em m: ");
        altura = ler.nextFloat();
        imc = peso / (altura * altura);
       
        
        System.out.println("Resultado com if");
         if (imc < 18.5) {
        System.out.printf(nome + " seu IMC é: %.2f, e define Magreza.", imc);
        } else if (imc <= 24.9) {
        System.out.printf(nome + " seu IMC é: %.2f, e define Normal.", imc);
        } else if (imc <= 30) {
        System.out.printf(nome + " seu IMC é: %.2f, e define Sobrepeso.", imc);
        } else {
        System.out.printf(nome + " seu IMC é: %2.f, e define Obesidade.", imc);
        }
        System.out.println("");
        System.out.println(df.format(imc));
        
        
    }
    
}
