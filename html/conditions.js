/**
 * 
 */
const time = new Date().getHours();
let greetings;
if(time<10){
	greetings = "Good morning";
}else if(time < 20){
	greetings = "Good Day";
} else {
	greetings = "Good evening"
}
document.getElementById("demo1").innerHTML ="Time is :"+time
document.getElementById("demo").innerHTML =greetings

const person = {fname:"Arya",lname:"Raj",age:23};
let txt ="";
for(let x in person) {
	txt += person[x]+" ";
}
document.getElementById("demo2").innerHTML = txt;

var txt1="";
function message(){
	try{
		addalert("welcome guest!");
	}
	catch(err) {
		txt1 = "There was an error on this page.\n\n";
		txt1 += "Click Ok to continue viewing this page,\n";
		txt1 += "or Cancel to return to the home page.\n\n";
		if(!confirm(txt1)) {
			document.getElementById.href = "https://www.google.co.in/";
		}
	}
}