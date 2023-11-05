package Day20;

enum Enum {
	SMALL,MEDIUM,LARGE,EXTRA_LARGE,EXTRA_EXTRA_LARGE;
	public static void main(String[] args) {
		System.out.println(Enum.SMALL.name());
		System.out.println(Enum.SMALL.getClass());
		System.out.println(Enum.SMALL.describeConstable());
		System.out.println(Enum.SMALL.values().length);
		System.out.println(Enum.SMALL.getDeclaringClass());
		//Enum.SMALL.main(args); //Recursive
		// TODO Auto-generated method stub
			
	}

}
//public static final
//enum only accepts private tag

//Note1:The constants of an enum type must be declared at the beginning, if present, before any other fields and methods

/* ENUM
1-)Enum types can have initializer blocks, like other classes and objects.
2-)However, initializer blocks or constructors cannot access a static field.
3-)When an enum type's field or static method is accessed, it is initialized, and all its constants are created.
4-)At the beginning of the enum type, static constants of its own type are defined; thus, during initialization, object blocks are executed first, followed by static blocks.
 */