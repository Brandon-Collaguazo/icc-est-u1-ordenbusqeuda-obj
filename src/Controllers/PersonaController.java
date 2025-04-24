package Controllers;

import Models.Persona;

public class PersonaController {
    public void sortByDireccionCodigo(Persona[] personas) {
        for(int i = 0; i < personas.length; i++) {
            int menIndex = i;
            for(int j = i + 1; j < personas.length; j++) {
                //if(personas[j].getCodigoDireccion() > personas[menIndex].getCodigoDireccion()) {
                if(personas[j].equalsByCodigoDireccion(personas[menIndex]))
                    menIndex = j;
            }
            if(menIndex != i) {
                Persona temp = personas[menIndex];
                personas[menIndex] = personas[i];
                personas[i] = temp;
            }
        }
    }
    public Persona findPersonaByCodigo(Persona[] personas, int codigo) {
        int bajo = 0;
        int alto = personas.length - 1;
        sortByDireccionCodigo(personas);
        while(bajo <= alto) {
            int centro = bajo + (alto - bajo) / 2;
            int vC = personas[centro].getCodigoDireccion();
            //if(personas[centro].equalsByCodigoDireccion(codigo)) {
            if(vC == codigo) {
                return personas[centro];
            } 
            if (vC > codigo) {
                bajo = centro + 1;
            } else {
                alto = centro - 1;
            }
        }
        return null;
    }
    
}
