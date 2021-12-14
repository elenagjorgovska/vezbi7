package zad2;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
    public static void main(String[] args) {
        MetodiZaListaNiza m = new MetodiZaListaNiza();
        List<String> lista = new ArrayList<String>();
        lista.add("Elena");
        lista.add("Ana");
        lista.add("Natasa");
        m.listToArray(lista);

        String [] niza = {"elena","ana","natasa"};
        m.arrayToList(niza);
    }
}
