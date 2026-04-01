package Challenge75_new.Day1;
/*Problem: Given an array nums, find all unique triplets [a, b, c] such that a + b + c = 0.*/

public class ThreeSum {
}






/*nums = [-5, -3, -1, 0, 2, 3, 4, 6]
After sorting (already sorted here), we need triplets that sum to 0.
Let me walk you through each triplet found 🔍
Fix i = -5, L starts at -3, R starts at 6

-5 + -3 + 6 = -2 → too small → move L right
-5 + -1 + 6 = 0 ✅ → found [-5, -1, 6]
-5 + 0 + 6 = 1 → too big → move R left
-5 + 0 + 3 = -2 → too small → move L right
-5 + 2 + 3 = 0 ✅ → found [-5, 2, 3]

Fix i = -3, L starts at -1, R starts at 6

-3 + -1 + 6 = 2 → too big → move R left
-3 + -1 + 4 = 0 ✅ → found [-3, -1, 4]
-3 + 0 + 4 = 1 → too big → move R left
-3 + 0 + 3 = 0 ✅ → found [-3, 0, 3]

Fix i = -1, L starts at 0, R starts at 6

-1 + 0 + 6 = 5 → too big → keep moving R left...
Eventually L meets R → stop

Fix i = 0 → nums[i] = 0, remaining are all positive → sum always > 0 → stop early ✅
Final answer: [-5,-1,6], [-5,2,3], [-3,-1,4], [-3,0,3]*/