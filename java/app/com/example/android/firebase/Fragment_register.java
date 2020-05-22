//package app.com.example.android.firebase;
//
//import android.content.Intent;
//import android.support.v4.app.Fragment;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Spinner;
//import android.widget.Toast;
//
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//public class Fragment_register extends Fragment {
//    private DatabaseReference mData;
//    private DatabaseReference mDataRead;
//    private EditText cred;
//    Button btn;
//    Button pls;
//    Spinner spinner_post;
//    Spinner spinner_event;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View v= inflater.inflate(R.layout.activity_fragment_developer, container, false);
//        // Inflate the layout for this fragment
//        mData = FirebaseDatabase.getInstance().getReference();
//
//
//        cred = (EditText) v.findViewById(R.id.credentials);
//        spinner_post = (Spinner) v.findViewById(R.id.spinner_post);
//        spinner_event = (Spinner) v.findViewById(R.id.spinner_event);
//        addItemToSpinner();
//        addListenerToSpinner();
//        Intent n = getIntent();
//        final String str = n.getStringExtra("value");
//
//
//
//        btn = (Button) v.findViewById(R.id.button2);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                cred = (EditText) findViewById(R.id.credentials);
//                String credentials=cred.getText().toString().trim();
//
//
//
//
//                mData.child("Registration").child(str).child("Credentials").setValue(credentials);
//
//                mDataRead = FirebaseDatabase.getInstance().getReference().child("Users").child(str).child("Name");
//                mDataRead.addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(DataSnapshot dataSnapshot) {
//                        String naam=dataSnapshot.getValue().toString();
//                        mData = FirebaseDatabase.getInstance().getReference();
//                        mData.child("Registration").child(str).child("Name").setValue(naam);
//                    }
//
//                    @Override
//                    public void onCancelled(DatabaseError databaseError) {
//
//                    }
//                });
//
//                mDataRead = FirebaseDatabase.getInstance().getReference().child("Users").child(str).child("Branch");
//                mDataRead.addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(DataSnapshot dataSnapshot) {
//                        String naam=dataSnapshot.getValue().toString();
//                        mData = FirebaseDatabase.getInstance().getReference();
//                        mData.child("Registration").child(str).child("Branch").setValue(naam);
//                    }
//
//                    @Override
//                    public void onCancelled(DatabaseError databaseError) {
//
//                    }
//                });
//
//                mDataRead = FirebaseDatabase.getInstance().getReference().child("Users").child(str).child("Contact");
//                mDataRead.addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(DataSnapshot dataSnapshot) {
//                        String naam=dataSnapshot.getValue().toString();
//                        mData = FirebaseDatabase.getInstance().getReference();
//                        mData.child("Registration").child(str).child("Contact").setValue(naam);
//                    }
//
//                    @Override
//                    public void onCancelled(DatabaseError databaseError) {
//
//                    }
//                });
//
//                mDataRead = FirebaseDatabase.getInstance().getReference().child("Users").child(str).child("Year");
//                mDataRead.addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(DataSnapshot dataSnapshot) {
//                        String naam=dataSnapshot.getValue().toString();
//                        mData = FirebaseDatabase.getInstance().getReference();
//                        mData.child("Registration").child(str).child("Year").setValue(naam);
//                    }
//
//                    @Override
//                    public void onCancelled(DatabaseError databaseError) {
//
//                    }
//                });
//
//                Toast toast = Toast.makeText(getContext(), "Registration Successfull", Toast.LENGTH_SHORT);
//                toast.show();
//            }
//        });
//
//
//    }
//
//    void addItemToSpinner() {
//
//        ArrayAdapter<CharSequence> arrayAdapter_1 = ArrayAdapter.createFromResource(getActivity(), R.array.post, android.R.layout.simple_spinner_dropdown_item);
//        arrayAdapter_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner_post.setAdapter(arrayAdapter_1);
//
//        ArrayAdapter<CharSequence> arrayAdapter_2 = ArrayAdapter.createFromResource(getActivity(), R.array.event, android.R.layout.simple_spinner_dropdown_item);
//        arrayAdapter_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner_event.setAdapter(arrayAdapter_2);
//
//    }
//
//
//
//    void addListenerToSpinner() {
//        Intent n = getIntent();
//        final String str = n.getStringExtra("value");
//        spinner_event.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                final String str1 = spinner_event.getItemAtPosition(position).toString();
//                mData = FirebaseDatabase.getInstance().getReference();
//
//                mData.child("Registration").child(str).child("Event").setValue(str1);
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//        spinner_post.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                final String str2 = spinner_post.getItemAtPosition(position).toString();
//
//                mData = FirebaseDatabase.getInstance().getReference();
//
//                mData.child("Registration").child(str).child("Post").setValue(str2);
//
//
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//
//
//
//
//
//        if(container!=null)
//        {
//            container.removeAllViews();
//        }
//        return v;
//
//    }
//}
