package programacao;
import java.util.Scanner;
/**
 *
 * @author Luiz_
 */
public class Main {
           
    public static void main(String[] args){
        Scanner calculo = new Scanner(System.in);
        
        int x = 0;
        while (x != 5) {
            System.out.println("\n");
            System.out.println("Selecione a operação!!");
            System.out.println("Calcular Fatorial ( 1 )");
            System.out.println("Calcular Impar ou Par ( 2 )");
            System.out.println("Calcular Tabuada ( 3 )");
            System.out.println("Calcular Bhaskara ( 4 )");
            System.out.println("Sair ( 5 )");
            x = calculo.nextInt();
            switch(x){
                case 1:
                    int y;
                    Fatorial calculo1 = new Fatorial();
                    System.out.println("Fatorial Selecionado");
                    System.out.println("Digite um número para fatorar: "); 
                    y = calculo.nextInt();
                    calculo1.calcFatorial(y);
                    break;
                case 2:
                    int p;
                    ParImpar calculo2 = new ParImpar();
                    System.out.println("Verificar se é par ou impar selecionado");
                    System.out.println("Digite um número: ");
                    p = calculo.nextInt();
                    calculo2.calcParImpar(p);
                    break;
                case 3:
                    int n;
                    Calculadora calculo3 = new Calculadora();
                    System.out.println("Tabuada selecionado");
                    System.out.println("Digite um número: ");
                    n = calculo.nextInt();
                    calculo3.calcTabuada(n);
                    break;
                case 4:
                    //Irá abrir uma tela Java basta clicar nela para realizar o 
                    //Calculo 
                    new telaEquacao().setVisible(true);
                    break;
                default:
                    System.out.println("Comando Inválido!!");
            }
        }
        
        //quando for mostrar os resultados role o scroll do mouse para cima
        //para ver todos os resultados!!
    } 


}
