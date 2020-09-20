package com.soebes.examples.strategies.functions;

import static java.util.stream.Collectors.toMap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;

public interface Helper {

  static <T, K, U> Collector<T, ?, Map<K, U>> toMapWithKey(Function<? super T, ? extends K> keyMapper) {
    return toMap(keyMapper, (Function<T, U>) Function.<U>identity());
  }


}

