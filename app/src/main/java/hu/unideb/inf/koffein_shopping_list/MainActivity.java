package hu.unideb.inf.koffein_shopping_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.bevasarloLista);
        TermekLista termekek = new TermekLista();
        for (int i = 1; i <= 100; i++){
            String line = "termek"+i+",mennyiseg"+i+",mertekegyes"+i;
            termekek.add(line);
        }
        TermekAdapter termekAdapter = new TermekAdapter(getApplicationContext(), termekek);
        listView.setAdapter(termekAdapter);
    }
}