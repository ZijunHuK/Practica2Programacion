package practica.programacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static boolean finalizar = false;

    private static final String OPCION_1 = "1. Visualizar las obras de arte existentes en la galería";
    private static final String OPCION_2 = "2. Dar de alta una nueva obra de arte";
    private static final String OPCION_3 = "3. Modificar los datos de una de las obras de arte expuestas";
    private static final String OPCION_4 = "4. Visualizar los datos de una de las obras de arte expuestas";
    private static final String OPCION_5 = "5. Obtener el precio de venta de una de las obras de arte expuestas";
    private static final String OPCION_6 = "6. Imprimir una etiquta para clasificar una de las obras expuestas y dar información adicional a los visitantes de la galería";
    private static final String OPCION_0 = "0. Finaliza";

    private static final String[] OPCIONES_MENU_INICIAL = {OPCION_1, OPCION_2, OPCION_3, OPCION_4, OPCION_5, OPCION_6, OPCION_0};

    private static final int SALIR = 0;
    private static final int VISUALIZAR_OBRAS_EXISTENTES = 1;
    private static final int DAR_ALTA = 2;
    private static final int MODIFICAR_DATOS = 3;
    private static final int VISUALIZAR_DATOS_EXPUESTAS = 4;
    private static final int OBTENER_PRECIO_EXPUESTAS = 5;
    private static final int IMPRIMIR_ETIQUETA = 6;
    private static final String MENSAJE_DESPEDIDA = "Hasta la próxima";
    private static final String MENSAJE_ERROR = "    !!!Opción elegida incorrecta";

    public static void main(String[] args) {

        Galería galeria = new Galería();

        Scanner sc = new Scanner(System.in);

            //mostrar menu
            while(!finalizar) {
                for (final String OPCION_MENU_INICIAL : OPCIONES_MENU_INICIAL) {
                    System.out.println(OPCION_MENU_INICIAL);
                } //for
            
            //pedir input al usuario
            int userInput = 0;
            try{
                userInput = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(MENSAJE_ERROR);
                sc.next();
                continue;
            } //try

            //ejecutar opción
            switch (userInput) {
                case SALIR:
                    finalizar = true;
                    break;
                case VISUALIZAR_OBRAS_EXISTENTES:
                    galeria.vizualizarObrasExistentes();
                    break;
                case DAR_ALTA:
                    System.out.println("Dar alta");
                    break;
                case MODIFICAR_DATOS:
                    System.out.println("Modificar obra de arte expuestas");
                    break;
                case VISUALIZAR_DATOS_EXPUESTAS:
                    galeria.visualizarObraExpuesta();
                    break;
                case OBTENER_PRECIO_EXPUESTAS:
                    galeria.obtenerPrecio();
                    break;
                case IMPRIMIR_ETIQUETA:
                    galeria.imprimirEtiqueta();
                    break;
                default:
                    System.out.println(MENSAJE_ERROR);
            } //switch
        } //while
        sc.close();
        System.out.println(MENSAJE_DESPEDIDA);

    } //main
} //MenuInicial
