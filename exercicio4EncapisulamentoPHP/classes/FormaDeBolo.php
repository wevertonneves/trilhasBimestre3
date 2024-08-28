<?php

class FormaDeBolo{

    public array $ingredientes = ["leite", "ovo","Manteiga", "Fermento"];
    public int $tempoForno =1;

    public function fazerBolo()
    {
        
     if(count($this->ingredientes) === 0){
        echo "não temos Ingredientes suficientes <br>";
        return;

     }

    }
}