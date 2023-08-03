package sg.edu.rp.c346.id22043453.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Contact> contactList;
    ImageView ivGender;

    public CustomAdapter(Context context, int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCode = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvNum = rowView.findViewById(R.id.textViewPhoneNum);
        ivGender = rowView.findViewById(R.id.imageViewGender);



        String imageUrl = "https://tinyurl.com/yck7ccfc";
        String imageUrl2 = "https://tinyurl.com/yeyad6wk";
        Picasso.with(parent_context).load(imageUrl).into(ivGender);

        Contact currentItem = contactList.get(position);
        tvName.setText(currentItem.getName());
        tvCode.setText("+" + currentItem.getCountryCode());
        tvNum.setText(currentItem.getPhoneNum() + " ");
        ivGender.setImageResource(R.drawable.female);

        if (currentItem.getGender() == 'M') {
            Picasso.with(parent_context).load(imageUrl).resize(50,50).into(ivGender);
        }
        else {
            Picasso.with(parent_context).load(imageUrl2).resize(50,50).into(ivGender);
        }


        /*
        if (currentItem.getGender() == 'M') {
            ivGender.setImageResource(R.drawable.male);
        }
        else {
            ivGender.setImageResource(R.drawable.female);
        }
        */

        return rowView;
    }



}
