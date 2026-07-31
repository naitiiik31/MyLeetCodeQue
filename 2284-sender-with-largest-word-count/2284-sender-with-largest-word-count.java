class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<messages.length;i++){
            String[] ss=messages[i].split(" ");
            int len=ss.length;
            mp.put(senders[i],mp.getOrDefault(senders[i],0)+len);
        }
        int maxi=-1;
        String ans="";
        for(String val:mp.keySet()){
            String key=val;
            int value=mp.get(key);
            if(maxi<value){
                maxi=value;
            }
        }
        List<String> l=new ArrayList<>();
        for(String val:mp.keySet()){
            String key=val;
            int value=mp.get(key);
            if(value==maxi){
                l.add(key);
            }
        }
        Collections.sort(l);
        return l.get(l.size()-1);
    }
}