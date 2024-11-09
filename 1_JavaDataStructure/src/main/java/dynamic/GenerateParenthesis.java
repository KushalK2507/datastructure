package dynamic;

import java.util.LinkedList;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args) {

        List<String> res = new LinkedList<>();
        StringBuilder combine = new StringBuilder();
        generate(res, 0, 0, combine, 3);

    }

    public static void generate(List<String> res, int left, int right, StringBuilder s, int n) {

        if (s.length() == n * 2) {
            res.add(s.toString());
        }

        if (left < n) {
            s.append("(");
            generate(res, left + 1, right, s, n);
            s.deleteCharAt(s.length() - 1);
        }

        if (right < left) {
            s.append(")");
            generate(res, left, right + 1, s, n);
            s.deleteCharAt(s.length() - 1);
        }


    }
}