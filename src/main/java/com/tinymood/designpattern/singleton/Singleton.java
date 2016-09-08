package com.tinymood.designpattern.singleton;

public class Singleton {
	private Singleton() {
	}

	// 1.懒加载 线程不安全
	/*
	private static Singleton uniqueInstance;

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	*/
	
	// 2.同步机制 懒加载
	// 线程安全 但并不高效
	/*
	private static Singleton uniqueInstance;

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	*/
	
	// 3.双重检查加锁 懒加载
	// 线程安全（Java5以后）
	// volatile禁止指令重排序Java5支持
//	private volatile static Singleton uniqueInstance;
//
//	public static Singleton getInstance() {
//		if (uniqueInstance == null) {
//			synchronized (Singleton.class) {
//				if (uniqueInstance == null) {
//					uniqueInstance = new Singleton();
//				}
//			}
//		}
//		return uniqueInstance;
//	}
	
	
	// 4. 急加载
	
	private static final Singleton uniqueInstance = new Singleton();
	
	public static synchronized Singleton getInstance3() {
		return uniqueInstance;
	}
	
	
	// 5.静态内部类的方式 懒加载
	// 线程安全 高效 不依赖Java版本
	
	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	public static final Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
}
