package id.sch.smktelkom_mlg.tugas01.xiirpl4020.myapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etName;
    RadioButton rbD, rbC, rbL, rbH;
    Button bRegister;
    CheckBox cbM, cbC, cbO, cbS4, cbS5;
    Spinner Negara;
    TextView tvView, tvViewR, tvViewC, tvViewT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.editTextName);
        rbD = (RadioButton) findViewById(R.id.radioButtonD);
        rbC = (RadioButton) findViewById(R.id.radioButtonC);
        rbL = (RadioButton) findViewById(R.id.radioButtonL);
        rbH = (RadioButton) findViewById(R.id.radioButtonH);
        bRegister = (Button) findViewById(R.id.button);
        cbM = (CheckBox) findViewById(R.id.checkBoxM);
        cbC = (CheckBox) findViewById(R.id.checkBoxC);
        cbO = (CheckBox) findViewById(R.id.checkBoxO);
        cbS4 = (CheckBox) findViewById(R.id.checkBoxS4);
        cbS5 = (CheckBox) findViewById(R.id.checkBoxS5);
        tvViewT = (TextView) findViewById(R.id.textViewHN);
        tvView = (TextView) findViewById(R.id.textViewHA);
        tvViewC = (TextView) findViewById(R.id.textViewHR);
        tvViewR = (TextView) findViewById(R.id.textViewHG);
        Negara = (Spinner) findViewById(R.id.spinnerProvinsi);
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();

            }

        });
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
                doClick2();
                doClick3();
                proses();
            }
        });
    }

    private void proses() {
        // boolean valid = true;
        String name = etName.getText().toString();
        tvViewT.setText("Your Name :" + name);

        // if (name.isEmpty()) {
        //   etName.setError("You Should Insert Your Names !");
        // valid = false;
        //} else if (name.length() < 4) {
        //  etName.setError("Your Name Must Be at Least 4 Characters");
        // valid = false;}

        //return valid;
    }


    private void doClick() {
        tvView.setText("Your State :" + Negara.getSelectedItem().toString());
    }

    private void doClick2() {
        String hasilC = "Your Role : \n";
        int startlen = hasilC.length();
        if (cbM.isChecked()) hasilC += cbM.getText() + "\n";
        if (cbC.isChecked()) hasilC += cbC.getText() + "\n";
        if (cbO.isChecked()) hasilC += cbO.getText() + "\n";
        if (cbS4.isChecked()) hasilC += cbS4.getText() + "\n";
        if (cbS5.isChecked()) hasilC += cbS5.getText() + "\n";
        if (tvView.length() == startlen) hasilC += "No Role Picked!";
        tvViewC.setText("" + hasilC);
    }

    private void doClick3() {
        String hasilR = null;
        if (rbD.isChecked()) {
            hasilR = rbD.getText().toString();
        }
        if (rbL.isChecked()) {
            hasilR = rbL.getText().toString();
        }
        if (rbH.isChecked()) {
            hasilR = rbH.getText().toString();
        }
        if (rbC.isChecked()) {
            hasilR = rbC.getText().toString();
        }
        if (tvViewR == null) {
            tvViewR.setText("You must choose your Games !");
        } else {
            tvViewR.setText("Your Games : " + hasilR);
        }
    }
}
