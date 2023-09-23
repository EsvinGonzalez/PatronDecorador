public class ChocolateDecorator extends Decorador {
    private double chocolateCosto = 4;

    public ChocolateDecorator(Bebida bebida) {
        super(bebida);
        descripcion = bebida.getDescripcion() + " con chocolate";
    }

    public double calcularCosto() {
        return bebida.calcularCosto() + chocolateCosto;
    }
}
