class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0, ele1 = 0, ele2 = 0;
        for(int i : nums) {
            if(count1 == 0 && i != ele2) {
                count1 = 1;
                ele1 = i;
            } else if(count2 == 0 && i != ele1) {
                count2 = 1;
                ele2 = i;
            } else if(i == ele1) {
                count1++;
            } else if(i == ele2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        int a = nums.length/3;
        int res1 = 0, res2 = 0;
        for(int i : nums) {
            if(i == ele1) res1++;
            if(i == ele2) res2++;
        }
        List<Integer> list = new ArrayList<>();
        if(res1 > a) list.add(ele1);
        if(res2 > a && !list.contains(ele2)) list.add(ele2);
        return list;
    }
}