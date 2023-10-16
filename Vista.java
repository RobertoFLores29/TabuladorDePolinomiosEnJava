import java.util.Scanner;

public class Vista {

    Scanner entrada;
    
    public Vista(){
        entrada = new Scanner(System.in);
    }

    public int obtenerGrado(){
        System.out.println("ingresa el grado de tu coeficiente: ");
        return entrada.nextInt();
    }

    public void obtenerCoeficientes(Polinomio polinomiofx){
        int gradoN = polinomiofx.grado;
        System.out.println("Introduce tus coeficeitnes: ");

        for(int i = 0; i <= gradoN; i++){
           if( i == 0){
             System.out.println("Ingresa el coeficiente del termino independiente: ");
            polinomiofx.coeficiente[i] = entrada.nextDouble();
           }else{
             System.out.println("Ingresa el coeficiente del termino x elevado a la potencia: " + i);
            polinomiofx.coeficiente[i] = entrada.nextDouble();
           }
        }

    }

    public double[] obtenerNumerosDeSustitucion(){

        double [] valor = new double[3];
         
        System.out.println("Ingresa el numero Inicial para sustituir x:");
        valor[0] = entrada.nextDouble();

        System.out.println("Ingresa el numero de veces que quiere sustituir x:");
        valor[1] = entrada.nextDouble();

        System.out.println("Ingresa el numero que se sumara al valor Inicial de x:");
        valor[2] = entrada.nextDouble();

        return valor;

    }

    public void generarPolinomio( Polinomio polinomiofx){
        for(int i = polinomiofx.grado; i >= 0 ; i--){
        System.out.print("[ " + polinomiofx.coeficiente[i] + "x" + "^" + i + "]" + "\t"  );
        }
        System.out.println("");
    }


}
