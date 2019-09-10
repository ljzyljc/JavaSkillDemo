### 异常，引用，finaly,finalize,final

1.Exception和Error都继承Throwable

2.Exception分为可检查异常（checked）和不检查异常(unchecked),不检查异常也就是所谓的运行时异常，比如NullPointerException，ArrayIndexOutOfBoundsException等

3.**Checked Exception不兼容functional编程。**

4.NoClassDefFoundError和ClassNotFoundException的区别

    NoClassDefFoundError是一个错误(Error)，而ClassNOtFoundException是一个异常，在Java中对于错误和异常的处理是不同的，我们可以从异常中恢复程序但却不应该尝试从错误中恢复程序。
    ClassNotFoundException的产生原因：
    
    Java支持使用Class.forName方法来动态地加载类，任意一个类的类名如果被作为参数传递给这个方法都将导致该类被加载到JVM内存中，如果这个类在类路径中没有被找到，那么此时就会在运行时抛出ClassNotFoundException异常。
    
    ClassNotFoundException的产生原因：
    
    Java支持使用Class.forName方法来动态地加载类，任意一个类的类名如果被作为参数传递给这个方法都将导致该类被加载到JVM内存中，如果这个类在类路径中没有被找到，那么此时就会在运行时抛出ClassNotFoundException异常。
    ClassNotFoundException的产生原因主要是：
    Java支持使用反射方式在运行时动态加载类，例如使用Class.forName方法来动态地加载类时，可以将类名作为参数传递给上述方法从而将指定类加载到JVM内存中，如果这个类在类路径中没有被找到，那么此时就会在运行时抛出ClassNotFoundException异常。
    解决该问题需要确保所需的类连同它依赖的包存在于类路径中，常见问题在于类名书写错误。
    另外还有一个导致ClassNotFoundException的原因就是：当一个类已经某个类加载器加载到内存中了，此时另一个类加载器又尝试着动态地从同一个包中加载这个类。通过控制动态类加载过程，可以避免上述情况发生。
    
    NoClassDefFoundError产生的原因在于：
    如果JVM或者ClassLoader实例尝试加载（可以通过正常的方法调用，也可能是使用new来创建新的对象）类的时候却找不到类的定义。要查找的类在编译的时候是存在的，运行的时候却找不到了。这个时候就会导致NoClassDefFoundError.
    造成该问题的原因可能是打包过程漏掉了部分类，或者jar包出现损坏或者篡改。解决这个问题的办法是查找那些在开发期间存在于类路径下但在运行期间却不在类路径下的类。
    
    
    ClassNotFoundException是在写编码的时候编译器就能告诉你这个地方需要捕获异常，如：你使用Class.forName的时候就必须要你捕获或者throws这个异常。
    而NoClassDefFoundError在Javac已经把程序成功的编译成字节码文件了,当JVM进程启动，通过类加载器加载字节码文件，然后由解释器去解释字节码指令的时候，在classpath下找不到对应的类进行加载时就会发生NoClassDefFoundError这个错误。
    我也不知道我的理解正确么？