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
    Button salvar, lixeira, lixeira1, lixeira2, lixeira3, lixeira4, lixeira5, lixeira6, lixeira7, lixeira8;
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
        lixeira1 = findViewById(R.id.lixeira1);
        lixeira2 = findViewById(R.id.lixeira2);
        lixeira3 = findViewById(R.id.lixeira3);
        lixeira4 = findViewById(R.id.lixeira4);
        lixeira5 = findViewById(R.id.lixeira5);
        lixeira6 = findViewById(R.id.lixeira6);
        lixeira7 = findViewById(R.id.lixeira7);
        lixeira8 = findViewById(R.id.lixeira8);
        lixeira = findViewById(R.id.lixeira);

        this.lerDadosFirebase();

        this.lixeiras();
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Salvar
                atualizarDadosFirebase();
                Toast.makeText(getApplicationContext(), "Dados Atualizados !", Toast.LENGTH_SHORT).show();
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
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });
        Toast.makeText(getApplicationContext(), "Dados Recebidos !", Toast.LENGTH_SHORT).show();

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
    }

    public void lixeiras() {
        lixeira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mu1.setText("");
                mu2.setText("");
                mu3.setText("");
                mu4.setText("");
                mu5.setText("");
                mu6.setText("");
                mu7.setText("");
                mu8.setText("");
                atualizarDadosFirebase();
                Toast.makeText(getApplicationContext(), "Dados Apagados !", Toast.LENGTH_SHORT).show();
            }
        });
        lixeira1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mu1.setText("");
                atualizarDadosFirebase();
                Toast.makeText(getApplicationContext(), "Dados Apagados !", Toast.LENGTH_SHORT).show();
            }
        });
        lixeira2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mu2.setText("");
                atualizarDadosFirebase();
                Toast.makeText(getApplicationContext(), "Dados Apagados !", Toast.LENGTH_SHORT).show();
            }
        });
        lixeira3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mu3.setText("");
                atualizarDadosFirebase();
                Toast.makeText(getApplicationContext(), "Dados Apagados !", Toast.LENGTH_SHORT).show();
            }
        });
        lixeira4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mu4.setText("");
                atualizarDadosFirebase();
                Toast.makeText(getApplicationContext(), "Dados Apagados !", Toast.LENGTH_SHORT).show();
            }
        });
        lixeira5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mu5.setText("");
                atualizarDadosFirebase();
                Toast.makeText(getApplicationContext(), "Dados Apagados !", Toast.LENGTH_SHORT).show();
            }
        });
        lixeira6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mu6.setText("");
                atualizarDadosFirebase();
                Toast.makeText(getApplicationContext(), "Dados Apagados !", Toast.LENGTH_SHORT).show();
            }
        });
        lixeira7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mu7.setText("");
                atualizarDadosFirebase();
                Toast.makeText(getApplicationContext(), "Dados Apagados !", Toast.LENGTH_SHORT).show();
            }
        });
        lixeira8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mu8.setText("");
                atualizarDadosFirebase();
                Toast.makeText(getApplicationContext(), "Dados Apagados !", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
