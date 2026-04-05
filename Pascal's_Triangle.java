/*
Given an integer n, return the first n (1-Indexed) rows of Pascal's triangle.

In Pascal's triangle:
The first row has one element with a value of 1.
Each row has one more element in it than its previous row.
The value of each element is equal to the sum of the elements directly above it when arranged in a triangle format.

Example 1
Input: n = 4
Output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]
Explanation: The Pascal's Triangle is as follows:
1
1 1
1 2 1
1 3 3 1
1st Row has its value set to 1.
All other cells take their value as the sum of the values directly above them

Example 2
Input: n = 5
Output: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
Explanation: The Pascal's Triangle is as follows:
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1st Row has its value set to 1.
All other cells take their value as the sum of the values directly above them

Example 3
Input: n = 3
Output:
[[1], [1, 1], [1, 2, 1]] 
*/

class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> finalOutput = new ArrayList<>();

        for(int row = 1; row <= n; row++){
            finalOutput.add(generateRow(row));
        }

        return finalOutput;
    }


    public List<Integer> generateRow(int row){
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        
        ansRow.add(1);

        for(int col = 1; col < row; col++){
            ans = (ans * (row - col))/col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
}

// Time Complexity : O(n^2)

// Remember : ( ans * (row - col) )/ col 