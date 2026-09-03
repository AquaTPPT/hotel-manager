export default function header() {
    const header = document.createElement("header");

    const pageTitle = document.createElement("h1");
    pageTitle.textContent = "> The Best Video Store!!!";

    const nav = document.createElement("nav");
    nav.innerHTML = `<a href="/">Home</a>
                     <a href="/about">About</a>
                     <a href="/contact">Contact</a>
                     `;

    header.appendChild(pageTitle);
    header.appendChild(nav);

    return header;
}
