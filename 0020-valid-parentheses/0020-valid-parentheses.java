class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c); // opener: remember it
            } else {
                if (stack.isEmpty())
                    return false; // failure mode 1
                char open = stack.pop();
                if (!matches(open, c))
                    return false; // your "top must match" rule
            }
        }
        return stack.isEmpty(); // failure mode 2
    }

    private boolean matches(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }
}