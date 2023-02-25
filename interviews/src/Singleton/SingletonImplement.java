package Singleton;

public class SingletonImplement {

	public static void main(String args[]) {

		MemCache mem = MemCache.getInstance();

		MemCache memLazy = MemCache.getInstanceLazy();

		System.out.println(mem.hashCode());

		System.out.println(mem.hashCode());

		System.out.println(memLazy.hashCode());

	}

}
