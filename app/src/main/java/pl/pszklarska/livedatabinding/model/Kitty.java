package pl.pszklarska.livedatabinding.model;

/**
 * ============================================================================
 * Copyright (C) 2019 W3 Engineers Ltd - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <br>----------------------------------------------------------------------------
 * <br>Created by: Ahmed Mohmmad Ullah (Azim) on [2019-03-11 at 12:39 PM].
 * <br>----------------------------------------------------------------------------
 * <br>Project: LiveDataBinding.
 * <br>Code Responsibility: <Purpose of code>
 * <br>----------------------------------------------------------------------------
 * <br>Edited by :
 * <br>1. <First Editor> on [2019-03-11 at 12:39 PM].
 * <br>2. <Second Editor>
 * <br>----------------------------------------------------------------------------
 * <br>Reviewed by :
 * <br>1. <First Reviewer> on [2019-03-11 at 12:39 PM].
 * <br>2. <Second Reviewer>
 * <br>============================================================================
 **/
public class Kitty {

    private final String name;
    private final int age;

    public final String getName() {
        return this.name;
    }

    public final int getAge() {
        return this.age;
    }

    public Kitty(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
