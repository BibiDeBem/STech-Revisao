package revisao;

import java.util.ArrayList;
import java.util.Scanner;


public class Revisao {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner (System.in); // usar no console
        boolean verifica; // var boleana- true or false -0 or 1
        int num1; //var do tipo inteiro
        short num2; // var = smalint inteiro pequeno
        long num3; //bigint inteiro grande - contador youtube
        double num4; // var = decimal, numeric com casas decimais
        float num5; //var = com casas decimais é menos que o double
        byte b; // num inteiro valor maximo 127
        String texto; // aceita tudo em formato texto
        String textoCurto;
        char sexo;
        int vet [] = {1, 2, 3}; // as posições começam em ZERO 0 , {1, 2, 3} são os valores
        ArrayList<Integer> valores = new ArrayList<> ();
        valores.add(1);
        valores.add(2);
        valores.add(3);
  
        
        
        System.out.println("Informe um número inteiro: ");
        num1 = ler.nextInt();
        System.out.println("nforme um número inteiro até 127: ");
        b = ler.nextByte();
        System.out.println("Informe um numero inteiro pequeno: ");
        num2 = ler.nextShort();
        System.out.println("Informe um número inteiro grande: ");
        num3 = ler.nextLong();
        System.out.println("Informe um número decimal: ");
        num4 = ler.nextDouble();
        System.out.println("nforme um número decimal pequeno: ");
        num5 = ler.nextFloat();
        System.out.println("Informe seu nome completo: ");
        ler.nextLine ();
        texto = ler.nextLine();
        System.out.println("Informe o primeiro nome de sua mãe");
        textoCurto = ler.next();
        System.out.println("Informe seu sexo: ");
        sexo = ler.next().charAt(0);
        
        System.out.println("------Impressão------");
        System.out.println("Byte: " + b);
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
        System.out.println("num4: " + num4);
        System.out.println("num5: " + num5);
        System.out.println("Seu nome completo é: " + texto);
        System.out.println("O nome de sua mãe é: " + textoCurto);
        System.out.println("Seu sexo é: " + sexo);
     
         verifica = num1>num2;
         if (verifica) {
             System.out.println("Num1 é maior que num2.");
        } else {
             System.out.println("Num2 é maior que num1.");
        }
        
        System.out.println("num1:" + num1);
        
        System.out.println("Revisão");
        
        System.out.println("Vetor");
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Posição: " + i + " | valor: " + vet [i]);
            
          
        }
     
        System.out.println("ArrayList");

    for (int i = 0; i < valores.size(); i++) {

      System.out.println("Posição: " + i + " | Valor: " + valores.get(i));

    }



    System.out.println("ArrayList-Impressão 2");

    valores.forEach((i) -> System.out.println("Valor: " + i));



    System.out.println("ArrayList-Impressão 3");

    valores.forEach(_item -> {

      System.out.println("Valor: " + valores.toString());

    });
    }
    
}
