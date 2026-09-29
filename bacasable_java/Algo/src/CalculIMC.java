void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quel est le poids?");
    double poids = scanner.nextDouble();
    System.out.print("Quelle est la taille?");
    double taille = scanner.nextDouble();
    double lins=18.5;
    double lsp=25;
    double lob=30;
    String msg;
    double imc=poids/(taille*taille);
    if (imc < lins) {
        msg = "Insuffisance";
    } else if (imc < lsp) {
        msg = "poids normal";
    } else if (imc < lob) {
        msg = "surpoids";
    } else {
        msg = "obseité";
    }
    DecimalFormat df = new DecimalFormat("#.##");
    System.out.println("IMC="+df.format(imc)+" "+msg);
    scanner.close();
   }