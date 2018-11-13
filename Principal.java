import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal_IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1= new Persona();
        Persona p2= new Persona("Andres",25);
        Persona p3= new Persona();
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Nombre: ");
        p1.setNombre(sc.nextLine());
        System.out.println("Edad: ");
        p1.setEdad(sc.nextInt());
        System.out.println("Peso: ");
        p1.setPeso(sc.nextDouble());
        System.out.println("Altura: ");
        p1.setAltura(sc.nextDouble());
        
        p3.setNombre("Pedro");
        p3.setEdad(24);
        p3.setPeso(90);
        p3.setAltura(1.89);
        
        System.out.println(p1.toString()+", Su masa corporal es: "+p1.calcularMC()+", Mayoria de edad:  "+p1.esMayoDeEdad());
        System.out.println(p2.toString()+", Su masa corporal es: "+p2.calcularMC()+", Mayoria de edad:  "+p2.esMayoDeEdad());
        System.out.println(p3.toString()+", Su masa corporal es: "+p3.calcularMC()+", Mayoria de edad:  "+p3.esMayoDeEdad());    
    }
    
}
