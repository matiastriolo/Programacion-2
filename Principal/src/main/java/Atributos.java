
import java.time.LocalDate;
import java.time.Period;

public class Atributos {
    Empleados num = new Empleados();

    public void CalcularEdad() {

        LocalDate fechaNacimiento = LocalDate.parse(num.getNacimiento());
        LocalDate fActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fActual);
        int años = periodo.getYears();
        System.out.println("La edad es: " + años);

    }
    
    public void MostrarDatos(){
        System.out.println(num.getDni());
        System.out.println(num.getApellido());
        System.out.println(num.getNom());
        System.out.println(num.getDomicilio());
        System.out.println(num.getNacimiento());
        System.out.println(num.getSueldo());
        
    }
}
