package Project10;

class Printer {
    private String text;

    public Printer(String text) { // constructor method
        this.text = text;
    }

    public String getPrint() { //getter
        return text;
    }

    public void setPrint(String newText) { //setter
        text = newText;
    }
}

public class project10_part1 {
    public static void PrinterAssign() {
        // create obj_1 of printer class
        Printer obj_1 = new Printer("Text");

        // the reference of obj_1 to obj_2 and obj_3
        Printer obj_2 = obj_1;
        Printer obj_3 = obj_1;

        System.out.println("Before:");
        System.out.println("\nFirst object property: " + obj_1.getPrint());
        System.out.println("Second object property: " + obj_3.getPrint());
        System.out.println("Third object property: " + obj_3.getPrint());

        // new property of obj_2
        obj_2.setPrint("New Text");

        System.out.println("\nAfter:");

        System.out.println("\nFirst object property: " + obj_1.getPrint());
        System.out.println("Second object property: " + obj_3.getPrint());
        System.out.println("Third object property: " + obj_3.getPrint());
    }

    public static void modifyObjectProperty(Printer obj) {
        // change object property inside
        obj.setPrint("New");
    }

    public static void main(String[] args) {
        PrinterAssign();

        System.out.println("Method Reference:\n");
        Printer obj = new Printer("First");

        // before call
        System.out.println("Before: \n" + obj.getPrint());

        // passing an obj as an argument
        modifyObjectProperty(obj);

        // after call
        System.out.println("After: \n" + obj.getPrint());
    }
}