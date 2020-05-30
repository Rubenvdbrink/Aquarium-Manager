let myAquaDiv = document.getElementById('alleaquaria');

function uitloggen() {
    window.sessionStorage.clear();
    myAquaDiv.innerHTML = ("");
}

document.querySelector("#uitloggen").addEventListener("click", uitloggen);