void main() {
    int[] tabl1={1, 2, 3, 2, 4, 3, 5};
    printResult(tabl1,doublesNaif(tabl1));
    printResult(tabl1,doubleSet(tabl1));
    int[] tabl2={1, 2, 3, 4, 5};
    printResult(tabl2,doublesNaif(tabl2));
    printResult(tabl2,doubleSet(tabl2));
    int[] tabl3={1, 1, 1, 1};
    printResult(tabl3,doublesNaif(tabl3));
    printResult(tabl3,doubleSet(tabl3));
    int[] tabl4={};
    printResult(tabl4,doublesNaif(tabl4));
    printResult(tabl4,doubleSet(tabl4));
//    doublesNaif(tabl4);
//    int[] tabl5={1, 1, 1, 1};
//    doublesNaif(tabl5);

}
void printResult(int[] donner, int[] result){
    System.out.print("[ ");
    for (int el : donner){
        System.out.print(el+" ");
    }
    System.out.print("] -> [ ");
    for (int el : result){
        System.out.print(el+" ");
    }
    System.out.println("]");
}

int[] doublesNaif(int[] tabl){
    ArrayList<Integer> lResult= new ArrayList<>();
    for(int i=0;i<tabl.length;i++){
        for (int j=tabl.length-1;j>i;j--){
            if (tabl[i]==tabl[j]){
                boolean absent=true;
                for (int el : lResult){
                    if (el==tabl[i]){
                        absent=false;
                        break;
                    }
                }
                if (absent){lResult.add(tabl[i]);}
            }
        }
    }
    int[] result = convertTabl(lResult);
    return result;
}
int[] doubleSet(int[] tabl){
    HashSet<Integer> lResult = new HashSet<>();
    for(int i=0;i<tabl.length;i++){
        for (int j=tabl.length-1;j>i;j--){
            if (tabl[i]==tabl[j]){
                lResult.add(tabl[i]);
            }
        }
    }
    int[] result = convertSet(lResult);
    return result;
}
public static int[] convertTabl(List<Integer> tabl){
    int[] result = new int[tabl.size()];
    int i=0;
    for (int el :tabl)
    {
        result[i] = el;
        i++;
    }
    return result;
}

public static int[] convertSet(HashSet<Integer> tabl){
    int[] result = new int[tabl.size()];
    int i=0;
    for (int el :tabl)
    {
        result[i] = el;
        i++;
    }
    return result;
}