package Project9;

// 1.1
class MyClass {

}

// 1.2
class MyClassAndMethod {
    public void print(String s) {
        System.out.println(s);
    }
}

// 1.3
class PrivateMethod {
    private void privateMethod() {
        System.out.println("Error method");

    }

    private void callPrivateMethod() {
        privateMethod();
    }
}

// 1.4
class Constructor {
    public Constructor() {
        System.out.println("Constructor");
    }
}

// 1.5
class Properties {
    public int intValue;
    public double doubleValue;
    public boolean booleanValue;
    public String stringValue;

    public void accessProperties() {
        System.out.println(intValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);
        System.out.println(stringValue);
    }
}

// 1.6
class PrivateProperties {
    private int intValue;
    private double doubleValue;
    private boolean booleanValue;
    private String stringValue;

    public void accessProperties() {
        // accessing properties
        System.out.println(intValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);
        System.out.println(stringValue);
    }
}

// 1.7
class GettersSetters {
    private int intValue;
    private double doubleValue;
    private boolean booleanValue;
    private String stringValue;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int value) {
        intValue = value;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double value) {
        doubleValue = value;
    }

    public boolean isBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean value) {
        booleanValue = value;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String value) {
        stringValue = value;
    }
}

// 1.8
class ArgumentConstructor {
    private int intValue;
    private String stringValue;

    public ArgumentConstructor(int intValue1, String stringValue) {
        intValue = intValue1;
        this.stringValue = stringValue;
    }

    public void printValues() {
        System.out.println(intValue);
        System.out.println(stringValue);
    }
}

class Project9_part1 {
    public static void main(String[] args) {
        // creation of object
        MyClass obj = new MyClass();

        // method call
        MyClassAndMethod obj2 = new MyClassAndMethod();
        obj2.print("print of 1.2");

        // error private method
        PrivateMethod obj3 = new PrivateMethod();
        //obj3.callPrivateMethod();


        Constructor obj4 = new Constructor();

        // accessing public properties
        Properties obj5 = new Properties();
        obj5.intValue = 10;
        obj5.doubleValue = 3.14;
        obj5.booleanValue = true;
        obj5.stringValue = "Hello";
        obj5.accessProperties();

        // private accessing (error method)
        PrivateProperties obj6 = new PrivateProperties();
        //System.out.println(obj6.intValue);

        // using getter and setter
        GettersSetters obj7 = new GettersSetters();
        obj7.setIntValue(20);
        obj7.setDoubleValue(2.55);
        System.out.println(obj7.getIntValue());
        System.out.println(obj7.getDoubleValue());

        // arguments in constructor
        ArgumentConstructor obj8 = new ArgumentConstructor(1111, "cocojambo");
        obj8.printValues();
    }
}