class parenthesis {
    public char getVal(char ch){
        switch(ch)
        {
            case ']': return '[';
            case '}': return '{';
            case ')': return '(';
            default : return ' ';

        }
    }
    public boolean isValid(String s) {
        String opening="({[";
        String closing="]})";
        Stack<Character> stk=new Stack<>();

        for(char ch:s.toCharArray())
        {
            if(opening.indexOf(ch)!=-1)
            stk.push(ch);
            else{
                if(stk.size()==0) return false;
                char temp=stk.pop();
                if(getVal(ch)!=temp)
                return false;

            }

        }
        return stk.size()==0;
        
    }
}
