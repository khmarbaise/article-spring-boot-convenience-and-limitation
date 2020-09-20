package com.soebes.examples.strategies.functions.two;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toUnmodifiableMap;

@Service
public class ExecuteStrategyTwo {

  private final Map<String, ITwoStrategy> strategies;

  public ExecuteStrategyTwo(List<ITwoStrategy> strategies) {
    this.strategies = strategies.stream()
        .collect(toUnmodifiableMap(k -> k.getClass().getDeclaredAnnotation(Qualifier.class).value(), identity()));
  }

  public void executeStrategyOne(String name) {
    if (!strategies.containsKey(name)) {
      throw new IllegalArgumentException("The key " + name + " does not exist.");
    }
    strategies.get(name).executeTheThing();
  }

}
