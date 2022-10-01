import javax.swing.JSpinner.NumberEditor;

public class OperadoresAritmeticosTeste {

  public static void main(String[] args) {
    
    int numberOfLife = 42;

    numberOfLife++;
    numberOfLife--;

    int restOfDiv = numberOfLife % 10;

    int div = 100 / 10;

    int mult = 10 * 10;

    int counting = 0;

    counting += mult;
    counting -= div;

    System.out.println("Number of Life: " + numberOfLife);
    System.out.println("Rest of Div: " + restOfDiv);
    System.out.println("Div: " + div);
    System.out.println("Mult: " + mult);
    System.out.println("Counting: " + counting);

  }
  
}
