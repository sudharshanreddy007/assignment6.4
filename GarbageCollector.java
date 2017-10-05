package garbagecollector;

public class GarbageCollector {


	public void finalize()

	{
		System.out.println("Object is garbage collector");//print the value
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GarbageCollector s1=new  GarbageCollector();
		//GarbageCollector is name of the class
		//s1 is a reference variable
		//new is operator that which allocates memory to an object
		//GarbageCollector is constructor call
		 GarbageCollector s2=new GarbageCollector();
		//GarbageCollector is name of the class
				//s2 is a reference variable
				//new is operator that which allocates memory to an object
				//GarbageCollector is constructor call
		s1=null;//s1 and s2 is value null
		s2=null;
		System.gc();//prints garbage collector
	}

}