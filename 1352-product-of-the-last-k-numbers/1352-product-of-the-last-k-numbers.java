class ProductOfNumbers {
    ArrayList<Integer> nums = new ArrayList<>();
    public ProductOfNumbers() {
        nums.add(1);
    }
    
    public void add(int num) {
        if(num==0) {
            nums.clear();
            nums.add(1);
        } else {
            nums.add(nums.get(nums.size()-1)*num);
        }
    }
    
    public int getProduct(int k) {
        int n=nums.size();
        if(k>=n) return 0;
        return nums.get(n-1)/nums.get(n-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */