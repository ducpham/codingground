
var People = Class.extend(function(){
    this.constructor = function(name){
        this.name = name;
    };
    this.sayHello = function(){
        console.log("Hi, I'm a people. My name is " + this.name);        
    }
});
  
//MyOtherClass extends MyClass
var Student = People.extend(function(){
    this.constructor = function(name, subject){
        //Execute the constructor of the class we extended.
        this.super(name);
        this.subject = subject;
        //Output from extending class
    };
    this.hello = function() {
    	console.log("Hi, I'm a student. My name is " + this.name + ", and my subject is " + this.subject);
    };
});
  
//Create instance of MyOtherClass
var studentA = new Student("Jack","IT");
studentA.hello();