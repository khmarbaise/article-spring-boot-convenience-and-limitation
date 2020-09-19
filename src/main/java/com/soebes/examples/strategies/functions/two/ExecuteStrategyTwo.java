package com.soebes.examples.strategies.functions.two;

import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class ExecuteStrategyTwo {

  private Map<String, ITwoStrategy> strategies;

  public ExecuteStrategyTwo(Map<String, ITwoStrategy> strategies) {
    this.strategies = strategies;
  }

  public void executeStrategyOne(String name) {
    strategies.entrySet().forEach(s -> System.out.println("k:'" + s.getKey() + "' v:" + s.getValue() + "'"));
    if (!strategies.containsKey(name)) {
      throw new IllegalArgumentException("The key " + name + " does not exist.");
    }
    strategies.get(name).executeTheThing();
  }

}
