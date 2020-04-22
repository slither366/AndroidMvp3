package com.example.mymvp3.Presenters;

import com.example.mymvp3.Interactors.CalcInteractorImpl;
import com.example.mymvp3.Interfaces.IInteractor;
import com.example.mymvp3.Interfaces.IPresenter;
import com.example.mymvp3.Interfaces.IView;

public class CalcPresenterImpl implements IPresenter {

    private IView view;
    private IInteractor interactor;

    public CalcPresenterImpl(IView view) {
        this.view = view;
        interactor = new CalcInteractorImpl(this);
    }

    @Override
    public void operacion(String numberOne, String numberTwo) {
        if(view!=null){
            //Iteractor
            interactor.operacionSuma(numberOne, numberTwo);
        }
    }

    @Override
    public void showErrorPresenter(String msgError) {
        if(view!=null){
            view.showError(msgError);
        }
    }

    @Override
    public void setResultPresenter(String msgResult) {
        if(view!=null){
            view.setResult(msgResult);
        }
    }
}
