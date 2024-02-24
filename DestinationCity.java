class Solution {
    public String destCity(List<List<String>> paths) {
        for(int i=0;i<paths.size();i++){
            String last;
            last = paths.get(i).get(1);
            int count = 0;
            for(int j=0;j<paths.size();j++){
                if(paths.get(j).get(0).equals(last)){
                    count++;
                    break;
                }  
            }
            if(count == 0){
                return last;
            }
        }
        return "0";     
    }
}
