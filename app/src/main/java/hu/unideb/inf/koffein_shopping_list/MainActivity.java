package hu.unideb.inf.koffein_shopping_list;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Button addButton;
    AlertDialog dialog;
    TermekLista termekek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.bevasarloLista);
        KedvencekLista kedvencek = new KedvencekLista(getApplicationContext(), "faves.csv", listView);
        termekek = new TermekLista(getApplicationContext(), "lista.csv", listView);
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

        addButton = findViewById(R.id.addButton);
        listView = findViewById(R.id.bevasarloLista);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("BUTTONS", "User clicked on Add button.");
                buildDialog();
                dialog.show();
            }
        });
    }


    private void buildDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view = getLayoutInflater().inflate(R.layout.activity_dialog, null);
        EditText termeknev = (EditText) view.findViewById(R.id.edit_termeknev);
        EditText mennyiseg = (EditText) view.findViewById(R.id.edit_mennyiseg);
        EditText mertekegyseg = (EditText) view.findViewById(R.id.edit_mertekegyseg);


        builder.setView(view);
        builder.setTitle("Termék hozzáadása")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(termeknev.getText())
                                .append(",")
                                .append(mennyiseg.getText())
                                .append(",")
                                .append(mertekegyseg.getText());
                        termekek.add(sb.toString());
                    }
                })
                .setNegativeButton("Vissza", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });
        dialog = builder.create();
    }
}