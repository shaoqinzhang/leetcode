public class L679_24Game {
    public boolean judgePoint24(int[] cards) {
        double[] temp = new double[4];
        for (int i = 0; i < 4; i++) {
            temp[i] = (double) cards[i];
        }
        return judgePoint24_core(temp, 4);

    }

    public boolean judgePoint24_core(double[] cards,int size) {
        if (size == 1 ) {
            return Math.abs(cards[0] - 24) <1e-6;
        }
        boolean res = false;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                double[] temp = new double[size];
                for (int m = 0; m < size; m++) {
                    temp[m] = cards[m];
                }
                temp[j] = temp[size - 1];
                double num = cards[i] + cards[j];
                temp[i] = num;
                res = judgePoint24_core(temp,size-1);
                if (!res) {
                    num = cards[i] - cards[j];
                    temp[i] = num;
                    res = judgePoint24_core(temp,size-1);
                }
                if (!res) {
                    num = cards[j] - cards[i];
                    temp[i] = num;
                    res = judgePoint24_core(temp,size-1);
                }
                if (!res) {
                    num = cards[i] * cards[j];
                    temp[i] = num;
                    res = judgePoint24_core(temp,size-1);
                }
                if (!res&&Math.abs(cards[j])>1e-6) {
                    num = cards[i] / cards[j];
                    temp[i] = num;
                    res = judgePoint24_core(temp,size-1);
                }
                if (!res&&Math.abs(cards[i])>1e-6) {
                    num = cards[j] / cards[i];
                    temp[i] = num;
                    res = judgePoint24_core(temp,size-1);
                }
                if(res){
                    return res;
                }
            }
        }
        return res;
    }
}
