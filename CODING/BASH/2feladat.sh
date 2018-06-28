#! /bin/bash

echo "Várok egy nevet:"
read NEV

if [ $NEV = istvan ] ; then
    echo "te vagy a legjobb mentor!"
else
    if [ $NEV = tasi ] ; then
        echo "te vagy a legjobb js mentor!"
    else
        if [ $NEV = laci ] ; then
            echo "neked van a legszebb macskad a mentorok kozt!"
        else
            echo "hello diak!"
        fi
    fi
fi
    
