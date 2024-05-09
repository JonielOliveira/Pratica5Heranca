
package pratica5heranca;

public class Principal {
    
    public static void main(String[] args){
        
        Funcionario Joniel = new Funcionario("48.620.458-3", "Joniel", 5000.0);
        System.out.println(Joniel);
        Joniel.aumentar_Salario(0.25);
        System.out.println(Joniel);
    }
    
}
