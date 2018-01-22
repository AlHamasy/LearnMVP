package id.my.asadullah.learnmvp;

import android.view.View;
import android.widget.EditText;

import id.my.asadullah.learnmvp.base.BasePresenter;

/**
 * Created by asadullah on 1/22/18.
 */

public class LoginPresenter implements BasePresenter <Viewlogin> {

    Viewlogin model;

    @Override
    public void onAttach(Viewlogin view) {
        model = view;
    }

    public void login (EditText email, EditText password){

        String getemail = email.getText().toString();
        String getpassword = password.getText().toString();

        if (getemail.isEmpty() || getpassword.isEmpty()){
            model.Error();
        }
        else if (getemail.equals("test") && getpassword.equals("test")){
            model.Success();
        }
        else {
            model.Error();
        }

    }

    @Override
    public void onDetach() {
        model = null;

    }
}
