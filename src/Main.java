import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num2;
        System.out.println("Guadalupe Maricchiolo - Programación Turno Tarde");
        System.out.println("Buenas tardes. Ingrese: \n1 / Continuar \n2 / Salir");
        do {
            num = sc.nextInt();
            switch (num) {
                case 1:
                    do {
                        System.out.println(" EJERCICIOS PARICAL");
                        System.out.println("Ingrese: \n 1 a 5 para ver los ejercicios\n 6 para salir");
                        num2 = sc.nextInt();
                        switch (num2) {
                            case 1:
                                System.out.println("EJERCICIO Nº1");
                                Ejercicio1.main(args);
                                break;

                            case 2:

                            default:
                                System.out.println("ERROR, número fuera de rango, vuelva a intentar");

                        }
                    } while (num != 2);
                case 2:
                    System.out.println("GRACIAS!");
                    break;
                default:
                    System.out.println("Número fuera de rango, intente nuevamente");
                }
            }while (num != 2);

        }
    }
