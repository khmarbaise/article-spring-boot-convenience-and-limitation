package com.soebes.examples.strategies.functions.one;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ExecuteStrategyOne {

  private Map<String, IOneStrategy> strategies;

  public ExecuteStrategyOne(List<IOneStrategy> strategies) {
    this.strategies = strategies.stream()
        .collect(
            toMap(k -> k.getClass().getDeclaredAnnotation(Qualifier.class).value(), identity()));
  }

  public void executeStrategyOne(String name) {
    strategies.entrySet().forEach(s -> System.out.println("k:'" + s.getKey() + "' v:" + s.getValue() + "'"));
    if (!strategies.containsKey(name)) {
      throw new IllegalArgumentException("The key " + name + " does not exist.");
    }
    strategies.get(name).executeTheThing();
  }
}
