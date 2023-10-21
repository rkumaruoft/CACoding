package interface_adapter.clear_users;


import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

import java.util.ArrayList;

public class ClearPresenter implements ClearOutputBoundary {
    private ClearViewModel clearViewModel;

    public ClearPresenter(){
        this.clearViewModel = new ClearViewModel();
    };
    @Override
    public void prepareSuccessView(ClearOutputData clearData) {
        String msg = "Following users Deleted: ";
        for(String s: clearData.getDeletedUsers()){
            msg += "\n" + s;
        }
        clearViewModel.showMsg(msg);
    }

    @Override
    public void prepareFailView(String error) {
        clearViewModel.showMsg(error);
    }
}
