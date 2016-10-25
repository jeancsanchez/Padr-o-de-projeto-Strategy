package com.topracha.jeancsanchez.strategyexample.ConcreteModels;

import com.topracha.jeancsanchez.strategyexample.Behaviors.IQuackable;

/**
 * Created by jeancarlos on 10/25/16.
 */

public class WhiteQuack implements IQuackable{
    @Override
    public String quack() {
        return "White quack";
    }
}
