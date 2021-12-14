package zad3;

public class SportskiKlub implements Comparable<SportskiKlub> {

        private String ime;
        private String sport;
        private int brojNaClenovi;

        public SportskiKlub(String ime, String sport, int brojNaClenovi) {
            this.ime = ime;
            this.sport = sport;
            this.brojNaClenovi = brojNaClenovi;
        }

        public String getIme() {
            return ime;
        }

        public void setIme(String ime) {
            this.ime = ime;
        }

        public String getSport() {
            return sport;
        }

        public void setSport(String sport) {
            this.sport = sport;
        }

        public int getBrojNaClenovi() {
            return brojNaClenovi;
        }

        public void setBrojNaClenovi(int brojNaClenovi) {
            this.brojNaClenovi = brojNaClenovi;
        }

        public int compareTo(SportskiKlub obj) {
            SportskiKlub s = (SportskiKlub) obj;
            if (this.ime.equals(s.ime))
                return 0;
            else
                return this.ime.compareTo(s.ime);
        }
    }
