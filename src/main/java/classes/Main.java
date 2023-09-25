package classes;

/**
 *
 * @author thiagoabaguiar
 */

public class Main {

    public static void main(String[] args) {
     
        ControleRemoto meuControle = new ControleRemotoTV();
        
        System.out.println(meuControle.status());
        
        meuControle.ligar();
        
    }
}
