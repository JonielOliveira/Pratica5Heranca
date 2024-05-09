
package pratica5heranca1;

public class Funcionario extends Pessoa {
     
    private Double salario;
    
    public Funcionario(String rg, String nome, Double salario){
        super(rg, nome);
        this.salario = salario;
    }
    
    public Double getSalario(){
        return salario;
    }
    
    public void setSalario(Double salario){
        this.salario = salario;
    }
    
    public double aumentar_Salario(double percentual){
        return this.salario = (percentual + 1) * this.salario;
    }
    
    @Override
    public String toString(){
        return ("Salario atual: " + this.salario);
    }
    
}
