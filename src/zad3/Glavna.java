package zad3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Glavna {
    public static void main(String[] args) {
        List<SportskiKlub> list = new ArrayList<SportskiKlub>();
        list.add(new SportskiKlub("FC Barcelona", "Fudbal", 22));
        list.add(new SportskiKlub("RK Eurofarm Pelister", "Rakomet", 12));
        list.add(new SportskiKlub("Lakers", "Kosarka", 15));

        Collections.sort(list);
        for (SportskiKlub s : list) {
            System.out.println(s.getIme());
            System.out.println(s.getSport());
            System.out.println(s.getBrojNaClenovi());
            System.out.println();
        }
    }
}
