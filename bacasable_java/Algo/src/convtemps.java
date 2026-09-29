void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quelle durée en seconde?");
    double temps = scanner.nextDouble();
    int seconde=(int) temps%60;
    temps=(temps-seconde)/60;
    int  minute=(int)temps%60;
    int heure=(int) (temps-minute)/60   ;
    System.out.println(heure+"h "+minute+"m "+seconde+"s");
    scanner.close();

}