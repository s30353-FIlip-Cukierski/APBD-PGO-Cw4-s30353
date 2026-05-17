# Zespol Projektowy
Prosty projekt w Javie realizujący model zarządzania zespołem projektowym w software house.

## Opis
Program pozwala na tworzenie pracowników różnych typów, przechowywanie ich w jednej liście oraz generowanie raportu składu zespołu. System automatycznie oblicza miesięczny koszt pracy całego zespołu.

## Klasy
- **Pracownik** – klasa nadrzędna przechowująca wspólne dane wszystkich pracowników.
- **Programista** – klasa potomna reprezentująca programistę w zespole.
- **Tester** – klasa potomna reprezentująca testera w zespole.
- **ZespolProjektowy** – zarządza listą pracowników i generuje raport.
- **Main** – zawiera scenariusz testowy.

## Metody
- **dodajPracownika** – dodawanie pracownika do zespołu
- **wypiszSkladZespolu** – wypisanie wszystkich członków zespołu
- **policzLacznyKoszt** – obliczanie sumarycznego kosztu miesięcznego
- **znajdzPoId** – wyszukiwanie pracownika po identyfikatorze
- **przedstawSie** – wyświetlanie informacji o pracowniku
- **obliczKosztMiesieczny** – obliczanie kosztu dla konkretnego pracownika
- **pobierzIdPracownika** – zwracanie id pracownika (metoda final)
- **equals** – porównywanie pracowników na podstawie ich id

## Autor
Filip Cukierski s3035w
