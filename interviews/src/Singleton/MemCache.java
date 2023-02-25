package Singleton;

public class MemCache {

	private MemCache() {
	}

	private static MemCache instanceMemcache = null;

	private static MemCache instanceMemcacheNomal = new MemCache();

	public static MemCache getInstance() {
		return instanceMemcacheNomal;
	}

	public static MemCache getInstanceLazy() {

		if (instanceMemcache == null) {
			instanceMemcache = new MemCache();
		}

		return instanceMemcache;

	}

}
