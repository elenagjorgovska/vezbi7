package zad2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodiZaListaNiza {

    public void listToArray(List<String> lista){
        String [] niza = new String[lista.size()];
        lista.toArray(niza);
        System.out.println("Listata konvertirana vo niza e: ");

        for(String s: niza){
            System.out.println(s);
        }
    }

    public void arrayToList(String [] niza){
        List<String> lista = new ArrayList<String>();
        lista = Arrays.asList(niza);
        System.out.println("Nizata konvertirana vo lista e: ");

        for(String s : lista){
            System.out.println(s);
        }
    }
}
