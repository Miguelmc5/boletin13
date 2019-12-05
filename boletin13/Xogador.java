package boletin13;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Xogador extends SeleccionFutbol{
    
    private int dorsal;
    private String demarcacion;

    public Xogador() {
    }

    public Xogador(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Xogador(int dorsal, String demarcacion, int id, String nome, String apelido, int idade) {
        super(id, nome, apelido, idade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public void Concentracion(){
        System.out.println("Os xogadores están concentrados");
    }
    
    public void Viaxar(){
        System.out.println("Os xogadores viaxan");
    }
    
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return super.toString() +", dorsal= " + dorsal + ", demarcacion= " + demarcacion ;
    }

}
