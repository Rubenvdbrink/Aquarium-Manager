let myDiv = document.getElementById('alleaquaria');

function toonAquaria() {
    fetch("restservices/aquarium/alleAquaria", {method: 'GET', headers: { 'Authorization': `Bearer ${window.sessionStorage.getItem("myJWT")}` }})
        .then(function(response) {
            if(response.ok) return response.json();
            else throw "alle aquaria niet gevonden";
        })
        .then(myJson => myDiv.innerHTML = ("al uw aquaria: <pre>" + JSON.stringify(myJson, undefined,2)) + "</pre>")
        .catch(console.log);
}

document.querySelector("#alleaquariabutton").addEventListener("click", toonAquaria);