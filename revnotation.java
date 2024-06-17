class String {
    public int evalRPN(String[] tokens) {
      Stack<Integer> st=new Stack<>();
      String operators="+-*/";

      for(String token:tokens)
      {
        if(operators.indexOf(token)!=-1)
        {
            int a1=st.pop();
             int a2=st.pop();
             int ans=0;
             if(token.equals("+"))
                ans=a2+a1;
            else if(token.equals("-"))
                ans=a2-a1;
            else if(token.equals("*"))
                ans=a2*a1;
            else if(token.equals("/"))
                ans=a2/a1;
            st.push(ans);
            }
        else
            st.push(Integer.parseInt(token));
        } 
      return st.pop();
    }
}
