function addVerlichting() {
    let formData = new FormData(document.querySelector("#verlichtingform"));
    let encData = new URLSearchParams(formData.entries());

    fetch("restservices/toebehoren/addVerlichting", {method: 'POST', headers: { 'Authorization': `Bearer ${window.sessionStorage.getItem("myJWT")}` }, body: encData})
        .then(function(response) {
            if(response.ok) return response.json();
            else throw "kan verlichting niet toevoegen";
        })
        .catch(console.log);
}

document.querySelector("#maakverlichtingaan").addEventListener("click", addVerlichting);

function addThermostaat() {
    let formData = new FormData(document.querySelector("#thermostaatform"));
    let encData = new URLSearchParams(formData.entries());

    fetch("restservices/toebehoren/addThermostaat", {method: 'POST', headers: { 'Authorization': `Bearer ${window.sessionStorage.getItem("myJWT")}` }, body: encData})
        .then(function(response) {
            if(response.ok) return response.json();
            else throw "kan thermostaat niet toevoegen";
        })
        .catch(console.log);
}

document.querySelector("#maakthermostaataan").addEventListener("click", addThermostaat);

function addFilter() {
    let formData = new FormData(document.querySelector("#filterform"));
    let encData = new URLSearchParams(formData.entries());

    fetch("restservices/toebehoren/addFilter", {method: 'POST', headers: { 'Authorization': `Bearer ${window.sessionStorage.getItem("myJWT")}` }, body: encData})
        .then(function(response) {
            if(response.ok) return response.json();
            else throw "kan filter niet toevoegen";
        })
        .catch(console.log);
}

document.querySelector("#maakfilteraan").addEventListener("click", addFilter);