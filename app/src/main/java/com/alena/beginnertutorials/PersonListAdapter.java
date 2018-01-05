package com.alena.beginnertutorials;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PersonListAdapter extends ArrayAdapter<Person> {
    private static final String TAG = "PersonListAdapter";

    private Context mContext;
    private int mResource;
    private int lastPosition = -1;

    //holds variables in a view
    static class ViewHolder {
        TextView name;
        TextView birthday;
        TextView sex;
    }

    //default constructor for the PersonListAdapter
    public PersonListAdapter(Context context, int resource, ArrayList<Person> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the person info
        String name = getItem(position).getName();
        String birthday = getItem(position).getBirthday();
        String sex = getItem(position).getSex();

        //Create the person object with the info
        Person person = new Person(name,birthday,sex);

        //Create the view result for showing the animation
        final View result;

        //ViewHolder object
        ViewHolder holder;

        //store some objects head of time
        //if this position hasn't been visited yet
        if(convertView ==null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);

            holder = new ViewHolder();

            holder.name = (TextView) convertView.findViewById(R.id.textView1);
            holder.birthday = (TextView) convertView.findViewById(R.id.textView2);
            holder.sex = (TextView) convertView.findViewById(R.id.textView3);

            result = convertView;
            //the view will be stored in memory - setTag
            convertView.setTag(holder);
        }
        else{
            //the view will be referenced from memory - getTag
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition)? R.anim.load_down_anim : R.anim.load_up_anim);
        result.startAnimation(animation);
        lastPosition = position;

        holder.name.setText(person.getName());
        holder.birthday.setText(person.getBirthday());
        holder.sex.setText(person.getSex());

        return convertView;
    }
}


//public class PersonListAdapter extends ArrayAdapter<Person> {
//    private static final String TAG = "PersonListAdapter";
//
//    private Context mContext;
//    int mResource;
//
//    public PersonListAdapter(Context context, int resource, ArrayList<Person> objects) {
//        super(context, resource, objects);
//        mContext = context;
//        mResource = resource;
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        //get the person info
//        String name = getItem(position).getName();
//        String birthday = getItem(position).getBirthday();
//        String sex = getItem(position).getSex();
//
//        //Create the person object with the info
//        Person person = new Person(name,birthday,sex);
//
//        LayoutInflater inflater = LayoutInflater.from(mContext);
//        convertView = inflater.inflate(mResource, parent, false);
//
//        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);
//        TextView tvBirthday = (TextView) convertView.findViewById(R.id.textView2);
//        TextView tvSex = (TextView) convertView.findViewById(R.id.textView3);
//
//        tvName.setText(name);
//        tvBirthday.setText(birthday);
//        tvSex.setText(sex);
//
//        return convertView;
//    }
//}
