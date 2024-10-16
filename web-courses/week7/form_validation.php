<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>

<body>
    <h1>Form Input with Validation</h1>
    <form id="myForm" method="post">
        <label for="name">Name:</label>
        <input type="text" name="name" id="name">
        <span id="name-error" style="color: red;"></span><br>
        <label for="email">Email:</label>
        <input type="email" name="email" id="email">
        <span id="email-error" style="color: red;"></span><br>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password">
        <span id="password-error" style="color: red;"></span><br>

        <input type="submit" value="Submit">
    </form>

    <div id="result">
        <!-- Result will be displayed here -->
    </div>
    <script>
        $(document).ready(function() {
            $("#myForm").submit(function(event) {
                event.preventDefault(); // Prevent default form submission

                var name = $("#name").val();
                var email = $("#email").val();
                var password = $("#password").val();
                var valid = true;

                if (name === "") {
                    $("#name-error").text("Name is required");
                    valid = false;
                } else {
                    $("#name-error").text("");
                }

                if (email === "") {
                    $("#email-error").text("Email is required");
                    valid = false;
                } else {
                    $("#email-error").text("");
                }

                if (password === "" || password.length < 8) {
                    $("#password-error").text("Password must be at least 8 characters");
                    valid = false;
                } else {
                    $("#password-error").text("");
                }

                if (valid) {
                    $.ajax({
                        type: "POST",
                        url: "process_validation.php",
                        data: $("#myForm").serialize(), // Serialize form data
                        success: function(response) {
                            // Handle the response from the server
                            $("#result").html(response);
                        },
                    });
                }
            });
        });
    </script>
</body>

</html>
