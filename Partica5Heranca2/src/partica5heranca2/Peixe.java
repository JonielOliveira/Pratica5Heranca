
package partica5heranca2;

public class Peixe extends Animal{
    
    private String tipoHabitat;
    
    public Peixe(String nome, double peso, String tipoHabitat){
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }
    
    public Peixe(){    
        
    }
    
    public Peixe(String nome){
        super(nome);
    }
    
    public Peixe(double peso){
        super(peso);
    }
    
    public String getTipoHabitat(){
        return tipoHabitat;
    }
    
    public void setTipoHabitat(String tipoHabitat){
        this.tipoHabitat = tipoHabitat;
    }
    
    public String toString(){
        return ("Peixe - " + super.toString() + ", Habitat: " + tipoHabitat);
    }
    
}
