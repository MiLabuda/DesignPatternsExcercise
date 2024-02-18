# Design Patterns Excercise

## Creational Pattern - Builder

Utworzenie Buildera:
1. Użytkownik inicjuje proces tworzenia obiektu Pokemon, tworząc nowy obiekt klasy Builder i podając nazwę Pokemona (jako obowiązkowy parametr).
```
Pokemon.Builder builder = new Pokemon.Builder("Charmander");
```
2. Ustawianie opcjonalnych parametrów:
Użytkownik ustawia opcjonalne parametry dla Pokemona za pomocą odpowiednich metod buildera. Może dodać typ, poziom, punkty zdrowia, atak, obronę, prędkość, doświadczenie, region i trenera.

```
builder.type("Fire")
.level(12)
.healthPoints(35)
.attack(22)
.defense(20)
.speed(28)
.experience(60)
.region("Kanto")
.trainer("Ash");
```

3. Budowanie obiektu:
Po skonfigurowaniu wszystkich potrzebnych parametrów, użytkownik używa metody build() w celu utworzenia finalnego obiektu Pokemon.

```
Pokemon charmander = builder.build();
```
W rezultacie obiekt charmander reprezentuje Pokemona Charmendera z unikalnym identyfikatorem UUID oraz określonymi parametrami. Identyfikator UUID został automatycznie wygenerowany.



## Structural patterns - Adapter
1. Wprowadzenie nowego zasobu:
Tworzymy nową klasę ExternalPokemon, która reprezentuje informacje o Pokemonie w formacie różnym od naszego istniejącego systemu.

```
ExternalPokemon externalPokemon = new ExternalPokemon("Pikachu", "Electric", 30, 25, 20);
```

2. Tworzenie adaptera:
Tworzymy adapter, który dostosowuje ExternalPokemon do interfejsu Pokemon używanego w naszej grze.

```
ExternalPokemonAdapter adaptedPokemon = new ExternalPokemonAdapter(externalPokemon);
```

3. Użycie obiektu Pokemon w grze:
Używamy obiektu adaptedPokemon w naszym istniejącym systemie gry Pokemon, tak jakby to był standardowy obiekt Pokemon.

```
System.out.println("Name: " + adaptedPokemon.getName());
System.out.println("Type: " + adaptedPokemon.getType());
System.out.println("Health Points: " + adaptedPokemon.getHealthPoints());
System.out.println("Attack: " + adaptedPokemon.getAttack());
System.out.println("Defense: " + adaptedPokemon.getDefense())
```
4. Dzięki adapterowi, możemy bezproblemowo integrować nowy zasób (ExternalPokemon) z naszym istniejącym systemem gry, korzystając z istniejącego interfejsu (Pokemon). Adapter przekształca interfejs zasobu zewnętrznego na taki, który jest zgodny z oczekiwaniami naszej aplikacji.

## Behavioral patterns - Mediator
1. Rejestracja trenerów w mediatorze:
Tworzymy instancję PokemonChatroom jako mediatora.
Tworzymy trenerów, przypisując im referencję do mediatora podczas ich tworzenia.
Każdy trener rejestruje się w mediatorze za pomocą metody registerTrainer.

```
PokemonMediator chatroom = new PokemonChatroom();
Trainer ash = new Trainer("Ash", chatroom);
Trainer misty = new Trainer("Misty", chatroom);
Trainer brock = new Trainer("Brock", chatroom);
```

2. Komunikacja między trenerami za pośrednictwem mediatora:
Trenerzy wysyłają wiadomości za pośrednictwem mediatora, używając metody sendMessage.
Wiadomości są przesyłane do innych trenerów przez mediatora.

```
ash.sendMessage("Hi, trainers! Let's talk about our Pokemon!");
misty.sendMessage("Sure, Ash! My Starmie has learned a new move.");
brock.sendMessage("That's interesting, Misty! My Onix is evolving!");
```
3. Odbiór wiadomości przez trenerów:
Trenerzy odbierają wiadomości od innych trenerów za pośrednictwem mediatora.
Wiadomości są wyświetlane w konsoli.

```
// Oczekiwane wyjście w konsoli:
Ash sends: Hi, trainers! Let's talk about our Pokemon!
Misty receives: Hi, trainers! Let's talk about our Pokemon!
Brock receives: Hi, trainers! Let's talk about our Pokemon!
Misty sends: Sure, Ash! My Starmie has learned a new move.
Ash receives: Sure, Ash! My Starmie has learned a new move.
Brock receives: Sure, Ash! My Starmie has learned a new move.
Brock sends: That's interesting, Misty! My Onix is evolving!
Ash receives: That's interesting, Misty! My Onix is evolving!
Misty receives: That's interesting, Misty! My Onix is evolving!
```

4. W tym scenariuszu użycia trenerzy używają mediatora (chatroom) do komunikacji między sobą. Każdy trener wysyła wiadomości za pomocą metody sendMessage, a mediator przesyła te wiadomości do pozostałych trenerów. Dzięki temu wzorzec projektowy Mediator pomaga utrzymać elastyczność i minimalizować bezpośrednie połączenia między obiektami, ułatwiając zarządzanie komunikacją w systemie Pokemon.



## Antypatterns - Big Ball of Mud
Jeden z antywzorców projektowych to "Big Ball of Mud" (Duża kula błota). Jest to sytuacja, w której system nie ma klarownej struktury, jest trudny do zrozumienia, utrzymania i rozwijania. "Big Ball of Mud" to termin używany do opisania systemu, który z czasem zaczął tracić swoją pierwotną strukturę, a kod stał się chaotyczny, trudny do utrzymania i zrozumienia.

Charakterystyczne cechy antywzorca "Big Ball of Mud":

- Brak struktury: Brak jasno zdefiniowanej architektury lub struktury kodu. Komponenty są silnie powiązane, a zależności między nimi są niejasne.
- Globalna zależność: Wszystkie elementy systemu są mocno ze sobą związane, co utrudnia modyfikacje w jednym obszarze bez wpływania na inne.
- Nadmierne użycie globalnych zmiennych: Duża ilość zmiennych globalnych, które są używane wszędzie w systemie, co utrudnia śledzenie i zarządzanie stanem.
- Brak jasnych warstw: Brak wyraźnych warstw abstrakcji i odpowiedzialności, co prowadzi do rozmycia odpowiedzialności między różnymi częściami systemu.
- Zmiany trudne do wprowadzenia: Ze względu na brak struktury, nawet najmniejsze zmiany mogą prowadzić do nieoczekiwanych błędów w innych częściach systemu.

Antywzorzec "Big Ball of Mud" jest wynikiem braku dbałości o architekturę i procesy inżynierii oprogramowania. Jest to często efekt długotrwałego rozwijania systemu bez odpowiedniego nadzoru i utrzymania architektury. 

Aby unikać "Big Ball of Mud", zaleca się zastosowanie wzorców projektowych, zasad SOLID, testowania jednostkowego i regularnego refaktoryzowania kodu.