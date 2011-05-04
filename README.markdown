# Gra w Statki

Podzial aplikacji na moduly.
Mozliwosci wyboru:

1. StatkiView - Layout aplikacji
	Opis: Zawiera glowne okno aplikacji wraz ze wszystkimi komponentami oraz podstawowe akcje zarzadzajace oknem
2. ComputerAi - Algorytm gry komputera
	Opis: Klasa implementujaca sztuczna inteligencje (algorytm gry komputera czyli po prostu klasa ta obsluguje strzaly komputera)
3. TcpIpProtocol - Obsluga protokolu TCP/IP
	Opis : Implementacja protokołu połączeniwego TCP/IP wykorzystywana do przesyłania informacji pomiędzy grami (gra dwu-osobowa przez sieć). Dostarcza on interfejs umożliwiający wysyłanie wiadomości tekstowych.
4. Chat - Klasa do obslugi lan chatu
	Opis: Klasa implementująca mini komunikator sieciowy. Głównie wysyłanie i odbieranie oraz obróbka wiadomości z wykorzystaniem gotowej klasy TcpIpProtocol.
5. ShipsSetter - Algorytm do wstawiania statkow
	Opis: Implementacja ustawiania statków na mapie. Dostarcza interfejs graficzny umożliwiający "ręczne" ustawianie statków przez gracza na planszy. Dodatkowo grafika statków do wykonania. Wykorzystanie klasy Validator
6. MapGenerator - Plansza komputera
	Opis: Klasa impleentująca generowanie planszy komputera. Ewentualnie wczytywanie gotowych map z pliku. Wykorzystanie klasy Validator
7. Validator
	Opis: Klasa walidacyjna. Wykorzystywana do sprawdzania poprawności ustawień statków.

Pkt 1 oraz pkt 3 - Liderzy grupy tj. Wójtowicz Tomasz i Tasak Mariusz.

Application [*Statki*] - nazwa robocza :)

by [Wojtowicz Tomasz, Tasak Mariusz] - dopisywać się
