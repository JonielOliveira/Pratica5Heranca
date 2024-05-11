
package pratica5heranca3;

public class Funcionario {
    
    protected String nome;
    protected int cpf;
    protected double salario;
    
    public Funcionario(String nome, int cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getCpf(){
        return cpf;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String toString(){
        return "Nome: " + nome + ", CPF: " + cpf + ", Salario: " + salario;
    }
    
}
