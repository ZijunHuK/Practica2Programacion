package practica.programacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Galería {

    private Obra obra1 = new Pintura(1, "Guernica\t\t", "P.Picasso", "Óleo\t", 1000, 5, 2, 5, "cuadro guerra civil" ){};
    private Obra obra2 = new Pintura(2, "La Vie\t\t", "P.Picasso", "Óleo\t", 200, 1, 1, 1, "óleo"){};
    private Obra obra3 = new Pintura(3, "El sueño\t", "P.Picasso", "Óleo\t", 300, 1.3, 1, 1, "óleo"){};
    private Obra obra4 = new Pintura(4, "Retrato de Dora Maar ", "P.Picasso", "Óleo\t", 400, 1, 0.8, 1, "óleo"){};
    private Obra obra5 = new Escultura(5, "El piel roja\t", "U.Checa", "\tEscultura", 350, 1, 0.8, 1, "escultura"){};

    public void vizualizarObrasExistentes(){
        System.out.println(" Id\t" + "   Nombre\t\t" + "  Autor\t\t" + "  Técnica\t" + "Precio$\t" + "AlturaM  " + "PesoT  " + "Piezas  " + "   Desc");
        System.out.println(obra1);
        System.out.println(obra2);
        System.out.println(obra3);
        System.out.println(obra4);
        System.out.println(obra5); 
    } //vizualizarObrasExistentes

    public void darDeAlta(){}
    public void modificarDatosDeObra(){}

    public void visualizarObraExpuesta(){
        final String introduce = "Qué obra quiere visualizar?, teclea ID sin los dos 0";
        final String invalido = "ID NO EXISTE";
        int numId = 0;

        try{
            Scanner sca = new Scanner(System.in);
            System.out.println(introduce);
            numId = sca.nextInt();
        } catch (InputMismatchException a) {
            System.out.println(invalido);
        } //try

        switch (numId) {
            case 1:
                System.out.println("Nombre: " + obra1.getNombre() + "\nAutor: " + obra1.getAutor() + "\nPrecio($): " + obra1.getPrecio()
                + "\nAltura(m)" + obra1.getAltura() + "\nPeso(t): " + obra1.getPeso() + "\nNúmero de piezas: " + obra1.getPieza());
                break;
            case 2:
                System.out.println("Nombre: " + obra2.getNombre() + "\nAutor: " + obra2.getAutor() + "\nPrecio($): " + obra2.getPrecio()
                + "\nAltura(m)" + obra2.getAltura() + "\nPeso(t): " + obra2.getPeso() + "\nNúmero de piezas: " + obra2.getPieza());
                break;
            case 3:
                System.out.println("Nombre: " + obra3.getNombre() + "\nAutor: " + obra3.getAutor() + "\nPrecio($): " + obra3.getPrecio()
                + "\nAltura(m)" + obra3.getAltura() + "\nPeso(t): " + obra3.getPeso() + "\nNúmero de piezas: " + obra3.getPieza());
                break;
            case 4:
                System.out.println("Nombre: " + obra4.getNombre() + "\nAutor: " + obra4.getAutor() + "\nPrecio($): " + obra4.getPrecio()
                + "\nAltura(m)" + obra4.getAltura() + "\nPeso(t): " + obra4.getPeso() + "\nNúmero de piezas: " + obra4.getPieza());
                break;
            case 5:
                System.out.println("Nombre: " + obra5.getNombre() + "\nAutor: " + obra5.getAutor() + "\nPrecio($): " + obra5.getPrecio()
                + "\nAltura(m)" + obra5.getAltura() + "\nPeso(t): " + obra5.getPeso() + "\nNúmero de piezas: " + obra5.getPieza());
                break;
            default:
                System.out.println(invalido);
        } //switch
    } //visualizarObraExpuesta

    public void obtenerPrecio(){

        final String introduce = "Precio de que obra quieres?, teclea ID de la obra sin los dos 0";
        final String invalido = "ID NO EXISTE";
        int numId = 0;

        try{
            Scanner sca = new Scanner(System.in);
            System.out.println(introduce);
            numId = sca.nextInt();
        } catch (InputMismatchException b) {
            System.out.println(invalido);
        } //try

        switch (numId) {
            case 1:
                obra1.precioDeVenta();
                break;
            case 2:
                obra2.precioDeVenta();
                break;
            case 3:
                obra3.precioDeVenta();
                break;
            case 4:
                obra4.precioDeVenta();
                break;
            case 5:
                obra5.precioDeVenta();
                break;
            default :
                System.out.println(invalido);
        } //switch
    } //obtenerPrecio

    public void imprimirEtiqueta() {
        final String introduce = "De etiqueta de que obra quiere imprimir?, teclea ID de la obra sin los dos 0";
        final String invalido = "ID NO EXISTE";
        int numId = 0;

        try{
            Scanner sca = new Scanner(System.in);
            System.out.println(introduce);
            numId = sca.nextInt();
        } catch (InputMismatchException c) {
            System.out.println(invalido);
        } //try

        switch (numId) {
            case 1:
                System.out.println("Nombre: " + obra1.getNombre() + "\nAutor: " + obra1.getAutor() + "\nDescripción: " + obra1.getDesc());
                break;
            case 2:
                System.out.println("Nombre: " + obra2.getNombre() + "\nAutor: " + obra2.getAutor() + "\nDescripción: " + obra2.getDesc());
                break;
            case 3:
                System.out.println("Nombre: " + obra3.getNombre() + "\nAutor: " + obra3.getAutor() + "\nDescripción: " + obra3.getDesc());
                break;
            case 4:
                System.out.println("Nombre: " + obra4.getNombre() + "\nAutor: " + obra4.getAutor() + "\nDescripción: " + obra4.getDesc());
                break;
            case 5:
                System.out.println("Nombre: " + obra5.getNombre() + "\nAutor: " + obra5.getAutor() + "\nDescripción: " + obra5.getDesc());
                break;
            default:
            System.out.println(invalido);       
        } //switch
    } //imprimirEtiqueta
    
} //Galería
