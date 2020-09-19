package com.soebes.examples.strategies.functions.two;

import static com.soebes.examples.strategies.functions.StrategyNames.FIRST;

import org.springframework.stereotype.Service;

@Service(FIRST)
public class TwoStrategyFirst implements ITwoStrategy {

  @Override
  public void executeTheThing() {
    System.out.println("TwoStrategyFirst.executeTheThing");
  }
}
