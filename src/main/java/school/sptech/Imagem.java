package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public void adicionar(Figura figura){
        figuras.add(figura);
    }
    public Double calcularSomaDasAreas(){
        Double somaDasAreas = 0.0;
        for (Figura figura : figuras){
            somaDasAreas += figura.calcularArea();
        }
        return somaDasAreas;
    }
    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> maiorQueVinte = new ArrayList<>();


        for (Figura figura : figuras){
            if(figura.calcularArea() > 20.0){
                maiorQueVinte.add(figura);
            }
        }
        return maiorQueVinte;
    }
    public List<Figura> buscarQuadrados(){
        List<Figura> soQuadrado = new ArrayList<>();

        for (Figura figura : figuras){
            if (figura instanceof Quadrado){
                soQuadrado.add(figura);
            }
        }
        return soQuadrado;
    }

}
