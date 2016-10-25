package com.topracha.jeancsanchez.strategyexample.Models;

import com.topracha.jeancsanchez.strategyexample.ConcreteModels.WhiteFly;
import com.topracha.jeancsanchez.strategyexample.ConcreteModels.WhiteQuack;

/**
 * Created by jeancarlos on 10/25/16.
 */

public class WhiteDuck extends Duck {

    public WhiteDuck(){
        iQuackable = new WhiteQuack();
        iFlyable = new WhiteFly();
    }
}
