package com.topracha.jeancsanchez.strategyexample.Models;

import com.topracha.jeancsanchez.strategyexample.Behaviors.IFlyable;
import com.topracha.jeancsanchez.strategyexample.Behaviors.IQuackable;

/**
 * Created by jeancarlos on 10/25/16.
 */

public class Duck {
    IFlyable iFlyable;
    IQuackable iQuackable;

    public Duck(){};

    public String quack(){
        return iQuackable.quack();
    }

    public String fly(){
        return iFlyable.fly();
    }
}
