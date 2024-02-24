class Solution {
    public int minCost(String colors, int[] n) {
        int ans = 0;
        for(int i=0;i<colors.length()-1;i++){
            char a = colors.charAt(i);
            List<Integer> list = new ArrayList<Integer>();
            for(int j=i;j<colors.length();j++){
                if(colors.charAt(j) != a){
                    break;
                }
                if(j==i){
                    list.add(n[j]); 
                }
                else{
                    i++;
                    list.add(n[j]);
                }
            }
            Collections.sort(list);
            for(int k=0;k<list.size()-1;k++){
                ans += list.get(k);
            }
        }
        return ans;
    }
}
