package com.soebes.examples.strategies.functions.one;

import static com.soebes.examples.strategies.functions.StrategyNames.SECOND;

import org.springframework.stereotype.Service;

@Service(SECOND)
public class OneStrategySecond implements IOneStrategy {

  @Override
  public void executeTheThing() {
    System.out.println("OneStrategySecond.executeTheThing");
  }
}
