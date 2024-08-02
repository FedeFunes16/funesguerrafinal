package Modelados;

import Excepciones.ProductNotAvailableException;
import Excepciones.ProductNotFoundException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ProductosElectronicos<T> {
    private Set<T> productos;
    public ProductosElectronicos() {
        productos = new HashSet<T>();
    }
    public Set<T> getProductos() {
        return productos;
    }
    public void setProductos(Set<T> productos) {
        this.productos = productos;
    }

    public void addProducto(T obj){
        if(!productos.contains(obj)){
            productos.add(obj);
        }else{
            System.out.println("NO se ha podido agregar el producto, ya se encuentra cargado");
        }
    }

    public Producto getProducto(String buscado){
        try {
            Producto encontrado = null;
            for (T aux : productos) {
                //System.out.println(buscado);
                //System.out.println(aux);
                if (buscado.equals(((Producto) aux).getNombre())){
                   encontrado = (Producto) aux;
                }
            }
            return encontrado;
        }catch(Exception e){
            throw new ProductNotFoundException(e.getMessage());
        }
    }

    public void listAll(){
        for (T aux : productos){
            System.out.println(aux);
        }
    }

    public void deleteProducto(String buscado){
        Producto borrar = getProducto(buscado);
        if (borrar != null) {
            productos.remove(borrar);
        }
    }

    public void buyProducto(String productoComprar, int cantComprar){
        boolean flag = true;
        try {
                Producto aux = getProducto(productoComprar);

                    if (aux.getStock() == 0 || cantComprar > aux.getStock()) {
                        throw new ProductNotAvailableException("Producto no disponible");
                    } else {
                        aux.setStock(-cantComprar);
                    }
        }catch(RuntimeException e){
            throw new ProductNotAvailableException(e.getMessage());
        }
    }

    public void guardarArchivo() throws IOException {
        File file = new File("ArchivoProductos.json");
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(file, productos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
