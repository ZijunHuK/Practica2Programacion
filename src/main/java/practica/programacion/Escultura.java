package practica.programacion;

public class Escultura extends Obra {

    public Escultura(int id, String nombre, String autor, String técnica, int precio, double altura, double peso,
            int pieza, String desc) {
        super(id, nombre, autor, técnica, precio, altura, peso, pieza, desc);
    }

    @Override
    public void precioDeVenta() {
        double precioFinal = 0;

        System.out.println("Nombre: " + nombre);
        System.out.println("Altura(m): " + altura);
        System.out.println("Peso(t): " + peso);
        System.out.println("Número de piezas: " + pieza);
        System.out.println("Precio($): " + precio);
        precioFinal += precio;
        double comision = precio * 0.25;
        System.out.println("Comisión Galería($): " + comision);
        precioFinal += comision;

        if (peso > 1) {
            System.out.println("Importe por peso($): 100");
            precioFinal += 100;
        } else {
            System.out.println("Importe por peso($): 20");
            precioFinal += 20;
        }

        if (altura > 2) {
            System.out.println("Importe por altura($): 100");
            precioFinal += 100;
        } else {
            System.out.println("Importe por altura($): 20");
            precioFinal += 20;
        }

        for (int i = 3; i <= pieza; i++) {
            if (pieza > 2) {
                System.out.println("Importe adicional - Pieza " + i + " ($): 10" );
                continue;
            }
        }
        precioFinal += ((pieza - 2) * 10);

        System.out.println("Precio de venta($): " + precioFinal);
        
        double descuento = precioFinal * 0.20;
        System.out.println("Descuento (20% escultura $): " + descuento);
        precioFinal -= descuento;

        double sobreCoste = 50;
        System.out.println("Gastos de manipulación($): " + sobreCoste);
        precioFinal += sobreCoste;

        System.out.println("Precio final de venta($): " + precioFinal);
    }//precioDeVenta

} //Escultura
