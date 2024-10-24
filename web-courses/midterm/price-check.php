<?php
include "components/header.php";
session_start();
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Price Checker</title>
    <link rel="stylesheet" href="path_to_your_css_file.css"> <!-- Add your CSS file here -->
</head>

<body>
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                <div class="card bg-dark text-white" style="border-radius: 1rem;">
                    <div class="card-body p-5 text-center">

                        <div class="container mt-4">
                            <h3 class="text-center mb-4">Check Laundry Service Price</h3>
                            <form class="w-75 mx-auto" onsubmit="return checkPrice(event)">

                                <div class="mb-3">
                                    <label for="weight" class="form-label">Weight (kg)</label>
                                    <input type="number" class="form-control" id="weight" placeholder="Enter weight" name="weight" required>
                                </div>

                                <div class="mb-3">
                                    <label for="service" class="form-label">Service Type</label>
                                    <select class="form-select" id="service" name="service" required>
                                        <option value="" disabled selected>Select service type</option>
                                        <option value="wash_dry">Wash & Dry</option>
                                        <option value="wash_iron">Wash & Iron</option>
                                        <option value="iron_only">Iron Only</option>
                                    </select>
                                </div>

                                <div class="mb-3">
                                    <label for="type" class="form-label">Delivery Type</label>
                                    <select class="form-select" id="type" name="type" required>
                                        <option value="" disabled selected>Select delivery type</option>
                                        <option value="regular">Regular</option>
                                        <option value="express">Express</option>
                                    </select>
                                </div>

                                <div class="mb-3">
                                    <label for="discount" class="form-label">Discount</label>
                                    <select class="form-select" id="discount" name="discount" required>
                                        <option value="" disabled selected>Select discount type</option>
                                        <option value="non_member">Non Member</option>
                                        <option value="member">Member</option>
                                    </select>
                                </div>

                                <button type="submit" class="btn btn-primary w-100">Check Price</button>

                                <div class="result" id="result" style="color: red; padding-top: 13px; font-size: 20px; font-weight: bold;"></div>
                            </form>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="js/price.js"></script>
</body>

</html>
