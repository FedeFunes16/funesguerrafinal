package Excepciones;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String mensaje){
        super(mensaje);
    }
}
