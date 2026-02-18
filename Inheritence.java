class Keyboard{
int keys = 100;
String color = "blue";
public void hitnum(){
    System.out.println("sent number");
}
public void pressed(){
    System.out.println("key pressed");
}
}
class AdvKeyboard extends Keyboard{
    public void throwit(){
        System.out.println("got it");
    }
}

class Inheritence{
    public static void main(String args[]){
        Keyboard key=new Keyboard();
        key.hitnum();

        AdvKeyboard key1=new AdvKeyboard();
        key1.throwit();
        key1.pressed();
        key1.hitnum();
    }
}