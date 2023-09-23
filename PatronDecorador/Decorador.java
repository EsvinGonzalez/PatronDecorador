public abstract class Decorador extends Bebida {
    protected Bebida bebida;

    public Decorador(Bebida bebida) {
        this.bebida = bebida;
    }
}
