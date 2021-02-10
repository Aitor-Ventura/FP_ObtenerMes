package es.ulpgc.eii.strings;

public class StringUtils {                  //clase
    public static String mes(String s1){    //creamos método que devuelve un String y tiene por parámetro otro String
        int p = s1.indexOf("-");            //buscamos el índice donde se encuentra el carácter "-"
        int q = s1.indexOf("-", p+1);       //buscamos el índice donde se encuentra el otro carácter "-"
        String result = s1.substring(p+1,q);//obtenemos nada más lo que nos interesa de la String
        return result;  //devolvemos lo que nos interesa
    }
}