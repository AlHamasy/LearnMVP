package id.my.asadullah.learnmvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements Viewlogin{

    @BindView(R.id.edtusername)
    EditText edtusername;
    @BindView(R.id.edtPassword)
    EditText edtPassword;
    @BindView(R.id.signIn)
    Button signIn;

    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initPresenter();
        onAttach();
    }


    private void initPresenter() {
        presenter = new LoginPresenter();

    }

    @OnClick(R.id.signIn)
    public void onViewClicked() {
        presenter.login(edtusername, edtPassword);
    }

    @Override
    public void onAttach() {
        presenter.onAttach(this);
    }

    @Override
    public void onDetach() {
        presenter.onDetach();
    }

    @Override
    public void Success() {
        Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void Error() {
        Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
    }

}