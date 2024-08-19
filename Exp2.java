package instanceofexample;

public class Exp2 {
	public static void main(String[] args) {
		
	    Object obj = "ram"; 
	    // dummy value, think it may be String,Integer or Float
	    
	    if(obj instanceof String) {
	    	String s1 = (String)obj;
	    	System.out.println("object containing string  " +s1);
	    }else if(obj instanceof Integer) {
	    	Integer i1 = (Integer)obj;
	    	System.out.println("object containing integer " +i1);
	    }else{
	    	Float f1 = (Float)obj;
	    	System.out.println("object containing float   " +f1);
	    }
		
	}
}
