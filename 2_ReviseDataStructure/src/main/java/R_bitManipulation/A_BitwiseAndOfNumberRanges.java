package R_bitManipulation;

public class A_BitwiseAndOfNumberRanges {

  public int bitwiseAndOfNumberRanges(int left, int right) {
    var shift = 0;
    while (left < right) {
      left = left >> 1; // right shift by 1 bit --> means 7 >> 1 = 3
      right = right >> 1; // right shift by 1 bit --> 4 >> 1 = 2
      shift++;
    }

    shift = left << shift; // left shift
        return shift;
    }
}
