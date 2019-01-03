/**
* Design a stack that supports push, pop, top, and retrieving the minimum element in constant time. 
*
* @author Atara Weinreb
*/

class MinStack {
   
    ArrayList<Integer> stack;
    ArrayList<Integer> min;
    
    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<>();
        min = new ArrayList<>();
    }
    
    public void push(int x) {
        stack.add(x);
        if (min.size() == 0) {
            min.add(x);
        }
        else if (min.get(min.size() - 1) >= x) {
            min.add(x);
        }
    }
    
    public void pop() {
        if (top() == min.get(min.size() - 1)) {
            min.remove(min.size() - 1);
        }
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
       return min.get(min.size() - 1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
