import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tienda{
    public static void main(String[] args) throws IOException {
        
        //Declaracion de variables a usar
        ArrayList<Producto> productos = new ArrayList<>();
        Venta caja = new Venta();
        Scanner scan = new Scanner(System.in);
        boolean continuar=true,continuarSubmenu=true, productoEncontrado;
        int menu,total, ID_buscado,cantidadProductos=0;
        File archivo = new File("datosTienda.csv");


        cargarArchivos(archivo);
        convertirArchivos(archivo, productos);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        




        //inicio del menu
        while(continuar){
            System.out.println("***** Menú de Jugadores *****");
            System.out.println("1. Buscar producto por ID");
            System.out.println("2. Listado de categorías con total de productos");
            System.out.println("3. Listado de productos por categoria");
            System.out.println("4. Mostrar informe de caja");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            menu = scan.nextInt();
            scan.nextLine();


            switch (menu) {
                case 1:    
                    System.out.println("BUSCAR PRODUCTO POR ID");
                    while(continuarSubmenu){
                        System.out.println("Ingrese el ID del producto");
                        ID_buscado = scan.nextInt();
                        scan.nextLine();

                        productoEncontrado = false; 

                        for (Producto producto : productos) {
                            if (ID_buscado == producto.getID()) {
                                System.out.println(producto);
                                productoEncontrado = true; 
                                break; 
                            }
                        }
                
                        if (!productoEncontrado) {
                            System.out.println("Lo siento, el producto no existe");
                        }
                        continuarSubmenu = volverAlMenu(scan, " a buscar otro producto?");
                    }   
                        
                    break;
                case 2:
                    System.out.println("Listado de categorías con total de productos");
                        System.out.print("Dulce - ");
                        for (Producto producto : productos) {
                            if(producto.getCategoria().equals("Dulce")){
                                cantidadProductos += producto.getDisponibles();

                            }
                        }
                        System.out.println(cantidadProductos);
                        cantidadProductos=0;
                        System.out.print("Snack - ");
                        for (Producto producto : productos) {
                            if(producto.getCategoria().equals("Snack")){
                                cantidadProductos += producto.getDisponibles();

                            }
                        }
                        System.out.println(cantidadProductos);
                        cantidadProductos=0;
                        System.out.print("Bebida - ");
                        for (Producto producto : productos) {
                            if(producto.getCategoria().equals("Bebida")){
                                cantidadProductos += producto.getDisponibles();

                            }
                        }
                        System.out.println(cantidadProductos);

                    break;
                case 3:   
                    System.out.println("Listado de productos por categoría");
                    System.out.println("Categoría Dulce:");
                    for (Producto producto : productos) {
                        if(producto.getCategoria().equals("Dulce")){
                            System.out.println("\t"+producto.getNombre());

                        }
                    }
                    System.out.println("Categoría Snack:");
                    for (Producto producto : productos) {
                        if(producto.getCategoria().equals("Snack")){
                            System.out.println("\t"+producto.getNombre());

                        }
                    }

                    System.out.println("Categoría Bebida:");
                    for (Producto producto : productos) {
                        if(producto.getCategoria().equals("Bebida")){
                            System.out.println("\t"+producto.getNombre());

                        }
                    }
    
                    break;
                case 4:
                    System.out.println("INFORME DE CAJA");
                    total=0;
                    for (Producto producto : productos) {
                        total += (producto.getPrecio()*producto.getDisponibles());
                    }
                    caja.setTotal(total, 0,  null);
                    total=0;
                    for (Producto producto : productos) {
                        if(producto.getCategoria().equals("Snack")){
                            total = (producto.getPrecio()*producto.getDisponibles());
                            caja.setTotal(total, 0, "Snack");
                        }else if(producto.getCategoria().equals("Bebida")){
                            total = (producto.getPrecio()*producto.getDisponibles());
                            caja.setTotal(total, 0, "Bebida");
                        }else if(producto.getCategoria().equals("Dulce")){
                            total = (producto.getPrecio()*producto.getDisponibles());
                            caja.setTotal(total, 0, "Dulce");
                        }
                        
                    }




                    System.out.println("Total de ventas: Q"+caja.getTotal(null));
                    System.out.println("Ventas Snack: Q" + caja.getTotal("Snack"));
                    System.out.println("Ventas Bebida: Q" + caja.getTotal("Bebida"));
                    System.out.println("Ventas Dulces (con comision aplicada): Q" + caja.getTotal("Dulce"));
                    System.out.println("\tCantidad de comision por Dulces: Q" + caja.getComision());

                    break;
                case 5:
                    System.out.println("Saliendo del programa.");


                    System.exit(0);

                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    
                    break;
            }
            
            continuar = volverAlMenu(scan," al menú? ");
            

        }
        scan.close();




    }



    private static void cargarArchivos(File archivo) throws IOException{
        try {
            
            FileWriter escritor = new FileWriter(archivo, true);
            if(archivo.exists()){
                System.out.println("Archivo " + archivo + " cargado correctamente!!");
            }else{        
                System.out.println("No existe " + archivo);
                System.exit(0);
            }
            escritor.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Upsi");
            e.printStackTrace();
        }
    }


    private static void convertirArchivos(File archivo, ArrayList<Producto> productos) throws IOException{
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean esEncabezado = true;

            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                
                if (esEncabezado) {
                    esEncabezado = false;
                } else if(campos != null) {
                        if (campos[6].equals("Dulce")) {
                            // Asignar variables a cada campo
                            int ID = Integer.parseInt(campos[0]);
                            String nombre = campos[1];
                            int cant_disponibles = Integer.parseInt(campos[2]);
                            int precio = Integer.parseInt(campos[5]);
                            double comision = 0.20;

                            boolean esDietetico = Boolean.parseBoolean(campos[12]);
                            
                            Producto x = new Dulce(ID,cant_disponibles,precio,comision,nombre,esDietetico);
                            productos.add(x);
                        }else if(campos[6].equals("Snack")){
                            // Asignar variables a cada campo
                            int ID = Integer.parseInt(campos[0]);
                            String nombre = campos[1];
                            int cant_disponibles = Integer.parseInt(campos[2]);
                            int precio = Integer.parseInt(campos[5]);
                            double comision = 0.20;

                            int gramos = Integer.parseInt(campos[9]);
                            String sabor = campos[10];
                            String tamanio = campos[11];

                            
                            Producto x = new Snack(ID,cant_disponibles,precio,comision,nombre,gramos, sabor,tamanio);
                            productos.add(x);
                        }else if(campos[6].equals("Bebida")){
                            // Asignar variables a cada campo
                            int ID = Integer.parseInt(campos[0]);
                            String nombre = campos[1];
                            int cant_disponibles = Integer.parseInt(campos[2]);
                            int precio = Integer.parseInt(campos[5]);
                            double comision = 0.20;

                            int mililitros = Integer.parseInt(campos[7]);;
                            String tipo = campos[8];
                            

                            
                            Producto x = new Bebida(ID,cant_disponibles,precio,comision,nombre, mililitros, tipo );
                            productos.add(x);
                        }
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean volverAlMenu(Scanner scanner, String eleccion) {
        System.out.println("¿Desea volver"+ eleccion+" (1: Sí, 0: No): ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        if (opcion == 0) {
            if(eleccion.equals(" al menú? ")){
                System.out.println("Saliendo del programa....");
                return false;
            }else{
                System.out.println("Saliendo de la opción.");
                return false;
            }
        } else {
            
            return true;
        }
        
    }

}