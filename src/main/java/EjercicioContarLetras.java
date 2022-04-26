import java.util.HashMap;
import java.util.LinkedHashMap;


public class EjercicioContarLetras {

    public static String Repeticiones(String entrada) {

        if(entrada == null)
            return null;

        char[] array = entrada.toLowerCase().toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (Character c:array) {
            if (map.containsKey(c)){
                Integer valor = map.get(c);
                valor++;
                map.replace(c,valor);
            }else{
                map.put(c,1);
            }
        }
        return map.toString();
    }

}
