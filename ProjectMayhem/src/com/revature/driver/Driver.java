package com.revature.driver;

import com.revature.beans.Human;

public class Driver {
	//This is really just FUN at this stage so there's not much of a point to this yet!

	public static void main(String[] args) {
		Human h = new Human();
		
		h.setName("Casey");
		h.setAge(28);
		h.setWeight(250);
		System.out.println(h.getName());
	}
}
