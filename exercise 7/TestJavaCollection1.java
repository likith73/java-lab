import java.util.*;
class TestJavaCollection1
{
	public static void main(String arg[])
	{
		ArrayList<String>list = new ArrayList<>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		System.out.println("the list is : \n"+list);
		Iterator<String>itr=list.iterator();
		System.out.println("the iterator values"+"the list are");
		while(itr.hasNext())
		{
		System.out.print(itr.next()+"  ");
		}
		HashMap<Integer,String>hash = new HashMap<Integer,String>();
		hash.put(1,"Ravi");
		hash.put(2,"Vijay");
		hash.put(3,"Ravi");
		hash.put(4,"Ajay");
		System.out.println("\nhashMap:"+ hash);
	}
}
