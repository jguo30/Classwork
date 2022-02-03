public class lab{
  public static void momentum(double mass, double velocity){
    double base = mass * velocity;
    base = base * 1000;
    base = Math.round(base);
    base = base / 1000;

    double uncertaintyHigh = (mass + .01) * (velocity + .01);

    double uncertaintyLow = (mass - .01) * (velocity - .01);

    double uncertainty = Math.abs(((uncertaintyHigh - uncertaintyLow) / 2));
    // uncertainty = (Integer)(uncertainty);
    uncertainty = uncertainty * 10000;
    uncertainty = Math.round(uncertainty);
    uncertainty = uncertainty / 10000;

    System.out.println("Momentum: " + base + " ± " + uncertainty);
  }

  public static void kinetic(double mass, double velocity){
    double base = mass * velocity * velocity * .5;
    base = base * 1000;
    base = Math.round(base);
    base = base / 1000;
    double uncertaintyHigh = .5 * (mass + .01) * Math.pow((velocity + .01), 2);
    double uncertaintyLow = .5 * (mass - .01) * Math.pow((velocity - .01), 2);
    double uncertainty = Math.abs(((uncertaintyHigh - uncertaintyLow) / 2));

    uncertainty = uncertainty * 10000;
    uncertainty = Math.round(uncertainty);
    uncertainty = uncertainty / 10000;
    System.out.println("Kinetic: " + base + " ± " + uncertainty);
  }

  public static void main(String[] args){
    momentum(Double.parseDouble(args[0]) , Double.parseDouble(args[1]));
    kinetic(Double.parseDouble(args[0]) , Double.parseDouble(args[1]));
  }
}
