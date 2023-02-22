package practica.programacion;

public class Escultura extends Obra {

    public Escultura(int id, String nombre, String autor, String técnica, int precio, double altura, double peso,
            int pieza, String desc) {
        super(id, nombre, autor, técnica, precio, altura, peso, pieza, desc);
    }

    @Override
    public void precioDeVenta() {
        throw new UnsupportedOperationException("Unimplemented method 'precioDeVenta'");
    }

    

 
} //Escultura
