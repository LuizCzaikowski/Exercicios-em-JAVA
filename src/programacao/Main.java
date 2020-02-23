package programacao;
/**
 *
 * @author Luiz_
 */
public class Main {
            
    public static void main(String[] args){
        //Instancia um objeto apontando o metodo passando parametro para realizar
        // o calculo
        Fatorial calculo1 = new Fatorial();
        ParImpar calculo2 = new ParImpar();
        Calculadora calculo3 = new Calculadora();
        
        calculo1.calcFatorial(5);
        calculo2.calcParImpar(5);
        calculo3.calcTabuada(2);
        
        //quando for mostrar os resultados role o scroll do mouse para cima
        //para ver todos os resultados!!
    } 


}
