package ring.notes.test;

/**
 * JVM在运行时会产生三个ClassLoader:
 * Bootstrap ClassLoader (JVM自带的类加载器(JVM实现者提供这个)，用来加载java的核心类库，比如java.lang.*)
 * Extension ClassLoader (子级)
 * App ClassLoader(孙子级)
 * 
 * @author mlb 2013-02-26
 *
 */
public class ClassLoaderTest {

	public static void main(String[] args) {
		Class c = null;
		//获取当前默认的类加载器(加载当前程序的 ClassLoader)
		ClassLoader cl = ClassLoader.getSystemClassLoader();
		
		System.out.println("当前默认类加载器： " + cl);
		System.out.println("当前类加载器的各个父级：(注意JVM自带的Bootstrap ClassLoader在这里是不显示的，表现为null)");
		while(cl!=null){
			cl = cl.getParent();
			System.out.println(cl);
		}
		
		try{
			ClassLoaderTest ct = new ClassLoaderTest();
			c = Class.forName("java.lang.Object");
			cl = c.getClassLoader();
			System.out.println("java.lang.Object 的ClassLoader是： " + cl);
//			c = Class.forName("ClassLoaderTest");//这里会报ClassNotFoundException
			c = ct.getClass();
			cl = c.getClassLoader();
			System.out.println("ClassLoaderTest's ClassLoader is : " + cl);
		}catch(Exception e){
			System.out.println("Failed to get the Class Instance.");
		}
	}
}
