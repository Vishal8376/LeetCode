class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        char[] arr = "0123456789abcdef".toCharArray();
        StringBuilder s = new StringBuilder();

        while (num != 0) {
            int rem = num & 15;
            s.append(arr[rem]);
            num >>>= 4;
        }

        return s.reverse().toString();
    }
}
