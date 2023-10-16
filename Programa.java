
public class Programa {

    public static void main(String[] args) {
           
        Vista entradaDatos = new Vista();
        //aca se optienen el grado de el polinomio y se lo damos a la clase que lo calcula
        int gradoN = entradaDatos.obtenerGrado();
        Polinomio polinomiofx = new Polinomio(gradoN);

       
        entradaDatos.obtenerCoeficientes(polinomiofx);
        //aca se mandan los valores de sustitucion de vista a polinomio
        double[] valor = entradaDatos.obtenerNumerosDeSustitucion();
        polinomiofx.obtenerDatosDeSustitucion(valor);

        //necesitamos los valores de xy en renglones por eso se los pasamos a la constructura directamente
        Renglon renglones = new Renglon(polinomiofx.valoresParaSustituirEnX(), polinomiofx.resolverPolinomio());
        
        //esto es para que el usuario pueda ver que metio
        System.out.println("Tu polinomio se ve asi: ");
        entradaDatos.generarPolinomio(polinomiofx);

        String[] renglonesCreados = renglones.crearRenglones();

        // se crea una tabla con los renglones creados
        Tabla tabla = new Tabla(renglonesCreados);

        // Imprimir la tabla con el metodo imprimir
        tabla.imprimir();


    }
 


}
