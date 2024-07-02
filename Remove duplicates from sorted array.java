class Solution {
    public int removeDuplicates(int[] arr) {
        int count=0;
        for(int j=0;j<arr.length-1;j++){
            if( arr[j]==arr[j+1]){ //if elements are same, continue
                continue;

            }
            else
            {
                arr[count] = arr[j]; //else add in array
                count++; // counter for unique elements
            }
             arr[count]  = arr[arr.length-1];  // to add last element in array          

        }
        return count+1; // need to do +1 because we have to add last element in count 
    }
      
    }

