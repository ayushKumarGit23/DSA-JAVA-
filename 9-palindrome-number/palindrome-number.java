class Solution {
    public boolean isPalindrome(int x) {
        long rev=0;
        int dub=x;
       
        while(x>0){
            int ld=x%10;

            rev=(rev*10)+ld;

            x=x/10;
        }
        if(rev==dub){
            return true;
        }else{
            return false;
        }
        
    }
}