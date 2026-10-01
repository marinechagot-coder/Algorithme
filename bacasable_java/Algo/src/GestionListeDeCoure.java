static int rechercher(ArrayList<String> liste, String val){
    int index=liste.size()+1;
    for (int i=0;i<liste.size();i++){
        if (Objects.equals(liste.get(i), val)){
            index=i;
            break;
        }
    }
    return index;
}

void main() {
    boolean quitter=false;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Menu: \n 1.Ajouter un article \n 2.Supprimer un article (par nom) \n 3.Rechercher un article \n 4. Afficher la liste\n 5. Quitter\n");
    int choix;
    String val;
    ArrayList<String> liste = new ArrayList<>();
    int index=0;
    while (!quitter){
        choix=scanner.nextInt();
        switch(choix){
            case 1: // Ajouter
                System.out.print("Ajouter:");
                val=scanner.next();
                liste.add(val);
                System.out.println("-> OK");
                break;
            case 2: //supprimer
                System.out.print("Supprimer: ");
                val=scanner.next();
                index=rechercher(liste,val);
                if (index>liste.size()){
                    System.out.println("Non trouvé");
                } else {
                    liste.remove(index);
                    System.out.println("-> OK");
                }

                break;
            case 3: //chercher
                System.out.print("Recherche :");
                index=rechercher(liste,scanner.next());
                if (index>liste.size()){
                    System.out.println("Non trouvé");
                } else {
                    System.out.println("Trouver en position "+(index+1));
                }
                break;
            case 4: //afficher
                for (int i=0;i<liste.size();i++){
                    System.out.print("  "+ (i+1) + ". "+liste.get(i));
                }
                System.out.println(" ");
                break;
            case 5:
                quitter=true;
                break;
            default:
                System.out.println("commande invalide");
        }

    }
    scanner.close();

}