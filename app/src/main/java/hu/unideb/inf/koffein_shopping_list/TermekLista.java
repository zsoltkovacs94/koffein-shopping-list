package hu.unideb.inf.koffein_shopping_list;

import java.util.ArrayList;
import java.util.List;

public class TermekLista {
    List<Termek> termekList = new ArrayList<Termek>();
    public TermekLista(){

    }
    public TermekLista(String filename){
    }
    public void add(String termek){
        termekList.add(new Termek(termek));
    }
    public int size(){
        return termekList.size();
    }
    public Termek at(int index){
        return termekList.get(index);
    }
}
