/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA I
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int cedula;
        double nocturnas;
        double matutinas;
        String ciudad;
        double seg_social;
        boolean bandera = true;
        String mensaje = "";
        double subtotal;
        double total;
        double matutinas_valor;
        double nocturnas_valor;
        double descuento = 0;
        int contador = 0;
        int salir;

        while (bandera) {
            System.out.println("Ingrese su nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el nombre de su ciudad");
            ciudad = entrada.nextLine();
            System.out.println("Ingrese su numero de cédula");
            cedula = entrada.nextInt();
            System.out.println("Ingrese las horas matutinas trabajadas");
            matutinas = entrada.nextDouble();
            System.out.println("Ingrese las horas nocturnas trabajadas");
            nocturnas = entrada.nextDouble();

            contador = contador + 1;
            matutinas_valor = matutinas * 10;

            if (nocturnas >= 10) {
                descuento = nocturnas * 1.5;
            }

            nocturnas_valor = (nocturnas * 15) + descuento;
            subtotal = matutinas_valor + nocturnas_valor;
            seg_social = (subtotal * 18) / 100;
            total = subtotal - seg_social;

            mensaje = mensaje + "Rol del trabajador de nombre " + nombre +
                    " y cédula " + cedula +".\n"+"\tHoras matutina trabajadas: "
                    +matutinas+".\n"+"\tHoras nocturnas trabajadas: "+nocturnas+".\n"+
                    "\tSubtotal $"+subtotal+"\n\tSeguro Social $"+seg_social+"\n\tTota"
                    + "l a cancelar $"+total+"\n\n";
            
            
            entrada.nextLine();
            System.out.print("Ingrese 1 si desea salir\n");
            salir = entrada.nextInt();

            entrada.nextLine();

            if (salir == 1) {
                bandera = false;
            }

        }
        System.out.printf("Nómina de Trabajadores\n\n%sNúmero de empleados"
                + " %d\n", mensaje, contador);

    }

}

/*mensaje = System.out.printf("%sRol del trabajador de nombre %s y "
                    + "cédula %d.\n\tHoras matutina trabajadas: %d.\n\tHoras"
                    + " nocturnas tranajadas %d.\n\tSubtotal $%.1f.\n\tSeguro"
                    + "socila $%.1f.\n\tTotal a cancelar $%.1f.\n",
                    mensaje + nombre + cedula + matutinas + nocturnas + subtotal
                    + seg_social + total);*/