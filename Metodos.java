
package metodos;

import java.util.Scanner;


public class Metodos {

    public static int sumar(){
        int sum=0;
        for (int i=1;i<=10;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static int[] vector(){
        int V[]=new int [10];
        for(int i=0;i<10;i++){
          V[i]=i*2+1;
        }
        return V;
    }
    public static void desplegar(int V[]){
        for (int i=0;i<V.length;i++){
             System.out.print("--"+V[i]);
    }
        System.out.println("");
    }
    public static long factorial (int n){
        long f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static int potencia(int b, int ex){
        int r=1;
        for (int i=1;i<=ex;i++){
           r=r*b;
        }
        return r;
    }
    public static int sumaVector(int V[]){
        int s=0;
        for (int i=0;i<5;i++){
            s=s+V[i];
        }
        return s;
}
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int op=0; int V2[];
        do{
            System.out.println("Menu de operaciones ");
            System.out.println("1.Calcular la suma de los numeros 1-10");
            System.out.println("2.Generar un vector de longitud 10 ");
            System.out.println("3.Calcular el factorial de un numero");
            System.out.println("4.Calcular la potencia de un numero");
            System.out.println("5.Calcular la suma de un vector previamente definido");
            System.out.println("9.Salida");
            System.out.println("Tecela opciones: ");
            op=leer.nextInt();
            switch(op){
                case 1: System.out.println("La suma es "+sumar());
                    break;
                case 2: V2=vector();
                
                       desplegar(V2);
                    break;
                case 3: System.out.println("Teclea el numero:");
                    int n=leer.nextInt();
                    long res=factorial(n);
                    System.out.println("Factorial: "+res);
                    break;
                case 4: System.out.println("Inserta tu base: ");
                     int b=leer.nextInt();
                     System.out.println("Inserta el exponente: ");
                     int ex=leer.nextInt();
                     int r=potencia(b,ex);                      
                    System.out.println("El resultado es: "+r);
                    break;
                case 5: int V[]={10,30,50,80,75};
                    System.out.println("El resultado de la suma es: "+sumaVector(V));
        }
        
    }while(op!=9);
            
          
    }
    
    }
