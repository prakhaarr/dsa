class MyQueue {

    Stack < Integer > input = new Stack <> ();
    Stack < Integer > output = new Stack <> ();

    public MyQueue() {
       
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if (output.empty())
            while (input.empty() == false) {
                output.push(input.peek());
                input.pop();
            }


        int x = output.peek();
        output.pop();
        return x;
        
    }
    
    public int peek() {
        if(output.isEmpty()){
            while(input.isEmpty()==false){
                output.push(input.peek());
                input.pop();
            }

        }

        return output.peek();
    }

    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */