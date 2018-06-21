package test;

public class Singleton {
	private static Singleton singleton = null;
	public static Singleton getInstance(){
		if(singleton==null){
			singleton = new Singleton();
		}
		return singleton;
	}
	//静态内部类
	private Singleton(){};
	private static class lazyHolder{
		private final static Singleton instance = new Singleton();
	}
	public static Singleton getS(){
		return lazyHolder.instance;
	}
}
