package com.example.ekene.roomtest;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateUser extends AppCompatActivity {

    private static final String TAG = "CreateUser";

    private EditText firstName, lastName, email;
    private Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
        firstName = findViewById(R.id.first_name);
        lastName = findViewById(R.id.last_name);
        email = findViewById(R.id.email);
        save = findViewById(R.id.save);
        final AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "production")
                .allowMainThreadQueries()
                .build();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Todo save users to database
                Log.d(TAG, "firstName " + firstName.getText().toString());
                User user = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString());
                db.userDao().InsrtAll(user);
                startActivity(new Intent(CreateUser.this, MainActivity.class));
            }
        });
    }
}
