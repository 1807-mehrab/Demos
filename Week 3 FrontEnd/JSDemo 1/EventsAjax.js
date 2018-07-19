//Unobtrusive event listener
window.addEventListener("resize", function() {
    document.getElementById("template").innerHTML = "Window resized!";
})

document.getElementById("div1").addEventListener("click", function() {
    document.getElementById("div2").innerHTML = "Div1 got clicked";
})

//window.addEventListener("click", function() {
//    document.getElementById("div2").innerHTML = "Got clicked";
//})

function myDiv2Event(event) {
    console.log("div2");
}

function myDiv1Event(event) {
    console.log("div1");
}

//Bubbling (default)
//document.getElementById("div1").addEventListener("click", myDiv1Event);
//document.getElementById("div2").addEventListener("click", myDiv2Event);

//Capturing
document.getElementById("div1").addEventListener("click", myDiv1Event, true);
document.getElementById("div2").addEventListener("click", myDiv2Event, true);