package io.rong.app.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

/*
 * PROJECT_NAME :Demo-IM
 * VERSION :[V 1.0.0]
 * AUTHOR :  yulongsun 
 * CREATE AT : 8/4/2015 4:58 PM
 * COPYRIGHT : InSigma HengTian Software Ltd.
 * NOTE :
 */
public class EditTextHolder implements View.OnClickListener, View.OnFocusChangeListener {
    private EditText mEditText;
    private View mDeleteView;
    private OnEditTextFocusChangeListener mEditTextFocusChangeListener;
    private boolean isHashFocus = false;


    public EditTextHolder(EditText editText, View deleteView, OnEditTextFocusChangeListener listener) {
        this.mDeleteView = deleteView;
        this.mEditText = editText;
        this.mEditTextFocusChangeListener = listener;

        mDeleteView.setOnClickListener(this);
        //焦点发生变化
        mEditText.setOnFocusChangeListener(this);
        //文本长度变化
        mEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable)) {//内容为空
                    mDeleteView.setVisibility(View.GONE);
                } else {//内容为不空
                    if (isHashFocus) {//有焦点
                        mDeleteView.setVisibility(View.VISIBLE);
                    }
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        mEditText.setText("");
        mDeleteView.setVisibility(View.GONE);
    }

    @Override
    public void onFocusChange(View view, boolean b) {
        this.isHashFocus = b;

    }


    interface OnEditTextFocusChangeListener {
        void onEidtTextFocusChange(View v, boolean hashFocus);
    }


}
