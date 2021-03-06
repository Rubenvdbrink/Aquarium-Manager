function register() {
    let formData = new FormData(document.querySelector("#registerform"));
    let encData =  new URLSearchParams(formData.entries());

    fetch("restservices/authentication/register", {method: 'POST', body: encData})
        .then(function(response) {
            if (response.ok) {
                window.alert("Succesvol geregistreerd!");
                return response.json();
            }
            else throw "Vul de velden correct in / gebruikersnaam bestaat al";
        })
        .then(myJson => window.sessionStorage.setItem("myJWT", myJson.JWT))
        .catch(console.log && window.alert);
}

document.querySelector("#register").addEventListener("click", register);