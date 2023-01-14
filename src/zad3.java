public class zad3 {

    public static void main(String[] args) {
        int [] tablica1=zad1.downloadN();
        int[] tablica2=reverse(tablica1);
        zad1.Parametr(tablica1);
        System.out.println();
        zad1.Parametr(tablica2);
    }
    public static int[] reverse(int[] array){

        int [] tablica=array.clone();

        for (int i=0; i< tablica.length-1; i++){
            for(int j=0; j< tablica.length-i-1;j++){

                if(tablica[j]<tablica[j+1]){
                    int temp = tablica[j];
                    tablica[j]=tablica[j+1];
                    tablica[j+1]=temp;
                }
            }
        }
        return tablica;
    }
}
