function removeAquarium() {
    let formData = new FormData(document.querySelector("#removeaquariumform"));
    let encData = new URLSearchParams(formData.entries());

    fetch("restservices/aquarium/removeAquarium", {method: 'DELETE', headers: { 'Authorization': `Bearer ${window.sessionStorage.getItem("myJWT")}` }, body: encData})
        .then(function(response) {
            if(response.ok) return response.json();
            else throw "kan aquarium niet verwijderen";
        })
        .catch(console.log);
}

document.querySelector("#verwijderaquarium").addEventListener("click", removeAquarium);