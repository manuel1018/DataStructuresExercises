package com.juanma.HackAlgorithms.Algorithms;

import java.util.Stack;

public class TagValidator {
	private String input;
	private Stack<String> stack;
	private String message;
	
	public TagValidator() {
		
	}
	public boolean isContenValid(String input) {
		if(input.length()==0)
			return false;
		this.input=input;
		Stack<String> stack=getStatements();
		if(isBalanced(stack))
			return true;
		return false;
	}
	
	private Stack<String> getStatements() {		
		boolean isEnd=false;
		int i=0;
		stack=new Stack<String>();
		char htmlString[]=input.toCharArray();	
		String auxInput=input;
		int index=0;
		
		while(i<htmlString.length) {			
				if(htmlString[i]=='<')
					index=i;
				if(htmlString[i]=='>') { 					
					stack.add(auxInput.substring(index, i+1));
				}
				i++;			
			}	
		return stack;
	}
	
	private boolean isBalanced(Stack<String> stack) {
		String openStament=null;
		String closeStament=null;
		for(int x=0;x<stack.size();x++) {			
			if(x%2!=0) {				
				closeStament=stack.get(x);
				if(closeStament.contains("/")) {
					String auxCloseStament=closeStament.replace("/", "");					
					if(auxCloseStament.equals(openStament)) {
						message=input.replace(openStament,"");
						message=message.replace(closeStament,"");						
						System.out.println("Message: "+message);						
						return true;
					}
					else {
						message=null;
						System.err.println("cadena no valida");
						return false;
					}
				}
				else {
					message=null;
					System.err.println("No hay cadena de cerradura");
					return false;
				}			
			}	
			else 
				openStament=stack.get(x);		
		}
		System.err.println("String vacio");
		return false;
	}
}
