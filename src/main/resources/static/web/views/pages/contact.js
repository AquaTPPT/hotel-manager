export default function render() {
    const main = document.getElementById("main-content");
    main.innerHTML = "";

    const title = document.createElement("h2");
    title.textContent = "Contact us";

    const description = document.createElement("p");
    description.textContent = "Send a hug to class 08";

    main.appendChild(title);
    main.appendChild(description);
}
