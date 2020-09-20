package com.soebes.examples.strategies.functions.one;

import static com.soebes.examples.strategies.functions.StrategyNames.THIRD;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(THIRD)
public class OneStrategyThird implements IOneStrategy {

  @Override
  public void executeTheThing() {
    System.out.println("OneStrategyThird.executeTheThing");
  }
}
