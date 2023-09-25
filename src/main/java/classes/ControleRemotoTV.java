package classes;

/**
 *
 * @author thiagoabaguiar
 */

public class ControleRemotoTV implements ControleRemoto{

    @Override
    public String status() {
        return "Dispositivo desligado...";
    }
    
}
