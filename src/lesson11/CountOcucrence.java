package lesson11;

public class CountOcucrence {

	public static void main(String[] args) {
		String[] arr={"a","a","b",null};
		System.out.println("count is "+countOccurences(arr, null));
	}
	
	public static<T> int countOccurences(T[] arr, T target) {
		int count = 0;
		
		if (target == null){
			for (T item :arr){
				if (item ==  null )
			count++;
			}
		}else{
			for (T item :arr)
				if (target.equals(item))
					count++;
		}
		
		return count;
	}

}

//class T{
//	
//}