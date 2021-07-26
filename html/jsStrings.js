/**
 * 
 */
let str ="Please locate where 'locate' occurs!";
document.getElementById("demo").innerHTML = str.indexOf("locate");

function myFunctions() {
	let text = document.getElementById("demo1").innerHTML;
	document.getElementById("demo1").innerHTML=text.replace("Microsoft","Ubundu");
}

let text = "a,b,c,d,e,f";
const myArray = text.split(",");
document.getElementById("demo2").innerHTML =myArray[0];