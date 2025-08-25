<?php
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