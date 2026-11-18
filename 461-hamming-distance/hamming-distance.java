class Solution {
    public void convertToBin(int num , StringBuilder s){
        while(num > 0){
            int rem = num % 2;
            s.insert(0 , String.valueOf(rem));
            num /= 2;
        }
    }
    public int hammingDistance(int x, int y) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();

        convertToBin(x , one);
        convertToBin(y , two);

        
        while(two.length() > one.length()){
            one.insert(0 , String.valueOf(0));
        }

        while(two.length() < one.length()){
            two.insert(0 , String.valueOf(0));
        }
        
        int count = 0;
        int i = 0;
        while(i < one.length() && i < two.length()){
            if(one.charAt(i) != two.charAt(i))
                count++;
            i++;
        }
        System.out.print(one + "\n" + two);
        return count;
    }
}