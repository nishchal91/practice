/* You're now a baseball game point recorder.

Given a list of strings, each string can be one of the 4 following types:

Integer (one round's score): Directly represents the number of points you get in this round.
"+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
"D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
"C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
Each round's operation is permanent and could have an impact on the round before and the round after.

You need to return the sum of the points you could get in all the rounds.*/

package com.practice.leetcode;

import java.util.ArrayList;

public class BaseBall {
	public int calPoints(String[] ops) {
        int sum=0;
        ArrayList<Integer> points= new ArrayList<Integer>();
        
        for(String op:ops){
            
            if(op.equals("D")){
                int doublePoints=2*points.get(points.size()-1);
                points.add(doublePoints);
                sum=doublePoints+sum;
                
            }
            else if(op.equals("C")){
                
                int invalidPoint=points.get(points.size()-1);
                points.remove(points.size()-1);
                sum=sum-invalidPoint;
            }
            else if(op.equals("+")){
                int pointsAdd=points.get(points.size()-1).intValue()+points.get(points.size()-2).intValue();
                sum=sum+pointsAdd;
                points.add(pointsAdd);
            }
            else{
            int intVal=isInteger(op);
            if(intVal!=31000){
                points.add(intVal);
                sum+=intVal;
            }
            }
            
        }
        
        return sum;
    }
    
    
    public int isInteger(String s){
        try{
            int op= Integer.parseInt(s);
            return op;
        }
        catch (NumberFormatException e) {
            return 31000;
        }
    }
	public static void main(String[] args) {
		BaseBall calc=new BaseBall();
		String[] ops={"5","2","C","D","+"};
		int sum=calc.calPoints(ops);
		System.out.println(sum);
	}

}
