class Solution {
    public String findLatestTime(String s) {
        char[] conv = s.toCharArray();
        int i=1;
        while(i!=5){

        if(conv[0]=='?' && conv[1]=='?'){
            conv[0]='1';
            conv[1]='1';
        }    
        if(conv[0]=='?'){
            conv[0] = '1';
            if(conv[0]=='1' && conv[1] >='2' ){
                conv[0]= '0';
            }
        }
        else if(conv[0]=='1' && conv[1]=='?'){
            conv[1] = '1';
        }
        else if(conv[0]=='0' && conv[1]=='?'){
            conv[1] = '9';
        }
        if(conv[3]=='?'){
            conv[3] = '5';
        }
        else if(conv[4]=='?'){
            conv[4]='9';
        }
        i++;
        }
        String str = new String(conv);
        return str;
    }
}