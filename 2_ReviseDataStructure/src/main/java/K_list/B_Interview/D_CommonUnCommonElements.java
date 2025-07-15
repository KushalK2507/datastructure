package K_list.B_Interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class D_CommonUnCommonElements {

  Set<Integer> set1;
  Set<Integer> set2;

  public D_CommonUnCommonElements(Set<Integer> set1, Set<Integer> set2) {
    this.set1 = set1;
    this.set2 = set2;
  }

  public void commonUnCommonElements() {
    Map<Integer, Integer> valueToCount = new HashMap<>();
    for (int value : set1) {
      if (valueToCount.containsKey(value)) {
        int count = valueToCount.get(value) + 1;
        valueToCount.put(value, count);
      } else {
        valueToCount.put(value, 1);
      }
    }

    for (int value : set2) {
      if (valueToCount.containsKey(value)) {
        int count = valueToCount.get(value) + 1;
        valueToCount.put(value, count);
      } else {
        valueToCount.put(value, 1);
      }
    }

    System.out.println(
        "Common = "
            + valueToCount.values().stream()
                .filter(value -> value > 1)
                .collect(Collectors.toSet()));
    System.out.println(
        "UnCommon = "
            + valueToCount.values().stream()
                .filter(value -> value == 1)
                .collect(Collectors.toSet()));
  }
}
