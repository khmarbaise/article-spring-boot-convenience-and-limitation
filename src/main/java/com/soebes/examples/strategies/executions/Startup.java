package com.soebes.examples.strategies.executions;

import com.soebes.examples.strategies.functions.StrategyNames;
import com.soebes.examples.strategies.functions.one.ExecuteStrategyOne;
import com.soebes.examples.strategies.functions.two.ExecuteStrategyTwo;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class Startup {

  private ExecuteStrategyOne executeStrategyOne;
  private ExecuteStrategyTwo executeStrategyTwo;

  public Startup(ExecuteStrategyOne executeStrategyOne, ExecuteStrategyTwo executeStrategyTwo) {
    this.executeStrategyOne = executeStrategyOne;
    this.executeStrategyTwo = executeStrategyTwo;
  }

  @EventListener(ApplicationReadyEvent.class)
  public void applicationReadyEvent() {
    executeStrategyOne.executeStrategyOne(StrategyNames.FIRST);
    executeStrategyTwo.executeStrategyOne(StrategyNames.FIRST);
  }

}
