package com.workspace.org;

public class TypeCastingDemo {
	public void castDemo() {
		// Wildcasting
		System.out.println("Wildcasting");
		long l = 12;
		short s = 20;
		int i = s;
		System.out.println("short s " + s);
		System.out.println("int i " + i);

		float f = 10;
		double d = f;
		System.out.println("float f " + f);
		System.out.println("double d " + d);

//		int j=f;
		float ff = i;
		double dd = l;
		System.out.println("float ff " + ff);
		System.out.println("double dd " + dd);

	}

	public void castDemo1() {
		// Narrowcasting
		System.out.println("Narrowcasting");
		int i = 10;
		short s = (short) i;
		System.out.println("int i " + i);
		System.out.println("short s " + s);

		double d = 22;
		float f = (float) d;
		System.out.println("double d " + d);
		System.out.println("float f " + f);

		int ii = (int) f;
		long ll = (long) d;
		System.out.println("int ii " + ii);
		System.out.println("long ll " + ll);
	}

	public static void main(String[] args) {
		TypeCastingDemo tc = new TypeCastingDemo();
		tc.castDemo();
		tc.castDemo1();
	}
}
