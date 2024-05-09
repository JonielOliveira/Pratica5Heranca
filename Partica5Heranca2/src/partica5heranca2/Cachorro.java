
package partica5heranca2;

public class Cachorro extends Animal{
    
    private String raca;
    
    public Cachorro(String nome, double peso, String raca){
        super(nome, peso);
        this.raca = raca;
    }
    
    public Cachorro(){
        
    }
    
    public Cachorro(String raca){
        this.raca = raca;
    }
    
    public String getRaca(){
        return raca;
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    @Override
    public String toString(){
        return ("Cachorro - " + super.toString() + ", Raca: " + raca);
    }
}
