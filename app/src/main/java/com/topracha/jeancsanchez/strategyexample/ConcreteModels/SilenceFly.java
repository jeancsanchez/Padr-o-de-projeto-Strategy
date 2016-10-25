package com.topracha.jeancsanchez.strategyexample.ConcreteModels;

import com.topracha.jeancsanchez.strategyexample.Behaviors.IFlyable;

/**
 * Created by jeancarlos on 10/25/16.
 */

public class SilenceFly implements IFlyable {
    @Override
    public String fly() {
        return "";
    }
}
