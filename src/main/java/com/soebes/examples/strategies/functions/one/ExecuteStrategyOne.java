package com.soebes.examples.strategies.functions.one;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ExecuteStrategyOne {


  private Map<String, IOneStrategy> strategies;

  public ExecuteStrategyOne(Map<String, IOneStrategy> strategies) {
    this.strategies = strategies;
  }

  @Bean("IOneStrategy")
  public Map<String, IOneStrategy> strategies(List<IOneStrategy> oneStrategies) {
    HashMap<String, IOneStrategy> result = new HashMap<>();
    for (IOneStrategy oneStrategy : oneStrategies) {
      Qualifier annotationsByType = oneStrategy.getClass().getDeclaredAnnotation(Qualifier.class);
      String value = annotationsByType.value();
      result.put(value, oneStrategy);
    }
    result.entrySet().forEach(s -> System.out.println("k: '" + s.getKey() + "' v:'" + s.getValue() + "'"));
    return result;
  }

  public void executeStrategyOne(String name) {
    strategies.entrySet().forEach(s -> System.out.println("k:'" + s.getKey() + "' v:" + s.getValue() + "'"));
    if (!strategies.containsKey(name)) {
      throw new IllegalArgumentException("The key " + name + " does not exist.");
    }
    strategies.get(name).executeTheThing();
  }
}
