package io.rong.app.activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.sea_monster.exception.BaseException;
import com.sea_monster.network.AbstractHttpRequest;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.rong.app.R;
import io.rong.app.activity.base.BaseApiActivity;

/*
 * PROJECT_NAME :Demo-IM
 * VERSION :[V 1.0.0]
 * AUTHOR :  yulongsun 
 * CREATE AT : 8/4/2015 2:24 PM
 * COPYRIGHT : InSigma HengTian Software Ltd.
 * NOTE :
 */
public class LoginActivity extends BaseApiActivity {


    @Bind(R.id.iv_login_background)
    ImageView ivLoginBackground;
    @Bind(R.id.de_login_logo)
    ImageView deLoginLogo;
    @Bind(R.id.et_login_username)
    EditText etLoginUsername;
    @Bind(R.id.fr_login_username_delete)
    FrameLayout frLoginUsernameDelete;
    @Bind(R.id.et_login_password)
    EditText etLoginPassword;
    @Bind(R.id.fr_login_password_delete)
    FrameLayout frLoginPasswordDelete;
    @Bind(R.id.btn_login_sign_in)
    Button btnLoginSignIn;
    @Bind(R.id.tv_login_forgot_pwd)
    TextView tvLoginForgotPwd;
    @Bind(R.id.tv_login_register)
    TextView tvLoginRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //隐藏标题
        getSupportActionBar().hide();

        ButterKnife.bind(this);
    }


    @Override
    public void onCallApiSuccess(AbstractHttpRequest request, Object obj) {

    }

    @Override
    public void onCallApiFailure(AbstractHttpRequest request, BaseException e) {

    }
}
