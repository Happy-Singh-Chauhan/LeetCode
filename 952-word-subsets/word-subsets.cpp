class Solution {
public:
    vector<string> wordSubsets(vector<string>& words1, vector<string>& words2) {
        int n=words1.size(),m=words2.size();
        vector<vector<int>>hsh1(n,vector<int>(26,0));
        for(int i=0;i<n;i++){
            for(char ch:words1[i]) hsh1[i][(int)ch-97]++;
        }
        vector<int>hsh2(26,0);
        for(int i=0;i<m;i++){
            vector<int>temp(26,0);
            for(char ch:words2[i]) temp[(int)ch-97]++;
            for(int i=0;i<26;i++){
                hsh2[i]=max(hsh2[i],temp[i]);
            }
        }
        
        
        vector<string>ans;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<26;j++){
                if(hsh1[i][j]>=hsh2[j]) cnt++;
            }
            cout<<cnt<<" "<<words1[i]<<"\n";
            if(cnt==26) ans.push_back(words1[i]);
        }
        return ans;
    }
};