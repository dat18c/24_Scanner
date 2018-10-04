# 24_Scanner

## Opsamling
* den lille tabel
* afstandsberegning
* gennemsnit af tilfældige tal
* primtal 2 - 100

## Scanner
Scanner klassen har metoder, der læser næste token/linie fra kommandolinien.

Linie er hele inputlinien.
En linie består af tokens (ord/tegnsammensætninger) adskilt med et skilletegn (delimiter). Default er mellemrum.

Eksempel på linie og tokens:
`````
correct horse battery staple
token1  token2 token3 token4
`````
next(), nextDouble(), nextInt() læser næste token af typen String, double, hhv. int

nextLine() læser næste linie som String

`````
import java.util.Scanner;

Scanner console = new Scanner(System.in);

String tal  = console.nextInt();

System.out.println("Tallet er: " + tal);
`````

Andre interessante metoder, som vi kommer tilbage til: hasNextInt(), hasNextDouble()

useDelimiter("") er en vigtig metode, som vi skal bruge, når vi læser filer.

## Øvelser
* Input af info på studerende i Skole/Studerende.
* Input af værdier til matematikfunktioner primtal og pythagoras
