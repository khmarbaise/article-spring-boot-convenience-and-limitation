package com.soebes.examples.strategies.functions.one;

import static com.soebes.examples.strategies.functions.Helper.toMapWithKey;

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
            toMapWithKey(k -> k.getClass().getDeclaredAnnotation(Qualifier.class).value()));
  }

  public void executeStrategyOne(String name) {
    strategies.entrySet().forEach(s -> System.out.println("k:'" + s.getKey() + "' v:" + s.getValue() + "'"));
    if (!strategies.containsKey(name)) {
      throw new IllegalArgumentException("The key " + name + " does not exist.");
    }
    strategies.get(name).executeTheThing();
  }
}
