package practica.programacion;

public abstract class Obra {

    protected int id;
    protected String nombre;
    protected String autor;
    protected String técnica;
    protected double precio;
    protected double altura;
    protected double peso;
    protected int pieza;
    protected String desc;

    public Obra(int id, String nombre, String autor, String técnica, double precio, double altura, double peso, int pieza, String desc) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.técnica = técnica;
        this.precio = precio;
        this.altura = altura;
        this.peso = peso;
        this.pieza = pieza;
        this.desc = desc;
    }
        
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTécnica(){
        return this.técnica;
    }

    public void setTécnica(String técnica) {
        this.técnica = técnica;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPieza() {
        return this.pieza;
    }

    public void setPieza(int pieza) {
        this.pieza = pieza;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract void precioDeVenta();

    @Override
    public String toString() {
        return
            "00" + getId() + "\t" +
             getNombre() + "\t" +
             getAutor() + "\t" +
             getTécnica() + "\t" +
             getPrecio() + "$\t" +
             getAltura() + "m     " +
             getPeso() + "t     " +
             getPieza() + "     " +
             getDesc() + "";
    }

} //obra
