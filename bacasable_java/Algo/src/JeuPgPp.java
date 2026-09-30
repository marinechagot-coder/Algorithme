void main() {
    Scanner scanner = new Scanner(System.in);
    int bingo = (int) (Math.random() * 100 + 1);
    boolean cherche = true;
    int cpt = 1;
    while (cherche) {
        System.out.print("Devine combien?");
        int prop = scanner.nextInt();
        if (prop == bingo) {
            System.out.print("Bravo ! Trouve en " + cpt + " essais");
            cherche = false;
        } else if (prop < bingo) {
            System.out.print("Plus grand ! ");
        } else {
            System.out.print("Plus petit ! ");
        }
        cpt++;
        //Sortie de boucle pour debug
        //if (cpt>10){cherche=false;}
    }
    scanner.close();
}