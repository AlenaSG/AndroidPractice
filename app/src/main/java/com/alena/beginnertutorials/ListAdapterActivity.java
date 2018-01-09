package com.alena.beginnertutorials;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by alenagolovina on 1/4/18.
 */

public class ListAdapterActivity extends AppCompatActivity {

    private static final String TAG = "ListAdapterActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_list);
        ListView mListView = (ListView) findViewById(R.id.listView);

        //create the Person objects
        Person john = new Person ("John", "12-20-1988", "Male", "drawable://" + R.drawable.tweek);
        Person jane = new Person ("Jane", "05-20-1987", "Female", "drawable://" + R.drawable.tweek);
        Person steve = new Person ("Steve", "01-04-1997", "Male", "drawable://" + R.drawable.tweek);
        Person mary = new Person ("mary", "11-04-1995", "Female", "drawable://" + R.drawable.tweek);
        Person mary0 = new Person ("mary", "11-04-1995", "Female", "drawable://" + R.drawable.tweek);
        Person mary1 = new Person ("mary", "11-04-1995", "Female", "drawable://" + R.drawable.tweek);
        Person mary2 = new Person ("mary", "11-04-1995", "Female", "drawable://" + R.drawable.tweek);
        Person mary3 = new Person ("mary", "11-04-1995", "Female", "drawable://" + R.drawable.tweek);


    //Add the person objects to an ArrayList
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(john);
        peopleList.add(jane);
        peopleList.add(steve);
        peopleList.add(mary);
        peopleList.add(mary0);
        peopleList.add(mary1);
        peopleList.add(mary2);
        peopleList.add(mary3);
        peopleList.add(john);
        peopleList.add(jane);
        peopleList.add(steve);
        peopleList.add(mary);
        peopleList.add(mary0);
        peopleList.add(mary1);
        peopleList.add(mary2);
        peopleList.add(mary3);
        peopleList.add(john);
        peopleList.add(jane);
        peopleList.add(steve);
        peopleList.add(mary);
        peopleList.add(mary0);
        peopleList.add(mary1);
        peopleList.add(mary2);
        peopleList.add(mary3);

        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);

    }
}
