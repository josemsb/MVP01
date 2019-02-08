package com.appgrouplab.calculadora.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.appgrouplab.calculadora.R;
import com.appgrouplab.calculadora.presenter.MainActivityPresenter;
import com.appgrouplab.calculadora.presenter.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements  MainActivityView {

    private EditText edNumero01;
    private EditText edNumero02;
    private TextView txtResultado;

    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNumero01 = findViewById(R.id.txtNumero1);
        edNumero02 = findViewById(R.id.txtNumero2);
        txtResultado = findViewById(R.id.txtResultado);

        presenter = new MainActivityPresenterImpl(this);

    }


    public void suma(View view)
    {
        String number1=edNumero01.getText().toString();
        String number2=edNumero02.getText().toString();
        presenter.sumar(number1,number2);
    }

    @Override
    public void showResult(String result) {
        txtResultado.setText(result);
    }

    @Override
    public void showError(String error) {
        txtResultado.setText(error);
    }
}
