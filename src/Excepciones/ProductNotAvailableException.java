package Excepciones;

public class ProductNotAvailableException extends RuntimeException{
    public ProductNotAvailableException(String mensaje){
        super(mensaje);
    }
}
