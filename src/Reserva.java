public class Reserva {
    private Habitaciones[] habitaciones;
    private int id;
    private static final int max_habitaciones = 5;
    private int contador;

    public Reserva(int id){
    this.id = id;
    habitaciones = new Habitaciones[max_habitaciones];
    contador = 0;
    }

    public int getId() {
        return id;
    }
    public boolean agregar_abitacion(Habitaciones habitacion){
        if(habitacion.getCantidad_noches() >= 0){
            throw new Tarifa_inadecuada("Las noches de la habitacion son invalidas");
        }
        if(habitacion.equals(habitacion)){
            throw new Habitaciones_iguales("Esta habitacion ya ha sido registrada");
        }
        if(contador >= max_habitaciones){
            System.out.println("Habitaciones maximas registradas");
        return false;}
        else
        habitaciones[contador] = habitacion;
        contador ++;
        return true;}

    public Habitaciones[] getReserva() {
        return habitaciones;
    }
}
