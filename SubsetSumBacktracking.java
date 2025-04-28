import java.util.*;

public class SubsetSumBacktracking {

    public static void main(String[] args) {
        int[] nums = {2, 3, 6, 7}; // Input array
        int target = 7;            // Target sum to achieve

        List<List<Integer>> result = new ArrayList<>(); // To store all subsets that sum to target

        findSubsets(nums, 0, target, new ArrayList<>(), result);

        System.out.println("Subsets that sum to " + target + ": " + result);
    }

    // Backtracking function
    static void findSubsets(int[] nums, int index, int target, List<Integer> current, List<List<Integer>> result) {
        // Base Case 1: If target becomes 0, current subset is a valid answer
        if (target == 0) {
            result.add(new ArrayList<>(current)); // Add a copy of current list to result
            return;
        }

        // Base Case 2: If we reach end of array or target becomes negative, stop recursion
        if (index >= nums.length || target < 0) {
            return;
        }

        // 1. Choose the current number (include it)
        current.add(nums[index]); // Add nums[index] to current subset
        findSubsets(nums, index, target - nums[index], current, result); // Stay at same index because we can reuse the same number

        // 2. Backtrack (remove last number added)
        current.remove(current.size() - 1); // Remove the last element to backtrack

        // 3. Move to next number (exclude current number)
        findSubsets(nums, index + 1, target, current, result);
    }
}

