import java.util.Scanner;
public class MiprogramaJS {
    
    public static void main  (String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        
        System.out.print("Ingrese su estatura en metros (ejemplo 1.75): ");
        double estatura = scanner.nextDouble();
        
        
        System.out.print("Ingrese su peso en kilogramos (ejemplo 70): ");
        double peso = scanner.nextDouble();
        
       
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        
        double imc = peso / (estatura * estatura);
        
      
        System.out.println("\n--- Resultados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Estatura: " + estatura + " metros");
        System.out.println("Peso: " + peso + " kilogramos");
        System.out.println("Edad: " + edad + " años");
        System.out.printf("IMC: %.2f\n", imc);
        
        
        scanner.close();
    }
}
