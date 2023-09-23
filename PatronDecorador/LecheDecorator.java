public class LecheDecorator extends Decorador {
    private double lecheCosto = 3.50;

    public LecheDecorator(Bebida bebida) {
        super(bebida);
        descripcion = bebida.getDescripcion() + " con leche";
    }

    public double calcularCosto() {
        return bebida.calcularCosto() + lecheCosto;
    }
}
