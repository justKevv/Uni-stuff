<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
    <h2>Sample Form</h2>
    <form id="myForm">
        <label for="fruit">Choose a Fruit:</label>
        <select name="fruit" id="fruit">
            <option value="apple">Apple</option>
            <option value="banana">Banana</option>
            <option value="mango">Mango</option>
            <option value="orange">Orange</option>
        </select>

        <br>

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

    <div id="result">
        <!-- Result will be displayed here -->
    </div>

    <script>
    $(document).ready(function () {
        $("#myForm").submit(function (e) {
            e.preventDefault(); // Prevent default form submission

            // Collect form data
            var formData = $("#myForm").serialize();

            // Send data to PHP server
            $.ajax({
                url: "process_next.php", // Change to the appropriate PHP file name
                type: "POST",
                data: formData,
                success: function (response) {
                    // Display server response in the "result" div
                    $("#result").html(response);
                }
            });
        });
    });
    </script>
</body>
</html>
