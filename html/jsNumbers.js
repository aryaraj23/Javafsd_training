/**
 * 
 */
let x = NaN;
let y = 5;
document.getElementById("demo").innerHTML = x+y;

let x1="100";
let y1="10";
let z =x1*y1;
document.getElementById("demo1").innerHTML=z;

let x2=123;
let y2 = new Number(123);
document.getElementById("demo2").innerHTML = typeof x2 +"<br>" + typeof y2;

//to setFullYear()
const d =new Date();
d.setFullYear(2021);
document.getElementById("demo3").innerHTML =d;