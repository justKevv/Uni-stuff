<?php
$menu = [
    [
        "name" => "Home"
    ],
    [
        "name" => "News",
        "subMenu" => [
            [
                "name" => "Tourism",
                "subMenu" => [
                    [
                        "name" => "Beach"
                    ],
                    [
                        "name" => "Mountain"
                    ]
                ]
            ],
            [
                "name" => "Culinary"
            ],
            [
                "name" => "Entertainment"
            ]
        ]
    ],
    [
        "name" => "About"
    ],
    [
        "name" => "Contact"
    ]
];

function showMultipleMenu(array $menu) {
    echo "<ul>";

    foreach ($menu as $key => $item) {
        echo "<li>{$item['name']}";
        if (isset($item['subMenu'])) {
            showMultipleMenu($item['subMenu']);
        }
        echo "</li>";
    }
    echo "</ul>";
}

showMultipleMenu($menu);
