void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quelle table de multiplication?");
    int n = scanner.nextInt();
    String[][] tabl=new String[n+2][(2*n+1)];;
    for (int i = 0; i < tabl.length; i++) {
        for (int j = 0; j < tabl[i].length; j++) {
            tabl[i][j] = " ";
        }
    }
    //separateur du tableau
    tabl[1][0]="-";
    for (int i=1;i<tabl[0].length;i++){
        tabl[1][i]="---";
    }
    for (int i=0;i<tabl.length;i++){
            tabl[i][1]="|";
    }
    //En tete
    for (int i=0;i<n;i++){
        tabl[0][2*i+2]=Integer.toString(i+1);
        if (tabl[0][2*i+2].length()<4){
            tabl[0][2*i+2]=" ".repeat(4-tabl[0][2*i+2].length()) + tabl[0][2*i+2];
        }
    }
    for (int i=0;i<n;i++){
        tabl[i+2][0]=Integer.toString(i+1);

    }

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            tabl[i+1][2*j]= Integer.toString(i*j);
            if (tabl[i+1][2*j].length()<4){
                tabl[i+1][2*j]=" ".repeat(4-tabl[i+1][2*j].length()) + tabl[i+1][2*j];
            }
        }
    }

    for (int i = 0; i < tabl.length; i++) {
        for (int j = 0; j < tabl[i].length; j++) {
            System.out.print(tabl[i][j] + " ");
        }
        System.out.println();
    }
    scanner.close();
    /*
    Algorithme Tbl Multipl
DEBUT
  VARIABLE n, i, j: ENTIER
  VARIABLE Tbl: TABLEAU[STRING]
  VARIABLE msg: STRING
  ECRIRE("Quelle table de multiplication?")
  LIRE(n)
  Tabl[2*n+1][2*n+1]
  POUR i ALLANT DE 0 à 2*n par increment 1
    Tabl[1][i]="-"
    Tabl[i][1]="|"
  FIN POUR
  POUR i ALLANT DE 1 à n par increment 1
    Tabl[0][i+2]=i
    Tabl[i+2][0]=i
  FIN POUR
  POUR i ALLANT DE 1 à n par increment 1
    POUR j ALLANT DE 1 à n par increment 1
      Tabl[2*i][2*j]=i*j
    FIN POUR
  FIN POUR
  POUR i ALLANT DE 1 à n par increment 1
    POUR j ALLANT DE 1 à n par increment 1
      msg=msg+Tabl[i][j]
    FIN POUR
    Ecrire(msg)
  FIN POUR
FIN
     */
}