function register() {
    let formData = new FormData(document.querySelector("#registerform"));
    let encData =  new URLSearchParams(formData.entries());

    fetch("restservices/authentication/register", {method: 'POST', body: encData})
        .then(function(response) {
            if (response.ok) return response.json();
            else throw "Vul de velden correct in";
        })
        .then(MyJson => window.sessionStorage.setItem("myJWT", MyJson.JWT))
        .catch(console.log);
}

document.querySelector("#register").addEventListener("click", register);