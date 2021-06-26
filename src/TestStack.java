/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
    import java.util.NoSuchElementException;
import java.util.Scanner;

public class TestStack {
	public static void main(String[] args) throws Exception {	
		System.out.println("----------------------STACK--------------------");
		Stack<Integer> s = new Stack<Integer>();
                Stack<Integer> s1 = new Stack<Integer>();
		s.push(6);
                s.push(4);
                s.push(8);
                s.push(1);
		outputStack(s);
                transfer(s, s1);
//                reverse1c(s, s1);
                outputStack(s);
//                sortStack(s);
//                Stack<Integer> s2=new Stack<Integer>();
//                transfer(s, s2);

	}
	
	static void inputStack(Stack<Integer> S)
	{
		System.out.print("Enter elements separated by space: ");
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt()) {
	          S.push(sc.nextInt());
	      }
	}
	
	static void outputStack(Stack<Integer> S)
	{
                System.out.println(S);
            
	}
	
	public static void reverse1a(Stack<Integer> S) throws Exception
	{
		//Reverse the order of elements on stack S using 2 additional stacks
		//1. Declare Stack S1, S2
		Stack<Integer> S1 = new Stack<Integer>();
		Stack<Integer> S2 = new Stack<Integer>();
		
		//2. Transfer all elements from S to S1
		while(!S.isEmpty())
			S1.push(S.pop());
		
		//3. Transfer all elements from S1 to S2
		while(!S1.isEmpty())
			S2.push(S1.pop());
		
		//4. Transfer all elements from S2 to S
		while(!S2.isEmpty())
			S.push(S2.pop());		
	}
		
	public static void reverse1c(Stack<Integer> S,Stack<Integer> S1) throws Exception
	{
		//Reverse the order of elements on stack S using one //additional stack and some additional non-array variable
                int top;
                 if(!S.isEmpty()){
                     top=S.topEl();//1. Take the top element of S and assign to top el   
                     S1.push(top);//2.stack 1 push the top el
                     reverse1c(S, S1);//3.then recurse until s is empty
                 }
                 
    		if(S.isEmpty()){//4.when S is empty
                    while(!S1.isEmpty()){//push all elements from s1 back to ori stack
                        S.push(S1.pop());
                    }
                }
	}
	
	public static void sortStack(Stack<Integer> S){
            Stack<Integer> S1=new Stack<Integer>();
            while(!S.isEmpty()){//if original stack is not empty
                int tmp=S.pop();//then pop 1 el from stack set it as tmp 
                while(!S1.isEmpty() && S1.topEl()<tmp){//if stack 1 is not empty
                                                    //and top el of stack 1 > tmp 
                    S.push(S1.pop());//then ori stack push 1 el from stack 1
                }//repeat until condition is false
                S1.push(tmp);//push the tmp el in stack1
            }//end of loop,repeat until ori stack is empty
            while(!S1.isEmpty()){
                S.push(S1.pop());
            }
            System.out.println("Stack s1:"+S1);
            System.out.println("Stack s:"+S);
		//Put the elements on the stack S in ascending order using one additional stack and
		//some additional non-array variables
		
		
	}
	
	public static void transfer(Stack<Integer> S1, Stack<Integer> S2){
                while(!S1.isEmpty()){
                   int tmp=S1.topEl();
                   S2.push(tmp);
                }
                System.out.println("S2 stack:"+S2);
                System.out.println("S1 stack:"+S1);
		//Transfer elements from stack S1 to stack S2
		//so that the elements from S2 are in the same order as on S1
		//using no additional stack but only some additional non-array variables
		
		
	}
	
	
}


