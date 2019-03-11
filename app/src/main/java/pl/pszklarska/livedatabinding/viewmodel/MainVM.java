package pl.pszklarska.livedatabinding.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import pl.pszklarska.livedatabinding.model.Kitty;

/**
 * ============================================================================
 * Copyright (C) 2019 W3 Engineers Ltd - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <br>----------------------------------------------------------------------------
 * <br>Created by: Ahmed Mohmmad Ullah (Azim) on [2019-03-11 at 12:43 PM].
 * <br>----------------------------------------------------------------------------
 * <br>Project: LiveDataBinding.
 * <br>Code Responsibility: <Purpose of code>
 * <br>----------------------------------------------------------------------------
 * <br>Edited by :
 * <br>1. <First Editor> on [2019-03-11 at 12:43 PM].
 * <br>2. <Second Editor>
 * <br>----------------------------------------------------------------------------
 * <br>Reviewed by :
 * <br>1. <First Reviewer> on [2019-03-11 at 12:43 PM].
 * <br>2. <Second Reviewer>
 * <br>============================================================================
 **/
public class MainVM extends ViewModel {
    private final KittyRepository kittyRepository = new KittyRepository();
    private final MutableLiveData<String> kittyName = new MutableLiveData();
    private final MutableLiveData<Integer> kittyAge = new MutableLiveData();

    public final MutableLiveData getKittyName() {
        return this.kittyName;
    }

    public final MutableLiveData getKittyAge() {
        return this.kittyAge;
    }

    public MainVM() {

        kittyRepository.receiveNewKitties(this);

    }

    public void update(Kitty kitty) {
        kittyName.postValue(kitty.getName());
        kittyAge.postValue(kitty.getAge());
    }
}