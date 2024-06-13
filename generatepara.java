class String {
    public List<String> generateParenthesis(int n) {
         List<String> ans= new ArrayList<>();
         solve(n,n, new StringBuilder() ,ans);
         return ans;
    }
    private void solve(int a, int b, final StringBuilder sb, List<String> ans){ 
        if(a==0 && b==0)
        {
            ans.add(sb.toString());
            return;
        }
        if(a>0){
            sb.append("(");
            solve(a- 1, b, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(a<b){
            sb.append(")");
            solve(a, b-1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
