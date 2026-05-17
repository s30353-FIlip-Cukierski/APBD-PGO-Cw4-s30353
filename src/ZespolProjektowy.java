import java.util.ArrayList;

public class ZespolProjektowy {

    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownik) {
        pracownicy.add(pracownik);
        System.out.println("Dodano do zespołu: " + pracownik.getImie() + " " + pracownik.getNazwisko());
    }

    public void wypiszSkladZespolu() {
        System.out.println("\n========================================");
        System.out.println("  SKŁAD ZESPOŁU: " + nazwaProjektu);
        System.out.println("========================================");
        for (Pracownik p : pracownicy) {
            System.out.println("  - " + p.przedstawSie());
        }
        System.out.println("========================================\n");
    }

    public double policzLacznyKoszt() {
        double suma = 0;
        for (Pracownik p : pracownicy) {
            suma += p.obliczKosztMiesieczny(); // polimorficzne wywołanie
        }
        return suma;
    }

    public Pracownik znajdzPoId(String idPracownika) {
        for (Pracownik p : pracownicy) {
            if (p.pobierzIdPracownika().equals(idPracownika)) {
                return p;
            }
        }
        return null;
    }

    public void wypiszTesterowAutomatyzujacych() {
        System.out.println("\n--- Testerzy automatyzujący ---");
        for (Pracownik p : pracownicy) {
            if (p instanceof Tester) {
                Tester t = (Tester) p;
                if (t.isCzyAutomatyzujacy()) {
                    System.out.println("  * " + t.getImie() + " " + t.getNazwisko()
                            + " (" + t.getLiczbaScenariuszy() + " scenariuszy)");
                }
            }
        }
    }
}
