# RULES OF JAVA PROGRAMMING 👾
1. To convert datatypes of a variable both the 2 variable and the expression have to mentioned with that datatypes

#### _SYNTAX_: 
    datatype <var_name> = (datatype)<expression>

2. next line
#### _SYNTAX_:
    println()

3.  same line
#### _SYNTAX_:
    print()

4. printf() : takes multiple argumemts and print formatted datatype
## Unary operators:

5. MinusOperator(-): used to conevrt (+) -> (-) and (-) -> (+)

6. NotOpeartor(!): used to negate value from True to False vice versa

7. BitwsieOperator(~): complement the value by [-(N+1)]

## Relatinal operators:

8. Relational opeartors gives only boolean values


## Bitwsie operator:

9. (^) XOR: if 2 numbers are different in binary returns 1

10. (<<) left shift: shift binary digits by 0 to left

11. (>>) right shift: shifts to right in binary (remove)

12. shifting operations cannot be performed 
    if one of the number is <negative> . 


13. ternary operator: . 

_Syntax_: 

    variable = expression1 ? expression2 : expression3
    if (Expression1) is true then (expression2) evaluated
    else (expression3) will be evaluated

14. instanceOf operator:
* used to check the objects are present in the class .

15. character should be single quoted(' ')

## Iteration Statemnets:
16. JavaEnchanced for loop:

* Its is used to iterate through array sequntially without INDEX .

17. for(System.out.println("hi");i<10;i++)
    is valid

18. while return any value should use 
#### _Syntax_:
    public static <DATA_TYPE> <FUNCTION_NAME> 
    (String args[]) 

## Math:
19. ceil()
####
    ceil("2.5")
    if value = 2.5 then
    it becomes 3

20. floor()
####
    floor(<2.5>)
    if value = 2.5 then
    it becomes 2


## methods:
21. In method_overloading overloading can be performed by **changing parameters**:
#### _Syntax:_
    public class Solution
        public static int add(int a ,int b) {
            return a + b;
        }
        public static int add(int a ,int b ,int c) {
            return a + b;
        }
        public static void main(String args[]) {
            int twonum = Solution.add(10,30);
            int threenum = Solution.add(10,30,40);
            System.out.println(twonum)
            System.out.println(threenum)
        }
22. In method_overloading overloading can be performed by **changing datatypes**:
#### _Syntax:_
    public class Solution
        public static int add(int a ,int b) {
            return a + b;
        }
        public static float add(double a ,double b) {
            return a + b;
        }
        public static void main(String args[]) {
            int twonum = Solution.add(10,30);
            double threenum = Solution.add(10,30);
            System.out.println(twonum)
            System.out.println(threenum)
        }
## Arrays

23. Creating array :
#### _Syntax:_
**array declaration -**

    <datatype> <variable_name>
    ex:
    int arr[]

**array creation -**
    
    arr = new int[20]

**both declaration and creation of array can be done in a single statement -**
    
    int arr[] = new int[20]

24. initializing array :

**In single line**

#### _Syntax :_

    <datatype> <var_name>[] = {val1 , val2 ,....}
    ex:
    int arr[] = {1,2,3,4,5}

**Using for loop**

#### _Syntax :_

    import java.util.*;
    import java.io.*;

    class Example {
        public static void main (String args[]) {
            int arr[] = new int[5];
            Scanner Scan = new Scanner(System.in):
            for(int i = 0; i<arr.length ; i++) {
                arr[i] = Scan.nextInt();
            }
        }
    }
    output : 1 2 3 4 5

**acessing array elements**

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[4]);
    output : 1 2 5

**traversing array**

    for(int i : arr) {
        System.out.print(i);
    }
    output : 1 2 3 4 5

**array storing**

    int arr[] = new int[10]

    here arr is the reference to the array not the name

**array methods**

    arr.length : returns the length of the array
    ex : arr.length = 10

    arr.sort() : sorts the array in ascending order
    ex : arr = {1,2,3,4,5}

    arr.toString() : returns the string representation of the array

    arr.clone() : returns the copy of the array

    arr.equals(arr1) : returns true if both arrays are equal

    arr.fill(val) : fills the array with the given value


**resassigning the reference can be happened but its data type cannot be changed**

    
    int arr[] = new int[10]
    int arr1[] = new int[20]

    arr1 =  arr

    now both arrays refer to the same array
    now the space assigned for the arr[10] will be freed by the garabage collector
    now that space can be used for future object allocation

**character**

    char ch[] = {a,b,c}
    System.out.print(ch + " ")
    output : a b c

    but 

    int arr[] = {1,2,3}
    System.out.print(arr + " ")
    output : <address of the array>

    This happens due to unicode is already assigned to characters
    and this is same for strings and floats also

## 2-D arrays
25. Declaring 2-D arrays

_Syntax :_

    <datatype> <var_name>[][] = new <datatype>[row][col]
    ex:
    int arr[][] = new int[3][3]

26. Initializing 2-D arrays

_Syntax :_

    <datatype> <var_name>[][] = {{val1,val2,val3},{val1,val2,val3},{val1,val2,val3}}
    ex:
    int arr[][] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}}
    . there are 3 rows and 3 columns
    . the array should be filled in row wise
    . left to right

## Arraylist
27. arraylist is a class in java.util package

_Syntax :_
    
    <Arraylist> <var_name> = new <Arraylist>()
    ex:
    Arraylist arr = new Arraylist()
    
28. arraylist methods : To acess the arraylist we use the methods in the Arraylist class

        . add() : adds the element to the arraylist
        ex: arr.add(10)

        . remove() : removes the element from the arraylist
        ex: arr.remove(10)

        . get() : gets the element from the arraylist
        ex: arr.get(10)

        . set() : sets the element to the arraylist
        ex: arr.set(10,20)

        . size() : returns the size of the arraylist
        ex: arr.size()

        . clear() : clears the arraylist
        ex: arr.clear()

        . contains() : checks whether the element is present in the arraylist
        ex: arr.contains(10)

        . isEmpty() : checks whether the arraylist is empty or not
        ex: arr.isEmpty()

        . indexOf() : returns the index of the element in the arraylist
        ex: arr.indexOf(10)
