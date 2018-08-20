package com.example.opet.loginfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Initial extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        String emailCurrent = currentUser.getEmail();

        TextView emailUser = findViewById(R.id.emailUser);
        emailUser.setText("Bem vindo, " + emailCurrent);


        // Extra: Vindo da activity SignUp:
        /*
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        String email = bundle.getString("email");

        TextView emailResultado = findViewById(R.id.emailResultado);

        emailResultado.setText("Bem vindo, " + email);
        */
    }

    public void sair(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
