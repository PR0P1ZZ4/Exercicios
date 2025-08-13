import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;
// 1. Criar esqueleto da função
// 2. Definir se tem retorno ou não
// 3. Definir se tem parametro ou não
// 4. Escrever o codigo da função ( O que faz )
public class Main {
// dar as boas vindas
public static void mostrarSaudacao (){
    System.out.println("Seja bem vindo ao programa!");

}
// dobrar todo numero
public static void mostrarDobro (int num1){

    System.out.println(num1 * 2);
}
//mostrar divisor
public static void mostrarDivisao (int num4, int num5){
    System.out.println(num4 / num5);

}
public static boolean ehPar (int numero){
    boolean resultado = (numero % 2 == 0);
     return resultado;
}

public static void medirTemperatura (double celsius) {
double resultado = (celsius * 1.8 + 32);
    System.out.println(resultado);

}

public static double medirRetangulo (double base, double altura){
double area = (base * altura);
return area;

}

public static double calcularMedia (double nota,double nota2,double nota3){
double media = (nota + nota2 + nota3);
double resultado = (media / 3);
return resultado;
}
public static void criarLinha () {
    System.out.println("-----------------------------");


}
public static boolean multiploDeTres (int num){
boolean resultado = (num % 3 == 0);
return  resultado;
}
public static int somarArray (){
int [] numero = new int[5];
numero[0] = 3;
numero[1] = 5;
numero[2] = 2;
numero[3] = 6;
numero[4] = 9;
int soma = 0;
    for (int i = 0; i < 5; i++) {
        soma = numero [i] + soma;


    }

return soma;

}

public static void ehPalindromo () {
   Scanner sc = new Scanner(System.in);
   String palindromo = sc.nextLine();



}
public static void main (String [] args){

mostrarSaudacao();
mostrarDobro(4);
mostrarDivisao(4,2);
boolean ehpar = ehPar(7);
    System.out.println(ehPar(6));
medirTemperatura(7);
    System.out.println(medirRetangulo(7,8));
    System.out.println(calcularMedia(3.5,7.2,9));
criarLinha();
    System.out.println(multiploDeTres(7));
    System.out.println(somarArray());























    }
}