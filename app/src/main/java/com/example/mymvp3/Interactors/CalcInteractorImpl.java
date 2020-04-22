package com.example.mymvp3.Interactors;

import com.example.mymvp3.Interfaces.IInteractor;
import com.example.mymvp3.Interfaces.IPresenter;

public class CalcInteractorImpl implements IInteractor {

    private IPresenter presenter;
    private double resultado;

    public CalcInteractorImpl(IPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void operacionSuma(String numberOne, String numberTwo) {
        if(!numberOne.equals("") && !numberTwo.equals("")){
            try {
                resultado = Double.valueOf(numberOne) + Double.valueOf(numberTwo);
                presenter.setResultPresenter(String.valueOf(resultado));
            }catch (Exception e){
                presenter.showErrorPresenter(e.getMessage());
            }

        }else{
            presenter.showErrorPresenter("Los Campos estan Vacios!");
        }
    }
}
