void main() {
    ;
    ;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Température en °C ? ");
    double Tc = scanner.nextInt();
    double Tf= Tc * 9/5+32;

    System.out.println("Température en °C " + Tf);
    scanner.close();
}