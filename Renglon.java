
public class Renglon {

    double [] valoresY;
    double [] valoresX;
    String [] renglones;

    public Renglon(double[] valoresDeX, double[] valorY) {
            this.valoresX = new double[valoresDeX.length];
            System.arraycopy(valoresDeX, 0, this.valoresX, 0, valoresDeX.length);
    
            this.valoresY = new double[valorY.length];
            System.arraycopy(valorY, 0, this.valoresY, 0, valorY.length);

            //necesitamos los valores exactos de x y asi que usamos arraycopy para copiar estos valores
    }

    public String[] crearRenglones(){
        renglones = new String[valoresX.length];

        for (int i = 0; i < renglones.length; i++) {
        renglones[i] = "valor de x: " + valoresX[i] + "\t"+ "|| valor de y: " + valoresY[i];
        }

        return renglones;
    }
    

}
