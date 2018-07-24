package org.examples.singleton;

public class SingletonRuntimeDemo {

	public static void main(String[] args) {
		Runtime singletonRuntime = Runtime.getRuntime();
		singletonRuntime.gc();// garbage collector
		System.out.println(singletonRuntime);
		Runtime anotherInstance = Runtime.getRuntime();
		System.out.println(anotherInstance);

		if (singletonRuntime == anotherInstance) {
			System.out.println("São a mesma instância");
		}

	}

}
