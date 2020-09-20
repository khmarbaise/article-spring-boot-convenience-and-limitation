package com.soebes.examples.strategies.functions.two;

import static com.soebes.examples.strategies.functions.StrategyNames.THIRD;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(THIRD)
public class TwoStrategyThird implements ITwoStrategy {

  @Override
  public void executeTheThing() {
    System.out.println("TwoStrategyThird.executeTheThing");
  }
}
