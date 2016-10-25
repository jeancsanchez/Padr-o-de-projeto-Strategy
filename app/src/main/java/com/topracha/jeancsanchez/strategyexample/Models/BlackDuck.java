package com.topracha.jeancsanchez.strategyexample.Models;


import com.topracha.jeancsanchez.strategyexample.ConcreteModels.BlackFly;
import com.topracha.jeancsanchez.strategyexample.ConcreteModels.BlackQuack;

/**
 * Created by jeancarlos on 10/25/16.
 */

public class BlackDuck extends Duck {

    public BlackDuck(){
        iFlyable = new BlackFly();
        iQuackable = new BlackQuack();
    }
}
