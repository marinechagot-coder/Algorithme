public class Carte{
    String valeur;
    String couleur;
    char symbol;
    int valTrie;
    Carte(String valeur, String couleur){
        this.valeur=valeur;
        this.couleur=couleur;
        if (valeur.matches("/[0-9]+/")) {
            this.valTrie=Integer.parseInt(valeur);
        } else{
            switch (valeur){
                case "Valet":
                    this.valTrie=11;
                    break;
                case "Dame":
                    this.valTrie=12;
                    break;
                case "Roi":
                    this.valTrie=13;
                    break;
                case "As":
                    this.valTrie=14;
                    break;
            }
        }
        switch (couleur){
            case "Trefle":
                this.symbol='♣';
                break;
            case "Carreau":
                this.valTrie=this.valTrie+20;
                this.symbol='♦';
                break;
            case "Coeur":
                this.valTrie=this.valTrie+40;
                this.symbol='♠';
                break;
            case "Pique":
                this.valTrie=this.valTrie+60;
                this.symbol='♥';
        }

    }

}

void main() {
    Carte[] mainCartes={CarteAleatoire(),CarteAleatoire(),CarteAleatoire(),CarteAleatoire(),CarteAleatoire(),CarteAleatoire(),CarteAleatoire()};
    mainCartes=controlerUnique(mainCartes);
    afficherMain("Main Initiale",mainCartes);
    mainCartes=trieCarte(mainCartes);
    afficherMain("Main Finale",mainCartes);

}
boolean compareCartes(Carte carte1,Carte carte2){
    if (carte1.valTrie<carte2.valTrie){
        return true;
    } else {
        return false;
    }
}
Carte CarteAleatoire(){
    String[] lcouleur={"Coeur","Carreau","Pique","Trefle"};
    String[] lvaleur={"2","3","4","5","6","7","8","9","10","Valet","Dame","Roi","As"};
    return new Carte(lvaleur[(int) (Math.random() * 12 + 1)],lcouleur[(int) (Math.random() * 3 + 1)]);
}
Carte[] controlerUnique(Carte[] hand){
    for (int i=1;i<hand.length;i++){
        for (int j=0;j<i;j++){
            if (hand[i].valTrie==hand[j].valTrie){
                hand[i]=CarteAleatoire();
                j=0;
            }
        }
    }
    return hand;
}
Carte[] trieCarte(Carte[] hand){
    for (int i=0;i<hand.length;i++){
        int j=i-1;
        Carte cle=hand[i];
        while (j>= 0 && compareCartes(cle,hand[j])){
            hand[j+1]=hand[j];
            j--;
        }
        hand[j+1]=cle;
    }
    return hand;
}
void afficherMain(String enTete,Carte[] hand){
    String msg="enTete+\":\"";
    for (Carte el: hand){
        msg=msg+" "+el.valeur+el.symbol+",";
    }
    msg=msg.substring(0,msg.length()-1);
    System.out.println(msg);
}