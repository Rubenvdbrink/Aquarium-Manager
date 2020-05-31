function addGarnaal() {
    let formData = new FormData(document.querySelector("#garnaalform"));
    let encData = new URLSearchParams(formData.entries());

    fetch("restservices/bewoner/addGarnaal", {method: 'POST', headers: { 'Authorization': `Bearer ${window.sessionStorage.getItem("myJWT")}` }, body: encData})
        .then(function(response) {
            if(response.ok) return response.json();
            else throw "kan garnaal niet toevoegen";
        })
        .catch(console.log);
}

document.querySelector("#maakgarnaalaan").addEventListener("click", addGarnaal);

function addKreeft() {
    let formData = new FormData(document.querySelector("#kreeftform"));
    let encData = new URLSearchParams(formData.entries());

    fetch("restservices/bewoner/addKreeft", {method: 'POST', headers: { 'Authorization': `Bearer ${window.sessionStorage.getItem("myJWT")}` }, body: encData})
        .then(function(response) {
            if(response.ok) return response.json();
            else throw "kan kreeft niet toevoegen";
        })
        .catch(console.log);
}

document.querySelector("#maakkreeftaan").addEventListener("click", addKreeft);

function addSlak() {
    let formData = new FormData(document.querySelector("#slakform"));
    let encData = new URLSearchParams(formData.entries());

    fetch("restservices/bewoner/addSlak", {method: 'POST', headers: { 'Authorization': `Bearer ${window.sessionStorage.getItem("myJWT")}` }, body: encData})
        .then(function(response) {
            if(response.ok) return response.json();
            else throw "kan slak niet toevoegen";
        })
        .catch(console.log);
}

document.querySelector("#maakslakaan").addEventListener("click", addSlak);

function addVis() {
    let formData = new FormData(document.querySelector("#visform"));
    let encData = new URLSearchParams(formData.entries());

    fetch("restservices/bewoner/addVis", {method: 'POST', headers: { 'Authorization': `Bearer ${window.sessionStorage.getItem("myJWT")}` }, body: encData})
        .then(function(response) {
            if(response.ok) return response.json();
            else throw "kan vis niet toevoegen";
        })
        .catch(console.log);
}

document.querySelector("#maakvisaan").addEventListener("click", addVis);