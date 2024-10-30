
public class Algoritmos {

    /* METODOS */
    // PROCIMENTAL
    public static void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
        // NO RETORNA NADA
    }

    // FUNCIONAL
    // RETORNA UN VALOR
    // TIPO DE DATO DE RETORNO
    // SINTAXIS
    // public static TIPO_DE_DATO nombre_de_la_funcion(PARAMETROS) {
    //     return VALOR;
    // }
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static String concatenar(String a, String b) {
        return a + b;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }


}
