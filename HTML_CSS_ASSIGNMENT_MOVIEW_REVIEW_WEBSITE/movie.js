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


function getFilmId() {
    const params = new URLSearchParams(window.location.search);
    return params.get("id");
}


function displayFilmDetails() {
    const filmId = getFilmId();
    const film = films.find(f => f.id === filmId);

    if (!film) {
        document.getElementById("filmDetails").innerHTML = "<p>Film not found.</p>";
        return;
    }

    document.getElementById("filmDetails").innerHTML = `
        <div class="movie">
            <img src="${film.poster}" alt="${film.title}">
            <h3>${film.title}</h3>
            <p>⭐ Rating: ${film.rating}/10</p>
            <p>${film.description}</p>
            <p><strong>Cast:</strong> ${film.cast}</p>
            <p><strong>Crew:</strong> ${film.crew}</p>
        </div>
    `;
}

// Home button 
function navigateHome() {
    window.location.href = "index.html";
}

// Handle form submission for reviews
document.getElementById("feedbackForm").addEventListener("submit", function(event) {
    event.preventDefault();
    const userName = document.getElementById("userName").value;
    const userReview = document.getElementById("userReview").value;

    const review = document.createElement("div");
    review.classList.add("review");
    review.innerHTML = `<p><strong>${userName}</strong>: ${userReview}</p>`;
    document.getElementById("feedback").appendChild(review);

   
    document.getElementById("feedbackForm").reset();
});


displayFilmDetails();
