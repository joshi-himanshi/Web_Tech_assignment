function showMsg() {
    let name = document.getElementById("name").value;
    document.getElementById("msg").innerText = "Hello " + name;
}

document.getElementById("myForm").addEventListener("submit", function(e) {
    e.preventDefault();
    showMsg();
});
