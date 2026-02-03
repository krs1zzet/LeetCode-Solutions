class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> stack = new ArrayList<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && a < 0 && stack.get(stack.size() - 1) > 0) {
                int top = stack.get(stack.size() - 1);

                if (top < -a) {
                    stack.remove(stack.size() - 1); 
                } else if (top == -a) {
                    stack.remove(stack.size() - 1); 
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; 
                    break;
                }
            }

            if (!destroyed) {
                stack.add(a);
            }
        }

        // List -> array
        int[] result = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }
        return result;
    }
}
