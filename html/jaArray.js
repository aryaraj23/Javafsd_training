/**
 * 
 */
const cars=["Saab","Volvo","BMW"];
document.getElementById("demo").innerHTML=cars;

const array1 = ["Cecilie","Lone"];
const array2 = ["Emil","Tobias","Linus"];
const array3 = ["Robin","Morgan"];

const myChildren = array1.concat(array2, array3);
document.getElementById("demo1").innerHTML = myChildren;

const fruits =["Banana","Orange","Apple","Grapes"];
document.getElementById("demo2").innerHTML =fruits;
fruits.shift();
document.getElementById("demo3").innerHTML =fruits;

const points = [40,100,1,5,25,10]
document.getElementById("demo4").innerHTML = myArrayMin(points);
function myArrayMin(arr) {
	return Math.min.apply(null,arr);
}

const numbers =[45,4,9,16,25];

let txt="";
numbers.forEach(myFunction1);
document.getElementById("demo5").innerHTML = txt;

function myFunction1(value,index,array) {
	txt += value+"<br>";
}

const numbers1 = [45,4,9,16,25];
let allOver18 = numbers1.every(myFunction2);
document.getElementById("demo6").innerHTML = "All over 18 is "+allOver18;
function myFunction2(value,index,array) {
	return value > 18;
}