package com.symantec.eloqua.assetMigrator.Thread;

public class Container {
	public static final ThreadLocal userThreadLocal = new ThreadLocal();

	public static void set(InstanceInfo user) {
		userThreadLocal.set(user);
	}

	public static void unset() {
		userThreadLocal.remove();
	}

	public static InstanceInfo get() {
		return (InstanceInfo) userThreadLocal.get();
	}

}
