void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Chiffre romain:");
    String rom=scanner.next();
    boolean nonconf=false;
    int nbr=0;
    for (int i=rom.length()-1;i>=0;i--){
        switch (rom.charAt(i)){
            case 'I':
                nbr = nbr<5 ? nbr+1: nbr-1;
                break;
            case 'V':
                nbr = nbr<10 ? nbr+5: nbr-5;
                break;
            case 'X':
                nbr = nbr<50 ? nbr+10: nbr-10;
                break;
            case 'L':
                nbr = nbr<100 ? nbr+50: nbr-50;
                break;
            case 'C':
                nbr = nbr<500 ? nbr+100: nbr-100;
                break;
            case 'D':
                nbr = nbr<1000 ? nbr+500: nbr-500;
                break;
            case 'M':
                nbr = nbr+1000 ;
                break;
            default:
                nonconf=true;
                System.out.print("Non traité:Ce n'est pas un chiffre romain ");
        }
        if (nonconf){break;}
    }
    System.out.print(nbr);
    scanner.close();
}