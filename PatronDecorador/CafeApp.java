public class CafeApp {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        System.out.println("Descripcion: " + cafe.getDescripcion());
        System.out.println("Costo: Q" + cafe.calcularCosto());

        Bebida cafeConLeche = new LecheDecorator(new Cafe());
        System.out.println("\nDescripcion: " + cafeConLeche.getDescripcion());
        System.out.println("Costo: Q" + cafeConLeche.calcularCosto());

        Bebida cafeConLecheYChocolate = new ChocolateDecorator(new LecheDecorator(new Cafe()));
        System.out.println("\nDescripcion: " + cafeConLecheYChocolate.getDescripcion());
        System.out.println("Costo: Q" + cafeConLecheYChocolate.calcularCosto());
    }
}
