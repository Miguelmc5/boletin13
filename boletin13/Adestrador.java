package boletin13;

/**
 *
 * @author DANIELCASTELAO\mmartinezcosta
 */
public class Adestrador extends SeleccionFutbol{
    
    private String idFederacion;

    public Adestrador() {
    }

    public Adestrador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Adestrador(String idFederacion, int id, String nome, String apelido, int idade) {
        super(id, nome, apelido, idade);
        this.idFederacion = idFederacion;
    }

    public void Concentracion(){
        System.out.println("O adestrador está concentrado");
    }
    
    public void Viaxar(){
        System.out.println("O adestrador viaxa co equipo");
    }
    
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", idFederacion= " + idFederacion ;
    }
        
}
