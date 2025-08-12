import java.sql.SQLOutput;
import java.util.Scanner;
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
public static void main (String [] args){

mostrarSaudacao();
mostrarDobro(4);
mostrarDivisao(4,2);
boolean ehpar = ehPar(7);
    System.out.println(ehPar(6));






























    }
}