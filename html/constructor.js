/**
 * 
 */
document.getElementById("demo").innerHTML = "Arya".constructor+"<br>"+(3.14).constructor+"<br>"+false.constructor+"<br>"+
[1,2,3,4].constructor+"<br>"+{name:'Arya',age:23}.constructor+"<br>"+new Date().constructor+"<br>"+function(){}.constructor;

function Person(first,last,age,eye) {
	this.firstName = first;
	this.lastName =last;
	this.age = age;
	this.eyeColor = eye;
}
const myFather = new Person("Raju","AN",55,"black");

document.getElementById("demo1").innerHTML = "My Father is "+myFather.age+".";