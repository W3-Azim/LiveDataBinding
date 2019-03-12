package pl.pszklarska.livedatabinding.viewmodel;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import pl.pszklarska.livedatabinding.model.Kitty;

/**
 * ============================================================================
 * Copyright (C) 2019 W3 Engineers Ltd - All Rights Reserved.
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * <br>----------------------------------------------------------------------------
 * <br>Created by: Ahmed Mohmmad Ullah (Azim) on [2019-03-11 at 12:42 PM].
 * <br>----------------------------------------------------------------------------
 * <br>Project: LiveDataBinding.
 * <br>Code Responsibility: <Purpose of code>
 * <br>----------------------------------------------------------------------------
 * <br>Edited by :
 * <br>1. <First Editor> on [2019-03-11 at 12:42 PM].
 * <br>2. <Second Editor>
 * <br>----------------------------------------------------------------------------
 * <br>Reviewed by :
 * <br>1. <First Reviewer> on [2019-03-11 at 12:42 PM].
 * <br>2. <Second Reviewer>
 * <br>============================================================================
 **/
public class KittyRepository {
    private final Timer timer = new Timer();
    private final Random random = new Random();
    private final long period;

    public KittyRepository() {
        this.period = TimeUnit.SECONDS.toMillis(5L);
    }

    public void receiveNewKitties(final MainVM mainVM) {

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int name = random.nextInt(KittyNames.values().length);

                mainVM.update(new Kitty(KittyNames.values()[name].name(), name * 10));
            }
        }, period, period);

    }
}
