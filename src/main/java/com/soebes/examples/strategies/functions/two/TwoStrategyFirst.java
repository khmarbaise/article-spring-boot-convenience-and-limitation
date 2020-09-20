package com.soebes.examples.strategies.functions.two;

import static com.soebes.examples.strategies.functions.StrategyNames.FIRST;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier(FIRST)
public class TwoStrategyFirst implements ITwoStrategy {

  @Override
  public void executeTheThing() {
    System.out.println("TwoStrategyFirst.executeTheThing");
  }
}
