
package partica5heranca2;

public class Animal {
    
    protected String nome;
    protected double peso;
    
    public Animal(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    
    public Animal(){
        
    }
    
    public Animal(String nome){
        this.nome = nome;
    }
    
    public Animal(double peso){
        this.peso = peso;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public String toString(){
        return ("Nome: " + nome + ", Peso: " + peso + " kg");
    }
    
}
