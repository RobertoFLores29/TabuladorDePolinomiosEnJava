
public class Tabla{
    private String[] renglones;

    public Tabla(String[] renglones) {
        this.renglones = renglones;
    }

    public void imprimir() {
        for (int i = 0; i < renglones.length; i++) {
            String renglon = renglones[i];
            System.out.println(renglon);
      }
    }
}
