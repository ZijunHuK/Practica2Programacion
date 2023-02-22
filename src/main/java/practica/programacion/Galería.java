package practica.programacion;

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
    
}
