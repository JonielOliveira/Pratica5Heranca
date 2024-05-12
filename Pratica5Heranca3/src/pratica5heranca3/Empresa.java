
package pratica5heranca3;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
    
    public static void main(String[] args){
        
        Gerente gerente1 = new Gerente("Mario", 45487168522L, 3500.0, 12345);
        Gerente gerente2 = new Gerente("Maria", 78512449533L, 4250.0, 45782);
        
        List<Gerente> gerentes = new ArrayList();
        
        gerentes.add(gerente1);
        gerentes.add(gerente2);
        
        for (Gerente g : gerentes){
            System.out.println(g);
        }

    }
    
}
