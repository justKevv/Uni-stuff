<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Sample Form</h2>
    <form method="POST" action="process_next.php">
        <label for="fruit">Choose a Fruit:</label>
        <select name="fruit" id="fruit">
            <option value="apple">Apple</option>
            <option value="banana">Banana</option>
            <option value="mango">Mango</option>
            <option value="orange">Orange</option>
        </select>

        <br><br>

        <label>Select Favorite Color:</label><br>
        <input type="checkbox" name="color[]" value="red"> Red<br>
        <input type="checkbox" name="color[]" value="blue"> Blue<br>
        <input type="checkbox" name="color[]" value="green"> Green<br>

        <br>

        <label>Select Gender:</label><br>
        <input type="radio" name="gender" value="Male"> Male<br>
        <input type="radio" name="gender" value="Female"> Female<br>

        <br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
