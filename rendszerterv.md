# Rendszerterv

## A rendszer célja

## Projektterv

## Üzleti folyamatok modellje

## Követelmények

## Funkcionális terv

### Menühierarchia

A kezdőképernyő a Listaválasztás, a téglalapok menük, a kerekített sarkú téglalapok pedig funkciók.

![Menühierarchia](UML/funkcionalis_terv/menuhierarchia.png)

### Lista megjelenítése

A lista megjelenítése egy automatikusan meghívott függvény, ami megjeleníti a képernyőn a kiválasztott listát. Az lista kiválasztásakor és minden listaművelet után meghívásra kerül.

![Listamegjelenítés folyamata](UML/funkcionalis_terv/megjelenites.png)

Megjeleníti a képernyőn, egymás alatt a memóriába betöltött lista elemeit.

![Megjelenő lista](UML/kepernyotervek/lista1.drawio.png)

### Hozzáadás listához

A hozzáadás függvényt a felhasználó gombnyomásra hívja meg, a memóriában lévő és a háttértáron lévő listát is frissíti a művelettel.

![Hozzáadás folyamata](UML/funkcionalis_terv/hozzaadas.png)

A hozzáadás funkciót a kezdetben megjelenő képernyő "Termék hozzáadása" gombjával érhető el. Megadandó adatok a termék neve, a mennyiség és a mennyiség mértékegysége. Ezek után az OK gomb meghívja a hozzáadó függvényt.

![Hozzáadás menüje](UML/kepernyotervek/termek_hozzaadasa1.drawio.png)

### Kedvencekhez adás

A kedvencekhez adás menti a beírt terméknevet későbbi gyors kiválasztáshoz.

![Mentés folyamata](UML/funkcionalis_terv/mentes.png)

A hozzáadás menüjében a "Kedvencek közé" gombbal elérhető.

![Hozzáadás menüje](UML/kepernyotervek/termek_hozzaadasa1.drawio.png)

### Törlés a listából

A törlő függvény a memóriában tártolt listából és a háttértáron tárolt listából is törli az adott elemet.

![Törlés folyamata](UML/funkcionalis_terv/torles.png)

A listanézetben a listaelemre kattintva érhető el a törlés funkció.

![Megjelenő lista](UML/kepernyotervek/lista1.drawio.png)

### Kedvencek listájának megjelenítése

### Kedvencekből való törlés

### Kedvencekhez adás a kedvencek listájából

### Listaválasztás

### Listák tárolása a háttértáron

## Fizikai környezet

Az alkalmazást JAVA platformon fejlesztjük, android 7.0 (Nougat) és újabb verziójú eszközökre.

A JAVA platformra a nyelv operációs rendszer függetlensége miatt esett a választás.

Azért fejlesztjük az alkalmazást android 7.0 és újabb verziójú eszközökre, mert az android visszafele kompatibilitása és a statisztikák szerint a jelenleg használt androidos eszközök 95,4%-án futni fog az alkalmazás.

A fejlesztéshez az Android Studio IDE-t fogjuk használni.

Az alkalmazás várható hardverkövetelménye elhanyagolható lesz, ezért tervek szerint bármilyen android 7.0-át és újabb verziót futtató eszközök képesek lesznek a futtatására.

Az alkalmazás nem kommunikál majd semmilyen külső szerverrel vagy API-val, minden adat tárolása lokálisan történik és nem továbbítódik külső félnek.

## Absztrakt domain modell

## Architektúrális terv

## Tesztterv

## Telepítési terv
