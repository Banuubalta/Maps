import java.util.HashMap;
import java.util.Map;

public class maps {

public static void main (String [] args) {

    int matris2 [][] = {
            {1,2,3,1},
            {4,5,6,1},
            {7,8,9,1} // ixj
    };

    int[] satirToplam = new int[matris2.length]; // matris2.length yazarak 3 ü vurguladı
    int[] sutunToplam = new int[matris2[1].length]; // [1] de yazsa [2] de aynısını verecek

    // Her bir satırın ve sütunun toplamını bul
    for (int i = 0; i < matris2.length ; i++) {
        for (int j = 0; j < matris2[i].length ; j++) {
            satirToplam[i] += matris2[i][j];
            sutunToplam[j] += matris2[i][j];
        }
    }

    // Her bir satırın toplamını yazdır
    for (int i = 0; i < satirToplam.length; i++) {
        System.out.println(i + 1 + ". satirin toplami --> " + satirToplam[i]);
    }

    // Her bir sütunun toplamını yazdır
    for (int i = 0; i < sutunToplam.length; i++) {
        System.out.println(i + 1 + ". sutunun toplami --> " + sutunToplam[i]);
    }
}
}



