package use_case.clear_users;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject,
                           ClearOutputBoundary userPresenter) {
        this.userDataAccessObject = userDataAccessObject;
        this.userPresenter = userPresenter;
    }

    @Override
    public void execute() {
        ArrayList<String> usersDeleted = userDataAccessObject.delete_all();
        if(!usersDeleted.isEmpty()){
            userPresenter.prepareSuccessView(new ClearOutputData(usersDeleted));
        }
        else {
            userPresenter.prepareFailView("No users to Delete.");
        }
    }
}
