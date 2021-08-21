
public class Circulo {
    // Atributos / caracteristicas
    float raio;
    float x;
    float y;
    
    public void mover(float n1, float n2){
        x = n1;
        y = n2;
    }
    
    public void redimensionar(float r){
        raio = r;
    }
    
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
    @Override
    public String toString() {
        return "circulo [x: "+x + ", y: "+y + ", raio: "+raio+"]";
    }
    
}