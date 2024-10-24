function validate() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    var error = document.getElementById("error-msg");
    var errorMessage = "";

    if (username === "" || password === "") {
        errorMessage = "Please enter username and password. ";
    }

    if (password.length > 6) {
        errorMessage = "Password must be less than 6 characters. ";
    }

    if (!/[A-Z]/.test(password) || !/[a-z]/.test(password)) {
        errorMessage = "Password must contain at least one uppercase and one lowercase letter. ";
    }

    if (errorMessage !== "") {
        error.innerHTML = errorMessage;
        return false;
    }

    return true;
}
