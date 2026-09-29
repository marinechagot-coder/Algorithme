void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quel est le prix HT?");
    double Pht = scanner.nextDouble();
    System.out.print("Quel est le taux de TVA?");
    double Ttva = scanner.nextDouble();
    System.out.print("Quel est le pourcentage de remise à appliquer?");
    double Tremise = scanner.nextDouble();
    double Mtva=Pht*Ttva/100;
    System.out.println("Le montant de la TVA est "+Mtva);
    double Pttc=Pht+Mtva;
    System.out.println("Le prix TTC est "+Pttc);
    double Mremise=Pttc*Tremise/100;
    System.out.println("Le montant de la remise est "+Mremise);
    double Pfinal=Pttc-Mremise;
    System.out.println("Le prix final est "+Pfinal);
    scanner.close();

}