package com.appgrouplab.calculadora.presenter;

public interface MainActivityPresenter {

    void sumar(String  number1, String number2); //Interactor

    void showError(String error); //view
    void showResult(String result); //view

}
