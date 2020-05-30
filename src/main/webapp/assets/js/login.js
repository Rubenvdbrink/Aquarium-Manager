function login(event) {
    let formData = new FormData(document.querySelector("#loginform"));
    let encData = new URLSearchParams(formData.entries());

    fetch("restservices/authentication/login", { method: 'POST', body: encData})
        .then(function(response) {
            if (response.ok) return response.json();
            else throw "Wrong username/password";
        })
        .then(myJson => window.sessionStorage.setItem("myJWT", myJson.JWT))
        .catch(error => console.log(error));
}

document.querySelector("#login").addEventListener("click", login);