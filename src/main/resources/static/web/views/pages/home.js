export default function render(movies = []) {
    const main = document.getElementById("main-content");
    main.innerHTML = "";

    const title = document.createElement("h2");
    title.textContent = "Best Movies Ever!!";

    const movieContainer = document.createElement("div");
    movieContainer.style.display = "flex";
    movieContainer.style.justifyContent = "center";
    movieContainer.style.alignItems = "center";
    movieContainer.style.flexDirection = "column";

    movies.forEach((movie) => {
        const movieTitle = document.createElement("h4");
        movieTitle.textContent = movie.title;

        movieContainer.appendChild(movieTitle);
    });

    main.appendChild(title);
    main.appendChild(movieContainer);
}
