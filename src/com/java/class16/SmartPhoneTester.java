package com.java.class16;

public class SmartPhoneTester {
	public static void main(String[] args) {
		
		SmartPhone Xiaomi = new SmartPhone();
		SmartPhone Huawei = new SmartPhone();
		
		Xiaomi.colour = "Gray";
		Xiaomi.model = "Mi 11 Lite 64GB";
		Xiaomi.camera = "HD";
		int weightXiaomi = 15;
		int internalMemoryCardXiaomi = 64;
		
		Huawei.colour = "Sylver";
		Huawei.model = "P40 Lite 128GB";
		Huawei.camera = "4K";
		int weightHuawei = 20;
		int internalMemoryCardHuawei = 128;
		
		System.out.println(Xiaomi.colour);
		System.out.println(Xiaomi.model);
		
		System.out.println(Huawei.colour);
		System.out.println(Huawei.model);
		
		System.out.println(weightXiaomi + "Gr");
		System.out.println(weightHuawei + "Gr");
		
		System.out.println(internalMemoryCardXiaomi + "GB");
		System.out.println(internalMemoryCardHuawei + "GB");
		
		Xiaomi.answerToCall();
		Huawei.answerToCall();
				
		Xiaomi.takingphoto();
		Huawei.takingphoto();
	}
}
