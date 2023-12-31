# Követelmény specifikáció

## Jelenlegi helyzet leírása
A bevásárló listák elkészítése manapság papír alpúak. Észrevételünk, hogy ez a fajta eljárás már elavult. A papír alapú bevásárló lista nem hatékony.
Könnyen elveszhet míg a telefonos alkalmazás alapú lista mindíg nállunk van , mert telefon nélkül kevesen indulnak el otthonról.
Több bevásárló lista esetén ezek cetlin keverethetnek vagy elveszhet. Telefonos alkalmazásunkban könnyen tudunk létrehozni új bevásárlólistát vagy törölni amire már nincs szükségünk.
Gyakran vásárolt termékeinket megtudjuk jelölni kedvenceink listájába így még egyszerübb a bevásárló listák elkészítése.


## Vágyálomrendszer leírása

A cél egy olyan szoftver létrehozása, amely gyorsabbá és egyszerűbbé teszi a bevásárlást az által, hogy egy ingyenes, könnyen használható bevásárló listát biztosít a felhasználónak.

A vágy az, hogy a felhasználónak csak le kelljen töltenie az alkalmazást, majd bejelentkezés után egyből el kezdheti tervezni azt, hogy milyen termékeket kell vásárolnia.

Vágyunk azt, hogy a szoftver több fontos funkcióval is rendelkezzen:

- Egyszerű szerkesztése a listának (egyszerű legyen hozzáadni, törölni a termékek nevét)
- A listába ne csak a termék nevét lehessen megadni, hanem a vásárolni kívánt mennyiséget is
  - Hogy a felhasználónak még egyszerűbb dolga legyen, a mértékegységek eleve legyen tárolva az alkalmazásban (pl. egy legördülő lista használatával)
- Gyakran használt termékek nevének tárolása, gyors kiválasztása (pl. abban az esetben, ha gyakran veszünk egy terméket, legyen lehetőség annak nevének elmentésére, hogy később ne kelljen újra beírni)
  - Ezt úgy is el lehet képzelni, mint egy külön 'Favorites' listát, ahonnan gyorsan ki tudjuk választani kedvenc termékeink nevét
  - Azt is szeretnénk, hogy ezt a listát külön lehessen szerkeszteni (elemeket hozzáadni, törölni, megváltoztatni a már benne lévő adatokat)
- Több bevásárló lista létrehozása, tárolása (pl. abban az esetben, ha más boltokban más termékeket szeretünk jobban vagy egyes boltokban olcsóbbak egyes termékek)
- A lista adatait csak a felhasználó változtathassa meg (pl. abban az esetben, ha több felhasználó is hozzáfér az eszközhöz, legyen egy olyan beléptetési rendszer, amely csak a saját listáinkat jeleníti meg, így csak azokhoz férünk hozzá)
  - Itt azt is szeretnénk, hogy a felhasználó a saját listájáért legyen felelős: a szoftver nem fogja kijavítani a felhasználót, ha esetleg elírta egy termék nevét (pl. gondoljunk itt az 'auto-correct'-re), így a felhasználó felelőssége lesz a hibát felismerni és kijavítani, ha szükségesnek látja azt
- Egyszerű és kényelmes legyen használni (ide tartozik az is, hogy ingyenesen letölthető és használható)
- Esztétikailag vonzó legyen

## Jelenlegi üzleti folyamatok leírása
A mai világban az emberek körében egyre fontisabb a digitális átálás. A hagyományos "cetlis" bevásárló lista már nem a leghatékonyabb. Sokszor elkanlódik , nem tudjuk mi az ami már megvan a listáról vagy összekeverhetjük a listáinkat. Ezért tartjuk fontosnak a digitális bevásárlólistát. Így sokkal könnyebben tudják rendszerezni a listáikat és követni annak aktualitását. A lista és a hozzá adott elemeket lehet hozzáadni, átnevezni és törölni.

## Igényelt üzleti folyamatok modellje

Azért, hogy könnyebbé tegyük a vásárlást tervező emberek dolgát, létrehozunk egy alkalmazást, amely
a mindennapokban megfelelően helyt fog tudni állni az elektronikai világban.


A vásárlást tervező felhasználónak lehetősége nyílik egy/több új listát létrehozni (vagy meglévőt
törölni), azt elnevezni (vagy átnevezni), majd a listán belül termékeket hozzáadni/eltávolítani.
A termékeket el tudja nevezni, mennyiséget és mértéket is hozzá tud rakni. Emellett a kedvenc
(gyakori) termékeit ki tudja jelölni, ezzel megkönnyítve a bevásárlólista feltöltését.


![modell](UML/igenyelt_folyamatok/Igenyelt_folyamatok.drawio.png)

## Követelménylista

### Funkcionális követelmények

A bevásárlólista alkalmazásnak az alábbi funkcionális követelményeknek kell megfelelnie.

| ID | Név | Kifejtés |
|----|-----|----------|
| k1 | Bevásárló lista megjelenítése | A programnak, könnyen értelmezhető módon meg kell jelenítenie a bevásárló listát|
| k2 | Bevásárló lista permanens tárolása | A bevásárló listát permanensen kell tárolni az adott eszközön |
| k3 | Termék hozzáadása a listához | A felhasználónak képesnek kell lennie termékeket hozzáadniuk a listához, ami eltávolásig tárolódik |
| k4 | Termék eltávolítása a listából | A felhasználónak képesnek kell lennie termékeket eltávolítani a bevásárló listából |
| k5 | Terméknév elmentése | A programnak tudnia kell tárolni a felhasználó által elmentett termékek neveit |
| k6 | Terméknév gyors kiválasztása | A felhasználónak képesnek kell lennie korábban elmentett terméknevek gyors kiválasztására |
| k7 | Több bevásárló lista tárolása | A programnak tudnia kell több bevásárlólistát eltárolni |
| k8 | Bevásárló listák közti váltás | A felhasználónak képesnek kell lennie a tárolt bevásárlólisták közti váltásra |

### Nem-funkcionális követelmények

Az alkalmazásnak a megfelelő működés érdekében az alábbi nem-funkcionális követelményeknek kell megfelelnie.

| ID | Név | Kifejtés |
|----|-----|----------|
| k9 | Az adatokat csak a felhasználó módosíthatja | Az bevásárló listához csakis a felhasználó adhat hozzá és csakis ő távolíthat el belőle termékeket |
