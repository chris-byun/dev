import java.util.*;

public Vector {

  public double[] vector;

  public Vector() {

    Scanner Scanner = new Scanner(System.in);

    System.out.println("How many components?");
    int n = Scanner.nextInt();
    vector = new double[n];

    System.out.println("type your components, pressing enter after each one:");
    for (int i = 0; i < vector.length; i++) {
      vector[i] = Scanner.nextDouble();
    }

    System.out.print("Your vector:\n<");
    for (double num : vector) {
        System.out.print(" " + num);
    }
    System.out.println(" >");

  }

  public double dot(Vector b) {

    double product = 0;

    for (int i = 0; i < b.length; i++) {
        product += vector[i] * b.getVector()[i];
    }

    return product;

  }

  public double[] getVector() {
    return vector;
  }

}