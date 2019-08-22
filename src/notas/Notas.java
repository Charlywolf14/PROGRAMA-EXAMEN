/*
 *5090-18-1749
 *Carlos Rodolfo Bendfeldt Samayoa
 */
package notas;
import java.util.Scanner;
public class Notas {

    private static int op;
    public static void main(String[] args) {
        String tecla = null;
        Scanner sc =  new Scanner(System.in);
        do{
            int op = 0;
            int a,b,c,d;
            int CA1=0,CA2=0,CA3=0,CA4=0;
            int NO1=0,NO2=0,NO3=0,NO4=0;
            int AUX1;
         System.out.println("*************************************\n");
         System.out.println("*                 MENU              *\n");
         System.out.println("* 1.Ingreso de Carnes               *\n");
         System.out.println("* 2.Ingreso Notas y promedio        *\n");
         System.out.println("* 3.Orden de datos                  *\n");
         System.out.println("* 4.Salir                           *\n");
         System.out.println("*************************************\n");
         System.out.println("Elja una opcion: \n");
         op = sc.nextInt();
         switch(op){
             case 1:
                 System.out.println("*****************************\n");
                 System.out.println("*     Ingreso de carnes     *\n");
                 System.out.println("* Ingrese el primer carné:  *\n");
                 CA1= sc.nextInt();
                 System.out.println("* Ingrese el segundo carné: *\n");
                 CA2= sc.nextInt();
                 System.out.println("* Ingrese el tercer carné.  *\n");
                 CA3= sc.nextInt();
                 System.out.println("* Ingrese el cuarto carné:  *\n");
                 CA4= sc.nextInt();
                 break;
             case 2:
                 System.out.println("******************************\n");
                 System.out.println("*        Ingreso Notas       *\n");
                 System.out.println("* Ingrese la primera Nota:   *\n");
                 NO1 = sc.nextInt();
                 System.out.println("* Ingrese la segunda Nota:   *\n ");
                 NO2 = sc.nextInt();
                 System.out.println("* Ingrese la tercera Nota:   *\n");
                 NO3= sc.nextInt();
                 System.out.println("* Ingrese la Cuarta Nota:    *\n");
                 NO4= sc.nextInt();
                 
                AUX1 = NO1+NO2+NO3+NO4/4;
                 System.out.println("El promedio es : "+AUX1);
                 break;
             case 3:
                          
                 System.out.println("*   Orden de datos\n");
                 System.out.println("* Primer Carné:  "+CA1+"\n");
                 System.out.println("* Segundo Carné: "+CA2+"\n");
                 System.out.println("* Tercer Carné: "+CA3+"\n");
                 System.out.println("* Cuarto Carné: "+CA4+"\n");
                 System.out.println("* NOTAS Ordenas\n");
                 if (NO1 > NO2 && NO1 > NO3 && NO1 > NO4)
			a = NO1;
		if (NO1 < NO2 && NO1 > NO3 && NO1 > NO4)
			b = NO1;
		if (NO1 < NO2 && NO1 < NO3 && NO1 > NO4)
			c = NO1;
		if (NO1 < NO2 && NO1 < NO3 && NO1 < NO4)
			d = NO1;
		if (NO2 > NO1 && NO2 > NO3 && NO2 > NO4)
			a = NO2;
		if (NO2 < NO1 && NO2 > NO3 && NO2 > NO4)
			b = NO2;
		if (NO2 < NO1 && NO2 < NO3 && NO2 > NO4)
			c = NO2;
		if (NO2 < NO1 && NO2 < NO3 && NO2 < NO4)
			d = NO2;
               if (NO3 > NO2 && NO3 > NO4 && NO3 > NO4)
			a = NO3;
		if (NO3 < NO2 && NO3 > NO1 && NO3 > NO4)
			b = NO3;
		if (NO3 < NO2 && NO3 < NO1 && NO3 > NO4)
			c = NO3;
		if (NO3 < NO2 && NO3 < NO1 && NO3 < NO4)
			d = NO3;
		if (NO4 > NO1 && NO4 > NO2 && NO4 > NO3)
			a = NO4;
		if (NO4 < NO1 && NO4 > NO2 && NO4 > NO3)
			b = NO4;
		if (NO4 < NO1 && NO4 < NO2 && NO4 > NO3)
			c = NO4;
		if (NO4 < NO1 && NO4 < NO2 && NO4 < NO3)
			d = NO4;
                break;
             case 4:
                 System.out.println("GRACIAS POR USAR EL PROGRAMA");
                 System.exit(0);
                break;
            }
        }while (4!=op);
        
        } 
    }

        
    
    

