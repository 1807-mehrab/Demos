//Load from a txt file using Ajax
function loadDoc() {
    let xhr = new XMLHttpRequest();
    xhr.onreadystatechange = function() {
        console.log(this.readyState);

        if (this.readyState == 4) {
            if (this.status == 200) {
                document.getElementById('demo').innerHTML = xhr.responseText;
            } else {
                console.log("error");
            }   
        }
    }

    xhr.open('GET', 'hello.txt');
    xhr.send();
}
function reqListener () {
    console.log(this.responseText);
}

var oReq = new XMLHttpRequest();
oReq.addEventListener("load", reqListener);
oReq.open("GET", "hello.txt");
oReq.send();