package com.topracha.jeancsanchez.strategyexample.ConcreteModels;

import com.topracha.jeancsanchez.strategyexample.Behaviors.IQuackable;

/**
 * Created by jeancarlos on 10/25/16.
 */

public class BlackQuack implements IQuackable{
    @Override
    public String quack() {
        return "Black quack!";
    }
}
