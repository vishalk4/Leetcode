// Problem statement: https://leetcode.com/problems/bulb-switcher/
// My Solution

class Solution {
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}

// Other Solutions
class Solution {
    public int bulbSwitch(int n) {
        long l = 1, r = n;
        while (l < r) {
            long k = (l + r) / 2;
            if (k * k + 2 * k < n) {
                l = k + 1;
            } else {
                r = k;
            }
        }
        return r;
    }
}
