package busquedamayor;

/**
 *
 * @author DANIEL
 */
public class BusquedaMayor {

        public static void main(String[] args) {
        int[] a = {7,8,9,10,14,5,2,6};
        MyS(a);
    }

    public static void MyS(int[] a) {
        int mayor,aux, i;
        mayor=a[0];
        aux=0;
        for(i=1;i<a.length;i++){
            if (a[i]>mayor){
                aux=mayor;
                mayor=a[i];
            } else{
                if(a[i]>aux){
                    aux=a[i];
                }
            }                
        }
        System.out.println("El mayor es "+mayor+" y el siguiente mayor es "+aux);
    }
}
