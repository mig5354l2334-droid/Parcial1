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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Habitaciones otro = (Habitaciones) obj;
        return this.numero == otro.numero;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(numero);
    }
}

