// Create a connection to the database
const mysql = require('mysql');
const connection = mysql.createConnection({
  host: 'localhost',
  user: 'mbcland',
  password: 'mbcland',
  database: 'user_db'
});

// Handle registration form submission
const registerForm = document.getElementById('loginForm');
registerForm.addEventListener('submit', (event) => {
  event.preventDefault();
  const username = document.getElementById('username').value;
  const email = document.getElementById('email').value;
  const password = document.getElementById('password').value;

  // Insert user data into the database
  const query = `INSERT INTO users (username, email, password) VALUES ("${username}", "${email}", "${password}")`;
  connection.query(query, (error, results, fields) => {
    if (error) {
      console.error(error);
      return;
    }
    console.log('User registered successfully!');
  });
});

// Handle login form submission
const loginForm = document.getElementById('loginForm');
loginForm.addEventListener('submit', (event) => {
  event.preventDefault();
  const loginUsername = document.getElementById('email').value;
  const loginPassword = document.getElementById('loginPassword').value;

  // Check if the user exists in the database
  const query = `SELECT * FROM users WHERE email = "${email}" AND password = "${loginPassword}"`;
  connection.query(query, (error, results, fields) => {
    if (error) {
      console.error(error);
      return;
    }
    if (results.length > 0) {
      console.log('User logged in successfully!');
    } else {
      console.log('Invalid email or password!');
    }
  });
});

// Connect to the database
connection.connect((error) => {
  if (error) {
    console.error(error);
    return;
  }
  console.log('Connected to the database!');
});
