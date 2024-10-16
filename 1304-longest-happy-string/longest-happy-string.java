class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int A=0;
        int B=0;
        int C=0;
        int maxLength=a+b+c;
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<maxLength){
            if(A!=2 && a>=b && a>=c || a>0 && (B == 2 || C == 2)){
                sb.append('a');
                A++;
                B=0;
                C=0;
                a--;
            }
           else if(B!=2 && b>=a && b>=c || b>0 && (A == 2 || C == 2)){
                sb.append('b');
                B++;
                A=0;
                C=0;
                b--;
            }
            else if(C!=2 && c>=b && c>=a || c>0 && (B == 2 || A == 2)){
                sb.append('c');
                C++;
                B=0;
                A=0;
                c--;
            }
            i++;
        }
        return sb.toString();
    }
}