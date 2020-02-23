package programacao;

public class Calculadora {
    
    private int valor;
    
    public void calcTabuada(int valor){
        this.setValor(valor);
        int tot;
        int i;
                
        for (i = 1; i <= 10; i++){
            tot = this.getValor() * i;
            System.out.println(this.getValor() + "x" + i + " = " + tot);
         }
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public int getValor() {
        return this.valor;
    }
}
