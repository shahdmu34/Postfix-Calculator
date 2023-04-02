package application;

import java.util.Stack;
//author : Shahd Mustafa


public class PostFixCalc {
	//postfix function to be used in controller
	public static int evaluate(String userInput) {
		
		Stack<String> st = new Stack<>(); //stack holds the values 
		
		
		 
		int num1;   //intillizing the number variables
		int num2;
	
		for(int i = 0; i < userInput.length(); i++) {       //loops through the input 
			char c = userInput.charAt(i);        //  catches the operands
			num1 = 0;
			num2 = 0;
			
			
			int result = 0;
			if(c == ' ') {
				continue;  //reads till space is found
			}
			else if(Character.isDigit(c)) { //check for the operand in second index
				
				int n = 0;
				while(Character.isDigit(c)) { //storing the operand in the number value 
					n = n* 10 + (int)(c - '0');
					i++;
					c = userInput.charAt(i);
				}
				i--;
				st.push(Integer.toString(n)); //pushing to stack
			}
			else {
				
			//plus operand 
			if(c == '+') {
				//popping the values in the stack
					num2 = Integer.parseInt(st.pop());
					num1 =  Integer.parseInt(st.pop());
					
					result = num2 + num1;      //eqn for addition
					st.push(Integer.toString(result));      //pushing the result to stack
					}
			else if(c == '-') { //subtracting operand
					num2 = Integer.parseInt(st.pop());
					num1 =  Integer.parseInt(st.pop());       //popping the values to stack
					
					result = num1 - num2;     //eqn for subtraction
					st.push(Integer.toString(result));      //pushing the result to stack
			}else if(c == '*') {             //multiplication operand
					num2 = Integer.parseInt(st.pop());
					num1 =  Integer.parseInt(st.pop());       //popping the values to stack
					
					result = num2 * num1;     //eqn for multiplying
					st.push(Integer.toString(result));       //pushing the values to stack
			}else if(c == '/') {      //division operand
				
				num2 = Integer.parseInt(st.pop());
				num1 =  Integer.parseInt(st.pop());          //popping the values to stack
				
				if( num2 == 0){    //error catching - if dividing by 0
					result = 9999;              //9999 = error 
					st.push(Integer.toString(result));           // pushing the error to stack
					
				}else{
					
					//eqn for dividion
					result = num1 / num2;
					
					st.push(Integer.toString(result));  //pushing the result to stack
				}
				}
			
			}
			}
		if(!st.empty()) {       //when the stack is not empty
			int calcul = Integer.parseInt(st.pop());
			return calcul;
		}
		else {
	
			return Integer.parseInt(st.pop());       //returns the stack
		}
	
		
		
		
		
		
	}
}
