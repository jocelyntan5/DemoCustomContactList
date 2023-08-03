package sg.edu.rp.c346.id22043453.democustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> alContactList;
    CustomAdapter caContact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContact = findViewById(R.id.listViewContacts);
        alContactList = new ArrayList<>();
        Contact item1 = new Contact("Mary", 65, 81234567, 'F');
        Contact item2 = new Contact("Ken", 65, 91234567, 'M');
        alContactList.add(item1);
        alContactList.add(item2);

        caContact = new CustomAdapter(this, R.layout.row, alContactList);
        lvContact.setAdapter(caContact);


    }
}