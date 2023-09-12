
package examen;

import java.util.Scanner;

public class Examen {

    
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
       for (int i = 11; i <= 275; i += 11) {
                        if (i == 275) {
                            System.out.println(i);
                        } else {
                            System.out.print(i + "-");
                        }
                    }
                    System.out.println("");
}
}
