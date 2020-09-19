package com.soebes.examples.strategies.functions.one;

import static com.soebes.examples.strategies.functions.StrategyNames.THIRD;

import org.springframework.stereotype.Service;

@Service(THIRD)
public class OneStrategyThird implements IOneStrategy {

  @Override
  public void executeTheThing() {
    System.out.println("OneStrategyThird.executeTheThing");
  }
}
