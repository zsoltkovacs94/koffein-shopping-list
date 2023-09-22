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
            }
        });
        listView = (ListView) findViewById(R.id.bevasarloLista);
        TermekLista termekek = new TermekLista(getApplicationContext(), "lista.csv", listView);
        //termekek.remove(termekek.at(0));

        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                termekek.showList(listView);
            }
        });
    }

    public void showFaves(KedvencekLista kedvencek) {
        KedvencekAdapter kedvencekAdapter = new KedvencekAdapter(getApplicationContext(), kedvencek);
        listView.setAdapter(kedvencekAdapter);
    }
}