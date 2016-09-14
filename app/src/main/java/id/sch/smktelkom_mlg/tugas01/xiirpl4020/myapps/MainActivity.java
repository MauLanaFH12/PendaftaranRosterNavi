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
    TextView tvView, tvView2, tvView3, tvView4;

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
        tvView = (TextView) findViewById(R.id.textView3);
        tvView2 = (TextView) findViewById(R.id.textView7);
        tvView3 = (TextView) findViewById(R.id.textView8);
        tvView4 = (TextView) findViewById(R.id.textView9);
        Negara = (Spinner) findViewById(R.id.spinnerProvinsi);
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
                doProcess();
            }

        });
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
            }
        });
    }

    private void doProcess() {
    }

    private void doClick() {
        tvView4.setText("Your State :" + Negara.getSelectedItem().toString());
    }
}
