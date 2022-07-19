import java.util.List;
import java.util.PriorityQueue;

public class L218The_Skyline_Problem {
    class Skylinen implements Comparable<Skylinen> {
        public int lefti;
        public int righti;
        public int heighti;

        public Skylinen(int lefti, int righti, int heighti) {
            this.lefti = lefti;
            this.righti = righti;
            this.heighti = heighti;
        }

        @Override
        public int compareTo(Skylinen o) {
            return this.heighti-o.heighti;
        }
    }
//    public List<List<Integer>> getSkyline(int[][] buildings) {
//
//    }
}
