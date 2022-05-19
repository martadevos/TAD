import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> setNombres = new HashSet<>();
        setNombres.add("Lola");
        setNombres.add("David");
        setNombres.add("Maria");
        setNombres.add(null);
        setNombres.add("Lola");
        setNombres.add("Marta");
        escribir(setNombres);
        LinkedHashSet<String> setNombres2 = new LinkedHashSet<>();
        setNombres2.add("Lola");
        setNombres2.add("David");
        setNombres2.add("Maria");
        setNombres2.add(null);
        setNombres2.add("Lola");
        setNombres2.add("Marta");
        escribir(setNombres2);
    }
    public static void escribir(HashSet<String> setNombres){
        Iterator<String> itr = setNombres.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();
        System.out.println(setNombres);
        System.out.println();
    }
    public static void escribir2(HashSet<String> setNombres){
        for (String setNombre : setNombres) {
            System.out.println(setNombre);
        }
        System.out.println();
        System.out.println(setNombres);
        System.out.println();
    }
}
