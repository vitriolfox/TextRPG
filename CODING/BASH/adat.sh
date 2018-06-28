#! /bin/bash

if [ -e $PWD/adatok.dat ] ; then
    let ADATOKSOROKSZAMA=`cat adatok.dat | wc -l `-1
    echo "Az adatok.dat file megvan."
    echo "Kérlek add meg a feldolgozandó személy sorszámát:"
    read SORSZAM
    if ! [[ $SORSZAM =~ ^[0-9]+$ ]]; then
        echo "Nem számot adtál meg!"
    elif [ $SORSZAM -gt $ADATOKSOROKSZAMA ] ; then
        echo "Túl magas számot adtál meg. A program kilép!"
        exit
    else
    KERESETTSOR=`cat adatok.dat | grep ^$SORSZAM\;.*`
    echo $KERESETTSOR
    SORSZAM=`echo $KERESETTSOR | cut -f 1 -d ';'`
    echo "Sorszáma: $SORSZAM"
    NEV=`echo $KERESETTSOR | cut -f 2 -d ';'`
    echo "Neve: $NEV"
    SZULHELY=`echo $KERESETTSOR | cut -f 3 -d ';'`
    echo "Születési helye: $SZULHELY"
    SZULIDO=`echo $KERESETTSOR | cut -f 4 -d ';'`
    echo "Születési ideje: $SZULIDO"
    ANYJANEVE=`echo $KERESETTSOR | cut -f 5 -d ';'`
    echo "Anyja neve: $ANYJANEVE"
    GYEREKKORINEV=`echo $KERESETTSOR | cut -f 6 -d ';'`
    echo "Gyerekkori neve: $GYEREKKORINEV"
    LAKHELY=`echo $KERESETTSOR | cut -f 7 -d ';'`
    echo "Lakhelye: $LAKHELY"
    NEM=`echo $KERESETTSOR | cut -f 8 -d ';'`
    echo "Neme: $NEM"
    CSALADIALLAPOT=`echo $KERESETTSOR | cut -f 9 -d ';'`
    echo "Családi álapot: $CSALADIALLAPOT"
    GYEREKEKSZAMA=`echo $KERESETTSOR | cut -f 10 -d ';'`
    echo "Gyerekek száma: $GYEREKEKSZAMA"
    DATE=`date +%Y`
    echo $DATE
    SZULETESIEV=`echo $SZULIDO | cut -f 1 -d ' '`
    echo $SZULETESIEV
    ELETKOR=`expr $DATE - $SZULETESIEV`
    echo "Életkora: $ELETKOR"
        if [[ $CSALADIALLAPOT = "házas" && $GYEREKEKSZAMA != 0 ]] ; then
            echo "$NEV, $ELETKOR éves, lakhelye: $LAKHELY, $CSALADIALLAPOT, gyermekei száma: $GYEREKEKSZAMA"
            echo "$NEV, $ELETKOR éves, lakhelye: $LAKHELY, $CSALADIALLAPOT, gyermekei száma: $GYEREKEKSZAMA" | rev
        elif [ $GYEREKEKSZAMA = 0 ] ; then
            echo "még nincs gyermeke"
            echo "még nincs gyermeke" | rev
        elif [ $CSALADIALLAPOT != "házas" ] ; then
            echo "$NEV, $ELETKOR éves, lakhelye: $LAKHELY, $CSALADIALLAPOT."
            echo "$NEV, $ELETKOR éves, lakhelye: $LAKHELY, $CSALADIALLAPOT." | rev
        fi
    fi
else
    echo "Az adatok.dat file nem található." >&2 ; exit 1
fi


