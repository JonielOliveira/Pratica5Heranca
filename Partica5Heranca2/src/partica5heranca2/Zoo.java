
package partica5heranca2;

import java.util.List;
import java.util.ArrayList;

public class Zoo {
    
    public static void main(String[] args){
        
        List<Animal> animais = new ArrayList();
        animais.add(new Cachorro("Yuki", 26.0, "Border Collie"));
        animais.add(new Cachorro("Akira", 35.0, "SRD"));
        animais.add(new Peixe ("Glub", 10.0, "Rio"));
        animais.add(new Peixe ("Nemo", 0.05, "Mar"));
        
        for(Animal pet : animais){
            System.out.println(pet);
        }
        
    }
    
}
