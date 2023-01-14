import java.util.Random;
import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) {
        int [] tablica=downloadN();
        Parametr(tablica);
    }
    public static int[] downloadN(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą n i wciśnij ENTER");
        n= sc.nextInt();
        int [] intiger = new int[n];
        Random random = new Random();
        for (int i=0; i<n; i++){
            intiger[i]= random.nextInt(100);
        }
        return intiger;

    }

    public static void Parametr(int[] tablica){
        for(int i=0; i<tablica.length;i++){
            System.out.println(tablica[i]);
        }
        System.out.println();
    }
}
