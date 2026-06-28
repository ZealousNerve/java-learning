public class ExceptionHierarchy {
    public static void main(String[] args) {
    /*  in this hierarchy every element is a class

    Object
    └── Throwable
        ├── Error(something which we can't handle)
        │   ├── OutOfMemoryError
        │   ├── StackOverflowError
        │   └── VirtualMachineError
        │
        └── Exception(something which we can and we should handle)
            ├── Checked Exceptions(compiler forced us to handle it)
            │   ├── IOException
            │   ├── SQLException
            │   └── ClassNotFoundException
            │
            └── RuntimeException (Unchecked exceptions-it depends on us wether we want to handle or not)
                ├── ArithmeticException
                ├── NullPointerException
                ├── ArrayIndexOutOfBoundsException
                ├── ClassCastException
                └── NumberFormatException 

    
    */
    }
}
