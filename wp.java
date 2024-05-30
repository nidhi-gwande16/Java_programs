class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map= new HashMap<>();
        Set<String> set=new HashSet<>();

        String[] a1=s.split(" ");
        int n=a1.length;
        if(n!=pattern.length())
        return false;

        for(int i=0;i<n;i++){
            String word=a1[i];
            char ch=pattern.charAt(i);

            if(map.containsKey(ch))
            {
                if(!map.get(ch).equals(word))
                return false;
            }
            else
            {
                if(set.contains(word))
                return false;

                else
                {
                map.put(ch,word);
                set.add(word);
                }
            }
        }
        return true;
    }
}
