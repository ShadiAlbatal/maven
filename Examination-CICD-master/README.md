# Examination-CICD
 Gruppuppgift CICD 


Uppgifter – Examination
Kursen Continuous Integration & Continuous Delivery för DevOps17 examineras genom en
gruppuppgift och två individuella uppgifter. Den uppgift som utförs i grupp redovisas inför klassen
och lärare onsdag 28 november. De uppgifter som utförs individuellt skickas in till lärare för
bedömning senast fredag 30 november.
1. Gruppuppgift
För denna uppgift skall ni arbeta i grupper på 3-4 personer. Inom gruppen ansvarar ni själva för att
fördela arbetet och se till att redovisa det tillsammans.
Uppgiften skall inte i första hand testa programmering, men kommer att utgå från ett enkelt Javaprogram,
nämligen det som finns på https://www.javatpoint.com/online-exam-project-in-javaswing-without-database
Ladda hem och installera programmet. Se till att alla i gruppen kan köra det.
Skapa även ett repository (förslagsvis på Github) där ni har ert projekt. Lägg dit koden. Checka ut
till era datorer så att ni alla kan arbeta på den.
Ni skall nu göra följande med projektet. Tänk på att hela tiden fokusera på att checka in
kontinuerligt, men se till att ert projekt (”huvudspåret”) är i skick att kunna användas i varje skede.
Att visa hur era incheckningar gjorts och vad de innehåller blir en viktig del av redovisningen.
A. Skriv JUnit-tester till metoden check.
B. Lyft ut frågorna till en array som finns i en separat klass. Låt den klassen ha en metod för att
returnera en fråga med angivet nummer. Skapa en metod i den ursprungliga klassen som hämtar
nästa fråga.
C. Skriv Junit-tester för både den nya klassen och den nya metoden i B ovan.
D. Ändra frågorna / lägg till nya frågor. Flera av er skall göra detta, och sedan göra en merge av
resultaten till ert huvudprojekt.
2. Individuell uppgifter
2.1
I denna uppgift skall du skapa ett automatiserat test med Selenium. För VG skall du dessutom visa
att du kan skriva scripts för Selenium.
Börja med att ta hem och installera Selenium. https://www.seleniumhq.org/
A. Skapa en upprepningsbar Selenium-sekvens för att via webbinterface inspektera ert Githubrepository
från gruppuppgiften, inklusive vilka commits som har gjorts. Redovisa det skript som
skapas för sekvensen.
B. För VG: Gör nu samma sak som i uppgift A genom att skriva ett program som använder sig av
Selenium API. Välj själv om du gör det i Java, C# eller Python.
2.2
I denna uppgift skall du ge en kort beskrivning som visar att du vet hur man bygger
installationspaket för leverans / installation. För VG skall du dessutom göra beskrivningen så pass
detaljerad att den kan användas som manual.
Du kommer använda dig av det projekt ni har arbetat med i gruppuppgiften.
A. Skriv kortfattat ned vilka steg som behöver utföras för att hämta den senaste versionen från
huvudspåret i det git-repository, kompilera den, och hitta de klasser / paket som behövs för att
installera hela programmet (tänk dig för enkelhets skull att du intallerar i en ny driftsmiljö). Rimlig
mängd text är mellan 10 rader och 1 A4.
B. För VG: Beskriv varje steg ovan mer i detalj och illustrera med skärmdumpar. Rimlig mängd text
+ bilder är 2-5 A4.
