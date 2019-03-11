package pl.pszklarska.livedatabinding.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import pl.pszklarska.livedatabinding.R;
import pl.pszklarska.livedatabinding.databinding.ActivityMainBinding;
import pl.pszklarska.livedatabinding.viewmodel.MainVM;

/**
 * ============================================================================
 * Copyright (C) 2019 W3 Engineers Ltd - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <br>----------------------------------------------------------------------------
 * <br>Created by: Ahmed Mohmmad Ullah (Azim) on [2019-03-11 at 12:41 PM].
 * <br>----------------------------------------------------------------------------
 * <br>Project: LiveDataBinding.
 * <br>Code Responsibility: <Purpose of code>
 * <br>----------------------------------------------------------------------------
 * <br>Edited by :
 * <br>1. <First Editor> on [2019-03-11 at 12:41 PM].
 * <br>2. <Second Editor>
 * <br>----------------------------------------------------------------------------
 * <br>Reviewed by :
 * <br>1. <First Reviewer> on [2019-03-11 at 12:41 PM].
 * <br>2. <Second Reviewer>
 * <br>============================================================================
 **/
public class MainActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainVM viewModel = ViewModelProviders.of(this).get(MainVM.class);
        if (binding != null) {
            binding.setViewModel(viewModel);
            binding.setLifecycleOwner(this);
        }

    }
}