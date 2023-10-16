
public class Polinomio {
    
    double [] coeficiente;
    int grado;
    double x;

    double valorSustitucionPaso;
    double valorSustitucionRenglones;
    double valorSustitucionInicial;
    double [] valoresDeSustitucionDeX;
    double [] valorY;

      

    public Polinomio(int gradoN){
        this.grado = gradoN;
        this.coeficiente = new double [gradoN + 1];
    }

    public void obtenerDatosDeSustitucion( double [] valorSustitucion){
        valorSustitucionInicial = valorSustitucion[0];
        valorSustitucionRenglones = valorSustitucion[1];
        valorSustitucionPaso    = valorSustitucion[2] ;

        //se inicializan los arreglos aqui y no en la constructora ya que valorRenglones no esta definido
        this.valorY =  new double[(int)valorSustitucionRenglones + 1];
        this.valoresDeSustitucionDeX =  new double[(int)valorSustitucionRenglones + 1];
    }

   //aca se genera una funcion que recorre todos los valores posibles para sustituir en x como

    public double [] valoresParaSustituirEnX(){
        valoresDeSustitucionDeX[0] = valorSustitucionInicial;

        for (int i = 1; i < valoresDeSustitucionDeX.length; i++) {
            valoresDeSustitucionDeX[i] = valoresDeSustitucionDeX[i - 1] + valorSustitucionPaso;
        }
        return valoresDeSustitucionDeX;
    } 

    public double [] resolverPolinomio(){

        //es necesario dos ciclos for por que el indice de los valoresY y sustitucionX si son los mismos
        //pero no comparten esa igualdad con el grado y los coeficientes

       for (int j = 0; j < valoresParaSustituirEnX().length; j++) {
         for (int i = grado; i >= 0; i--) {
             valorY[j]= valorY[j] + coeficiente[i] * Math.pow(valoresDeSustitucionDeX[j], i);
        }
       }
        return valorY;


    }
   }



