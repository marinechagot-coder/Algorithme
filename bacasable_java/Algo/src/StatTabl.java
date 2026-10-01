static int  minimum(int[] tabl) {
    int min=tabl[0];
    if (tabl.length>1){
        for (int i=1;i<tabl.length;i++){
            if (min>tabl[i]){min=tabl[i];}
        }
    }
    return min;
}
static int  maximum(int[] tabl) {
    int max=tabl[0];
    if (tabl.length>1){
        for (int i=1;i<tabl.length;i++){
            if (max<tabl[i]){max=tabl[i];}
        }
    }
    return max;
}
static double  moyenne(int[] tabl) {
    double moy = 0;
    for (int i=0;i<tabl.length;i++){
        moy=moy+(double) tabl[i];
    }
    moy=moy/( double)tabl.length;
    return moy;
}
static double  ecartType(int[] tabl){
    double moy=moyenne(tabl);
    double ecartT=0;
    for (int i=0;i<tabl.length;i++){
        ecartT=ecartT+Math.pow(tabl[i]-moy,2);
    }
    return Math.pow(ecartT/(double) tabl.length,0.5);
    
}
static void  affichageStat(int[] tabl){
    int min=minimum(tabl);
    int max=maximum(tabl);    
    double moy=moyenne(tabl);
    double ecartT=ecartType(tabl);
    String visuTabl="[";
    for (int i=0;i<tabl.length;i++){
        visuTabl=visuTabl+tabl[i];
        visuTabl= i!=tabl.length-1 ? visuTabl+"," : visuTabl+"]";
    }
    DecimalFormat df = new DecimalFormat("#.##");
    Scanner scanner = new Scanner(System.in);
    int dimT= visuTabl.length()<20 ? 20-visuTabl.length() : 0;
    int dimD= Integer.toString(max).length()<11 ? 11-Integer.toString(max).length() : 0;
    System.out.println("Tableau           | Min      | Max      | Moyenne  | Ecart-Type");
    System.out.println(visuTabl+" ".repeat(dimT)+min+" ".repeat(dimD)+max+" ".repeat(dimD)+df.format(moy)+" ".repeat(dimD)+df.format(ecartT));
    scanner.close();
}


void main() {
    int[] tabl1={10, 20, 30, 40, 50};
    affichageStat(tabl1);
    int[] tabl2={5, 5, 5, 5};
    affichageStat(tabl2);
    int[] tabl3={1};
    affichageStat(tabl3);
    int[] tabl4={-3, 0, 3};
    affichageStat(tabl4);
    }
    


