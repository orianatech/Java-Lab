//3.	Write a program to implement ‘this’ keyword.

class q3 {
    int instVar;

    q3(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        q3 obj = new q3(8);
        System.out.println("object reference = " + obj);
    }
}
