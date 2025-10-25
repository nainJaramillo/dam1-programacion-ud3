public class CarritoSuma {

    // Clase que representa un producto
    static class Producto {
        String nombre;
        double precio;

        // Constructor (sirve para crear el producto)
        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }
    }

    // Método que suma todos los precios del carrito
    public static double totalCarrito(Producto[] carrito) {
        double total = 0;

        // Recorremos todos los productos del carrito
        for (int i = 0; i < carrito.length; i++) {
            total = total + carrito[i].precio;
        }

        return total;
    }

    // Método principal (donde empieza el programa)
    public static void main(String[] args) {

        // Creamos algunos productos
        Producto p1 = new Producto("Teclado", 24.99);
        Producto p2 = new Producto("Ratón", 15.50);
        Producto p3 = new Producto("Auriculares", 39.90);

        // Creamos un array (carrito) con los productos
        Producto[] carrito = { p1, p2, p3 };

        // Llamamos a la función que suma los precios
        double total = totalCarrito(carrito);

        // Mostramos el total
        System.out.println("Total del carrito: " + total + " €");
    }
}



