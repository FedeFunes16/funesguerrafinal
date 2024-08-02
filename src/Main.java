import Modelados.*;
import Excepciones.*;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        Telefono telefono1 = new Telefono("buenCelu", "Samsung", 15000, 5, "android", "64GB", "15cm x 6cm");
        Telefono telefono2 = new Telefono("celuTrabajo", "Motorola", 8000, 2, "android", "32GB", "8cm x 4cm");
        Computadora computadora1 = new Computadora("Nitro5", "Acer", 100000, 1, "i5-9400f", "16GB", "500GB");
        Computadora computadora2 = new Computadora("MacBook2", "Apple", 234500, 0, "macProcessor 2024", "8gb", "256GB");
        Accesorio accesorio1 = new Accesorio("AuricularesGamer", "Corsair", 50000, 16, "Bluetooth", "Android e Ios");
        Accesorio accesorio2 = new Accesorio("Teclado", "RedDragon", 36500, 4, "USB", "Windows  10 y 11");

        ProductosElectronicos<Producto> negocio = new ProductosElectronicos<>();

        negocio.addProducto(telefono1);
        negocio.addProducto(telefono2);
        negocio.addProducto(computadora1);
        negocio.addProducto(computadora2);
        negocio.addProducto(accesorio1);
        negocio.addProducto(accesorio2);

        do {
            System.out.println("Ingrese un numero para ejecutar funcion:");
            switch (scanner.nextInt()){
                case 1: //Trae el producto buscado
                    System.out.println("Diga el nombre del producto que busca:");
                    String buscar = scanner.next();
                    Producto buscado = negocio.getProducto(buscar);
                    System.out.println(buscado);
                    break;
                case 2: //Muestra todos los productos en el negocio
                    negocio.listAll();
                    break;
                case 3: //Borra el producto en base al nombre dado por el usuario
                    System.out.println("Diga el nombre del producto que desea borrar:");
                    String borrar = scanner.next();
                    negocio.deleteProducto(borrar);
                    System.out.println("Producto eliminado de manera exitosa");
                    break;
                case 4: //Compra el producto que quiere el usuario
                    System.out.println("Diga el nombre del producto que quiere comprar:");
                    String comprar = scanner.next();

                    System.out.println("Que cantidad necesita del producto:");
                    int cantidadComprar = scanner.nextInt();

                    negocio.buyProducto(comprar, cantidadComprar);
                    break;
                case 5: //Guarda los productos del negocio en el archivo
                    negocio.guardarArchivo();
                    break;
                default:
                    flag = false;
                    break;
            }
        }while(flag);

    }
}