
package pratica5heranca1;

public class Pessoa {

    protected String rg;
    protected String nome;
    
    public Pessoa(String rg, String nome){
        this.rg = rg;
        this.nome = nome;
    }
    
    public String getRg(){
        return rg;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String toString (){
        return ("Nome: " + nome + "," + "RG: " + rg); 
    }

}
