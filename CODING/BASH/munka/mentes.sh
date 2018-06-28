#! /bin/bash

MENTENI="$PWD/1 $PWD/2"
for KONYVTAR in $MENTENI; do
    cp -r $KONYVTAR $PWD/mentes
done
