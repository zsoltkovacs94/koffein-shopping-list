package hu.unideb.inf.koffein_shopping_list;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class KedvencekLista {

    CSVHandler csvHandler;

    List<Termek> kedvencekList = new ArrayList<Termek>();

    public KedvencekLista() {

    }

    public KedvencekLista(Context context, String filename) {
        csvHandler = new CSVHandler(context, filename);
        readFromFile();
    }

    public void add(String termek) {
        kedvencekList.add(new Termek(termek));
        if(csvHandler != null) {
            writeToFile();
        }
    }

    public void remove(Termek t) {
        kedvencekList.remove(t);
        if(csvHandler != null) {
            writeToFile();
        }
    }

    public int size() {
        return kedvencekList.size();
    }

    public Termek at(int index) {
        return kedvencekList.get(index);
    }

    private void readFromFile() {
        List<String> lines = csvHandler.read();
        kedvencekList = new ArrayList<Termek>();
        for (String line : lines) {
            if(line != null) {
                kedvencekList.add(new Termek(line));
            }
        }
    }

    private void writeToFile() {
        csvHandler.write(this.toString());
    }

}
