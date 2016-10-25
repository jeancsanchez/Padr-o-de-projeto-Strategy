package com.topracha.jeancsanchez.strategyexample.Models;

import com.topracha.jeancsanchez.strategyexample.ConcreteModels.SilenceFly;
import com.topracha.jeancsanchez.strategyexample.ConcreteModels.SilenceQuack;

/**
 * Created by jeancarlos on 10/25/16.
 */

public class PlasticDuck extends Duck {

    public PlasticDuck(){
        iQuackable = new SilenceQuack();
        iFlyable = new SilenceFly();
    }
}
