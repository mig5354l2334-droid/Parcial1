public class Calculo {


    public static double calculartotal(Habitaciones habitacion){
        double total = 0.0;
        Habitaciones[] habitaciones = habitacion.getResrva;
        if(habitacion.getTipo().equals("Suite") )
            for(int i = 0; i < 5; i++){
                total += (habitaciones[i].getTarifa_base() * habitaciones[i].getCantidad_noches()) * (20.0/100);


        }
        if(habitacion.getTipo().equals("Oferta") )
            for(int i = 0; i < 5; i++){
                total += (habitaciones[i].getTarifa_base() * habitaciones[i].getCantidad_noches()) * ();


            }





        return total;}
}
