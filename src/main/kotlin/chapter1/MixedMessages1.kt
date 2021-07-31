fun main(){
    var x = 0
    var y = 0
    while (x < 5) {
        //Sample codes
        //y = x - y // output - 00 11 21 32 42
        //y = y + x // output - 00 11 23 36 410

        //y = y + 3
        //if(y > 4) y = y -1
        // output - 03 15 27 39 411

        //x = x + 2
        //y = y + x
        // output - 22 57

        if (y < 5){
            x = x + 1
            if (y < 3) x = x - 1
        }
        y = y +3
        // output - 03 26 39 412

        print("$x$y ")
        x++
    }
}