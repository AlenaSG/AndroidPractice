package com.alena.beginnertutorials;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    private static final String TAG = "ListViewActivity";
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView list = (ListView) findViewById(R.id.theList);

        EditText theFilter = (EditText) findViewById(R.id.searchFilter);
        Log.d(TAG, "onCreate: started ListView Act");

        //declare ArrayList as final so the onClick listener cn see it
        final ArrayList<String> names = new ArrayList<>();
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

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "onItemClick: name: " + names.get(i));
                Toast.makeText(ListViewActivity.this, "You clicked on: " + names.get(i), Toast.LENGTH_SHORT).show();
                //passing data to another activity
                Intent intent = new Intent(ListViewActivity.this, ClickedNameActivity.class);
                intent.putExtra("name", names.get(i));
                startActivity(intent);
            }
        });

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
