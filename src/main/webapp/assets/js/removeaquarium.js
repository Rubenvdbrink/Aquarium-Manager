function removeAquarium() {
    let formData = new FormData(document.querySelector("#removeaquariumform"));
    let encData = new URLSearchParams(formData.entries());

    fetch("restservices/aquarium/removeAquarium", {method: 'DELETE', headers: { 'Authorization': `Bearer ${window.sessionStorage.getItem("myJWT")}` }, body: encData})
        .then(function(response) {
            if(response.ok) {
                window.alert("Aquarium succesvol verwijderd!");
                return response.json();
            }
            else throw "kan aquarium niet verwijderen";
        })
        .catch(console.log && window.alert);
}

document.querySelector("#verwijderaquarium").addEventListener("click", removeAquarium);