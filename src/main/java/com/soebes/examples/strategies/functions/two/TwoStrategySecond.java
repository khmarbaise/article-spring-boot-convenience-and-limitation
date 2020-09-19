package com.soebes.examples.strategies.functions.two;

import static com.soebes.examples.strategies.functions.StrategyNames.SECOND;

import org.springframework.stereotype.Service;

@Service(SECOND)
public class TwoStrategySecond implements ITwoStrategy {

  @Override
  public void executeTheThing() {
    System.out.println("TwoStrategySecond.executeTheThing");
  }
}
