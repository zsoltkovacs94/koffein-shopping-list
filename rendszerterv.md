# Rendszerterv

## A rendszer célja

A rendszer célja, hogy az emberek a telefonjukon tudjanak létrehozni bevásárló listákat.
Új listákat tudnak létrehozni és hozzá adni új tételeket.
A meglévő lista elemeit tudjá módosítani és törölni.
A rendszer használható androidos eszközökön , alkalmazás formájában.
Mivel az alkalmazást csak  Androidos alkalmazásban szeretnénk elérhetővé tenni, nem célunk hogy más, például
IOS operációs rendszerrel rendelkező eszközön fusson.
A rendszer az adatokat lokálisan tárolja, külső szercert, adatbázist nem használ.


## Projektterv

A projektet JAVA platformon fejlesztjük, android eszközökre, az Android Studio IDE-t használva.

### Elvégzendő feladatok

A rendszer leprogramozását négy felé bontottuk:

- Lista megjelenítése és perzisztens tárolása
- Termék listához adása és törlése
- Kedvencek megjelenítése és perzisztens tárolása
- Kedvencekhez adás és törlés

A projekten dolgozók mindegyikének vállalnia kell egy részt.

Továbbá elvégzendő feladatok a specifikációk és rendszerterv elmaradt részeinek pótlása.

### Felelősségi körök

| Név | Felelősségi kör | Vállalt rész |
|-----|-----------------|--------------|
| Czinege Lajos | Programozó | Kedvencek hozzáadása és törlése funkció leprogramozása és tesztelése |
| Jurás Dorka | Programozó | Kedvencek megjelenítése és tárolása funkció leprogramozása és tesztelése |
| Kovács Zsolt | Programozó | Lista megjelenítése és perzisztens tárolása funkció leprogramozása és tesztelése |
| Madar Boglárka | Programozó | Kedvencek hozzáadása és törlése funkció leprogramozása és tesztelése |

### Mérföldkövek

A projekt legfontosabb mérföldkövei a következők:

- Programrészek önállóan működő változatainak elkészítése
- Programrészek önállóan működő változatainak tesztelése
- Programrészek közös működésének megvalósítása
- Programrészek közös működésének tesztelése
- Test log kitöltése

### Ütemterv

#### Programozáshoz kötődő feladatok ütemterve

| Feladat | Határidő |
|---------|----------|
| Programrészek önállóan működő megvalósítása | 2023. 09. 22 |
| Programrészek önálló működésének tesztelése | 2023. 09. 22 |
| Programrészek közös működésének megvalósítása | 2023. 09. 24 |
| Programrészek közös működésének tesztelése | 2023. 09. 24 |

#### Programozáshoz nem kötődő feladatok ütemterve

| Feladat | Határidő |
|---------|----------|
| Test log kitöltése a programrészek önálló részeinek tesztjeivel | 2023. 09. 22 |
| Követelmény specifikáció hiányzó részeinek pótlása | 2023. 09. 24 |
| Funkcionális specifikáció hiányzó részeinek pótlása | 2023. 09. 24 |
| Rendszerterv hiányzó részeinek pótlása | 2023. 09. 24 |
| Test log kitöltése a programrészek közös működésének tesztjeivel | 2023. 09. 24 |

## Üzleti folyamatok modellje

### Üzleti szereplők


1. **Felhasználó**: Alkalmazásunkban ez a "fő szereplő", aki az alkalmazást használja a bevásárlólista
   készítéséhez és kezeléséhez.
2. **Adminisztrátor**: Az adminisztrátoroknak az alábbi feladatokat szükséges elvégezniük:


- Problémák kezelése: Az adminisztrátorok foglalkozhatnak a problémákkal, panaszokkal vagy visszajelzésekkel.
- Rendszerkarbantartás: Az adminisztrátorok felelősek a rendszer karbantartásáért, például
  biztonsági mentések készítéséért és a rendszer teljesítményének optimalizálásáért.
- Adatbiztonság és adatvédelem: Az adminisztrátorok felelősek lehetnek az adatbiztonság és adatvédelem fenntartásáért.
- Kommunikáció: Gyakori kommunikálás a felhasználókkal, például: értesítés küldése, válasz a felhasználó kérdéseisre, kéréseire.

Az adminisztrátorok szerepe tehát az alkalmazás hatékony működésének és a felhasználók támogatásának
biztosítása, valamint a biztonság és adatvédelem fenntartása.


### Üzleti folyamatok


1. **Bevásárlólista készítése**: A felhasználó létrehozza vagy módosítja a bevásárlólistát.
   Ezt az eseményt az alkalmazás felhasználói felülete indítja.
    - Bemenetek: Felhasználói input
    - Kimenetek: Bevásárlólista tartalma
    - Szereplők: Felhasználó


2. **Termékek hozzáadása és eltávolítása**: A felhasználó hozzáad termékeket a bevásárlólistához vagy törli őket.
   - Bemenetek: Felhasználói input, Kedvenc termékek lista
   - Kimenetek: Módosított bevásárlólista
   - Szereplők: Felhasználó


3. **Kedvenc termékek hozzáadása és eltávolítása**: A felhasználó hozzáadja a kedvenc termékeit a
   "Kedvenc termékek" listához vagy törli őket.
    - Bemenetek: Felhasználói input
    - Kimenetek: Módosított "Kedvenc termékek" lista
    - Szereplők: Felhasználó
     ![Üzleti_folyamatok](UML/igenyelt_folyamatok/Igenyelt_folyamatok.drawio.png)


### Üzleti entitások:


- **Bevásárlólista**: A felhasználó által létrehozott lista, amely tartalmazza a vásárolni kívánt termékeket és mennyiségeket.
- **Kedvenc termékek**: A felhasználó által gyakran alkalmazott, vagy kedvencek közé helyezett termékek listája.


## Követelmények

Ez azoknak a követelményeknek a listája, amelyeket szeretnénk mindenképpen megvalósítani. Ezek a fejlesztés során változhatnak.

### Funkcionális követelmények

> ### Bevásárló lista megjelenítése
> **Röviden a követelménylistából**: A programnak könnyen értelmezhető módon kell megjelenítenie a bevásárló listát.
>
> A célunk az, hogy a felhasználó a mobiljáról könnyedén hozzáférhessen az alkalmazáshoz és kényelmesen használhassa azt. Fontos egy felhasználó-barát interfész kialakítása.
> 
> A felhasználó által készített bevásárlólistának akadálymentesen, bármilyen beavatkozás nélkül kell megjelennie az alkalmazáson belül.

> ### Bevásárló lista permanens tárolása
> **Röviden a követelménylistából**: A bevásárló listát permanens módon kell tárolni az adott eszközön.
> 
> Mivel azért hozzuk létre ezt a szoftvert, hogy a felhasználó helyett észben tartsa a bevásárlólistát, ezért biztosítanunk kell annak permanens tárolását.
> 
> Tervünk az, hogy a lista elemeit egy, az adott eszköz háttértárába elmentett .csv állományba fogjuk elmenteni, így az nem foglal sok helyet és nem bonyolult a frissítése sem.

> ### Termék hozzáadása a listához
> **Röviden a követelménylistából**: A felhasználónak képesnek kell lennie termékeket hozzáadni a listához, ami eltávolításig tárolódik.
> 
> Ahhoz, hogy a felhasználónak egyszerű dolga legyen, nem mi adunk a felhasználónak egy előre létrehozott, többezres nagyságrendű listát amiből ő válogathat, hanem megadjuk neki a lehetőséget, hogy a saját bevásárló listáját hozhassa létre.
> 
> Egy gomb megnyomása után a felhasználónak csak annyit kell tennie, hogy beírja a számára fontos termék nevét, mennyiségét és mértékegységét a megfelelő helyre, és azok az adatok hozzáadás után eltárolódnak.

> ### Termék eltávolítása a listából
> **Röviden a követelménylistából**: A felhasználónak képesnek kell lennie termékeket eltávolítani a listából.
> 
> Hogy a felhasználó egyszerűen kezelhesse a bevásárló listáját, biztosítani kell arra módszert, hogy jelezhesse magának ha már megvette a listán található terméket, vagy ha már nincs szüksége rá.
> 
> A törlés kivitelezésével a termék adatai törlődnek mind az alkalmazásból és az eszköz háttértárán tárolt listából is.

> ### Terméknév elmentése/Kedvencekhez adás
> **Röviden a követelménylistából**: A programnak tudnia kell tárolni a felhasználó által elmentett termékek neveit.
> 
> Azt szeretnénk, hogy a felhasználónak kényelmes legyen használnia ezt a szoftvert, ezért megadunk egy olyan lehetőséget, hogy a felhasználó tetszés szerint elmenhesse a kedvenc termékeit egy külön listába.
> 
> Az ilyen termékek adatait a felhasználó elmenheti a termék listához adása közben vagy egy külön 'Kedvenc termékek' lista használatával is.

> ### Terméknév gyors kiválasztása
> **Röviden a követelménylistából**: A felhasználónak képesnek kell lennie korábban elmentett terméknevek gyors kiválasztására.
> 
> Célunk ugyancsak az, hogy a felhasználónak még egyszerűbb dolga legyen.
> 
> A már 'Kedvenc termékek' listához hozzáadott terméknevek megjelennek, ha a felhasználó hasonló, esetleg ugyanazt a terméket kezdi el beírni a bevásárló listájába. Ezzel is szeretnénk könnyebbé tenni a lista létrehozását.

> ### Több bevásárló lista tárolása
> **Röviden a követelménylistából**: A programnak tudnia kell több bevásárlólistát is tárolni.
> 
> Hasonlóan a 'Bevásárló lista permanens tárolása' ponthoz, ezzel a követelménnyel is azt szeretnénk elérni, hogy a felhasználónak ne kelljen több listát is fejben tartania.
> 
> A több listás megoldás egyesek számára csak kényelmi opciót fog jelenteni, ha külön listákba szeretnék írni azokat a termékeket, amiket külön boltokban vesznek meg, de fontos megadni erre is a lehetőséget.

> ### Bevásárló listák közti váltás
> **Röviden a követelménylistából**: A felhasználónak képesnek kell lennie a tárolt bevásárló listák közti váltásra.
> 
> Ha a felhasználó több listába szeretné elmenteni a kívánt termékeket, akkor biztosítanunk kell arra lehetőséget, hogy a különböző listák között gyorsan és egyszerűen válthasson.
> 
> A 'Listaváltás' funkció már a főmenüből elérhető lesz, így a felhasználó bármikor könnyedén válthat a listák között.

### Nem-funkcionális követelmények

> ### Az adatokat csak a felhasználó módosíthatja
> **Röviden a követelménylistából**: A bevásárló listához csakis a felhasználó adhat hozzá és csakis ő távolíthat el termékeket. 
> 
> Mivel nem kötjük az egyes bevásárló listákat belépéshez, ezért itt arra törekszünk, hogy az a felhasználó legyen az egyetlen aki módosítani tudja a listákat, akinél az eszköz található.
> 
> Ezzel arra gondolunk, hogy a felhasználó lesz felelős a saját listájáért; mi, a szoftver fejlesztői, nem fogunk belenyúlni a listába még az elírt szavak javítása érdekében sem, hanem minden döntést a felhasználóra bízunk.

### Törvényi előírások, szabványok

Először is szükséges megfelelnünk az Európai Unió Általános adatvédelmi rendeletének (GDPR).

Továbbá, szoftverünk terveink szerint bármilyen mobilos alkalmazás áruházból elérhető lesz (mint a Google Play Store vagy App Store), ezért ránk, mint fejlesztőkre, szigorú szabályok vonatkoznak.

A Google Play Store fejlesztőkre vonatkozó irányelveiből kiemelnénk párat, amely szigorúbban hat a mi általunk tervezett szoftverre.

1. Korlátozott tartalom
   - Alkalmazásunknak meg kell felelnie a jelen tartalmi irányelveknek és a helyi törvényeknek.
     - Biztosítanunk kell, hogy alkalmazásunk nem tartalmaz sértő és káros dolgokat.
     - Pénzügyileg nem zsákmányolhatunk ki semmilyen felhasználót.
2. Mások személyi adataival való visszaélés
   - Nem szabad olyan alaklmazást létrehoznunk, amely bármilyen módon félrevezeti a felhasználókat.
     - Ne próbáljuk meg más személynek vagy alkalmazásnak tettetni magunkat.
     - Ne éljünk vissza felhasználóink adataival.
3. Spam és minimális használhatóság
   - Minimális követelmény az alkalmazások felé, hogy valamilyen alapszintű funkcionalitást és tisztességes felhasználói élményt biztosítsanak.
     - Ne omoljon össze az alkalmazás használat közben.
     - Ne küldjön az alkalmazás nemkívánatos emaileket, spamet.
4. Rosszindulatú program
   - Rosszindulatú programnak tekinthető minden olyan kód, amely veszélynek teszi ki a felhasználót, a felhasználó adatait vagy a felhasználó eszközét.

Fő célunk továbbra is a felhasználó életének könnyítése, ezért biztosítani fogjuk, hogy alkalmazásunk megfelel a fent említett, és a bővebb irányelvek listájának is.
(Forrás: [Fejlesztői irányelvek központja](https://play.google.com/about/developer-content-policy/))

## Funkcionális terv

Az MVVM architektúra használata segít elkülöníteni az alkalmazás különböző rétegeit és elvégezni a vázlatos tervezést. Az MVVM három fő rétegből áll: 
- Modell (Model): A Modell réteg felelős az alkalmazás üzleti logikájáért és az adatkezelésért. Ebben a rétegben definiálod a bevásárló listák és elemek adatstruktúráját, valamint az adatokat a fájlba mentő és onnan betöltő logikát.

- Nézet (View): A Nézet réteg felelős az alkalmazás felhasználói felületének (UI) megjelenítéséért. Ebben a rétegben hozod létre a felhasználói felületet, és a ViewModel segítségével kommunikálsz a Modell réteggel.

- Nézetmodell (ViewModel): A Nézetmodell réteg közvetíti az adatokat a Modell és a Nézet rétegek között. A ViewModel feladata az adatok előkészítése és formázása a Nézetnek, valamint a Nézetből érkező események kezelése és továbbítása a Modell felé.

Adatkezelés:

Az adatokat egy fájlban tároljuk, szövegfájl formájában. Az alkalmazásnak meg kell valósítania a fájlok olvasását és írását. Java nyelven írt osztályokat használunk a fájlkezeléshez.

Adatstruktúra:

Definiáljuk az adatok struktúráját, például a bevásárló listák és elemek modelljeit. Ezek a modell osztályok tartalmazzák az adatokat, például a termék nevét, mennyiségét stb.

Felhasználói Felület (UI):

A UI tervezése és megvalósítása XML-elrendezési fájlokkal történik. Az alkalmazásnak képesnek kell lennie a bevásárló listák létrehozására, megtekintésére és szerkesztésére.

Fájlkezelési réteg:

Ez a réteg felelős az adatfájlok kezeléséért, például a fájlok mentéséért és betöltéséért a tárolóból.

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

#### Hozzáadás menüből

A kedvencekhez adás menti a beírt terméknevet későbbi gyors kiválasztáshoz.

![Mentés folyamata](UML/funkcionalis_terv/mentes.png)

A hozzáadás menüjében a "Kedvencek közé" gombbal elérhető.

![Hozzáadás menüje](UML/kepernyotervek/termek_hozzaadasa1.drawio.png)

#### Kedvenc termékek listából

A "Termék hozzáadása" gomb megnyomása után meg kell adni a termék nevét, majd jóváhagyni és hozzáadódik a listához.

![Kedvencekhez adás kedvencek listából](UML/funkcionalis_terv/kedvencekhez_adas_kedvencekbol.png)

A kedvencekhez adás a "Termék hozzáadása" gombbal történik.

![Kedvencek lista](UML/kepernyotervek/kedvenc_termekek.drawio.png)

### Törlés a listából

A törlő függvény a memóriában tártolt listából és a háttértáron tárolt listából is törli az adott elemet.

![Törlés folyamata](UML/funkcionalis_terv/torles.png)

A listanézetben a listaelemre kattintva érhető el a törlés funkció.

![Megjelenő lista](UML/kepernyotervek/lista1.drawio.png)

### Kedvencek listájának megjelenítése

A kedvencek megjelenítése hasonló módon történik, mint a bevásárlólista megjelenítése, vagyis automatikusan történik a kedvenc termékek menüpont megnyitásakor.

![Kedvencek megjelenítésének folyamata](UML/funkcionalis_terv/kedvencek_megjelenitese.png)

A kedvencek hasonlóan jelennek meg, mint a bevásárlólista elemei.

![Kedvencek lista](UML/kepernyotervek/kedvenc_termekek.drawio.png)

### Kedvencekből való törlés

A kedvencek menü megnyitásakor látható a termék neve mellett egy törlés gomb, ami törli az adott elemet.

### Lista tárolása a háttértáron

A lista tárolása egyszerű csv formátumban történik, aminek a felépítése a következő:

```
termeknev1,mennyiseg1,mertekegyseg1
termeknev2,mennyiseg2,mertekegyseg2
.
.
.
```

Egy külön osztály felelős a lista beolvasásáért és kiírásáért, a lista háttértáron lévő verziójának mindig a memóriában lévő verzióval együtt kell frissülnie.

## Fizikai környezet

Az alkalmazást JAVA platformon fejlesztjük, android 7.0 (Nougat) és újabb verziójú eszközökre.

A JAVA platformra a nyelv operációs rendszer függetlensége miatt esett a választás.

Azért fejlesztjük az alkalmazást android 7.0 és újabb verziójú eszközökre, mert az android visszafele kompatibilitása és a statisztikák szerint a jelenleg használt androidos eszközök 95,4%-án futni fog az alkalmazás.

A fejlesztéshez az Android Studio IDE-t fogjuk használni.

Az alkalmazás várható hardverkövetelménye elhanyagolható lesz, ezért tervek szerint bármilyen android 7.0-át és újabb verziót futtató eszközök képesek lesznek a futtatására.

Az alkalmazás nem kommunikál majd semmilyen külső szerverrel vagy API-val, minden adat tárolása lokálisan történik és nem továbbítódik külső félnek.

## Absztrakt domain modell

### Domain specifikáció, fogalmak:


**Felhasználó**: A rendszer felhasználója, aki használja az alkalmazást a bevásárlólisták készítéséhez és kezeléséhez.


**Termék**: Olyan árucikk vagy tétel, amelyet a felhasználó tud létrehozni és hozzáadhatja a bevásárlólistájához.
Minden terméknek van neve, mennyisége és mértéke.


**Bevásárlólista**: A felhasználó által létrehozott lista, amely tartalmazza a kiválasztott termékeket és azok mennyiségét.


**Kedvenc termék**: A felhasználó kedvenc termékei, melyeket gyakran vásárol.


### Absztrakt komponensek és azok kapcsolatai:


**Felhasználó és Bevásárlólista**: A felhasználó létrehozhat és kezelhet több bevásárlólistát.
A felhasználó ezeket a listákat szerkesztheti vagy törölheti.


**Termék és Bevásárlólista**: Egy bevásárlólista tartalmazhat több terméket, és egy termék több
bevásárlólistában is szerepelhet. A kapcsolat az adott termék felvétele a bevásárlólistába.


**Felhasználó és Termék**: A felhasználók hozzáadhatnak termékeket a bevásárlólistájukhoz.
A termék adatait a felhasználó használja a listájának szerkesztéséhez.


### Konkrét példán keresztüli bemutatás:


**Példa 1**: Feri egy felhasználó, aki létrehoz egy bevásárlólistát "Hétvégi bevásárlás" néven.
Ebben a listában szerepelnek olyan termékek, mint "tej", "kenyér" és "tojás". Az absztrakt modell
szerint Feri a felhasználó, a "Hétvégi bevásárlás" a bevásárlólista, és a termékek (tej, kenyér, tojás)
a bevásárlólista részei.


**Példa 2**: Bob is egy felhasználó, és ő is létrehoz egy bevásárlólistát "Munkahelyi szülinapi bulihoz" címmel.
Ebben a listában olyan termékek vannak, mint "tortához való díszek" és "üdítők". Mivel már korábban
többször is volt rá alkalom, hogy Bob üdítőt vegyen, ezért megegyszerűsítette a saját dolgát és a "Kedvencek"
listába helyezte a terméket, így nem kellett újra létrehoznia az üdítő nevű terméket.
Az absztrakt modell alapján Bob a felhasználó, a "Munkahelyi szülinapi bulihoz" pedig egy másik bevásárlólista,
amelynek saját termékei vannak.


## Architektúrális terv

## Tesztterv

### Jelen alpont meghatározása

A tesztelések célja a rendszer és komponensei funkcionalitásának teljes vizsgálata, ellenőrzése, a rendszer által megvalósított üzleti szolgáltatások verifikálása.

Tesztelésünk során összefoglalásként kiemelhető, hogy akkor tekinthető egy adott részrendszer tesztelése sikeresnek, ha
- a test log mezői 95%-ban 'MEGFELELT' minősítésűek, azaz
  - a specifikációban elfogadott funkciók működnek,
  - a rendszerfunkciók specifikált paramétereinek mért értékei az elvárásoknak megfelelő teljesítmény-határértékek között vannak.

### Tesztelési eljárások

> Általános funkcionális teszt

- A rendszer működésének vizsgálata normál működés esetén.
- A teszt során ellenőrizzük, hogy a rendszer funkciói az elvártaknak megfelelően működnek, a tesztek során a kívánt eredményeket kapjuk.
  - Számunkra ez az jelenti, hogy a lista feltöltése, adatok mentése, listák megjelenítése, stb. rendesen működik.
- Ahol lehetséges, szükséges már a fejlesztési idő alatt tesztelni, hogy egyes metódusok megfelelően működnek-e.
- A teszteket a fejlesztők végzik, és a tesztek kimenetét a test log-ba jegyzik fel.
- Minden egyes metódus megfelelő működésének biztosítására írni kell Unit teszteket, amelyek minden elképzelhető hibaesetre is kitérnek.
- A metódusok akkor vannak készen, ha a tesztesetek hiba nélkül térnek vissza az egyes metódusokon.

> Szélsőérték funkcionális teszt

- A rendszer működésének vizsgálata szélső bemeneti és kimeneti értékek esetén.
- A teszt során ellenőrizzük, hogy a rendszer funkciói az elvártaknak megfelelően működnek, a teszt során a kívánt eredményeket kapjuk.
  - Számunkra ez azt jelenti, hogy negatív beírt értékekre hibát fog jelezni a teszt, stb.

> Biztonsági teszt

- A szoftver jogosultsági rendszerének tesztelése ellenőrzi, hogy a rendszer adataihoz csak az elvárt felhasználók férnek-e hozzá.
  - Számunkra ez azt jelenti, hogy a listában lévő adatokhoz és magukhoz a listákhoz egyedül az eszköz tulajdonában lévő felhasználó fér hozzá.

> Telepítési és rendszer-visszaállítási teszt

- A rendszer telepítésének tesztelése a rendszerüzemeltetési leírás alapján.
  - Számunkra ez azt jelenti, hogy a felhasználó képes az alkalmazás áruházból telepíteni az alkalmazást mindenféle bonyodalmak hiányában.
- Rendszer visszaállítása (program és adat) a rendszerüzemeltetési leírás alapján.
  - Számunkra ez azt jelenti, hogy az alkalmazás törlése után az alkalmazásba mentett minden adat törlődik az eszközről.

### Tesztelendő funkciók

> Funkcionális követelmények tesztjei

- Az alkalmazásnak bármilyen telefonos készüléken meg kell jelennie telepítés után, az alapméretezett, üres listának egyből be kell töltődnie az alkalmazás elindítását követően.
- A felhasználó által létrehozott listáknak el kell tárolódnia az alkalmazáson belül és az eszköz háttértárolóján is. Ha a listák változnak (bővítés, törlés) annak mindkét listában tükröződnie kell.
- A felhasználó által hozzáadott és törölt termékek adatainak (név, mennyiség, mértékegység) rendszerint kell működniük, hozzáadás és törlés esetén is.
- A 'Kedvenc termékek' listának ugyanúgy meg kell jelennie, mint a bavásárló listáknak, és ugyanúgy kezelnie kell a termékek hozzáadását és törlését.
- A 'Kedvenc termékek' listában szereplő elemeknek meg kell jelenniük a felhasználónak, ha a termék neve hasonló a felhasználó által beírt termék nevéhez.

## Telepítési terv

> A programunk android alapú mobil alkalmazás
-Egyik telepítési lehetőség letölteni a Google áruházból amihez
meg kell adni a szükséges engedélyeket és utána lehet telepíteni a programot.
-Amennyiben nem az áruházból kívánja telepíteni az alkalmazást, úgy engedélyezze készülékén az úgynevezett "Harmadik féltől származó
tartalmakat" a beállításoknál!
- Helyezze az ".apk" kiterjesztésű elemet a készülékére, majd futtassa
azt!
Webes telepítésre nincs lehetőség mivel az alkalmazás csak mobil alkalmazáson fut.
