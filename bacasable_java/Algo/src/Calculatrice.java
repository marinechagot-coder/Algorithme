void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Premier nombre?");
    double a = scanner.nextDouble();
    System.out.print("opération?");
    String op = scanner.next();
    System.out.print("deuxième nombre?");
    double b = scanner.nextDouble();
    double result;
    switch (op) {
        case "+":
            result = a + b;
            System.out.println(result);
            break;
        case "-":
            result = a - b;
            System.out.println(result);
            break;
        case "*":
            result = a * b;
            System.out.println(result);
            break;
        case "/":
            if (b == 0) {
                System.out.println("Erreur : division par zero");
            } else {
                result = a / b;
                System.out.println(result);
            }
            break;
        default:
            System.out.println("Erreur : operateur inconnu");
            break;
    }
    scanner.close();
}