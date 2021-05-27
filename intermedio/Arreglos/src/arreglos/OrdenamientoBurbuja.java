package arreglos;

/**
 *
 * @author freya
 */
public class OrdenamientoBurbuja {
    public void algoritmoBurboja(int[] a){
        int tem;
        for(int i = 0; i < a.length - 1; i++){
            for(int j = 0; j < a.length - 1; j++){
                if(a[j] > a[j + 1]){
                    tem = a[j];
                    a[j] = a[j + 1];
                    a[j + 1 ] = tem;
                }
            }
        }
    }
}
