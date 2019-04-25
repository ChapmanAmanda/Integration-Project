/**This class demonstrates the primitive data types and other relevant vocabulary.
 * @author Amanda
 *
 */
class PrimitiveDataTypes {
  // menu choice #1
  // data types method
  // this method shows all the primitive data types
  // as well as other java vocabulary words
  public static void dataTypes() {

    System.out.println("\nExcellent choice!\n Here are our primitive data types in Java: ");
    // System.out.println("Here is a list of our Primitive Data Types: ");

    String data = "\r\nbyte -- The byte data type is an 8-bit signed two's "
        + "complement integer. \n"
        + "        It has a minimum value of -128 and a maximum value of 127 "
        + "(inclusive). \r"
        + "        The byte data type can be useful for saving memory in large "
        + "arrays,\n        where the memory savings actually matters. They can"
        + " also be used in place \n        of int where their limits help to "
        + "clarify your code; the fact that a variable's\n        range is "
        + "limited can serve as a form of documentation. \r\n\n"
        + "short -- The short data type is a 16-bit signed two's complement "
        + "integer. \r\n        It has a minimum value of -32,768 and a maximum"
        + " value of 32,767 (inclusive).\n        As with byte, the same "
        + "guidelines apply: you can use a short to save memory \n        "
        + "in large arrays, in situations where the memory savings actually "
        + "matters.\r\n\n"
        + "int -- By default, the int data type is a 32-bit signed two's "
        + "complement integer,\n       which has a minimum value of -231 and "
        + "a maximum value of 231-1.\r\n"
        + "       Use the Integer class to use int data type as an unsigned "
        + "integer. Static \r\n       methods like compareUnsigned, "
        + "divideUnsigned etc have been added to the \r\n       Integer class to"
        + "support the arithmetic operations for unsigned integers.\r\n" 
        + "long -- The long data type is a 64-bit two's complement integer. The"
        + "signed \n       long has a minimum value of -263 and a maximum value"
        + " of 263-1. In \r\n"
        + "       Java SE 8 and later, you can use the long data type to represent an \n"
        + "       unsigned 64-bit long, which has a minimum value of 0 and a "
        + "maximum value \r\n"
        + "       of 264-1. Use this data type when you need a range of values "
        + "wider than \r\n       those provided by int. The Long class also "
        + "contains methods like \r\n       compareUnsigned, divideUnsigned etc "
        + "to support arithmetic operations for \r\n       unsigned long.\r\n\n"
        + "float -- The float data type is a single-precision 32-bit IEEE 754 "
        + "floating \r\n       point. Its range of values is beyond the scope of"
        + " this discussion. As with \r\n       the recommendations for byte and"
        + " short, use a float (instead of double) \r\n       if you need to "
        + "save memory in large arrays of floating point numbers. \r\n       "
        + "This data type should never be used for precise values, such as "
        + "currency. \r\n       For that, you will need to use the "
        + "java.math.BigDecimal class instead. \r\n       Numbers and Strings "
        + "covers BigDecimal and other useful classes provided \r\n"
        + "       by the Java platform.\r\n\n"
        + "double -- The double data type is a double-precision 64-bit IEEE 754\n"
        + "       floating point. Its range of values is beyond the scope of "
        + "this discussion\r\n       For decimal values, this data type is "
        + "generally the default choice. As \r\n       mentioned above, this "
        + "data type should never be used for precise values,\r\n       such as"
        + " currency.\r\n\n"
        + "boolean -- The boolean data type has only two possible values: true "
        + "and\n       false. Use this data type for simple flags that track "
        + "true/false \n       conditions. This data type represents one bit of"
        + " information, but its \n       \"size\" isn't something that's "
        + "precisely defined.\r\n\n"
        + "char -- The char data type is a single 16-bit Unicode character. It "
        + "has a \n       minimum value of '\\u0000' (or 0) and a maximum value"
        + " of '\\uffff'\n       (or 65,535 inclusive).\n\n"
        + "Variable -- is a location in memory.\r\n"
        + "Scope -- a variable is only accessible in the method where it was "
        + "declared\r\n"
        + "Casting -- forces Java to treat a variable as a different data type\r\n"
        + "Final -- constant variable, cannot be changed\r\n";

    System.out.println(data);
  }
  // Operator precedence:
  // Operators are special symbols that perform specific operations on one, two,
  // or three operands, and then return a result.
  // Operators with higher precedence are evaluated before operators with
  // relatively lower precedence. Operators on the same line have equal
  // precedence.
  // When operators of equal precedence appear in the same expression, a rule must
  // govern which is evaluated first. All binary operators except for the
  // assignment operators are
  // evaluated from left to right; assignment operators are evaluated right to
  // left.
}
