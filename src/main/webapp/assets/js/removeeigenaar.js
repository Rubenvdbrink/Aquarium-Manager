function removeEigenaar() {
    let formData = new FormData(document.querySelector("#removeeigenaarform"));
    let encData = new URLSearchParams(formData.entries());

    fetch("restservices/beheerder/removeEigenaar", {method: 'DELETE', headers: { 'Authorization': `Bearer ${window.sessionStorage.getItem("myJWT")}` }, body: encData})
        .then(function(response) {
            if(response.ok) {
                window.alert("Eigenaar succesvol verwijderd!");
                return response.json();
            }
            else throw "kan eigenaar niet verwijderen";
        })
        .catch(console.log && window.alert);
}

document.querySelector("#verwijdereigenaar").addEventListener("click", removeEigenaar);