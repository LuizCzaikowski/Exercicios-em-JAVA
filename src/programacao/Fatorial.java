package programacao;

public class Fatorial {
        private int valor, tot;
             
    
          public void calcFatorial(int valor) {
              int i;
              this.setValor(valor);
              if (this.getValor() < 0){
                System.out.println("Não existe fatorial negativo!!");
             }else if(this.getValor() == 0){
                System.out.println("O fatorial de 0 sempre será 1");
             }else{
                tot = 1;
                
                for(i = this.getValor();i >= 1; i--){
                    tot *= i;
                    System.out.println("Fatorial: " + getValor() + "! = " + getValor() + " x " + i);
                }
                System.out.println("Resultado da multiplicação total dos produtos: " + tot);
        
             }  
         
          }
          
          public void setValor(int valor){
              this.valor = valor;
          }
          
          public int getValor() {
              return this.valor;
          }   
}
