class CustomStack {
    private int[] arr;
    private int topIndex;

    public CustomStack(int maxSize) {
        arr=new int[maxSize];
        topIndex=-1;
    }
    
    public void push(int x) {
        if(topIndex < arr.length-1){
            arr[++topIndex]=x;
        }
    }
    
    public int pop() {
        if(topIndex >= 0){
            return arr[topIndex--];
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        int limit=Math.min(k,topIndex+1);
        for(int i=0;i<limit;i++){
            arr[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */