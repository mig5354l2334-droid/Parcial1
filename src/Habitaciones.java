public class Habitaciones {
    private String nombre;
    private int numero;
    private double tarifa_base;
    private String tipo;
    private int cantidad_noches;

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public double getTarifa_base() {
        return tarifa_base;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad_noches() {
        return cantidad_noches;
    }

    public void setCantidad_noches(int cantidad_noches) {
        this.cantidad_noches = cantidad_noches;
    }
}
