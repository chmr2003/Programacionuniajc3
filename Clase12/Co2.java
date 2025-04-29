import java.util.ArrayList;

public class Co2 {

    public static void main(String[] args) {
        // Emisiones por kilómetro (en gramos)
        double gasolina = 127.6;
        double diesel = 132.0;
        double gnv = (143 + 170) / 2.0; // promedio

        // Supongamos que cada vehículo recorre 20,000 km por año
        int kmPorAnio = 20000;

        // Datos de los vehículos: {nombre, cantidad, porcentaje gasolina, porcentaje diésel, porcentaje GNV}
        ArrayList<Object[]> vehiculos = new ArrayList<>();
        vehiculos.add(new Object[]{"Camiones livianos", 400000, 0.30, 0.40, 0.30});
        vehiculos.add(new Object[]{"Camiones medianos", 280000, 0.25, 0.50, 0.25});
        vehiculos.add(new Object[]{"Camiones pesados", 380000, 0.10, 0.80, 0.10});
        vehiculos.add(new Object[]{"Tractocamiones", 1150000, 0.05, 0.90, 0.05});
        vehiculos.add(new Object[]{"Volquetas", 936000, 0.40, 0.40, 0.20});

        // Mostrar resultados
        System.out.println("Emisiones anuales de CO2 en toneladas:");
        for (Object[] vehiculo : vehiculos) {
            String nombre = (String) vehiculo[0];
            int cantidad = (int) vehiculo[1];
            double porcentajeGasolina = (double) vehiculo[2];
            double porcentajeDiesel = (double) vehiculo[3];
            double porcentajeGnv = (double) vehiculo[4];

            double emisGas = cantidad * porcentajeGasolina * kmPorAnio * gasolina / 1e6;
            double emisDiesel = cantidad * porcentajeDiesel * kmPorAnio * diesel / 1e6;
            double emisGnv = cantidad * porcentajeGnv * kmPorAnio * gnv / 1e6;

            System.out.println(nombre + " - Gasolina: " + emisGas + " ton");
            System.out.println(nombre + " - Diésel: " + emisDiesel + " ton");
            System.out.println(nombre + " - GNV: " + emisGnv + " ton");
        }
    }
}