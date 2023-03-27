strs=["flower","flow","flight"] #output "fl"
# strs=["a"] output "a"
# strs=["rac","hef","kil"] output ""
# def longestCommonPrefix(self, strs: List[str]) -> str:
if len(strs)>1:

    l1=len(strs[0])
    l2=len(strs[1])
    d=""
    i=0
    while(i<l1 and i<l2):
        if strs[0][i]==strs[1][i]:
            d=d+strs[0][i]
            i+=1
        else:
            break
    if( len(d)!=0 and len(strs)>2):
        for i in range(2,len(strs)):
            s=d
            d=""
            k=0
            while (k<len(strs[i])and k<len(s)):
                f=0
                if strs[i][k]==s[k]:
                    d=d+strs[i][k]
                    k+=1
                else:
                    f=1
                    break
        return d
    else:
        return d
else:
    return strs[0]