package hu.unideb.inf.koffein_shopping_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.bevasarloLista);
        TermekLista termekek = new TermekLista(getApplicationContext(), "lista.csv");
        //termekek.remove(termekek.at(0));
        TermekAdapter termekAdapter = new TermekAdapter(getApplicationContext(), termekek);
        listView.setAdapter(termekAdapter);
    }
}