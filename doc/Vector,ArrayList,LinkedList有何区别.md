### Vector,ArrayList,LinkedList的区别：

1.Vector在扩容时会**提高一倍**，而ArrayList则是**增加50%**,LinkedList则是Java提供的双向链表

2.外部排序，归并，交换（冒泡，快排），选择排序，插入排序等

    外部排序，掌握利用内存和外部存储处理超大数据集，至少要理解过程和思路。
    
    稳定的排序和不稳定的排序（快排，堆排）
    
3.TreeSet支持自然顺序访问，但是添加，删除，包含等操作要相对低效（log(n)时间）    
 
  HashSet则是利用哈希算法，理想情况下，如果哈希散列正常，可以提供常数时间的添加，删除，包含等操作，但是它不保证有序。
  
  LinkedHashSet,内部构件一个记录插入顺序的双向链表，因此提供了按照插入顺序遍历的能力，与此同时，也保证了常数时间的添加，删除，包含等操作，
  
  这些操作性能略低于HashSet,因为这需要维护链表的开销。
  
  在遍历元素时，HashSet性能受自身容量影响，所以初始化时，除非有必要，不然不要将其背后的HashMap容量设置过大。
  
  
4.Java提供的默认排序算法，需要区分是Arrays.sort()还是Collections.sort()(底层是调用Arrays.sort());什么数据类型；多大的数据集（太小的数据集，

   复杂排序是没有必要的，Java会直接进行二分插入排序）等
   
    1.对于原始数据类型，目前使用的是所谓双轴快速排序（Dual-Pivot QuickSort）,是一种改进的快速排序算法，早期版本是相对传统的快速排序。
    
    2.而对于对象数据类型，目前则是使用TimSort,思想上也是一种归并和二分插入排序（binarySort）结合的优化排序算法。TimSort并不是Java的独创，简单来说它的思路
    
    是查找数据集中已经排好序的分区（这里叫run）,然后合并这些分区来达到排序的目的。
    
    3.Java8引入并行排序算法（直接使用parallelSort方法），这是为了充分利用现代多核处理器的计算能力，底层实现基于fork-join框架
    
5.Java 8之中，Java平台支持了Lambda和Stream，相应的Java集合框架也进行了大范围的增强，以支持类似为集合创建相应stream或者parallelStream方法的实现，

   我们可以非常方便的实现函数式代码。
   
6.Java8在语言层面允许接口实现默认方法，Java 9中，Java标准类库提供了一系列的静态工程方法，比如List.of(),Set.of()大大简化了构建小的容器实例代码的代码量。
    
   利用容器静态工厂方法，同时也保证了不可变性。      
   
   
   
7.PriorityBlockingQueue
   
   
   
   
   
   
   
   
   
   
   
   
   
      