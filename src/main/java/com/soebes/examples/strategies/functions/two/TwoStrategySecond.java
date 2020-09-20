package com.soebes.examples.strategies.functions.two;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import static com.soebes.examples.strategies.functions.StrategyNames.SECOND;

@Service
@Qualifier(SECOND)
public class TwoStrategySecond implements ITwoStrategy {

  @Override
  public void executeTheThing() {
    System.out.println("TwoStrategySecond.executeTheThing");
  }
}
