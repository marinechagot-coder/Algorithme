static int compteur;
static HashMap <Integer,Integer> suiteFibo = new HashMap<Integer,Integer>();
void main() {
    int[] val={5,10,20,30,40};
    for (int n : val){
        compteur=0;
        System.out.println("Naif: "+n+" "+fiboNaif(n)+" "+compteur);
        compteur=0;
        suiteFibo.clear();
        System.out.println("Memo: "+n+" "+fiboMemo(n)+" "+compteur);
    }

}
void fiboSuite(int n){
    int[] suite=new int[n+1];
    int cpt=1;
    for (int i=0;i<=n;i++){
        switch(i){
            case 0:
                suite[i]=0;
                break;
            case 1:
                suite[i]=1;
                break;
            default:
                suite[i]=suite[i-1]+suite[i-2];
        }
        System.out.print(suite[i]+" ");
    }

}
int fiboNaif(int n){
    compteur++;
    switch(n){
        case 0:
            return 0;
        case 1:
            return 1;
        default:
            return fiboNaif(n-1)+fiboNaif(n-2);
    }
}
int fiboMemo(int n){
    compteur++;
    if (suiteFibo.containsKey(n)){
        return suiteFibo.get(n);
    } else {
        switch(n){
            case 0:
                suiteFibo.put(n,0);
                return 0;
            case 1:
                suiteFibo.put(n,1);
                return 1;
            default:
                int result=fiboMemo(n-1)+fiboMemo(n-2);;
                suiteFibo.put(n,result);
                return result;
        }
    }
}
//suiteFibo