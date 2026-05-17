public class Tester extends Pracownik {

    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko,
                  double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny() {
        if (czyAutomatyzujacy) {
            return getStawkaBazowa() * 1.15;
        }
        return getStawkaBazowa();
    }

    @Override
    public String przedstawSie() {
        String typ = czyAutomatyzujacy ? "automatyzujący" : "manualny";
        return "Tester " + getImie() + " " + getNazwisko()
                + " | Typ: " + typ
                + " | Scenariusze: " + liczbaScenariuszy
                + " | Koszt: " + obliczKosztMiesieczny() + " PLN";
    }

    public void uruchomRaportTestow() {
        System.out.println("--- Raport testów: " + getImie() + " " + getNazwisko() + " ---");
        System.out.println("    Liczba scenariuszy: " + liczbaScenariuszy);
        System.out.println("    Automatyzacja: " + (czyAutomatyzujacy ? "TAK" : "NIE"));
        System.out.println("    Status: " + (liczbaScenariuszy > 20 ? "Pełne pokrycie" : "Wymaga uzupełnienia"));
    }

    @Override
    public String toString() {
        return "Tester{id='" + pobierzIdPracownika() + "', imie='" + getImie()
                + "', nazwisko='" + getNazwisko() + "', automatyzacja=" + czyAutomatyzujacy
                + ", scenariusze=" + liczbaScenariuszy
                + ", kosztMiesieczny=" + obliczKosztMiesieczny() + " PLN}";
    }
}
