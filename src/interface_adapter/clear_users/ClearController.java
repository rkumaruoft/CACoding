package interface_adapter.clear_users;
import use_case.clear_users.ClearInputBoundary;
public class ClearController {
    final ClearInputBoundary clearUseCase;

    public ClearController(ClearInputBoundary clearUseCase) {
        this.clearUseCase = clearUseCase;
    }
    public void execute(){
        clearUseCase.execute();
    }
}
