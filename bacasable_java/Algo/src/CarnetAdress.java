public class Contact{
    String tel;
    String email;
    String ville;
    Contact(String tel, String email, String ville){
        this.tel=tel;
        this.email=email;
        this.ville=ville;
    }
}
public HashMap<String,Contact> carnet= new HashMap<String,Contact>();
void main() {
    //donnee entree

    carnet.put("Alice Dupont",new Contact("0601020304", "alice@mail.com", "Paris" ));
    carnet.put("Bob Martin",new Contact("0611223344", "bob@mail.com", "Lyon" ));
    //carnet.put("Charlie Durand",new Contact("0622334455", "charlie@mail.com", "Paris" ));
//
    ajouterContact("Charlie Durand","0622334455", "charlie@mail.com", "Paris" );
    System.out.println(rechercheContact("ali"));
    System.out.println(filtrerVille("Paris"));
    System.out.println(supprimerContact("Bob Martin"));
    System.out.println(rechercheContact("bob"));


}
void ajouterContact(String nom, String tel, String mail, String ville){
    carnet.put(nom,new Contact(tel,mail,ville));
}
String rechercheContact(String motClef){

    for (String nom : carnet.keySet()) {
        if (nom.toLowerCase().contains(motClef.toLowerCase())){

            return nom;
        }
    }
    return "Non trouvé";
}

String filtrerVille(String ville){
    String liste="";
    for (String nom : carnet.keySet()) {
        if (Objects.equals(carnet.get(nom).ville, ville)){
            liste=liste+nom+" ";
        }
    }
    return liste;
}
String supprimerContact(String nom){
    nom=rechercheContact(nom);
    if (Objects.equals(nom,"Non trouvé")){
        return nom;
    }else {
        carnet.remove(nom);
        return "OK";
    }
}