to run the project:


start your api and add the new string to ./services/movieService.js

```javascript

const BASE_URL = "http://localhost:3000/api"; //REPLACE HERE!!!!!

async function getMovies() {
    const response = await fetch(`${BASE_URL}/movies`);

    return await response.json();
}

export default { getMovies };


```

```bash
npm start
```