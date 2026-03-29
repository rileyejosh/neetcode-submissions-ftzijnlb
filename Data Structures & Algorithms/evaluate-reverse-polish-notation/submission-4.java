class Solution {
    
    private boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
    }
}

    public int evalRPN(String[] tokens) {
        Stack<Integer> operand = new Stack<>();
        
        int num1=0;
        int num2=0;
        for(String t : tokens) {
            if(isDigit(t)) {
                operand.push(Integer.parseInt(t));
            } else {
                switch(t) {
                    case "+":
                         num2 = operand.pop();
                         num1 = operand.pop();
                        operand.push(num1 + num2);
                        break;
                    case "-":
                         num2 = operand.pop();
                        num1 = operand.pop();
                        operand.push(num1- num2);
                        break;
                    case "*":
                         num2 = operand.pop();
                         num1 = operand.pop();
                        operand.push(num1*num2);
                        break;
                    case "/":
                         num2 = operand.pop();
                         num1 = operand.pop();
                        operand.push(num1/num2);
                        break;
                }                
            }
            
        }
        return operand.pop();
    }
}
