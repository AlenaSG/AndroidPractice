package com.alena.beginnertutorials;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by alenagolovina on 11/29/17.
 */

public class ListViewActivity extends AppCompatActivity {
    private static final String TAG = "ListViewActivity";
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView list = (ListView) findViewById(R.id.theList);
        EditText theFilter = (EditText) findViewById(R.id.searchFilter);
        Log.d(TAG, "onCreate: started ListView Act");

        ArrayList<String> names = new ArrayList<>();
        names.add("Alena");
        names.add("Anna");
        names.add("Sowmya");
        names.add("Mick");
        names.add("Saul");

//using different layouts
       // ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, names);
       // list.setAdapter(adapter);
        adapter = new ArrayAdapter(this, R.layout.list_item_layout, names);
        list.setAdapter(adapter);

        theFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                (ListViewActivity.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
