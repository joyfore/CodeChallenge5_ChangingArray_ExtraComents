class CodeChallenge5_ChangingArray_newComments {
    public static void main(String[] args) {

        /*
         * Create an array of numbers and add them all together using a loop.
         *
         * int one = 1;
         * int two = 2;
         * int thre = 3;
         * int three = 3;
         * int four = 4;
         * int all = one + two + thre + four;
         * String[] Y = {"1", "2", "3", "4"};
         * while (three < 4) {
         * System.out.println(Y[0]);
         * System.out.println(Y[1]);
         * System.out.println(Y[2]);
         * System.out.println(Y[3]);
         * three++;
         *
         * while (three == 4) {
         * System.out.println(all);
         * three++;
         * }
         * }
         *
         */

    /*
    Work on your formatting. Blocks of code {} should be better organized. Use tab button.
    Code works but is overcomplicated. Use array of ints. Can not add strings.

    Follow examples on W3 school. Compare use For and For Each Loops.

    https://www.w3schools.com/java/java_operators.asp
int x = 100 + 50;
int sum1 = 100 + 50;        // 150 (100 + 50)
int sum2 = sum1 + 250;      // 400 (150 + 250)
int sum3 = sum2 + sum2;     // 800 (400 + 400)

Operator	Name	Description	Example	Try it
+	Addition	Adds together two values	x + y
-	Subtraction	Subtracts one value from another	x - y
*	Multiplication	Multiplies two values	x * y
/	Division	Divides one value by another	x / y
%	Modulus	Returns the division remainder	x % y
++	Increment	Increases the value of a variable by 1	++x
--	Decrement	Decreases the value of a variable by 1	--x
int x = 10;
int x = 10;
x += 5;
=	x = 5	x = 5
+=	x += 3	x = x + 3
-=	x -= 3	x = x - 3
*=	x *= 3	x = x * 3
/=	x /= 3	x = x / 3
%=	x %= 3	x = x % 3
&=	x &= 3	x = x & 3
|=	x |= 3	x = x | 3
^=	x ^= 3	x = x ^ 3
>>=	x >>= 3	x = x >> 3
<<=	x <<= 3	x = x << 3
==	Equal to	x == y
!=	Not equal	x != y
>	Greater than	x > y
<	Less than	x < y
>=	Greater than or equal to	x >= y
<=	Less than or equal to	x <= y
Operator	Name	Description	Example	Try it
&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
!	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)
    https://www.w3schools.com/java/java_arrays_loop.asp
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (int i = 0; i < cars.length; i++) {
  System.out.println(cars[i]);
}
for (type variable : arrayname) {
  ...
}
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

    */

        // For Loop
        int[] numbers = { 1, 2, 3, 4 };
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {

            total += numbers[i]; // index of nums array
        }

        System.out.println(total);

        // For Each
        int[] nums = { 1, 2, 3, 4 };
        int sum = 0;

        for (int i : nums) {

            sum += i;// values inside nums array
        }

        System.out.println(sum);

    }
}
