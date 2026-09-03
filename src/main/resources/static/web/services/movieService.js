const BASE_URL = "http://localhost:3000/api";

async function getMovies() {
    const response = await fetch(`${BASE_URL}/movies`);

    return await response.json();
}

export default { getMovies };
