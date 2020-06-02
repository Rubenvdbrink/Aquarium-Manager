function login() {
    let formData = new FormData(document.querySelector("#loginform"));
    let encData = new URLSearchParams(formData.entries());

    fetch("restservices/authentication/login", { method: 'POST', body: encData})
        .then(function(response) {
            if (response.ok) {
                window.alert("Succesvol ingelogd!");
                return response.json();
            }
            else throw "Wrong username/password";
        })
        .then(myJson => window.sessionStorage.setItem("myJWT", myJson.JWT))
        .catch(console.log && window.alert);
}

document.querySelector("#login").addEventListener("click", login);