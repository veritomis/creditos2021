package ar.com.ada.creditos.excepciones;

import ar.com.ada.creditos.entities.*;

/**
 * ClienteDNIException
 */
public class ClienteNombreException extends ClienteInfoException {

    private Cliente Cliente;

    public ClienteNombreException(Cliente cliente, String mensaje) {
        super(cliente, mensaje);
        this.Cliente = cliente;
        // TODO Auto-generated constructor stub
    }

}