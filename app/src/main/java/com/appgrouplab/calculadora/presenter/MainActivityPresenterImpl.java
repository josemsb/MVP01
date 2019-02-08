package com.appgrouplab.calculadora.presenter;

import com.appgrouplab.calculadora.interactor.MainActivityInteractor;
import com.appgrouplab.calculadora.interactor.MainActivityInteractorImpl;
import com.appgrouplab.calculadora.view.MainActivityView;

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityView activityView;
    private MainActivityInteractor interactor;

    public MainActivityPresenterImpl(MainActivityView activityView) {
        this.activityView = activityView;
        interactor = new MainActivityInteractorImpl(this);
    }

    @Override
    public void sumar(String number1, String number2) {
        interactor.sumar(number1,number2);
    }

    @Override
    public void showError(String error) {
        activityView.showError(error);

    }

    @Override
    public void showResult(String result) {
        activityView.showResult(result);
    }
}
