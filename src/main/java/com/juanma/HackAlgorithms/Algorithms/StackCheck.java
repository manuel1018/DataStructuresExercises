package com.juanma.HackAlgorithms.Algorithms;

import java.util.Stack;

public class StackCheck {
    private Stack<Character>stack;
    char[] subCadena;
    public StackCheck(){
        this.stack=new Stack<>();

    }

    public boolean check(String cadena) {
       char auxChar=' ';
        subCadena=cadena.toCharArray();
        for(int i=0;i<subCadena.length;i++){      
            if(subCadena[i]==')')
                auxChar='(';
            else if(subCadena[i]=='}')
                auxChar='{';
            else
                auxChar='[';
            if(subCadena[i]=='('||subCadena[i]=='['||subCadena[i]=='{')
                stack.push(subCadena[i]);
            else if(subCadena[i]==')'||subCadena[i]==']'||subCadena[i]=='}')
                if(auxChar!=stack.pop())
                    return false;
        }
        if(stack.size()!=0)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return stack.toString();
    }
}