<?php
$userName = "Jhon";
$userLastName = "Marston";
echo ("Hello World, my Name is " . $userName . " " . $userLastName . "\n");

$i = 1;
while ($i <= 10) {
    echo ($i . " * 5 = " . $i * 5 . "\n");
    $i++;
}

function bubbleSort(array $array): array
{
    $arraySize = count($array);
    for ($i = 0; $i < $arraySize - 1; $i++) {
        for ($j = 0; $j < $arraySize - $i - 1; $j++) {
            if ($array[$j] > $array[$j + 1]) {
                $temp = $array[$j];
                $array[$j] = $array[$j + 1];
                $array[$j + 1] = $temp;
            }
        }
    }
    return $array;
}

// * Using the Bubble Sort Algorithm
$inputArray = [64, 34, 25, 12, 22, 11, 90];
$sortedArray = bubbleSort($inputArray);

echo ("Sorted Array: " . implode(", ", $sortedArray)) . "\n";

function additionFunction(int $number01, int $number02): int
{
    return $number01 + $number02;
}

$result = additionFunction(5, 5);
echo ("Result: " . $result);
// ? Comment_01
// ? Comment_02
// ? Comment_03