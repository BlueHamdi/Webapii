const form = document.getElementById('player-form');
form.addEventListener('submit', (event) => {
    event.preventDefault();
    const Firstname = document.getElementById('first-name').value;
    const Lastname = document.getElementById('last-name').value;
    const Email = document.getElementById('email').value;
    const Id = document.getElementById('id').value;

    const data = { Firstname, Lastname, Email,Id };

    fetch('http://localhost:8080/players', {
        method: 'POST',
        body: JSON.stringify(data),
        headers: { 'Content-Type': 'application/json' },
    })
        .then((response) => response.json())
        .then((data) => {
            console.log('Success:', data);
        })
        .catch((error) => {
            console.error('Error:', error);
        });
});


