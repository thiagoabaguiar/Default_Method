package classes;

/**
 *
 * @author thiagoabaguiar
 */
public interface ControleRemoto {

    int valor = 9;

    public String status();

    /* método concreto existente numa interface o qual não exige implementação
    por parte das classes que implementarem esta interface
     */
    default void ligar() {
        System.out.println("Dispositivo ligado...");
    }

}
