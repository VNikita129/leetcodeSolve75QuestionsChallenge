class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
  int count =0;
      
  for (int i =0; i < flowerbed.length ; i++)
  {
    if (flowerbed[i] == 0) // to check if current position is zero
    {
        // to check if prev and next position is zero, also checking edge cases when pointer is in the first postion and last position
      if (i==0 || flowerbed[i-1]==0 && flowerbed[i+1]==0 || flowerbed[flowerbed.length-1]==0)
      count ++;
  }
}

return count >= n;
    }
}



