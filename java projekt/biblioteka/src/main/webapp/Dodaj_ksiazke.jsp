<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dodaj książkę</title>
    
    <style>

    /* Ustawienia ogólne */
* {
  box-sizing: border-box;
  font-family: 'Roboto', sans-serif;
  font-size: 16px;
}

body {
  margin: 0;
  background-color:  rgb(210, 210, 222);
}

h1 {
  text-align: center;
  margin-top: 20px;
  font-size: 36px;
  color: #333;
}

form {
  width: 90%;
  max-width: 500px;
  margin: 30px auto;
  background-color: #fff;
  padding: 20px;
  border-radius: 15px;
  box-shadow: 0 5px 10px rgba(0, 0, 0, 0.6);
}

label {
  display: block;
  margin-bottom: 10px;
  color: #333;
}

input[type="text"],
input[type="date"] {
  width: 100%;
  padding: 10px;
  border: 1px solid #ccc;
  border-radius: 9px;
  font-size: 16px;
  color: #555;
  margin-bottom: 10px;
}

button[type="submit"] {
  background-color: #008CBA;
  color: #fff;
  border: none;
  padding: 10px 20px;
  font-size: 16px;
  border-radius: 20px;
  cursor: pointer;
  transition: background-color 0.3s ease;
 
}

button[type="submit"]:hover {
  background-color: #006B8E;
  background-color: rgba(0, 0, 0, 0.6);
}
    
    </style>
</head>
<body>

    <h1>Dodaj książkę</h1>
    <form method="post" action="DodajKsiazkeServlet">
        
        <label for="tytul">Tytuł:</label>
        <input type="text" id="tytul" name="tytul" required><br>
        <label for="autor">Autor:</label>
        <input type="text" id="autor" name="autor" required><br>
        <label for="wydawnictwo">Wydawnictwo:</label>
        <input type="text" id="wydawnictwo" name="wydawnictwo" required><br>
        <label for="dataPublikacji">Data publikacji:</label>
        <input type="date" id="dataPublikacji" name="dataPublikacji" required><br>
        <label for="pdf">Ścieżka do pliku PDF:</label>
        <input type="text" id="pdf" name="pdf" required><br>
        <button type="submit">Dodaj</button>
    </form>
     
   
   
     
</body>
</html>
