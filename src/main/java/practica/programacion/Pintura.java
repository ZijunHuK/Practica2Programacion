package practica.programacion;
public class Pintura extends Obra {

    public Pintura(int id, String nombre, String autor, String técnica, int precio, double altura, double peso,
            int pieza, String desc) {
        super(id, nombre, autor, técnica, precio, altura, peso, pieza, desc);
    }

    @Override
    public void precioDeVenta() {
        throw new UnsupportedOperationException("Unimplemented method 'precioDeVenta'");
    } 
 
} //Pintura
