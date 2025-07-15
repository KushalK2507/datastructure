package C_arrays.B_AdvanceArray;

public class N_NumberToRoman {

  int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
  String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

  public String numberToRoman(int num) {
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < numbers.length; i++) {
      var digit = num / numbers[i];
      while (digit > 0) {
        res.append(roman[i]);
        digit--;
      }
      num = num % numbers[i];
    }
    return res.toString();
  }
}
