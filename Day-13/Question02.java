// Question 02-Unique Binary Search Trees
// Given an integer n, return the number of structurally unique BST's (binary search trees) which has exactly n
//  nodes of unique values from 1 to n.




public class Question02 {
    public int numTrees(int n) {
   int [] G = new int[n+1];
   G[0] = G[1] = 1;
     
   for(int i=2; i<=n; ++i) {
     for(int j=1; j<=i; ++j) {
       G[i] += G[j-1] * G[i-j];
     }
   }
   return G[n];
 }
 }