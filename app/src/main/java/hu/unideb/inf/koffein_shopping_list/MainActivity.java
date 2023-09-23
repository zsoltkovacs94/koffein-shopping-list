package hu.unideb.inf.koffein_shopping_list;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Button addButton;
    AlertDialog dialog;
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

        addButton = findViewById(R.id.addButton);
        listView = findViewById(R.id.bevasarloLista);


        buildDialog();
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("BUTTONS", "User clicked on Add button.");


                dialog.show();
            }
        });
    }


    private void buildDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View view = getLayoutInflater().inflate(R.layout.activity_dialog, null);


        TextView termeknev = findViewById(R.id.edit_termeknev);
        TextView mennyiseg = findViewById(R.id.edit_mennyiseg);
        TextView mertekegyseg = findViewById(R.id.edit_mertekegyseg);


        builder.setView(view);
        builder.setTitle("Termék hozzáadása")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        addView(termeknev.getText().toString(),
                                mennyiseg.getText().toString(),
                                mertekegyseg.getText().toString());
                    }
                })
                .setNegativeButton("Vissza", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                });
        dialog = builder.create();


    }


    private void addView(String termeknev, String mennyiseg, String mertekegyseg){
        View view = getLayoutInflater().inflate(R.layout.activity_list_item, null);


        TextView termekNevView = view.findViewById(R.id.termekNevTextView);
        TextView mennyisegView = view.findViewById(R.id.mennyisegTextView);
        TextView mertekegysegView = view.findViewById(R.id.mertekegysegTextView);
        Button delete = view.findViewById(R.id.removeButton);


        termekNevView.setText(termeknev);
        mennyisegView.setText(mennyiseg);
        mertekegysegView.setText(mertekegyseg);


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.removeView(view);
            }
        });
        listView.addView(view);
    }

}