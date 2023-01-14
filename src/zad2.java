public class zad2 {

    public static void main(String[] args) {
    int [] tablica1=zad1.downloadN();
    int[] tablica2=sortuj(tablica1);
        zad1.Parametr(tablica1);
        zad1.Parametr(tablica2);
}
    public static int[] sortuj(int[] array){

        int [] tablica=array.clone();

        for (int i=0; i< tablica.length-1; i++){
            for(int j=0; j< tablica.length-i-1;j++){

                if(tablica[j]>tablica[j+1]){
                    int temp = tablica[j];
                    tablica[j]=tablica[j+1];
                    tablica[j+1]=temp;
                }
            }
        }
        return tablica;
    }
}
