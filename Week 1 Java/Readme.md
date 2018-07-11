#Java
Java is both an object-oriented programming language and a platform developed by Sun Microsystems (acquired by Oracle). Using the "write once, run anywhere" (**WORA**) principle, a Java application can be executed on any platform where a Java Virtual Machine (**JVM**) is installed. This flexibility made Java one of the most popular languages for many years, allowing developers to write large client-server web applications, desktop and mobile applications, and extensive frameworks and libraries.

##Features
<dl>
	<dt>Platform independence</dt>
	<dd>The compiler converts source code to bytecode. Then the JVM executes that bytecode. While each operating system has their own JVM implementation, every JVM can execute bytecode regardless of platform of origin.</dd>

	<dt>Clear, verbose syntax</dt>
	<dd>Java has syntax like C/C++ and C#. Many syntax elements of the language are readable and widely used in programming. The Java API (Application Programming Interface) is also written using verbose, descriptive naming conventions making it simple to parse large code bases..</dd>

	<dt>Multi-paradigm</dt>
	<dd>While Java is an object-oriented programming language, it supports multiple paradigms such as imperative, generic, concurrent, and functional programming.</dd>

	<dt>Garbage collection</dt>
	<dd>The JVM performs automatic memory deallocation of unused objects at runtime. Programs are written without the need for complex memory management.</dd>

	<dt>Multithreading</dt>
	<dd>Java supports multithreading at the language and the standard library levels. It allows concurrent and parallel execution of several parts of a Java program.</dd>
</dl>

See this [white paper](http://www.oracle.com/technetwork/java/langenv-140151.html) for more details.

##Object-Oriented Programming
Although Java accomodates several programming paradigms, Object-Oriented Programming (**OOP**) remains the foundation for most applications. In OOP, a program is organized into objects encapsulating related fields (representing its *state*) and methods (usually to control that state). When defining objects, Java reserves the keyword *class* (not to be confused with the *.class* extension) which serves as their blueprint. An object in Java represents an instance in memory of a class, and every class implicitly inherits from the *Object* superclass which provides some useful convenience methods such as *equals()* and *toString()*. 

Proper OOP follows several pillars of design theory. While the numbers vary between object-oriented languages, Java focuses on four:

<dl>
	<dt>Abstraction</dt>
	<dd>By simplifying objects to a set of useful features, we hide irrelevant details, reduce complexity, and increase efficiency. Abstraction is important at all levels of computer and software engineering, but are essential to designing useful objects. Complicated real-world objects are reduced to simple representations.</dd>
	<dt>Encapsulation</dt>
	<dd>Objects should protect their data through their own methods. The state of an object should only change, if ever, through these methods (commonly implemented as getter and setter methods). Also known as data hiding, this prevents outside interference with an object's data.</dd>
	<dt>Inheritance</dt>
	<dd>Code reuse is an important principle of programming, and new classes can reuse code from existing ones. This establishes a superclass-subclass or parent-child relationship where derived classes inherit (and can change) fields and methods.</dd>
	<dt>Polymorphism</dt>
	<dd>With inheritance, an object of a derived class can be referenced as instances of its parent class. This provides flexibility when invoking inherited methods with varying implementations in derived classes.</dd>
</dl>

##Programming in Java
Most Java applications only require the **JRE** (Java Runtime Environment) to run. But to write and compile your own Java applications requires the **JDK** (Java Development Kit). While the JRE provides Java's standard libraries and exceptions as well as a JVM, the JDK provides all of the above as well as *javac*, the compiler. Java source code is written in text files labeled with a *.java* extension. It is then compiled into bytecode in *.class* files by *javac*. Then the bytecode is executed by the JVM which translates Java commands into low-level instructions to the operating system.

Since Java 7, all Java programs not run inside a container (such as a Servlet Web Container) start and end with the main method. The class containing the main method can have any name, but the method itself should always be named *main*. The most simple Java program looks like this:

```java
class Example {
	public static void main(String[] args) {
		System.out.println("Number of arguments: " + args.length);
	}
}
```

- *public* means the method can be invoked from anywhere
- *static* means the method can be invoked without creating an instance of the class
- *void* means the method doesn't return any value
- *args* means the method can take command line arguments as an array of String objects 

We can compile this code into a *.class* file of the same name:
>javac Example.java

Then we can run the code without arguments:
>java Example

Which should output:
>Number of arguments: 0

If we run it again with arguments (each separated by a space):
>java Example arg1 arg2 arg3

We get:
>Number of arguments: 3

From here we can add packages and imports, expanding the application into a set of interacting objects each representing real-world entities or programming abstractions. By default, the *javac* compiler implicitly imports several packages from its standard library.

##Comments
The Java compiler ignores text annotated with certain characters.

###End-of-line comments
Any text after double forward slashes `//` to the end of that line will be ignored.

###Multi-line comments
Any text between `/*` and `*/` will be ignored, and can be used for multiple lines of text.

###Java documentation comments
Any text between `/**` and `*/` are ignored just like multi-line comments. These comments can be used with the *javadoc* tool to generate documentation and are usually placed above class and method declarations.

##Variables
A value is stored and identified in memory by a variable. Variables have a name that makes it possible to access its value, and a type that defines what sort of value it stores. Java is statically type, which means a variable type must be known at compile time, as opposed to a dynamically typed language which finds out at runtime.

###Primitive types
Java handles two kinds of data types: primitives and references. Primitive types are variables that store simple values. There are eight in Java:
- Integer type: **byte**, **short**, **int**, and **long** (42)
- Floating-point type: **float** and **double** (3.1415)
- Logical type: **boolean** (true)
- Character type: **char** ('x')

####Integer types
Integer types store whole numbers, with each type covering a certain range of values.
- **byte**: the size is 8 bits (1 byte), the range is from -128 to 127
- **short**: the size is 16 bits (2 bytes), the range is from -32768 to 32767
- **int**: the size is 32 bits (4 bytes), the range is from −(2^31) to (2^31)−1
- **long**: the size is 64 bits (8 bytes), the range is from −(2^63) to (2^63)−1

####Floating-point types
Floating-point types store decimal numbers, also in certain ranges.
- **float**: the size is 32 bits (4 bytes), the range is from 3.4e−038 to 3.4e+038 (approximately, 6-7 significant decimal digits)
- **double**: the size is 64 bits (8 bytes), the range is from 1.7e−308 to 1.7e+308 (approximately, 14-16 significant decimal digits)

###Reference types
Reference types store the memory address location of more complex data types. They are most commonly used to point to the location of objects in memory, and are checked by the garbage collector regularly. If an object has no reference, it will be removed from memory.

###Rules for naming variables
- Case sensitivity
- Can only use letters, numbers, and the *$* or *_* characters
- Cannot begin with a number
- Cannot be a reserved Java keyword

###Conventions for naming variables
- Lowercase for a single word
- For multi-word names, the first word is lowercase and each word after is uppercase
- Should not start with *$* or *_*

###Scopes
A variable's reference will only exist within the context of its declared scope, which is based on the location of its declaration.

- **Static** or class scoped variables are visible to all instances of a related class
- **Instance** or object scoped variables are visible to only that object
- **Local** or method scoped variables are visible only within a method
- **Block** or loop scoped variables are visible only within a control statement

Be aware of shadowing, when two variables in different scopes share names.

##Methods
Methods accept a list of arguments known as *parameters* and return some value. They are used to implement repeatable, consistent actions on variable input, much like a mathematical function.

##Constructors
Classes not only define an object's fields and methods, but how it should be instantiated through special methods called constructors. Constructors must have no return type and share the same name as its class. Naming other methods with the same name (and case) as the class is not recommended for this reason.

While a constructor may be *private*, used for creating singletons, it may not be *final*, *static*, or *abstract*.

If no constructor is defined, Java will automatically provide a *noargs* constructor which sets fields with default values. A class can have multiple constructors through method overloading (multiple methods sharing the same name with different parameters).

A constructor is called through the *new* keyword.
>Object obj = new Object();

##Access modifiers
<dl>
	<dt>private</dt>
	<dd>Accessible only within the context of that class</dd>
	<dt>default</dt>
	<dd>Accessible within the context of the package. Has no associated keyword, and applied when no modifier is set.</dd>
	<dt>protected</dt>
	<dd>Accessible to derived child classes outside of the package</dd>
	<dt>public</dt>
	<dd>Accessible anywhere</dd>
</dl>

Classes can only be public or default. There are no cascading access levels, and unspecified fields will have the default modifier. Subclasses can only change inherited fields to be less restrictive.