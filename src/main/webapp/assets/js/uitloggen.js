let myAquaDiv = document.getElementById('alleaquaria');

function uitloggen() {
    window.sessionStorage.clear();
    myAquaDiv.innerHTML = ("");
    window.alert("Succesvol uitgelogd!")
}

document.querySelector("#uitloggen").addEventListener("click", uitloggen);