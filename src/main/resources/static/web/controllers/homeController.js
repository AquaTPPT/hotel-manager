import render from "/views/pages/home.js";
import movieService from "../services/movieService.js";

export async function init() {
    const movies = await movieService.getMovies();
    render(movies);
}
