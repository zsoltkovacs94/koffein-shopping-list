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

        listView = (ListView) findViewById(R.id.bevasarloLista);
        KedvencekLista kedvencek = new KedvencekLista(getApplicationContext(), "faves.csv", listView);
        TermekLista termekek = new TermekLista(getApplicationContext(), "lista.csv", listView);
        //termekek.remove(termekek.at(0));
        //kedvencek.remove(kedvencek.at(0));

        Button favButton = (Button) findViewById(R.id.favButton);
        favButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kedvencek.showFaves(listView);
            }
        });

        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                termekek.showList(listView);
            }
        });
    }
}