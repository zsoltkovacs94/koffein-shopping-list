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
    KedvencekLista kedvencek;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.bevasarloLista);
        kedvencek = new KedvencekLista(getApplicationContext(), "faves.csv", listView);
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
        Button addFavButton = (Button) view.findViewById(R.id.addFavButton);
        addFavButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kedvencek.add(termeknev.getText().toString());
            }
        });
        builder.setView(view);
        builder.setTitle("Termék hozzáadása")
                .setPositiveButton("OK", null) // Ne adjunk meg OnClickListener-t itt
                .setNegativeButton("Vissza", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Ablak bezárása a "Vissza" gombra kattintva
                        dialog.dismiss();
                    }
                });
        dialog = builder.create();

        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {
                Button positiveButton = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
                positiveButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Ellenőrizzük, hogy az adatmezők üresek-e
                        String termekNevText = termeknev.getText().toString().trim();
                        String mennyisegText = mennyiseg.getText().toString().trim();
                        String mertekegysegText = mertekegyseg.getText().toString().trim();

                        if (termekNevText.isEmpty() || mennyisegText.isEmpty() || mertekegysegText.isEmpty()) {
                            // Ha valamelyik mező üres
                            Toast.makeText(MainActivity.this, "Adja meg a termék adatait", Toast.LENGTH_SHORT).show();
                        } else {
                            // Ha minden adat meg van adva
                            StringBuilder sb = new StringBuilder();
                            sb.append(termekNevText)
                                    .append(",")
                                    .append(mennyisegText)
                                    .append(",")
                                    .append(mertekegysegText);
                            termekek.add(sb.toString());
                            dialog.dismiss(); // Ablak bezárása a sikeres hozzáadás után
                        }
                    }
                });
            }
        });
    }
}
