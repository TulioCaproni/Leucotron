package com.tulio.muralleucotron;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    Button salvar;
    TextView mu1, mu2, mu3, mu4, mu5, mu6, mu7, mu8;

    // Write a message to the database
    FirebaseDatabase database = FirebaseDatabase.getInstance();

    DatabaseReference m1 = database.getReference("Leucotron/Mural1");
    DatabaseReference m2 = database.getReference("Leucotron/Mural2");
    DatabaseReference m3 = database.getReference("Leucotron/Mural3");
    DatabaseReference m4 = database.getReference("Leucotron/Mural4");
    DatabaseReference m5 = database.getReference("Leucotron/Mural5");
    DatabaseReference m6 = database.getReference("Leucotron/Mural6");
    DatabaseReference m7 = database.getReference("Leucotron/Mural7");
    DatabaseReference m8 = database.getReference("Leucotron/Mural8");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mu1 = findViewById(R.id.mural11);
        mu2 = findViewById(R.id.mural22);
        mu3 = findViewById(R.id.mural33);
        mu4 = findViewById(R.id.mural44);
        mu5 = findViewById(R.id.mural55);
        mu6 = findViewById(R.id.mural66);
        mu7 = findViewById(R.id.mural77);
        mu8 = findViewById(R.id.mural88);

        salvar = findViewById(R.id.salvar);

        this.lerDadosFirebase();

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Salvar
                atualizarDadosFirebase();
            }
        });

    }


    public void lerDadosFirebase() {

        // Read from the database
        m1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                mu1.setText(value);
                Toast.makeText(getApplicationContext(), "Dados Recebidos !", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

        m2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                mu2.setText(value);
                Toast.makeText(getApplicationContext(), "Dados Recebidos !", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

        m3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                mu3.setText(value);
                Toast.makeText(getApplicationContext(), "Dados Recebidos !", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

        m4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                mu4.setText(value);
                Toast.makeText(getApplicationContext(), "Dados Recebidos !", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

        m5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                mu5.setText(value);
                Toast.makeText(getApplicationContext(), "Dados Recebidos !", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });
        m6.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                mu6.setText(value);
                Toast.makeText(getApplicationContext(), "Dados Recebidos !", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });
        m7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                mu7.setText(value);
                Toast.makeText(getApplicationContext(), "Dados Recebidos !", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });
        m8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                mu8.setText(value);
                Toast.makeText(getApplicationContext(), "Dados Recebidos !", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });


    }

    public void atualizarDadosFirebase() {

        // mu - TextView
        // m - firebase

        m1.setValue(mu1.getText().toString());
        m2.setValue(mu2.getText().toString());
        m3.setValue(mu3.getText().toString());
        m4.setValue(mu4.getText().toString());
        m5.setValue(mu5.getText().toString());
        m6.setValue(mu6.getText().toString());
        m7.setValue(mu7.getText().toString());
        m8.setValue(mu8.getText().toString());

        Toast.makeText(getApplicationContext(), "Dados Atualizados !", Toast.LENGTH_SHORT).show();
    }

}
