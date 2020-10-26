package com.pboreg;

// keywoard import untuk package eksternal
// ini akan mengimport class console
import com.terminal.Console;

// mengimport static method dari console
import static com.terminal.Console.log;

public class multiFileDgPackage {

    public static void main(String[] args){
        Player player1 = new Player("Dion");
        player1.show();

        Console.log("Menampilkan data dengan Console.log");
        Console.log(player1.getName());

        log("Menampilkan data dengan log saja");
        log(player1.getName());
    }
}
// ini tidak bisa, penggunaan private tidak di perkenankan
// private class Test{

//}
