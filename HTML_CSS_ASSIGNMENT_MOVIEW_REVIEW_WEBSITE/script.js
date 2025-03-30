const films = [
    {
        id: "bahubali",
        title: "Baahubali: The Beginning",
        poster: "https://upload.wikimedia.org/wikipedia/en/7/7e/Baahubali_the_Conclusion.jpg",
        rating: "8.1",
        description: "An epic action film that narrates the story of the ancient kingdom of Mahishmati.",
        cast: "Prabhas, Rana Daggubati, Anushka Shetty, Tamannaah",
        crew: "Director: S. S. Rajamouli, Music: M. M. Keeravani"
    },
    {
        id: "sye-raa-narasimha-reddy",
        title: "Sye Raa Narasimha Reddy",
        poster: "https://upload.wikimedia.org/wikipedia/en/2/20/Sye_Raa_Narasimha_Reddy_poster.jpg",
        rating: "7.5",
        description: "A historical action film based on the life of Indian independence activist Uyyalawada Narasimha Reddy.",
        cast: "Chiranjeevi, Amitabh Bachchan, Nayanthara, Tamannaah",
        crew: "Director: Surender Reddy, Music: Amit Trivedi"
    },
    {
        id: "arjun-reddy",
        title: "Arjun Reddy",
        poster: "https://upload.wikimedia.org/wikipedia/en/f/f7/Arjun_Reddy.jpg",
        rating: "8.2",
        description: "A romantic drama that follows the story of a young surgeon who spirals into self-destruction after a failed relationship.",
        cast: "Vijay Deverakonda, Shalini Pandey, Rahul Ramakrishna",
        crew: "Director: Sandeep Reddy Vanga, Music: Radhan"
    }
];

function renderFilms(filteredFilms) {
    const filmList = document.getElementById("movieList");
    filmList.innerHTML = "";

    filteredFilms.forEach(film => {
        const filmCard = document.createElement("div");
        filmCard.classList.add("movie");

        filmCard.innerHTML = `
            <img src="${film.poster}" alt="${film.title}">
            <h3>${film.title}</h3>
            <p>⭐ Rating: ${film.rating}/10</p>
            <p>${film.description}</p>
            <button class="details-btn" data-id="${film.id}">View Details</button>
        `;

        filmList.appendChild(filmCard);
    });

    
    document.querySelectorAll(".details-btn").forEach(button => {
        button.addEventListener("click", function() {
            const filmId = this.getAttribute("data-id");
            window.location.href = `movie.html?id=${filmId}`;
        });
    });
}


renderFilms(films);


document.getElementById("searchInput").addEventListener("input", function() {
    const searchTerm = this.value.toLowerCase();
    const filteredFilms = films.filter(film => 
        film.title.toLowerCase().includes(searchTerm)
    );
    renderFilms(filteredFilms);
});
