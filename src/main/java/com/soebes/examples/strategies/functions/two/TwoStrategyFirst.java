package com.soebes.examples.strategies.functions.two;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import static com.soebes.examples.strategies.functions.StrategyNames.FIRST;

@Service
@Qualifier(FIRST)
public class TwoStrategyFirst implements ITwoStrategy {

  @Override
  public void executeTheThing() {
    System.out.println("TwoStrategyFirst.executeTheThing");
  }
}
