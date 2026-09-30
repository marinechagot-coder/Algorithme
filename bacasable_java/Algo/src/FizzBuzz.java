void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Valeur finale?");
    int n = scanner.nextInt();
    String msg;
    for (int i=1; i<=n; i++){
        msg="";
        if (i%3==0){msg=msg+"Fizz";}
        if (i%5==0){msg=msg+"Buzz";}
        if (i%7==0){msg=msg+"Wazz";}
        if (msg.isEmpty()){
            System.out.println(i);
        } else {
            System.out.println(msg);
        }
    }
    scanner.close();
}