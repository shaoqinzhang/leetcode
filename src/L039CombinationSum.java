import java.util.*;

public class L039CombinationSum {
    private List<List<Integer>> res = new ArrayList<>();
    private int[] candidates;
    private int len;

    private void findCombinationSum(int residue, int start, Stack<Integer> pre) {
        if (residue == 0) {
//             Java �пɱ���������ô��ݣ������Ҫ����ǰ path ���ֵ��������
            res.add(new ArrayList<>(pre));
            return;
        }
        // �Ż���ӵĴ���2����ѭ����ʱ�����жϣ���������ϵͳջ�����
        // residue - candidates[i] ��ʾ��һ�ֵ�ʣ�࣬�����һ�ֵ�ʣ�඼С�� 0 ����û�б�Ҫ���к����ѭ����
        // ��һ�����ԭʼ���������������ǰ�ᣬ��Ϊ�����������ʣ�ֻ࣬��Խ��ԽС
        for (int i = start; i < len && residue - candidates[i] >= 0; i++) {
            pre.add(candidates[i]);
            // ���ؼ�����ΪԪ�ؿ����ظ�ʹ�ã�����ݹ鴫����ȥ���� i ������ i + 1
            findCombinationSum(residue - candidates[i], i, pre);
            pre.pop();
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int len = candidates.length;
        if (len == 0) {
            return res;
        }
        // �Ż���ӵĴ���1���ȶ��������򣬿�����ǰ��ֹ�ж�
        Arrays.sort(candidates);
        this.len = len;
        this.candidates = candidates;
        findCombinationSum(target, 0, new Stack<>());
        return res;
    }

//    ���ߣ�liweiwei1419
//    ���ӣ�https://leetcode-cn.com/problems/two-sum/solution/hui-su-suan-fa-jian-zhi-python-dai-ma-java-dai-m-2/
//    ��Դ�����ۣ�LeetCode��
//    ����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Set<List<Integer>>> map = new HashMap<>();
        //��candidates�����������
        Arrays.sort(candidates);
        int len = candidates.length;
        for(int i = 1;i <= target;i++){
            //��ʼ��map
            map.put(i,new HashSet<>());
            //��candidates�������ѭ��
            for(int j = 0;j < len&&candidates[j] <= target;j++){
                if(i == candidates[j]){
                    //��ȼ�Ϊ���Ϊ0�������ֱ�Ӽ���set���ϼ���
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    map.get(i).add(temp);
                }else if(i > candidates[j]){
                    //i-candidates[j]��map��key
                    int key = i-candidates[j];
                    //ʹ�õ������Զ�Ӧkey��set���Ͻ��б���
                    //���candidates���鲻�������keyֵ����Ӧ��set���ϻ�Ϊ�գ������ﲻ��Ҫ�������ж�
                    for(Iterator iterator = map.get(key).iterator();iterator.hasNext();){
                        List list = (List) iterator.next();
                        //set���������ÿһ��list��Ҫ����candidates[j]��Ȼ����뵽��iΪkey�ļ�����
                        List tempList = new ArrayList<>();
                        tempList.addAll(list);
                        tempList.add(candidates[j]);
                        //������Ϊ��ͨ��set����ȥ��
                        Collections.sort(tempList);
                        map.get(i).add(tempList);
                    }
                }
            }
        }
        result.addAll(map.get(target));
        return result;
    }

//    ���ߣ�chun-meng-da-xiao-yang
//    ���ӣ�https://leetcode-cn.com/problems/two-sum/solution/chao-qiang-gifzhu-ni-shi-yong-dong-tai-gui-hua-qiu/
//    ��Դ�����ۣ�LeetCode��
//    ����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
    public static void main(String[] args){
        int[] candidates = {2,3,5};
        int target = 8;
        int[] candidates2 = {2,3,6,7};
        target = 7;
        L039CombinationSum solution = new L039CombinationSum();
        for(List<Integer> line :solution.combinationSum(candidates,8)){
            for (int x:line){
                System.out.print(x+", ");
            }
            System.out.println();
        }

    }


}
