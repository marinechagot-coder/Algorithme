void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Chiffre:");
    int chiff=scanner.nextInt();
    String[] t1={"I","X","C","M"};
    String[] t5={"V","L","D"};
    int cpt=chiff/1000;
    String rom="M".repeat(cpt);
    chiff=chiff-cpt*1000;
    while(chiff>0){
        for (int i=2;i>=0;i--){
            boolean ctr=(chiff/(5*(int) Math.pow(10,i))==1);
            if (ctr) {chiff=chiff-(5*(int) Math.pow(10,i));}
            cpt=chiff/(int) Math.pow(10,i);
            if (ctr){
                rom = cpt<4 ? rom+t5[i]+t1[i].repeat(cpt) : rom+t1[i]+t1[i+1];
            }else {
                rom = cpt<4 ? rom+t1[i].repeat(cpt) : rom+t1[i]+t5[i];
            }
            chiff=chiff-cpt*(int) Math.pow(10,i);

        }

    }
    System.out.print(rom);
    scanner.close();
    /*
    Algorithme ConvNbrversRomain
DEBUT
  VARIABLE rom: CHAINE
  VARIABLE nbr,cpt: ENTIER
  VARIABLE ctr:BOOLEAN
  ECRIRE("Chiffre:")
  LIRE(chiff)
  t1=['I','X','C','M']
  t5=['V','L','D']
  cpt=nbr%M
  rom=repeat('M',cpt)
  TANT QUE chiff>0 ALORS
    POUR i DE 2 A 0 PAR -1
      ctr= chiff%(50*(i+1))==1
      chiff=chiff-chiff%(50*(i+1))*50*(i+1)
      cpt=chiff%(10*(i+1))
      SI (ctr) ALORS
        rom = ? SI cpt<4 ALORS rom+t5[i]+repeat(t1[i],cpt) SINON rom+t1[i]+t1[i+1]
      SINON
        rom = ? SI cpt<4 ALORS rom+repeat(t1[i-1],cpt) SINON rom+t5[i]+t1[i]
      FIN SI
      chiff=chiff-chiff%(10*(i+1))*10*(i+1)
  FIN POUR
  ECRIRE(nbr)
FIN
     */
}