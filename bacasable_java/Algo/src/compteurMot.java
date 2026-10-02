String espacerRendu (String txt, int larg){
    return (txt+" ".repeat(larg- txt.length()));
}

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Saisir une phrase: ");
    String txt=scanner.nextLine();
    String regex = "[\\s+]";
    String[] listMot = txt.split(regex);
    HashMap<String, Integer> dicoMots = new HashMap<>();
    int larg=0;
    int max=1;
    for (int i=0; i<listMot.length;i++){
        if (dicoMots.containsKey(listMot[i])){
            dicoMots.replace(listMot[i],dicoMots.get(listMot[i])+1);
            if (dicoMots.get(listMot[i])>max){max=dicoMots.get(listMot[i]);}
        } else {
            dicoMots.put(listMot[i],1);
            if (listMot[i].length()>larg){larg=listMot[i].length();}
        }
    }
    //Resultat à ordonner
    System.out.println("Resultat:");
    for (int i=max;i>0;i--){
        for (var entry : dicoMots.entrySet()) {
            if (entry.getValue()==i) {
                System.out.println(
                        espacerRendu(entry.getKey(), larg) + " : " + entry.getValue()
                );
            }
        }
    }

    System.out.println("Total : "+listMot.length+" mots, "+dicoMots.size()+" mots uniques");
    scanner.close();
}
//  split sur " " ne gère pas les espaces multiples