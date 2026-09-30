void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quel Motif (A,B,C,D)?");
    char motif = scanner.next().charAt(0);
    System.out.print("Combien d'étoile?");
    int n = scanner.nextInt();
    switch (motif) {
        case 'A':
            for (int i=1;i<=n;i++){
                System.out.println("*".repeat(i)+" ".repeat(n-i));
            }
            break;
        case 'B':
            for (int i=0;i<n;i++){
                System.out.println("*".repeat(n-i)+" ".repeat(i));
            }
            break;
        case 'C':
            for (int i=1;i<=n;i++){
                System.out.println(" ".repeat(n-i)+"*".repeat(2*i-1));
            }
            break;
        case 'D':
            for (int i=1;i<=n;i++){
                System.out.println(" ".repeat(n-i)+"*".repeat(2*i-1));
            }
            for (int i=n-1;i>=1;i--){
                System.out.println(" ".repeat(n-i)+"*".repeat(2*i-1));
            }
            break;
        default:
            System.out.print("Code motif non reconnu");
    }
    scanner.close();
    /*
    Algorithme Etoiles
VARIABLE motif: CARACTERE
VARIABLE n: ENTIER
ECRIRE("Quel Motif (A,B,C,D)?")
LIRE(motif)
ECRIRE("Combien d'étoile?")
LIRE(n)
SELON motif
  CAS A FAIRE
    POUR i DE 1 à N PAR 1
      ECRIRE(repeat("*",i)+repeat(" ",n-i))
    FIN POUR
  CAS B FAIRE
    POUR i DE 1 à N PAR 1
      ECRIRE(repeat("*",i-n)+repeat(" ",i))
    FIN POUR
  CAS C FAIRE
    POUR i DE 1 à 2*N PAR 2
      ECRIRE(repeat(" ",i-n)+repeat("*",i)+repeat(" ",i-n))
    FIN POUR
  CAS D FAIRE
    POUR i DE 1 à 2*N PAR 2
      ECRIRE(repeat(" ",i-n)+repeat("*",i)+repeat(" ",i-n))
    FIN POUR
    POUR i DE 2N-2 à 1 PAR -2
      ECRIRE(repeat(" ",i-n)+repeat("*",i)+repeat(" ",i-n))
    FIN POUR
  CAS AUTRE FAIRE
FIN SELON
     */

}