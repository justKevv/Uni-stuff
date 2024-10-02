<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        table {
            border-collapse: collapse;
            width: 50%;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
    </style>
</head>
<body>
    <?php
        $Teacher = [
            'name' => 'Elok Nur hamdana',
            'residence' => 'Malang',
            'gender' => 'Female',
        ];
    ?>
    <table>
        <tr>
            <th>Attribute</th>
            <th>Value</th>
        </tr>
        <?php
            foreach ($Teacher as $attribute => $value) {
                echo "<tr><td>{$attribute}</td><td>{$value}</td></tr>";
            }
        ?>
    </table>
</body>
</html>
