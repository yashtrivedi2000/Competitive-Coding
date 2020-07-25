import java.util.Collections;
import java.util.List;

     class LeetCode120 {
        public static int minimumTotal(List<List<Integer>> triangle) {
            int sz = triangle.size();
            if (sz < 1)
                return 0;
            if (sz == 1)
                return Collections.min(triangle.get(0));
            for (int j = 1; j < sz; j++) {
                List<Integer> prevRow = triangle.get(j - 1);
                List<Integer> currRow = triangle.get(j);
                int col = currRow.size();
                currRow.set(0, prevRow.get(0) + currRow.get(0));
                currRow.set(col - 1, currRow.get(col - 1) + prevRow.get(col - 2));
                for (int k = 1; k < col - 1; k++) {
                    currRow.set(k, Math.min(currRow.get(k) + prevRow.get(k - 1), currRow.get(k) + prevRow.get(k)));
                }
            }
            return Collections.min(triangle.get(sz - 1));
        }
    }
}
