class Solution_1482 {
    public int minDays(int[] bloomDay, int m, int k) {
        int min=1,max=0;
        for(int x:bloomDay){
            max=Math.max(max,x);
        }        
        int ans=-1;
        while(min<=max){
            int mid=min+(max-min)/2;
            int b=0,f=0;
            for(int x:bloomDay){
                if(x<=mid){
                    f++;
                }else{
                    f=0;
                }
                if(f==k){
                    b++;
                    f=0;
                }
            }
            if(b>=m){
                ans=mid;
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return ans;
    }
}