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
        int num;
        double noc;
        double mat;
        String cid;
        double seg_s;
        boolean bandera = true;
        String mensaje = "";
        double subt;
        double total;
        double mat_v;
        double noc_v;
        double des = 0;
        int cont = 0;
        int salir;

        while (bandera) {
            System.out.print("Ingrese su nombre\n");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el nombre de su ciudad");
            cid = entrada.nextLine();
            System.out.println("Ingrese su numero de cédula");
            num = entrada.nextInt();
            System.out.println("Ingrese las horas matutinas trabajadas");
            mat = entrada.nextDouble();
            System.out.println("Ingrese las horas nocturnas trabajadas");
            noc = entrada.nextDouble();
            
            cont = cont + 1;
            mat_v = mat *10;
            
            if (noc >= 10) {
                des = noc *1.5;
            }
            
            noc_v = (noc *15) + des;
            subt = mat_v + noc_v;
            seg_s = (subt * 18) / 100; 
            total = subt - seg_s;
            
            mensaje = mensaje + "Rol del trabajador de nombre " + nombre +
                    " y cédula " + num +".\n"+"\tHoras matutina trabajadas: "
                    +mat+".\n"+"\tHoras nocturnas trabajadas: "+noc+".\n"+
                    "\tSubtotal $"+subt+"\n\tSeguro Social $"+seg_s+"\n\tTota"
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
                + " %d\n", mensaje, cont);

    }
    
}
