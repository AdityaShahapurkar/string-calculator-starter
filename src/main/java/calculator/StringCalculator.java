package calculator;

class StringCalculator {

 
    public static int add(String input){
    	  if(input.equals("")){
    	    return 0;
    	  }
    	  else if(input.contains(",")){
      	    String[] numbers = input.split(",");
      	    return toInt(numbers[0]) + toInt(numbers[1]);
      	  }
    	  else if(input.contains(",")){
    		  String[] numbers = input.split(",");
    		  int total = 0;
    		  for(String number : numbers){
    		    total += toInt(number);
    		}
    		  return total;
    		}
    	  else
    	  	return 1;
    	}
    private static int toInt(String number){
  	  return Integer.parseInt(number);
  	}
    private static String[] splitNumbers(String numbers){
    	  return numbers.split(",");
    	}

    	private static int sum(String[] numbers){
    	  int total = 0;
    	  for(String number : numbers){
    	    total += toInt(number);
    	  }
    	  return total;
    	}
}