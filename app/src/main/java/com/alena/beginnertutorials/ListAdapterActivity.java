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
        Person john = new Person ("John", "12-20-1988", "Male");
        Person jane = new Person ("Jane", "05-20-1987", "Female");
        Person steve = new Person ("Steve", "01-04-1997", "Male");
        Person mary = new Person ("mary", "11-04-1995", "Female");
        Person mary0 = new Person ("mary", "11-04-1995", "Female");
        Person mary1 = new Person ("mary", "11-04-1995", "Female");
        Person mary2 = new Person ("mary", "11-04-1995", "Female");
        Person mary3 = new Person ("mary", "11-04-1995", "Female");
        Person mary4 = new Person ("mary", "11-04-1995", "Female");
        Person mary5 = new Person ("mary", "11-04-1995", "Female");
        Person mary6 = new Person ("mary", "11-04-1995", "Female");
        Person mary7 = new Person ("mary", "11-04-1995", "Female");
        Person mary8 = new Person ("mary", "11-04-1995", "Female");
        Person mary9 = new Person ("mary", "11-04-1995", "Female");
        Person mary11 = new Person ("mary", "11-04-1995", "Female");
        Person mary111 = new Person ("mary", "11-04-1995", "Female");
        Person mary1111 = new Person ("mary", "11-04-1995", "Female");
        Person mary11111 = new Person ("mary", "11-04-1995", "Female");

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
        peopleList.add(mary4);
        peopleList.add(mary5);
        peopleList.add(mary6);
        peopleList.add(mary7);
        peopleList.add(mary8);
        peopleList.add(mary9);
        peopleList.add(mary11);
        peopleList.add(mary111);
        peopleList.add(mary1111);
        peopleList.add(mary11111);

        PersonListAdapter adapter = new PersonListAdapter(this, R.layout.adapter_view_layout, peopleList);
        mListView.setAdapter(adapter);

    }
}
