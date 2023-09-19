package hu.unideb.inf.koffein_shopping_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TermekAdapter extends BaseAdapter {

    Context context;
    TermekLista termekList;
    LayoutInflater layoutInflater;
    public TermekAdapter(Context context, TermekLista termekList){
        this.context=context;
        this.termekList = termekList;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return termekList.size();
    }

    @Override
    public Object getItem(int position) {
        return termekList.at(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.activity_list_item, null);
        TextView termekNevTV = (TextView) convertView.findViewById(R.id.termekNevTextView);
        TextView mennyisegTV = (TextView) convertView.findViewById(R.id.mennyisegTextView);
        TextView mertekegyegTV = (TextView) convertView.findViewById(R.id.mertekegysegTextView);
        termekNevTV.setText(termekList.at(position).getTermekNev());
        mennyisegTV.setText(termekList.at(position).getMennyiseg());
        mertekegyegTV.setText(termekList.at(position).getMertekegyseg());
        return convertView;
    }
}
