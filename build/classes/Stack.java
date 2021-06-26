/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.EmptyStackException;
    import java.util.LinkedList;


public class Stack<T> {
	LinkedList<T> l = new LinkedList<T>();	
	public void push(T el){
		l.addLast(el);		
	        System.out.println("Added to stack successful");
        }
        
	public T pop() throws EmptyStackException{
		if(l.isEmpty())	System.out.println("Empty stack");
		else
		    System.out.println("Element to be removed:"+l.peekLast());	
                 return l.removeLast();
	}
        
	public boolean isEmpty(){
		return l.isEmpty();
	}
        
	public void printAll()
	{	
		Stack<T> tmp = new Stack<T>();
		while(!this.isEmpty())
		{
			T el = pop();
			System.out.print(el + " ");
			tmp.push(el);
		}
		
		while(!tmp.isEmpty())
		{
			this.push(tmp.pop());
		}
		
		System.out.println();
	}
	
	public void clear(){
            if(l.isEmpty()) System.out.println("There's nothing to clear");
            else l.clear();
	}
	
	public T topEl() throws EmptyStackException{
		if(l.isEmpty())	System.out.println("Empty stack");
                else System.out.println("Last element of this stack:"+l.peekLast());
		 return l.removeFirst();
	}

	public String toString()
	{
		return l.toString();
	}
	
	public int Size(){
	    if(l.isEmpty()) System.out.println("This stack is empty");
            else System.out.println("The size of this stack is:"+l.size());
            return l.size();
	}
	
}


