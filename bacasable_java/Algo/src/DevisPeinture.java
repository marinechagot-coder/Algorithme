void main() {
    Scanner scanner = new Scanner(System.in);
    double Spot=10;
    double Cpot=29.9;
    double Touv=0.2;
    System.out.print("Quelle est la longeur de la pièce?");
    double Long = scanner.nextDouble();
    System.out.print("Quelle est la largeur de la pièce?");
    double Larg = scanner.nextDouble();
    System.out.print("Quelle est la hauteur de la pièce?");
    double Haut = scanner.nextDouble();
    double surface=(2*Long+2*Larg)*Haut*(1-Touv);
    double Npot=Math.ceil(surface/Spot);
    double prix=Npot*Cpot;
    DecimalFormat df = new DecimalFormat("#");
    DecimalFormat dp = new DecimalFormat("#.00€");
    System.out.println("Nbr pot="+df.format(Npot)+" Cout peinture:"+dp.format(prix));
    scanner.close();
    /*Algorithme Devis peinture
Debut
  VARIABLE Long, Larg, Haut, surface, Cpot, Spot, Prix : REEL
  VARIABLE  Npot: ENTIER
  Spot=10
  Cpot=29.9
  ECRIRE ("Quelle est la longeur de la pièce?")
  LIRE(Long)
  ECRIRE ("Quelle est la largeur de la pièce?")
  LIRE(Larg)
  ECRIRE ("Quelle est la hauteur de la pièce?")
  LIRE(Haut)
  surface=(2*Long+2*Larg)*Haut;
  Npot=arrondi.sup(surface/Spot)
  prix=Npot*Cpot
  ECRIRE("Nbr pot="+Npot+" Cout peinture:" + prix)
Fin*/
}