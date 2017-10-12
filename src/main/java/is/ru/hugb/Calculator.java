package is.ru.Calculator;
import java.util.List;
public	class	Calculator	{

	public	static int add(String text){
		if(text.equals(""))
			return 0;
		else{	
			if(text.contains("\n"))
			{
				text = text.replace("\n", ",");
			}		
			if(text.contains(",")){
				String numbers[] = text.split(",");
				return sum(numbers);
			}
			return  toInt(text);
		}
	}
	private static int toInt(String number){
		return Integer.parseInt(number);
	}
	private static int sum(String [] numbers){
		boolean negativefound = false;
		String negatives = new String();
		int total = 0;
		for(int i = 0; i < numbers.length; i++){
			if(toInt(numbers[i]) < 0)
			{	
				negativefound = true;
				negatives += numbers[i] + ",";
			}
			if(toInt(numbers[i]) > 1000)
			{
				numbers[i] = "0";
			}
			total += toInt(numbers[i]);
		}
		if(negativefound == true)
		{
			throw new IllegalArgumentException ("Negatives not allowed:" +negatives);
		}		
		return total;
	}
}
	