package com.soebes.examples.strategies.functions.one;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import static com.soebes.examples.strategies.functions.StrategyNames.SECOND;

@Service
@Qualifier(SECOND)
public class OneStrategySecond implements IOneStrategy {

  @Override
  public void executeTheThing() {
    System.out.println("OneStrategySecond.executeTheThing");
  }
}
