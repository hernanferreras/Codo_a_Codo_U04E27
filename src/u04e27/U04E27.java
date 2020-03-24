
package u04e27;


import java.util.Scanner;

public class U04E27 {
    public static void main(String args[]) {
        Scanner entrada=new Scanner(System.in);
        int sueldo, i=1, sumaSueldo=0;
        do{
            System.out.print("Ingrese el sueldo del mes "+i+": ");
            sueldo=entrada.nextInt();
            if (sueldo>0){
            sumaSueldo=sumaSueldo+sueldo;
            }
            i++;
        }while((sueldo>0)&&(i<13));
        System.out.println("El sueldo total al momento es de: "+sumaSueldo);
    }
}