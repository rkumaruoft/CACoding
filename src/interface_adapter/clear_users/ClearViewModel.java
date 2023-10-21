package interface_adapter.clear_users;

import javax.swing.*;
import java.util.ArrayList;

public class ClearViewModel {

    public ClearViewModel() {
    }

    public void showMsg(String msg){
        JOptionPane.showMessageDialog(new JFrame(), msg);
    }
}
