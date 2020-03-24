package com.example.kfostine.exempleradiobuttongroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
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
                CheckBox chkJava = (CheckBox)findViewById(R.id.idChkJava);
                CheckBox chkCPlus = (CheckBox)findViewById(R.id.idChkC);
                CheckBox chkJavascript = (CheckBox)findViewById(R.id.idChkJavascript);
                String langage = "";
                if(chkJava.isChecked()){
                    langage += chkJava.getText();
                }
                if(chkCPlus.isChecked()){
                    if(!langage.equals("")){
                        langage +=", " + chkCPlus.getText();
                    }
                    else{
                        langage += chkCPlus.getText();
                    }
                }
                if(chkJavascript.isChecked()){
                    if(!langage.equals("")){
                        langage +=", " + chkJavascript.getText();
                    }
                    else{
                        langage += chkJavascript.getText();
                    }
                }
                TextView txtResultat = (TextView) findViewById(R.id.idResultat);
                txtResultat.setText("Sexe : " +  radioSelected.getText()
                        +"\nLangage(s) de programmation : " + langage );

            }
        });
    }
}
