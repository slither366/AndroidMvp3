package com.example.mymvp3.Interfaces;

public interface IPresenter {

    void operacion(String numberOne, String numberTwo);
    void showErrorPresenter(String msgError);
    void setResultPresenter(String msgResult);
}
