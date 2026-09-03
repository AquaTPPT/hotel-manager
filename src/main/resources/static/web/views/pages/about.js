export default function render() {
    const main = document.getElementById("main-content");
    main.innerHTML = "";

    const title = document.createElement("h2");
    title.textContent = "Learn about us";

    const description = document.createElement("p");
    description.textContent = "Some say, the best class!!";

    main.appendChild(title);
    main.appendChild(description);
}
