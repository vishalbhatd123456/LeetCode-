class Solution {
    public int firstUniqChar(String s) {
//      int count[] = new int[26] ;
    
//         for(int i=0;i<s.length();i++)
//         {
//             int index = s.charAt(i)-'a';
//             count[index]++;
//         }
        
//         for(int i=0;i<s.length();i++)
//         {
//             int index = s.charAt(i)-'a';
//             if(count[index] == 1)
//             {
//                 return i;
//             }
//         }
//         return -1;
        int answer = Integer.MAX_VALUE;
        
        for(char c = 'a';c<='z';++c)
        {
            int index = s.indexOf(c);
            if(index!=-1 && index == s.lastIndexOf(c))
            {
                answer = Math.min(answer,index);
            }
        }
        return answer == Integer.MAX_VALUE?-1:answer;
   }
}
