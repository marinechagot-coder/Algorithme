import java.util.Map;
import java.util.TreeMap;

public static class Texte{
    String contenu;
    int nbTotalCara;
    int nbEspa;
    int nbMots;
    int nbPhrases;
    double moyLongMots;
    String motPlusLong;
    String[] top5;
    HashMap<Integer,Integer> distLong;
    HashMap<String,Integer> freqMot;
    boolean analyse;

    Texte(String txt){
        this.contenu=txt;
        this.nbTotalCara=txt.length();
        this.analyse=false;
        this.motPlusLong="";
        this.moyLongMots = 0;
        this.freqMot= new HashMap<>();
        this.distLong= new HashMap<>();

    }
    void Traitement() {
        String[] list = this.contenu.toLowerCase(Locale.ROOT).split(" ");
        this.nbEspa = list.length - 1;
        this.nbMots = list.length;
        for (String mot : list) {

            //traitement ponctuation
            boolean toto=mot.matches("[a-z]+[.!?]");
            if (mot.matches("[a-z]+[.!?;,:]")) {//!?;,:
                if (mot.matches("[a-z]+[.!?]")) {
                    this.nbPhrases++;
                }
                mot = mot.replaceAll("[.!?;,:]", "");
            }
            if (mot.length() > this.motPlusLong.length()) {
                this.motPlusLong = mot;
            }
            if (!mot.isEmpty()) {
                //Mise à jour dico
                this.moyLongMots = this.moyLongMots + mot.length();
                if (freqMot.containsKey(mot)) {
                    freqMot.replace(mot, freqMot.get(mot) + 1);
                } else {
                    freqMot.put(mot, 1);
                }
                if (distLong.containsKey(mot.length())) {
                    distLong.replace(mot.length(), distLong.get(mot.length()) + 1);
                } else {
                    distLong.put(mot.length(), 1);
                }

            }
        }
        //Bilan information collecté
        this.moyLongMots=this.moyLongMots/this.nbMots;
        if (freqMot.size()<=5){
            freqMot.keySet().toArray(this.top5);
        } else {
            this.top5= new String[5];
            int lmot=this.motPlusLong.length();
            int j=0;
            for (int i=lmot;i>0;i--){
                for (Map.Entry<String,Integer> entry : freqMot.entrySet()) {
                    if (entry.getValue()==i) {
                        this.top5[j]=entry.getKey();
                        j++;
                        if(j==5){break;}
                    }
                }
                if(j==5){break;}
            }
        }
        this.analyse=true;
    }

    void Affichage(){
        if (this.analyse){
            //int z1=20;
            int z2=10;
            System.out.println("Texte : \""+this.contenu+"\"");
            System.out.println();
            System.out.println("Caracteres (avec espaces) : "+this.nbTotalCara);
            System.out.println("Caracteres (sans espaces) : "+(this.nbTotalCara-this.nbEspa));
            System.out.println("Mots"+" ".repeat(z2-4)+": "+this.nbMots);
            System.out.println("Phrases"+" ".repeat(z2-7)+": "+this.nbPhrases);
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Moy. mots" + " ".repeat(z2 - 9) + ": " + df.format(this.moyLongMots));
            System.out.println("Plus long"+" ".repeat(z2-9)+": \""+this.motPlusLong+"\" ("+this.motPlusLong.length()+")");
            String msg="Top 5"+" ".repeat(z2-5);
            for (int i=0;i<this.top5.length;i++){
                msg=msg+ this.top5[i]+"("+freqMot.get(this.top5[i])+"), ";
            }
            msg=msg.substring(0,msg.length()-2);
            System.out.println(msg);
            System.out.println();
            System.out.println("Distribution :");
            TreeMap<Integer, Integer> sorted = new TreeMap<>();
            sorted.putAll(this.distLong);
            for (Map.Entry<Integer,Integer> entry: sorted.entrySet()){
                msg="   "+entry.getKey();
                msg=entry.getKey()==1?msg+" lettre : ":msg+" lettres : ";
                msg=msg+entry.getValue();
                msg=entry.getValue()==1?msg+" mot":msg+" mots";
                System.out.println(msg);
            }
        } else {
            System.out.println("Texte non analysé");
        }

    }
}
void main() {
    Texte test=new Texte("Le chat noir mange le poisson rouge. Le chat dort. Le poisson nage dans la mer.");
    test.Traitement();
    test.Affichage();
}