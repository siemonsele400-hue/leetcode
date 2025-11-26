/**
 * 郎新博 | 2025.11.26 Day1 第2题
 * 20. 有效的括号
 * https://leetcode.cn/problems/valid-parentheses/
 * 栈的经典应用 一次AC
 */
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')      stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
