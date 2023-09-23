public abstract class Bebida {
    protected String descripcion;
    protected double costo;

    public String getDescripcion() {
        return descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public abstract double calcularCosto();
}

