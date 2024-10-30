import java.util.ArrayList;

public class Carros {

    /* ATRIBUTOS DE CLASE */
    public static String tipo = "Vehiculo";
    public static int cantidad = 0;
    public static ArrayList<Carros> carros = new ArrayList<Carros>(); // Lista de carros

    /* ATRIBUTOS */
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private int velocidad;

    /* CONSTRUCTOR */

    public Carros() {

        Carros.cantidad += 1;// Incrementa la cantidad de carros
        Carros.carros.add(this);// Agrega el carro a la lista de carros
    }

    public Carros(String marca, String modelo, int año, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.velocidad = velocidad;

        Carros.cantidad += 1;// Incrementa la cantidad de carros
        Carros.carros.add(this);// Agrega el carro a la lista de carros
    }

    /* METODOS */
    public void acelerar() {
        this.velocidad += 10;
    }

    public void frenar() {
        this.velocidad -= 10;
    }

    /* METODOS DE CLASE */
    public static void imprimirCantidad() {
        System.out.println("Cantidad de carros STATIC: " + Carros.cantidad);
    }

    public static void imprimirCarros() {
        System.out.println("Lista de carros STATIC: " + Carros.carros);
    }

    /* GETTER Y SETTER */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

}
