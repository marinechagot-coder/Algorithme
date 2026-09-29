void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Valeur a?");
    double a = scanner.nextDouble();
    System.out.print("Valeur b?");
    double b = scanner.nextDouble();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("a="+a+" b="+b);
    scanner.close();
}