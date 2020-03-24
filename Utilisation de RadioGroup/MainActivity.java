package com.example.kfostine.exempleradiobuttongroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnAfficher = (Button) findViewById(R.id.idAfficher);
        btnAfficher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.idSexe);
                int idRadioSelected = radioGroup.getCheckedRadioButtonId();
                RadioButton radioSelected = (RadioButton) findViewById(idRadioSelected);
                Toast.makeText(MainActivity.this, "Le sexe est : " + radioSelected.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
