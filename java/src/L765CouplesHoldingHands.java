public class L765CouplesHoldingHands {

//    greedy
    public int minSwapsCouples(int[] row) {
        int count = 0;
        int couple;
        for (int i = 0; i < row.length; i = i+2) {
            if (row[i] % 2 == 0) {
                couple = row[i] + 1;
            } else {
                couple = row[i] - 1;
            }

            for (int j = i + 1; j < row.length; j++) {
                if (row[j] == couple) {
                    if ((i + 1) != j) {
                        count++;
                        int temp = row[i + 1];
                        row[i + 1] = row[j];
                        row[j] = temp;
                    }
                break;
                }
            }
        }
        return count;
    }


}
