# Fluent Builder Pattern
This project is an example of the "Fluent Builder" design pattern.  It is a 
combination of two distinct patterns: 
* Fluent Interface
* Builder Pattern

Its intent is to allow one to gradually build complex models over multiple
calls as the data is gathered.  The Fluent Builder can help to mask
some of the complexity of mapping deeply nested data elements in the 
model being built.  

The example provided will add sub-models to the top-level model only as 
needed or "just in time".

## Code Points of Interest
[BuilderExample.java](src/com/blt/examples/BuilderExample.java) Note that:
- Example of how to apply the fluent builder
- You can change the order of the calls and still get same result
- You can eliminate calls and those elements of the model will not be built

[GnarlyRecordBuilder.java](src/com/blt/examples/builder/GnarlyRecordBuilder.java) Note that:
- Each setter returns the current instance of the builder.  
- The `build()` method is the only public function that does not return the builder itself.

## The Fluent Interface Pattern
This has become a popular design pattern with its key distinguishing feature 
being that you can chain method calls together from the same object.

This is typically realized by having the return value of the each method returning
the object instance itself.   

For example:
```Java
public class MyClass {
   public MyClass doSomething() {
       // do stuff
       return this;
   }
}
```   

### Benefits
* Can make code easier to read.
* Encourages decomposition of complexity
* Allows for finer grained unit testing.

### Disadvantages
* Long chains of code are seen as 1 line by the debugger
* Net result of above is you can't set breakpoints on inner parts of the chain.

To read a bit more about the Fluent Interface Design Pattern, please refer to the following article:
[Fluent Interface Pattern](https://en.wikipedia.org/wiki/Fluent_interface)

## The Builder Pattern
The Builder Design Pattern is one of the original design patterns from the "Gang of Four" patterns. 
It's intent is to help decouple the construction of a complex object from it's actual
internal representation.  It helps to answer the question "How can a class that includes creating a 
complex object be simplified?"

The pattern typically provides for a set of calls on the `Builder` class that
gradually set values on the model we intend to build.  The user can
call these `Builder` setters in any order they wish (or not at all).  Finally
the caller will call the `Builder.build()` method to retrieve the built model.

### Benefits
* Allows you to vary a model's internal representation
* Hides the complexity of a large object model
* Allows you to gradually construct a complex model when all the information for doing so may not be immediately available.

### Disadvantages
* Does not work well with immutable classes (though there are ways of solving for this)
* Does not guarantee that all members of the class being constructed are initialized.


To read a bit more about the Fluent Interface Design Pattern, please refer to the following article:
[Builder Design Pattern](https://en.wikipedia.org/wiki/Builder_pattern)