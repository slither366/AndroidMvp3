package com.example.mymvp3.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mymvp3.Interfaces.IPresenter;
import com.example.mymvp3.Interfaces.IView;
import com.example.mymvp3.Presenters.CalcPresenterImpl;
import com.example.mymvp3.R;

public class Calculadora extends AppCompatActivity implements IView {

    EditText edtNumberOne, edtNumberTwo;
    Button btnSumar;

    private IPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);

        initComponents();

        presenter = new CalcPresenterImpl(this);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumarNumeros(v);
            }
        });
    }

    private void sumarNumeros(View v){

        presenter.operacion(edtNumberOne.getText().toString(), edtNumberTwo.getText().toString());
    }

    @Override
    public void setResult(String result) {
        Toast.makeText(this, "" + result, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String msgError) {
        Toast.makeText(this, ""+ msgError, Toast.LENGTH_SHORT).show();
    }

    private void initComponents() {
        edtNumberOne = findViewById(R.id.edtNumberOne);
        edtNumberTwo = findViewById(R.id.edtNumberTwo);
        btnSumar = findViewById(R.id.btnSumar);
    }
}
