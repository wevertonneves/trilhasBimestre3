<?php

require_once "./classes/FormaDeBolo.php";

$primeiroBolo = new FormaDeBolo();
$primeiroBolo->fazerBolo();

echo '<pre>' ; print_r($primeiroBolo);