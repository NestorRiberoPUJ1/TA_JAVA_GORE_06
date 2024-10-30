
/* ARCHIVO PRINCIPAL */
public class Application {

    /* FUNCION DE EJECUCIÓN PRINCIPAL */
    public static void main(String[] args) {

        System.out.println();
        Algoritmos.imprimirMensaje("ESTAMOS APRENDIENDO JAVA");

        int resultado = Algoritmos.sumar(5, 3);
        System.out.println("El resultado de la suma es: " + resultado);

        String resultadoConcatenado = Algoritmos.concatenar("Hola", "Mundo");
        System.out.println("El resultado de la concatenación es: " + resultadoConcatenado);

        boolean esPar = Algoritmos.esPar(5);
        System.out.println("El número es par: " + esPar);

        // String marca, String modelo, int año, String color, int velocidad
        Carros vwAmarok = new Carros("VolksWagen", "Amarok", 2021, "Blanco", 0);
        Carros audiQ7 = new Carros("Audi", "Q7", 2024, "Plata", 0);

        System.out.println("Marca: " + vwAmarok.getMarca());
        System.out.println("Modelo: " + audiQ7.getModelo());

        audiQ7.acelerar();
        System.out.println("Velocidad de Audi Q7: " + audiQ7.getVelocidad());
        audiQ7.acelerar();
        System.out.println("Velocidad de Audi Q7: " + audiQ7.getVelocidad());


        System.out.println("Cantidad de carros: " + Carros.cantidad);
        System.out.println("Lista de carros: " + Carros.carros);

        Carros.imprimirCantidad();
        Carros.imprimirCarros();

    }

}