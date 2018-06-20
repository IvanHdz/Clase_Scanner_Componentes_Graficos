import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

public class Rectangulo {
    private int coordenadaX,coordenadaY;
    private int largo, ancho;
    private int area, perimetro;
    double distancia;
  
    public Rectangulo(){ 
        asignarValores();
        mostrarValores();
        calcularMedidas();
    }
  
    private void asignarValores(){
        try{
            Scanner asignar = new Scanner(System.in);
            System.out.println("Asigne coordenada x  ");
            coordenadaX = asignar.nextInt();
            System.out.println("Asigne coordenada y  ");
            coordenadaY = asignar.nextInt();
            System.out.println("Asigne el Ancho del Rectangulo  ");
            ancho = asignar.nextInt();
            System.out.println("Asigne la Altura del Rectangulo  ");
            largo = asignar.nextInt(); 
        }catch(Exception e){
            System.out.println("Lo que escribio es una letra");
        }
    }
    
    private void mostrarValores(){
        System.out.println("Los valores asignados a las coordenadas 'x' y 'y' son: ("
        +coordenadaX+","+coordenadaY+")\n");
        System.out.println("Los valores asignados son: Largo "+largo+" y de Ancho "+ancho+"\n");
    }
  
    private void calcularMedidas(){
        area = largo*ancho;
        perimetro = 2*largo+2*ancho;
        distancia = Math.sqrt(Math.pow(coordenadaX,2)+Math.pow(coordenadaY,2));
        System.out.println("El area de la figura es: "+area+" y el perimetro es: "+perimetro+"\n");
        System.out.println("La distancia entre las dos esquinas es: "+distancia);
    }
    
    public void dibujar(Graphics g){      
        g.setColor(Color.BLUE);
        g.fillRect(coordenadaX, coordenadaY, ancho, largo);
    }
}