// DOM - Document Object Model Library
document.getElementById('template').innerHTML = `
<h1>Hello, pi = ${pi}</h1>
`
document.getElementById('template').innerHTML += `
<p>Lorem ipsum</p>
`

function changeText(id) {
    id.innerHTML += "text changed!";
}

let doc = document.getElementById('template');
doc.innerHTML = "New stuff"

changeText(template);

let newPara = document.createElement('p');
let node = document.createTextNode('This is a new node');
newPara.appendChild(node);

let target = document.getElementById('div1');
let child = document.getElementById('div2');
target.insertBefore(newPara, child);

