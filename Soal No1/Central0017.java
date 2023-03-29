/*Nama          : Arifah Lailatul Isthi'anah*/
/*Stambuk       : 13020210017*/
/*Kelas         : B1*/

interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0017 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0017 obj = new Central0017();
        System.out.println("main");
        obj.aaa();
    }
}
