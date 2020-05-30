function uitloggen(event) {
    window.sessionStorage.clear();
}

document.querySelector("#uitloggen").addEventListener("click", uitloggen);