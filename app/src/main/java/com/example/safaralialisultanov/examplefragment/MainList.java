package com.example.safaralialisultanov.examplefragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by safarali.alisultanov on 28.07.2016.
 */
public class MainList extends ListFragment {

    String data[] = new String[] { "one", "two", "three", "four",
                                   "one", "two", "three", "four",
                                   "one", "two", "three", "four",
                                   "one", "two", "three", "four"};

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, data);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        TextView textView = (TextView)v;
        String item = textView.getText().toString();

        Toast.makeText(getActivity(), "Вы выбрали позицию: " + item, Toast.LENGTH_SHORT).show();
        getActivity().getFragmentManager().beginTransaction().remove(this).commit();
    }



}

