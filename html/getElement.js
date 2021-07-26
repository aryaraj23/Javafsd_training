/**
 * 
 */
function getElements() {
	var x = document.getElementsByName("x");
	document.getElementById("demo").innerHTML = x.length;
}

document.getElementById("demo1").innerHTML = "Number of forms: "+document.forms.length;