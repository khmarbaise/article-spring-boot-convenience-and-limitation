package com.soebes.examples.strategies.functions.one;

import static com.soebes.examples.strategies.functions.StrategyNames.FIRST;

import org.springframework.stereotype.Service;

@Service(FIRST)
public class OneStrategyFirst implements IOneStrategy {

  @Override
  public void executeTheThing() {
    System.out.println("OneStrategyFirst.executeTheThing");
  }
}