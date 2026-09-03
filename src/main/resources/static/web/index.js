import router from "../router.js";
import renderShell from "./views/layout.js";

window.addEventListener("DOMContentLoaded", () => {
    const root = document.getElementById("app");
    App(root);
});

function App(root) {
    renderShell(root);
    router.start();
}
