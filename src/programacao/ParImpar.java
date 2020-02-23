package programacao;

public class ParImpar {

    private int valor;
    
    public void calcParImpar(int valor){
        this.setValor(valor);
        if (this.getValor() %2 == 0) {
            if(this.getValor() < 10){
                System.out.println("Não é estranho");
                System.out.println("O número " + getValor() + " é PAR");
            }else if(this.getValor() >= 10 && this.getValor() <= 20) {
                System.out.println("O número " + getValor() + " é PAR");
                System.out.println("O número é ESTRANHO");
            }if(this.getValor() > 20){
                System.out.println("O número " + getValor() + " é PAR");
                System.out.println("O número é não é ESTRANHO");
            }
        }else{
            System.out.println("O número " + getValor() + " é IMPAR");
            System.out.println("ESTRANHO");
        }
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return this.valor;
    }
}
