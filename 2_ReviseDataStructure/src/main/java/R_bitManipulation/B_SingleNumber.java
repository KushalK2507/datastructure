package R_bitManipulation;

public class B_SingleNumber {
  /*
  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
  You must implement a solution with a linear runtime complexity and use only constant extra space.
   */

  public int singleNumber(int[] a) {
    var result = 0;
    for (int num : a) {
      result = result ^ num;
    }
        return result;
    }
}
