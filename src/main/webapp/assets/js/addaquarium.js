function addAquarium() {
    let formData = new FormData(document.querySelector("#addaquariumform"));
    let encData = new URLSearchParams(formData.entries());

    fetch("restservices/aquarium/addAquarium", {method: 'POST', headers: { 'Authorization': `Bearer ${window.sessionStorage.getItem("myJWT")}` }, body: encData})
        .then(function(response) {
            if(response.ok) {
                console.log("Aquarium succesvol toegevoegd!");
                window.alert("Aquarium succesvol toegevoegd!");
                return response.json();
            }
            else throw "kan aquarium niet toevoegen";
        })
        .catch(console.log && window.alert);
}

document.querySelector("#maakaan").addEventListener("click", addAquarium);