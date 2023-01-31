import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String respuesta = "no";
        do {
            Scanner leer = new Scanner(System.in);
            leer.nextLine();
            System.out.print("Captura Operacion: (SUMA, RESTA, MULTIPLICACION O DIVISION)  ");
            String operacion = leer.nextLine();
            if (Objects.equals(operacion, "SUMA") || Objects.equals(operacion, "RESTA") || Objects.equals(operacion, "MULTIPLICACION") || Objects.equals(operacion, "DIVISION")) {
                System.out.print("Operando1: ");
                int parameter1 = leer.nextInt();
                System.out.print("Operando2: ");
                int parameter2 = leer.nextInt();
                switch (operacion) {
                    case "SUMA" -> System.out.println(parameter1 + " + " + parameter2 + " = " + (parameter1 + parameter2));
                    case "MULTIPLICACION" -> System.out.println(parameter1 + " * " + parameter2 + " = " + (parameter1 * parameter2));
                    case "DIVISION" -> System.out.println(parameter1 + " / " + parameter2 + " = " + (parameter1 / parameter2));
                    case "RESTA" -> System.out.println(parameter1 + " - " + parameter2 + " = " + (parameter1 - parameter2));
                }
                leer.nextLine();
                System.out.print("Otra oprecaion? (si o no)  ");
                respuesta = leer.nextLine();
            }
            else{
                System.out.println("No es una operacion valida");
            }
        }while(Objects.equals(respuesta, "si"));
    }
}