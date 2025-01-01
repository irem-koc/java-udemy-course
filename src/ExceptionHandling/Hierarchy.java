package ExceptionHandling;

public class Hierarchy {
    //1- Object
    //2- Throwable - most of the classes endswith able is interface
    //3-1- Error(we cant handle)
    //4-1-1- ThreadDeath
    //4-1-2- IOError
    //4-1-3- VirtualMachineError - example out of memory
    //3-2- Exception(we can handle and should handle)
    //4-2-1- RuntimeException // all runtime exceptions are actually called Unchecked Exceptions - and others(SQLException,IOException, ..etc)  are called Checked Exceptions
    //5-2-1-1- ArithmeticException
    //5-2-1-1- NullPointerException
    //5-2-1-1- ArrayIndexOutOfBoundsException
    //4-2-2- SQLException
    //4-2-3- IOException

}
