void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Mot de passe?");
    String mdp = scanner.next();
    boolean fort=false;
    boolean min=false;
    boolean maj=false;
    boolean chiff=false;
    boolean longer =false;
    if (mdp.length()>=8){
        longer =true;}
    if (mdp.length()>0){

        for (int i=0;i< mdp.length();i++){
            char cara=mdp.charAt(i);
            if (Character.isDigit(cara)){chiff=true;}
            if (cara>='a' && cara<='z'){min=true;}
            if (cara>='A' && cara<='Z'){maj=true;}
        }

    }
    fort= longer &&chiff&&min&&maj;
    System.out.println("Mot de passe Long>8 Majuscule Minuscule Chiffre Valide?");
    String msg=mdp + " ".repeat(13-mdp.length());
    msg = longer ? msg+'\u2713'+"      " : msg+'\u2715'+"      ";
    msg = maj ? msg+'\u2713'+"         " : msg+'\u2715'+"         ";
    msg = min ? msg+'\u2713'+"         " : msg+'\u2715'+"         ";
    msg = chiff ? msg+'\u2713'+"        " : msg+'\u2715'+"        ";
    msg = fort ? msg+'\u2713'+"       " : msg+'\u2715'+"       ";
    System.out.print(msg);
    scanner.close();
    /*
      SI fort ALORS ECRIRE("Valide") SINON ECRIRE("invalide")
  ECRIRE("Mot de passe Long>8 Majuscule Minuscule Chiffre Valide?")
  msg=Mdp + repeat(" ")
  msg <- SI long ALORS msg+\2713+"     " SINON msg+\2715+"     "
  msg <- SI maj ALORS msg+\2713+"     " SINON msg+\2715+"     "
  msg <- SI min ALORS msg+\2713+"     " SINON msg+\2715+"     "
  msg <- SI chiff ALORS msg+\2713+"     " SINON msg+\2715+"     "
  ECRIRE(msg)
FIN
     */
}