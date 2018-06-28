#! /bin/bash

VALTOZO="^[0-9[:space:]]+$"

if test $# -eq 2; then
    if ! [[ $* =~ $VALTOZO ]]; then
        echo "Nem szám a paraméter"
    else
        if ! (( $1 % 2 == 0 )); then
            echo "Az első paraméter nem páros!"
        else
            if ! (( $2 % 2 == 0 )); then
                echo "A második paraméter nem páros!"
            else
                if test $1 -lt $2; then
                    echo "A $1 a kisebb"
                else
                    echo "a $2 a kisebb"
                fi
            fi
        fi
    fi
else
    echo "PONTOSAN 2 paramétert várok!"
    exit
fi
