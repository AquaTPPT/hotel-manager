import header from "./components/header.js";

export default function renderShell(root) {
    const pageHeader = header();

    const main = document.createElement("main");
    main.id = "main-content";

    root.appendChild(pageHeader);
    root.appendChild(main);
}
