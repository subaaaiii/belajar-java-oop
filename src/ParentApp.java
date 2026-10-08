class ParentApp {
    static void main() {
        Child child = new Child();
        child.name =  "subairi";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);

//        karena di class child variable name di deklarasikan ulang
//        maka terjadi variable hiding yang membuat
//        name tidak di override oleh child

    }
}
