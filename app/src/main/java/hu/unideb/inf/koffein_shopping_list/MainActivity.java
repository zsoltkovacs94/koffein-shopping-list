package hu.unideb.inf.koffein_shopping_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button favButton = (Button) findViewById(R.id.favButton);

        favButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("BUTTONS", "User clicked on Favorites button.");
                KedvencekLista kedvencek = new KedvencekLista(getApplicationContext(), "faves.csv");
                showFaves(kedvencek);
                // Ez így most működik állítólag, amíg nem adunk ehhez a listához semmilyen terméket...
                // Mert egyszer megpróbáltam, másik csv file névvel, de egy órán át verekedtem ezzel a cuccal, szóval új nevet adtam neki, és még most működik...
                // A termékek listához lehet adni cuccokat és működik a dolog, és át is vált a Kedvencek listára, csak ha ahhoz hozzáadok valamit kiég szegény
                // Lehet ott kezdődnek a gondok, hogy nem is ide kéne adnom ezt a gomb nyomogatós lista megjelenítést, de nem értek én sajnos a programozáshoz lol
                // Szóval, röviden: ehhez a listához senki ne adjon semmit hozzá, és ha valakinek van jobb ötlete hova írjam át ezt, akkor megköszönném a segítséget (és bocsánat, also) ;;
            }
        });

        listView = (ListView) findViewById(R.id.bevasarloLista);
        TermekLista termekek = new TermekLista(getApplicationContext(), "lista.csv");
        //termekek.remove(termekek.at(0));
        showList(termekek);
    }
    public void showList(TermekLista termekek){
        TermekAdapter termekAdapter = new TermekAdapter(getApplicationContext(), termekek);
        listView.setAdapter(termekAdapter);
    }

    public void showFaves(KedvencekLista kedvencek) {
        KedvencekAdapter kedvencekAdapter = new KedvencekAdapter(getApplicationContext(), kedvencek);
        listView.setAdapter(kedvencekAdapter);
    }
}