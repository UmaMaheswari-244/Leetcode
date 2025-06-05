class Solution {
    public int romanToInt(String s) {
        int i=0, c=0;
        while(i<s.length()){
            if(s.charAt(i)=='I' && i+1 < s.length() && s.charAt(i+1)=='V'){
                i+=1;
                c+=4;
            }
            else if(s.charAt(i)=='I' && i+1 < s.length() && s.charAt(i+1)=='X'){
                i+=1;
                c+=9;
            }
            else if(s.charAt(i)=='X' && i+1 < s.length() && s.charAt(i+1)=='L'){
                i+=1;
                c+=40;
            }
            else if(s.charAt(i)=='X' && i+1 < s.length() && s.charAt(i+1)=='C'){
                i+=1;
                c+=90;
            }
            else if(s.charAt(i)=='C' && i+1 < s.length() && s.charAt(i+1)=='D'){
                i+=1;
                c+=400;
            }
            else if(s.charAt(i)=='C' && i+1 < s.length() && s.charAt(i+1)=='M'){
                i+=1;
                c+=900;
            }
            else{
                switch(s.charAt(i)){
                    case 'I':
                        c++;
                        break;
                    case 'V':
                        c+=5;
                        break;
                    case 'X':
                        c+=10;
                        break;
                    case 'L':
                        c+=50;
                        break;
                    case 'C':
                        c+=100;
                        break;
                    case 'D':
                        c+=500;
                        break;
                    case 'M':
                        c+=1000;
                        break;
                }
            }
            i++;
        }
        return c;
    }
}