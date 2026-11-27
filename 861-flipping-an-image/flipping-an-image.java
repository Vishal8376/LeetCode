class Solution {
    public void reverse(int[] arr){
        int left = 0;
        int right = arr.length -1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public void flip(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
    }

    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image)
            reverse(row);
        
        for(int[] row : image)
            flip(row);
        
        return image;
    }
}