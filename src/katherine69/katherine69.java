
package katherine69;

import java.util.Scanner;

public class katherine69 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int a=1;
        while(a==1){
        Scanner obj = new Scanner(System.in);
        int opcion;
        System.out.println("elija una opcion de saludo en diferentes idiomas");
        System.out.println("1. español");
        System.out.println("2. ingles");
        System.out.println("3. griego");
        System.out.println("4. noruego");
        System.out.println("5. aleman");
        opcion = obj.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("HOLA MUUUUUUUUUNDO");
            break;
            case 2:
                System.out.println("HELLO WOOOOOOOOORLD");
            break;
            case 3:
                System.out.println("γεια κόόόόόόόόόσμο");
            break;
            case 4:
                System.out.println("hei veeeeeeeerden");
            break;
            case 5:
                System.out.println("Hallo Weeeeeeeeelt");
            break;
            case 6:
                System.out.println("SALIENDOOOOO");
                a=0;
            break;
            default:
                System.out.println("elija una opcion valida");
        }  
        
    }
    
}
}
