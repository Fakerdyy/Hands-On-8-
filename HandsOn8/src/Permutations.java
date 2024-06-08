import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<String> getPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        permute("", str, permutations);
        return permutations;
    }

    private static void permute(String prefix, String str, List<String> permutations) {
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), permutations);
            }
        }
    }
}
