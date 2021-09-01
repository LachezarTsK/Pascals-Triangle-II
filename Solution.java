import java.util.List;
import java.util.ArrayList;

public class Solution {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();
        row.add(1);

        if (rowIndex == 0) {
            return row;
        }

        while (rowIndex-- > 0) {

            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);

            for (int i = 1; i < row.size(); i++) {
                currentRow.add(row.get(i - 1) + row.get(i));
            }
            currentRow.add(1);
            row = currentRow;
        }
        return row;
    }
}
