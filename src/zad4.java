public class zad4 {

    public static void main(String[] args) {
        int [] wygenerowana= zad1.downloadN();
        zad1.Parametr(wygenerowana);

        int [] posortowana = zad2.sortuj(wygenerowana);
        zad1.Parametr(posortowana);

        int[] odwrotna = zad3.reverse(wygenerowana);
        zad1.Parametr(odwrotna);

        System.out.println(isReserved(posortowana,odwrotna));
    }
    public static boolean isReserved(int[] tab1, int[] tab2){
        for (int i=0; i<tab1.length;i++){

            if(tab1[i]!=tab2[tab2.length-i-1]){
                return false;
            }
        }
        return true;

    }
}
