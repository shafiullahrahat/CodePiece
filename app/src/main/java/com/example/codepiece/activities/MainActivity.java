package com.example.codepiece.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.codepiece.R;
import com.example.codepiece.adapters.CustomAdapterForRecyclerView;
import com.example.codepiece.models.ProblemsTitleAndSolutionsModelClass;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int condition;
    Intent intent;

    String[] problemsTitle;
    String demoSolve;
    String ifElse1c, ifElse2c, ifElse3c, ifElse4c, ifElse5c, ifElse6c, ifElse7c, ifElse8c, ifElse9c, ifElse1cpp, ifElse2cpp, ifElse3cpp, ifElse4cpp, ifElse5cpp, ifElse6cpp, ifElse7cpp, ifElse8cpp, ifElse9cpp, ifElse1Java, ifElse2Java, ifElse3Java, ifElse4Java, ifElse5Java, ifElse6Java, ifElse7Java, ifElse8Java, ifElse9Java, ifElse1Python, ifElse2Python, ifElse3Python, ifElse4Python, ifElse5Python, ifElse6Python, ifElse7Python, ifElse8Python, ifElse9Python, ifElseAlgo1, ifElseAlgo2, ifElseAlgo3, ifElseAlgo4, ifElseAlgo5, ifElseAlgo6, ifElseAlgo7, ifElseAlgo8, ifElseAlgo9;
    String array1c, array2c, array3c, array4c, array5c, array6c, array7c, array8c, array9c, array10c, array11c, array12c, array13c, array14c, array15c;
    String array1Cpp, array2Cpp, array3Cpp, array4Cpp, array5Cpp, array6Cpp, array7Cpp, array8Cpp, array9Cpp, array10Cpp, array11Cpp, array12Cpp, array13Cpp, array14Cpp, array15Cpp;
    String array1Java, array2Java, array3Java, array4Java, array5Java, array6Java, array7Java, array8Java, array9Java, array10Java, array11Java, array12Java, array13Java, array14Java, array15Java;
    String array1Python, array2Python, array3Python, array4Python, array5Python, array6Python, array7Python, array8Python, array9Python, array10Python, array11Python, array12Python, array13Python, array14Python, array15Python;
    String array1Algo, array2Algo, array3Algo, array4Algo, array5Algo, array6Algo, array7Algo, array8Algo, array9Algo, array10Algo, array11Algo, array12Algo, array13Algo, array14Algo, array15Algo;
    String function1c, function2c, function3c, function4c, function5c, function6c, function7c, function8c, function9c;
    String function1Cpp, function2Cpp, function3Cpp, function4Cpp, function5Cpp, function6Cpp, function7Cpp, function8Cpp, function9Cpp;
    String function1Java, function2Java, function3Java, function4Java, function5Java, function6Java, function7Java, function8Java, function9Java;
    String function1Python, function2Python, function3Python, function4Python, function5Python, function6Python, function7Python, function8Python, function9Python;
    String function1Algo, function2Algo, function3Algo, function4Algo, function5Algo, function6Algo, function7Algo, function8Algo, function9Algo;

    List<ProblemsTitleAndSolutionsModelClass> problemsTitleList;

    RecyclerView recyclerView;
    CustomAdapterForRecyclerView customAdapterForRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        demoSolve = new String("Code will be shown here SOON");

        recyclerView = findViewById(R.id.recyclerView);
        problemsTitleList = new ArrayList<>();

        ifElse1c = new String("    int main(){\n" +
                "        int num1, num2;\n" +
                "        /* Input two numbers from user */\n" +
                "        printf(\"Enter two numbers: \");\n" +
                "        scanf(\"%d%d\", &num1, &num2);\n" +
                "        /* If num1 is maximum */\n" +
                "        if(num1 > num2){\n" +
                "            printf(\"%d is maximum\", num1);\n" +
                "        }\n" +
                "        /* If num2 is maximum */\n" +
                "        else if(num2 > num1){\n" +
                "            printf(\"%d is maximum\", num2);\n" +
                "        }\n" +
                "        else{\n" +
                "            printf(\"Both are equal\");\n" +
                "        }\n" +
                "        return 0;\n" +
                "    }");

        ifElse1cpp = new String("#include<iostream>\n" +
                "using namespace std;\n" +
                "int main()\n" +
                "{\n" +
                "\tint x,y;\n" +
                "\tcout<<\"Enter 1st Number : \";\n" +
                "\tcin>>x;\n" +
                "\tcout<<\"Enter 2nd Number : \";\n" +
                "\tcin>>y;\n" +
                "\tif(x>y)\n" +
                "\t{\n" +
                "\t\tcout<<x<<\" is Greature than  \"<<y;\n" +
                "\t}\n" +
                "\telse\n" +
                "\t{\n" +
                "\t\tcout<<y<<\" is greature than \"<<x;\n" +
                "\t}\n" +
                "}\n");

        ifElse1Java = new String("import java.util.Scanner;\n" +
                "public class LargestofTwo {\n" +
                "\tprivate static Scanner sc;\n" +
                "\tpublic static void main(String[] args) \n" +
                "\t{\n" +
                "\t\tint number1, number2;\n" +
                "\t\tsc = new Scanner(System.in);\t\n" +
                "\t\tSystem.out.print(\" Please Enter the First Number : \");\n" +
                "\t\tnumber1 = sc.nextInt();\t\n" +
                "\t\tSystem.out.print(\" Please Enter the Second Number : \");\n" +
                "\t\tnumber2 = sc.nextInt();\t\n" +
                "\t\tif(number1 > number2) \n" +
                "\t    {\n" +
                "\t\t\tSystem.out.println(\"\\n The Largest Number = \" + number1);          \n" +
                "\t    } \n" +
                "\t    else if (number2 > number1)\n" +
                "\t    { \n" +
                "\t    \tSystem.out.println(\"\\n The Largest Number = \" + number2);        \n" +
                "\t    } \n" +
                "\t    else \n" +
                "\t    {\n" +
                "\t    \tSystem.out.println(\"\\n Both are Equal\");\n" +
                "\t    }\t\t\n" +
                "\t}\t\n" +
                "}\n");

        ifElse1Python = new String("def maximum(a, b):\n" +
                "     \n" +
                "    if a >= b:\n" +
                "        return a\n" +
                "    else:\n" +
                "        return b\n" +
                "     \n" +
                "# Driver code\n" +
                "a = 2\n" +
                "b = 4\n" +
                "print(maximum(a, b))\n");

        ifElseAlgo1 = new String("1.\tInput two numbers from user. Store it in some variable say num1 and num2.\n" +
                "2.\tCheck if(num1 > num2) then print num1 is maximum.\n" +
                "3.\tCheck if(num2 > num1) then print num2 is maximum.\n" +
                "4.\tCheck if(num1 == num2) then both the numbers are equal.\n");

        ifElse2c = new String("#include <stdio.h>\n" +
                "\n" +
                "int main(){\n" +
                "    int num1, num2, num3, max;\n" +
                "\n" +
                "    /* Input three numbers from user */\n" +
                "    printf(\"Enter three numbers: \");\n" +
                "    scanf(\"%d%d%d\", &num1, &num2, &num3);\n" +
                "\n" +
                "    if((num1 > num2) && (num1 > num3)){\n" +
                "        /* If num1 is greater than both */\n" +
                "        max = num1;\n" +
                "    }\n" +
                "    else if((num2 > num1) && (num2 > num3)){\n" +
                "        /* If num2 is greater than both */\n" +
                "        max = num2;\n" +
                "    }\n" +
                "    else{\n" +
                "        /* If num3 is greater than both */\n" +
                "        max = num3;\n" +
                "    }\n" +
                "\n" +
                "    /* Print maximum number */\n" +
                "    printf(\"Maximum among all three numbers = %d\", max);\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        ifElse2cpp = new String("#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main() {\n" +
                "   int a = 11;\n" +
                "   int b = 55;\n" +
                "   int c = 23;\n" +
                "\n" +
                "   int max;\n" +
                "\n" +
                "   if (a>b && a>c) {\n" +
                "      max = a;\n" +
                "   } else if (b>c) {\n" +
                "      max = b;\n" +
                "   } else {\n" +
                "      max = c;\n" +
                "   }\n" +
                "   \n" +
                "   cout << max << endl;\n" +
                "}\n");

        ifElse2Java = new String("import java.util.Scanner;\n" +
                "public class Biggest_Number \n" +
                "{\n" +
                "    public static void main(String[] args) \n" +
                "    {\n" +
                "        int x, y, z;\n" +
                "        Scanner s = new Scanner(System.in);\n" +
                "        System.out.print(\"Enter the first number:\");\n" +
                "        x = s.nextInt();\n" +
                "        System.out.print(\"Enter the second number:\");\n" +
                "        y = s.nextInt();\n" +
                "        System.out.print(\"Enter the third number:\");\n" +
                "        z = s.nextInt();\n" +
                "        if(x > y && x > z)\n" +
                "        {\n" +
                "            System.out.println(\"Maximum number is:\"+x);\n" +
                "        }\n" +
                "        else if(y > z)\n" +
                "        {\n" +
                "            System.out.println(\"Maximum number is:\"+y);\n" +
                "        }\n" +
                "        else\n" +
                "        {\n" +
                "            System.out.println(\"Maximum number is:\"+z);\n" +
                "        }\n" +
                " \n" +
                "    }\n" +
                "}\n");

        ifElse2Python = new String("\n" +
                "def maximum(a, b, c):\n" +
                "  \n" +
                "    if (a >= b) and (a >= c):\n" +
                "        largest = a\n" +
                "  \n" +
                "    elif (b >= a) and (b >= c):\n" +
                "        largest = b\n" +
                "    else:\n" +
                "        largest = c\n" +
                "          \n" +
                "    return largest\n" +
                "  \n" +
                "  \n" +
                "# Driven code \n" +
                "a = 10\n" +
                "b = 14\n" +
                "c = 12\n" +
                "print(maximum(a, b, c))\n");

        ifElseAlgo2 = new String("1.\tnum1 is maximum if num1 > num2 and num1 > num3.\n" +
                "2.\telse if num2 > num1 and num2 > num3 num2 is maximum.\n" +
                "3.\tElse then num3 is maximum.\n");

        ifElse3c = new String("#include <stdio.h>\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int num;\n" +
                "    \n" +
                "    /* Input number from user */\n" +
                "    printf(\"Enter any number: \");\n" +
                "    scanf(\"%d\", &num);\n" +
                "    \n" +
                "\n" +
                "    if(num > 0){\n" +
                "        printf(\"Number is POSITIVE\");\n" +
                "    }\n" +
                "    else if(num < 0){\n" +
                "        printf(\"Number is NEGATIVE\");\n" +
                "    }\n" +
                "    else{\n" +
                "        printf(\"Number is ZERO\");\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        ifElse3cpp = new String("#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    signed long num1 = 0;\n" +
                "\tcout << \"\\n\\n Check whether a number is positive, negative or zero :\\n\";\n" +
                "\tcout << \"-----------------------------------------------------------\\n\";  \n" +
                "\tcout << \" Input a number : \";\n" +
                "    cin >> num1;\n" +
                "    if(num1 > 0)\n" +
                "    {\n" +
                "        cout << \" The entered number is positive.\\n\\n\";\n" +
                "    }\n" +
                "    else if(num1 < 0)\n" +
                "    {\n" +
                "        cout << \" The entered number is negative.\\n\\n\";\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "        std::cout << \" The number is zero.\\n\\n\";\n" +
                "    }\n" +
                "    return 0;\n" +
                "}\n");

        ifElse3Java = new String("import java.util.*;\n" +
                " \n" +
                "class PosNegZero\n" +
                "{\n" +
                "    public static void main(String []s)\n" +
                "    {\n" +
                "        int num;\n" +
                "        //Scanner class to read value\n" +
                "        Scanner sc=new Scanner(System.in);\n" +
                "         \n" +
                "        System.out.print(\"Enter any integer number: \");\n" +
                "        num=sc.nextInt();\n" +
                "         \n" +
                "        //check condition for +ve, -ve and Zero\n" +
                "        if(num>0)\n" +
                "            System.out.println(num + \" is POSITIVE NUMBER.\");\n" +
                "        else if(num<0)\n" +
                "            System.out.println(num + \" is NEGATIVE NUMBER.\");\n" +
                "        else\n" +
                "            System.out.println(\"IT's ZERO.\");\n" +
                "         \n" +
                "    }\n" +
                "}\n");

        ifElse3Python = new String("num = float(input(\"Enter a number: \"))\n" +
                "if num > 0:\n" +
                "   print(\"Positive number\")\n" +
                "elif num == 0:\n" +
                "   print(\"Zero\")\n" +
                "else:\n" +
                "   print(\"Negative number\")\n");

        ifElseAlgo3 = new String("1.\tInput a number from user in some variable say num.\n" +
                "2.\tCheck if(num < 0), then number is negative.\n" +
                "3.\tCheck else if(num > 0), then number is positive.\n" +
                "4.\telse then number is zero.\n");

        ifElse4c = new String("#include <stdio.h>\n" +
                "\n" +
                "int main(){\n" +
                "    int num;\n" +
                "\n" +
                "    /* Input number from user */\n" +
                "    printf(\"Enter any number: \");\n" +
                "    scanf(\"%d\", &num);\n" +
                "\n" +
                "    /*\n" +
                "     * If  num modulo division 5 is 0 \n" +
                "     * and num modulo division 11 is 0 then\n" +
                "     * the number is divisible by 5 and 11 both\n" +
                "     */\n" +
                "    if((num % 5 == 0) && (num % 11 == 0)){\n" +
                "        printf(\"Number is divisible by 5 and 11\");\n" +
                "    }\n" +
                "    else{\n" +
                "        printf(\"Number is not divisible by 5 and 11\");\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        ifElse4cpp = new String("#include<iostream>\n" +
                "using namespace std;\n" +
                "int main()\n" +
                "{\n" +
                "\tint number;\n" +
                "\tcout << \"\\nEnter any Number to Check it is Divisible by 5 and 11 =  \";\n" +
                "\tcin >> number;\n" +
                "\tif(( number % 5 == 0 ) && ( number % 11 == 0 ))\n" +
                "\t{\n" +
                "\t\tcout << \"\\nGiven number \"<< number << \" is Divisible by 5 and 11\";\n" +
                "\t}\n" +
                "\telse\n" +
                "\t{\n" +
                "\tcout << \"\\nGiven number \"<< number << \" is Not Divisible by 5 and 11\";\n" +
                "\t}\t\n" +
                " \treturn 0;\n" +
                "}\n");

        ifElse4Java = new String("import java.util.Scanner;\n" +
                "\n" +
                "public class Divisibleby5and11 {\n" +
                "\tprivate static Scanner sc;\n" +
                "\tpublic static void main(String[] args) \n" +
                "\t{\n" +
                "\t\tint number;\n" +
                "\t\tsc = new Scanner(System.in);\n" +
                "\t\tSystem.out.print(\" Please Enter any Number to Check whether it is Divisible by 5 and 11 : \");\n" +
                "\t\tnumber = sc.nextInt();\t\n" +
                "\t\tif((number % 5 == 0) && (number % 11 == 0))\n" +
                "\t\t{\n" +
                "\t\t\tSystem.out.println(\"\\n Given number \" + number + \" is Divisible by 5 and 11\"); \n" +
                "\t\t}\n" +
                "\t\telse\n" +
                "\t\t{\n" +
                "\t\t\tSystem.out.println(\"\\n Given number \" + number + \" is Not Divisible by 5 and 11\"); \n" +
                "\t\t}\t\n" +
                "\t}\n" +
                "}\n");

        ifElse4Python = new String("number = int(input(\" Please Enter any Positive Integer : \"))\n" +
                "\n" +
                "if((number % 5 == 0) and (number % 11 == 0)):\n" +
                "    print(\"Given Number {0} is Divisible by 5 and 11\".format(number))\n" +
                "else:\n" +
                "    print(\"Given Number {0} is Not Divisible by 5 and 11\".format(number))\n");

        ifElseAlgo4 = new String("1.\tInput a number from user. Store it in some variable say num.\n" +
                "2.\tTo check divisibility with 5, check if(num % 5 == 0) then num is divisible by 5.\n" +
                "3.\tTo check divisibility with 11, check if(num % 11 == 0) then num is divisible by 11.\n" +
                "4.\tNow combine the above two conditions using logical AND operator &&. To check divisibility with 5 and 11 both, check if((num % 5 == 0) && (num % 11 == 0)), then number is divisible by both 5 and 11.\n");

        ifElse5c = new String("#include <stdio.h>\n" +
                "\n" +
                "int main(){\n" +
                "    int num;\n" +
                "\n" +
                "    /* Input number from user */\n" +
                "    printf(\"Enter any number to check even or odd: \");\n" +
                "    scanf(\"%d\", &num);\n" +
                "    \n" +
                "    /* Check if the number is divisible by 2 then it is even */\n" +
                "    if(num % 2 == 0){\n" +
                "        /* num % 2 is 0 */\n" +
                "        printf(\"Number is Even.\");\n" +
                "    }\n" +
                "    else{\n" +
                "        /* num % 2 is 1 */\n" +
                "        printf(\"Number is Odd.\");\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        ifElse5cpp = new String("#include <iostream>\n" +
                "using namespace std;\n" +
                "int main() {\n" +
                "  int n;\n" +
                "  cout << \"Enter an integer: \";\n" +
                "  cin >> n;\n" +
                "  if ( n % 2 == 0)\n" +
                "    cout << n << \" is even.\";\n" +
                "  else\n" +
                "    cout << n << \" is odd.\";\n" +
                "  return 0;\n" +
                "}\n");

        ifElse5Java = new String("import java.util.Scanner;\n" +
                "\n" +
                "public class EvenOdd {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "\n" +
                "        Scanner reader = new Scanner(System.in);\n" +
                "\n" +
                "        System.out.print(\"Enter a number: \");\n" +
                "        int num = reader.nextInt();\n" +
                "\n" +
                "        if(num % 2 == 0)\n" +
                "            System.out.println(num + \" is even\");\n" +
                "        else\n" +
                "            System.out.println(num + \" is odd\");\n" +
                "    }\n" +
                "}");

        ifElse5Python = new String("num = int(input(\"Enter a number: \"))\n" +
                "if (num % 2) == 0:\n" +
                "   print(\"{0} is Even\".format(num))\n" +
                "else:\n" +
                "   print(\"{0} is Odd\".format(num))\n");

        ifElseAlgo5 = new String("1.\tInput a number from user. Store it in some variable say num.\n" +
                "2.\tCheck if number modulo division equal to 0 or not i.e. if(num % 2 == 0) then the number is even otherwise odd.\n");

        ifElse6c = new String("#include <stdio.h>\n" +
                "\n" +
                "int main(){\n" +
                "    int year;\n" +
                "\n" +
                "    /* Input year from user */\n" +
                "    printf(\"Enter year : \");\n" +
                "    scanf(\"%d\", &year);\n" +
                "\n" +
                "\n" +
                "    if(((year % 4 == 0) && (year % 100 !=0)) || (year % 400==0)){\n" +
                "        printf(\"LEAP YEAR\");\n" +
                "    }\n" +
                "    else{\n" +
                "        printf(\"COMMON YEAR\");\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        ifElse6cpp = new String("#include<iostream>\n" +
                "using namespace std;\n" +
                "int main() {\n" +
                "   int year = 2016;\n" +
                "   if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))\n" +
                "   cout<<year<<\" is a leap year\";\n" +
                "   else\n" +
                "   cout<<year<<\" is not a leap year\";\n" +
                "   return 0;\n" +
                "}\n");

        ifElse6Java = new String("import java.util.Scanner;\n" +
                "public class LeapYear {\n" +
                "   public static void main(String[] args){\n" +
                "      int year;\n" +
                "      System.out.println(\"Enter an Year :: \");\n" +
                "      Scanner sc = new Scanner(System.in);\n" +
                "      year = sc.nextInt();\n" +
                "      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))\n" +
                "         System.out.println(\"Specified year is a leap year\");\n" +
                "      else\n" +
                "         System.out.println(\"Specified year is not a leap year\");\n" +
                "   }\n" +
                "}\n");

        ifElse6Python = new String("def CheckLeap(Year):  \n" +
                "  if((Year % 400 == 0) or  \n" +
                "     (Year % 100 != 0) and  \n" +
                "     (Year % 4 == 0)):   \n" +
                "    print(\"Given Year is a leap Year\");  \n" +
                "  else:  \n" +
                "    print (\"Given Year is not a leap Year\")  \n" +
                "\n" +
                "Year = int(input(\"Enter the number: \"))  \n" +
                "CheckLeap(Year)  \n");

        ifElseAlgo6 = new String("1.\tInput year from user. Store it in some variable say year.\n" +
                "2.\tIf year is exactly divisible by 4 and not divisible by 100, then it is leap year. Or if year is exactly divisible by 400 then it is leap year.\n");

        ifElse7c = new String("#include <stdio.h>\n" +
                "\n" +
                "int main(){\n" +
                "    char ch;\n" +
                "    \n" +
                "    /* Input a character from user */\n" +
                "    printf(\"Enter any character: \");\n" +
                "    scanf(\"%c\", &ch);\n" +
                "    \n" +
                "\n" +
                "    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){\n" +
                "        printf(\"Character is an ALPHABET.\");\n" +
                "    }\n" +
                "    else{\n" +
                "        printf(\"Character is NOT ALPHABET.\");\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        ifElse7cpp = new String("#include<iostream>\n" +
                "using namespace std;\n" +
                "int main()\n" +
                "{\n" +
                "    char ch;\n" +
                "    cout<<\"Enter a Character: \";\n" +
                "    cin>>ch;\n" +
                "    if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))\n" +
                "        cout<<endl<<ch<<\" is an Alphabet\";\n" +
                "    else\n" +
                "        cout<<endl<<ch<<\" isn't an Alphabet\";\n" +
                "    cout<<endl;\n" +
                "    return 0;\n" +
                "}\n");

        ifElse7Java = new String("import java.util.Scanner;\n" +
                "\n" +
                "public class CheckAlphabet\n" +
                "{\n" +
                "    // Driver method\n" +
                "     public static void main(String []args)\n" +
                "     {\n" +
                "        Scanner sc=new Scanner(System.in);\n" +
                "        char ch;     //Declare a character\n" +
                "        System.out.println(\"Enter the character \");\n" +
                "        ch=sc.next().charAt(0);   //Initialize the character\n" +
                "        \n" +
                "        //check whether alphabet or not using if-else statement\n" +
                "        \n" +
                "        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))\n" +
                "        {\n" +
                "             System.out.print(ch+\" is an Alphabet \");\n" +
                "        }\n" +
                "        else\n" +
                "        {\n" +
                "             System.out.print(ch+\" is not an Alphabet \");\n" +
                "        }\n" +
                "     }   \n" +
                "}\n");

        ifElse7Python = new String("print(\"Enter a Character: \")\n" +
                "c = input()\n" +
                "if c>='a' and c<='z':\n" +
                "    print(\"\\nIt is an alphabet\")\n" +
                "elif c>='A' and c<='z':\n" +
                "    print(\"\\nIt is an alphabet\")\n" +
                "else:\n" +
                "    print(\"\\nIt is not an alphabet!\")\n");

        ifElseAlgo7 = new String("1.\tInput a character from user. Store it in some variable say ch.\n" +
                "2.\tCheck if((ch >= 'a') && (ch <= 'z')) or if((ch >= 'A') && (ch <= 'Z')). Then it is alphabet otherwise not.\n");

        ifElse8c = new String("#include <stdio.h>\n" +
                "\n" +
                "int main(){\n" +
                "    char ch;\n" +
                "\n" +
                "    /* Input character from user */\n" +
                "    printf(\"Enter any character: \");\n" +
                "    scanf(\"%c\", &ch);\n" +
                "\n" +
                "\n" +
                "    /* Condition for vowel */\n" +
                "    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || \n" +
                "       ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){\n" +
                "        printf(\"'%c' is Vowel.\", ch);\n" +
                "    }\n" +
                "    else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){\n" +
                "        /* Condition for consonant */\n" +
                "        printf(\"'%c' is Consonant.\", ch);\n" +
                "    }\n" +
                "    else {\n" +
                "        /*\n" +
                "         * If it is neither vowel nor consonant\n" +
                "         * then it is not an alphabet.\n" +
                "         */\n" +
                "        printf(\"'%c' is not an alphabet.\", ch);\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        ifElse8cpp = new String("#include <iostream>\n" +
                "using namespace std;\n" +
                "int main() {\n" +
                "   char c = 'a';\n" +
                "   if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )\n" +
                "   cout <<c<< \" is a Vowel\" << endl;\n" +
                "   else\n" +
                "   cout <<c<< \" is a Consonant\" << endl;\n" +
                "   return 0;\n" +
                "}\n");

        ifElse8Java = new String("import java.util.Scanner;\n" +
                "class Char\n" +
                "{\n" +
                "\tpublic static void main(String[ ] arg)\n" +
                "\t{\n" +
                "\tint i=0;\n" +
                "\tScanner sc=new Scanner(System.in);\n" +
                "\tSystem.out.println(\"Enter a character : \");\n" +
                "\tchar ch=sc.next( ).charAt(0);\t \t\t\n" +
                "\tif(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')\n" +
                "\t{\n" +
                "\tSystem.out.println(\"Entered character \"+ch+\" is  Vowel\"); \n" +
                "\t}\n" +
                "\telse if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))\n" +
                "\t\tSystem.out.println(\"Entered character \"+ch+\" is Consonant\");\n" +
                "\t      else\n" +
                "\t\tSystem.out.println(\"Not an alphabet\");\t\t\n" +
                "\t}\n" +
                "}\n");

        ifElse8Python = new String("ch = input(\"Enter a character: \")\n" +
                "\n" +
                "if(ch=='A' or ch=='a' or ch=='E' or ch =='e' or ch=='I'\n" +
                " or ch=='i' or ch=='O' or ch=='o' or ch=='U' or ch=='u'):\n" +
                "    print(ch, \"is a Vowel\")\n" +
                "else:\n" +
                "    print(ch, \"is a Consonant\")\n");

        ifElseAlgo8 = new String("1.\tInput a character from user. Store it in some variable say ch.\n" +
                "2.\tCheck conditions for vowel i.e. if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'), then it is vowel.\n" +
                "3.\tIf character is alphabet but not vowel then it is consonant. Means check ch >= 'a' && ch <= 'z' then, it is consonant.\n" +
                "4.\tIf it is neither vowel nor consonant, then it is not alphabet.\n");

        ifElse9c = new String("#include <stdio.h>\n" +
                "\n" +
                "int main(){\n" +
                "    char ch;\n" +
                "\n" +
                "    /* Input character from user */\n" +
                "    printf(\"Enter any character: \");\n" +
                "    scanf(\"%c\", &ch);\n" +
                "\n" +
                "    /* Alphabet check */\n" +
                "    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){\n" +
                "        printf(\"'%c' is alphabet.\", ch);\n" +
                "    }\n" +
                "    else if(ch >= '0' && ch <= '9'){\n" +
                "        printf(\"'%c' is digit.\", ch);\n" +
                "    }\n" +
                "    else {\n" +
                "        printf(\"'%c' is special character.\", ch);\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        ifElse9cpp = new String("#include<iostream>\n" +
                "using namespace std;\n" +
                "int main()\n" +
                "{\n" +
                "    char ch;\n" +
                "    cout << \"Enter any character\";\n" +
                "    cin >> ch;\n" +
                "    // Alphabet checking condition\n" +
                "    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))\n" +
                "    {\n" +
                "        cout << ch << \" is an Alphabet\";\n" +
                "    }\n" +
                "    else if(ch >= '0' && ch <= '9')\n" +
                "    {\n" +
                "        cout << ch << \" is a Digit\";\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "        cout << ch << \" is a Special Character\";\n" +
                "    }\n" +
                "    return 0;\n" +
                "}\n");

        ifElse9Java = new String("import java.util.Scanner;\n" +
                "\n" +
                "public class AlphabetDigitSpecial {\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "\n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "\n" +
                "        System.out.println(\"Enter any caracter : \");\n" +
                "        char ch = scanner.next().charAt(0);\n" +
                "\n" +
                "        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {\n" +
                "\n" +
                "             System.out.println(ch + \" is A ALPHABET.\");\n" +
                "\n" +
                "        } else if(ch >= '0' && ch <= '9') {\n" +
                "\n" +
                "             System.out.println(ch + \" is A DIGIT.\");\n" +
                "\n" +
                "        } else {\n" +
                "\n" +
                "             System.out.println(ch + \" is A SPECIAL CHARACTER.\");\n" +
                "        }\n" +
                "    \n" +
                "    }\n" +
                "}\n");

        ifElse9Python = new String("# Take character input from user\n" +
                "ch = input(\"Enter any character : \")\n" +
                "\n" +
                "# Check for alphabet and digit.\n" +
                "if ch[0].isalpha() :\n" +
                "\n" +
                "    print(\"\\n\" + ch[0], \"is A ALPHABET.\")\n" +
                "\n" +
                "elif ch[0].isdigit() :\n" +
                "\n" +
                "    print(\"\\n\" + ch[0], \"is A DIGIT.\")\n" +
                "\n" +
                "else :\n" +
                "\n" +
                "    print(\"\\n\" + ch[0], \"is A SPECIAL CHARACTER.\")\n");

        ifElseAlgo9 = new String("1.\tInput a character from user. Store it in some variable say ch.\n" +
                "2.\tFirst check if character is alphabet or not. A character is alphabet if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')).\n" +
                "3.\tNext, check condition for digits. A character is digit if(ch >= '0' && ch <= '9').\n" +
                "4.\tFinally, if a character is neither alphabet nor digit, then character is a special character.\n");

        array1c = new String("#include <stdio.h>\n" +
                "#define MAX_SIZE 1000 // Maximum array size\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE]; // Declare an array of MAX_SIZE\n" +
                "    int i, N;\n" +
                "\n" +
                "    /* Input array size */\n" +
                "    printf(\"Enter size of array: \");\n" +
                "    scanf(\"%d\", &N);\n" +
                "\n" +
                "    /* Input elements in array */\n" +
                "    printf(\"Enter %d elements in the array : \", N);\n" +
                "    for(i=0; i<N; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &arr[i]);\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    /*\n" +
                "     * Print all elements of array\n" +
                "     */\n" +
                "    printf(\"\\nElements in array are: \");\n" +
                "    for(i=0; i<N; i++)\n" +
                "    {\n" +
                "        printf(\"%d, \", arr[i]);\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array1Cpp = new String("#include <iostream>\n" +
                "#define MAX_SIZE 100 //Maximum size of the array\n" +
                "using namespace std;\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE]; //Declares sizr of array\n" +
                "    int i, num;\n" +
                "    cout<<\"Enter size of array: \";\n" +
                "    cin>>num;\n" +
                " \n" +
                "    cout<<\"Enter \"<<num<< \" elements in the array :\";\n" +
                " \n" +
                "    //Reads size & elements in array\n" +
                "    for(i=0; i<num; i++)\n" +
                "    {\n" +
                "        cin>>arr[i];\n" +
                "    }\n" +
                " \n" +
                "    //Prints all elements of array\n" +
                "    cout<<\"\\nElements in array are: \";\n" +
                "    for(i=0; i<num; i++)\n" +
                "    {\n" +
                "        cout<<arr[i]<<\"\\t\";\n" +
                "    }\n" +
                "    return 0;\n" +
                "}\n");

        array1Java = new String("public class PrintArray {  \n" +
                "    public static void main(String[] args) {  \n" +
                "        //Initialize array  \n" +
                "        int [] arr = new int [] {1, 2, 3, 4, 5};  \n" +
                "        System.out.println(\"Elements of given array: \");  \n" +
                "        //Loop through the array by incrementing value of i  \n" +
                "        for (int i = 0; i < arr.length; i++) {  \n" +
                "            System.out.print(arr[i] + \" \");  \n" +
                "        }  \n" +
                "    }  \n" +
                "} \n");

        array1Python = new String("public class PrintArray {  \n" +
                "    public static void main(String[] args) {  \n" +
                "        //Initialize array  \n" +
                "        int [] arr = new int [] {1, 2, 3, 4, 5};  \n" +
                "        System.out.println(\"Elements of given array: \");  \n" +
                "        //Loop through the array by incrementing value of i  \n" +
                "        for (int i = 0; i < arr.length; i++) {  \n" +
                "            System.out.print(arr[i] + \" \");  \n" +
                "        }  \n" +
                "    }  \n" +
                "} \n");

        array1Algo = new String("Step 1 → Take an array A and define its values\n" +
                "   Step 2 → Loop for each value of A\n" +
                "   Step 3 → Display A[n] where n is the value of current iteration");

        array2c = new String("#include <stdio.h>\n" +
                "\n" +
                "#define MAX_SIZE 100   // Maximum array size\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE];\n" +
                "    int i, max, min, size;\n" +
                "\n" +
                "    /* Input size of the array */\n" +
                "    printf(\"Enter size of the array: \");\n" +
                "    scanf(\"%d\", &size);\n" +
                "\n" +
                "    /* Input array elements */\n" +
                "    printf(\"Enter elements in the array: \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &arr[i]);\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    /* Assume first element as maximum and minimum */\n" +
                "    max = arr[0];\n" +
                "    min = arr[0];\n" +
                "\n" +
                "    /*\n" +
                "     * Find maximum and minimum in all array elements.\n" +
                "     */\n" +
                "    for(i=1; i<size; i++)\n" +
                "    {\n" +
                "        /* If current element is greater than max */\n" +
                "        if(arr[i] > max)\n" +
                "        {\n" +
                "            max = arr[i];\n" +
                "        }\n" +
                "\n" +
                "        /* If current element is smaller than min */\n" +
                "        if(arr[i] < min)\n" +
                "        {\n" +
                "            min = arr[i];\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    /* Print maximum and minimum element */\n" +
                "    printf(\"Maximum element = %d\\n\", max);\n" +
                "    printf(\"Minimum element = %d\", min);\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array2Cpp = new String("#include<iostream>\n" +
                "using namespace std;\n" +
                "int main ()\n" +
                "{\n" +
                "    int arr[10], n, i, max, min;\n" +
                "    cout << \"Enter the size of the array : \";\n" +
                "    cin >> n;\n" +
                "    cout << \"Enter the elements of the array : \";\n" +
                "    for (i = 0; i < n; i++)\n" +
                "        cin >> arr[i];\n" +
                "    max = arr[0];\n" +
                "    for (i = 0; i < n; i++)\n" +
                "    {\n" +
                "        if (max < arr[i])\n" +
                "            max = arr[i];\n" +
                "    }\n" +
                "    min = arr[0];\n" +
                "    for (i = 0; i < n; i++)\n" +
                "    {\n" +
                "        if (min > arr[i])\n" +
                "            min = arr[i];\n" +
                "    }\n" +
                "    cout << \"Largest element : \" << max;\n" +
                "    cout << \"Smallest element : \" << min;\n" +
                "    return 0;\n" +
                "}\n");

        array2Java = new String("import java.util.Arrays; \n" +
                "public class Exercise10 {\n" +
                " \n" +
                "  static int max;\n" +
                "  static int min;\n" +
                "\n" +
                "    public static void max_min(int my_array[]) {\n" +
                "        max = my_array[0];\n" +
                "        min = my_array[0];\n" +
                "        int len = my_array.length;\n" +
                "        for (int i = 1; i < len - 1; i = i + 2) {\n" +
                "            if (i + 1 > len) {\n" +
                "                if (my_array[i] > max) max = my_array[i];\n" +
                "                if (my_array[i] < min) min = my_array[i];\n" +
                "            }\n" +
                "            if (my_array[i] > my_array[i + 1]) {\n" +
                "                if (my_array[i] > max) max = my_array[i];\n" +
                "                if (my_array[i + 1] < min) min = my_array[i + 1];\n" +
                "            }\n" +
                "            if (my_array[i] < my_array[i + 1]) {\n" +
                "                if (my_array[i] < min) min = my_array[i];\n" +
                "                if (my_array[i + 1] > max) max = my_array[i + 1];\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "           int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};\n" +
                "        max_min(my_array);\n" +
                "        System.out.println(\" Original Array: \"+Arrays.toString(my_array));\n" +
                "        System.out.println(\" Maximum value for the above array = \" + max);\n" +
                "        System.out.println(\" Minimum value for the above array = \" + min);\n" +
                "    }\n" +
                "}\n");

        array2Python = new String("# Function to find minimum and maximum position in list\n" +
                "def maxminposition(A, n):\n" +
                "   # inbuilt function to find the position of minimum \n" +
                "   minposition = A.index(min(A))\n" +
                "   # inbuilt function to find the position of maximum \n" +
                "   maxposition = A.index(max(A)) \n" +
                "   print (\"The maximum is at position::\", maxposition + 1) \n" +
                "   print (\"The minimum is at position::\", minposition + 1)\n" +
                "# Driver code\n" +
                "A=list()\n" +
                "n=int(input(\"Enter the size of the List ::\"))\n" +
                "print(\"Enter the Element ::\")\n" +
                "for i in range(int(n)):\n" +
                "   k=int(input(\"\"))\n" +
                "   A.append(k)\n" +
                "maxminposition(A,n)\n");

        array2Algo = new String("1.\tInput size and element in array. store it in some variable say size and arr.\n" +
                "2.\tDeclare two variables max and min to store maximum and minimum. Assume first array element as maximum and minimum both, say max = arr[0] and min = arr[0].\n" +
                "3.\tIterate through array to find maximum and minimum element in array. Run loop from first to last array element i.e. 0 to size - 1. Loop structure should look like for(i=0; i<size; i++).\n" +
                "4.\tInside loop for each array element check for maximum and minimum. Assign current array element to max, if (arr[i] > max). Assign current array element to min if it is less than min i.e. perform min = arr[i] if (arr[i] < min).\n");

        array3Algo = new String("1.\tDeclare two arrays.\n" +
                "2.\tInitialize these two arrays.\n" +
                "3.\tDeclare another array that will store the merged arrays.\n" +
                "4.\tThe size of the merged array should be equal to the sum of the other two arrays.\n" +
                "5.\tFor loop will help to iterate every element present in the first array.\n" +
                "6.\tCondition inside the for loop (i < Size) will ensure the compiler, not exceed the array limit.\n" +
                "7.\tInside the second for loop assign each and every array element to the Merged array.\n");

        array3c = new String("#include<stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                " \tint n1, n2, n3, i, j;\n" +
                " \tprintf(\"\\n Enter the number of elements for  First Array  :  \");\n" +
                " \tscanf(\"%d\", &n1);     //Array Size Declaration\n" +
                "    int a[n1];      //Array Declaration\n" +
                " \tprintf(\"\\nEnter the elements for First Array :  \");\n" +
                " \tfor(i = 0; i < n1; i++)\n" +
                "  \t{\n" +
                "      \tscanf(\"%d\", &a[i]);\n" +
                "  \t}\n" +
                "  \tprintf(\"\\n Enter the number of elements for  Second Array  :  \");\n" +
                " \tscanf(\"%d\", &n2);    //Array Size Declaration\n" +
                "    int b[n2];       //Array Declaration\n" +
                " \tprintf(\"\\nEnter the elements for Second Array  :  \");\n" +
                " \tfor(i = 0; i < n2; i++)\n" +
                "  \t{\n" +
                "      \tscanf(\"%d\", &b[i]);\n" +
                "  \t}\n" +
                "\tn3 = n1 + n2;     //Array Size Declaration\n" +
                "    int c[n3];       //Array Declaration\n" +
                "  \tfor(i = 0; i < n1; i++)\n" +
                "  \t{\n" +
                "      \tc[i] = a[i];\n" +
                "  \t}\n" +
                " \tfor(i = 0, j = n1; j < n3 && i < n2; i++, j++)\n" +
                "  \t{\n" +
                "  \t\tc[j] = b[i];\n" +
                "  \t}\n" +
                " \tprintf(\"\\n a[%d] Array Elements After Merging \\n\", n3); \n" +
                " \tfor(i = 0; i < n3; i++)\n" +
                "  \t{\n" +
                "    \tprintf(\" %d \\t \",c[i]);\n" +
                "  \t}\n" +
                "  \treturn 0;\n" +
                "}\n");

        array3Cpp = new String("#include<iostream>\n" +
                "using namespace std;\n" +
                "int main()\n" +
                "{\n" +
                "    int arrOne[50], arrTwo[50], arrMerge[100];\n" +
                "\tint sizeOne, sizeTwo, i, k;\n" +
                "    cout<<\"Enter the Size for First Array: \";\n" +
                "    cin>>sizeOne;\n" +
                "    cout<<\"Enter \"<<sizeOne<<\" Elements for First Array: \";\n" +
                "    for(i=0; i<sizeOne; i++)\n" +
                "    {\n" +
                "        cin>>arrOne[i];\n" +
                "        arrMerge[i] = arrOne[i];\n" +
                "    }\n" +
                "    k = i;\n" +
                "    cout<<\"\\nEnter the Size for Second Array: \";\n" +
                "    cin>>sizeTwo;\n" +
                "    cout<<\"Enter \"<<sizeTwo<<\" Elements for Second Array: \";\n" +
                "    for(i=0; i<sizeTwo; i++)\n" +
                "    {\n" +
                "        cin>>arrTwo[i];\n" +
                "        arrMerge[k] = arrTwo[i];\n" +
                "        k++;\n" +
                "    }\n" +
                "    cout<<\"\\nThe New Array (Merged Array):\\n\";\n" +
                "    for(i=0; i<k; i++)\n" +
                "        cout<<arrMerge[i]<<\" \";\n" +
                "    cout<<endl;\n" +
                "    return 0;\n" +
                "}\n");

        array3Java = new String("import java.util.Arrays;  \n" +
                "public class MergeArrayExample1  \n" +
                "{  \n" +
                "public static void main(String[] args)   \n" +
                "{  \n" +
                "int[] firstArray = {23,45,12,78,4,90,1};        //source array  \n" +
                "int[] secondArray = {77,11,45,88,32,56,3};  //destination array  \n" +
                "int fal = firstArray.length;        //determines length of firstArray  \n" +
                "int sal = secondArray.length;   //determines length of secondArray  \n" +
                "int[] result = new int[fal + sal];  //resultant array of size first array and second array  \n" +
                "System.arraycopy(firstArray, 0, result, 0, fal);  \n" +
                "System.arraycopy(secondArray, 0, result, fal, sal);  \n" +
                "System.out.println(Arrays.toString(result));    //prints the resultant array  \n" +
                "}  \n" +
                "}  \n");

        array3Python = new String("# Python3 program to merge two sorted arrays/\n" +
                "\n" +
                "# Alternatively merge arr1[0..n1-1] and\n" +
                "# arr2[0..n2-1] into arr3[0..n1 + n2-1]\n" +
                "def alternateMerge(arr1, arr2, n1, n2, arr3) :\n" +
                "\ti = 0; j = 0; k = 0\n" +
                "\n" +
                "\t# Traverse both array\n" +
                "\twhile (i < n1 and j < n2) :\n" +
                "\t\tarr3[k] = arr1[i]\n" +
                "\t\ti += 1\n" +
                "\t\tk += 1\n" +
                "\t\t\n" +
                "\t\tarr3[k] = arr2[j]\n" +
                "\t\tj += 1\n" +
                "\t\tk += 1\n" +
                "\t\n" +
                "\n" +
                "\t# Store remaining elements of first array\n" +
                "\twhile (i < n1) :\n" +
                "\t\tarr3[k] = arr1[i]\n" +
                "\t\ti += 1\n" +
                "\t\tk += 1\n" +
                "\n" +
                "\t# Store remaining elements of second array\n" +
                "\twhile (j < n2) :\n" +
                "\t\tarr3[k] = arr2[j]\n" +
                "\t\tk += 1\n" +
                "\t\tj += 1\n" +
                "\t\t\n" +
                "\t\t\n" +
                "# Driver code\n" +
                "arr1 = [1, 3, 5, 7, 9, 11]\n" +
                "n1 = len(arr1)\n" +
                "\n" +
                "arr2 = [2, 4, 6, 8]\n" +
                "n2 = len(arr2)\n" +
                "\n" +
                "arr3= [0] *(n1 + n2)\n" +
                "alternateMerge(arr1, arr2, n1, n2, arr3)\n" +
                "\n" +
                "print(\"Array after merging\")\n" +
                "for i in range(0, (n1 + n2)) :\n" +
                "\tprint(arr3[i] , end = \" \")\n");

        array4Algo = new String("1.\tDeclare and input elements in array\n" +
                "2.\tRun a loop from 0 to N-1 (where N is array size). The loop structure should look like for(i=0; i<N; i++).\n" +
                "3.\tFor each element in array, if current element is negative i.e. if(array[i] < 0) then print it.\n");

        array4c = new String("#include <stdio.h>\n" +
                "\n" +
                "#define MAX_SIZE 100 // Maximum array size\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE]; // Declare array of MAX_SIZE\n" +
                "    int i, N;\n" +
                "\n" +
                "    /* Input size of the array */\n" +
                "    printf(\"Enter size of the array : \");\n" +
                "    scanf(\"%d\", &N);\n" +
                "\n" +
                "    /* Input elements in the array */\n" +
                "    printf(\"Enter elements in array : \");\n" +
                "    for(i=0; i<N; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &arr[i]);\n" +
                "    }\n" +
                "\n" +
                "    printf(\"\\nAll negative elements in array are : \");\n" +
                "    for(i=0; i<N; i++)\n" +
                "    {\n" +
                "        /* If current array element is negative */\n" +
                "        if(arr[i] < 0)\n" +
                "        {\n" +
                "            printf(\"%d\\t\", arr[i]);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array4Cpp = new String("#include <iostream>\n" +
                "#define MAX_SIZE 100 //Maximum size of the array\n" +
                "using namespace std;\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE]; //Declares an array size\n" +
                "    int i, num;\n" +
                "    //Enter size of array\n" +
                "    cout<<\"Enter size of the array: \";\n" +
                "    cin>>num;\n" +
                "    //Reading elements of array\n" +
                "    cout<<\"Enter elements in array: \";\n" +
                "    for(i=0; i<num; i++)\n" +
                "    {\n" +
                "        cin>>arr[i];\n" +
                "    }\n" +
                "    cout<<\"All negative elements in array are:\";\n" +
                "    for(i=0; i<num; i++)\n" +
                "    {\n" +
                "        //Printing negative elements\n" +
                "        if(arr[i] < 0)\n" +
                "        {\n" +
                "            cout<<arr[i];\n" +
                "        }\n" +
                "    }\n" +
                "    return 0;\n" +
                "}\n");

        array4Java = new String("package ArrayPrograms;\n" +
                "public class NegativeArrayItems {\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t\tint j = 0;\n" +
                "\t\tint[] Neg_arr = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -60};\n" +
                "\t\tSystem.out.print(\"\\nList of Negative Numbers in NEG Array : \");\n" +
                "\t\twhile(j < Neg_arr.length) \n" +
                "\t\t{\n" +
                "\t\t\tif(Neg_arr[j] < 0) {\n" +
                "\t\t\t\tSystem.out.format(\"%d \", Neg_arr[j]);\n" +
                "\t\t\t}\n" +
                "\t\t\tj++;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}\n");

        array4Python = new String("list1 = [11, -21, 0, 45, 66, -93]\n" +
                "  \n" +
                "# iterating each number in list\n" +
                "for num in list1:\n" +
                "      \n" +
                "    # checking condition\n" +
                "    if num < 0:\n" +
                "       print(num, end = \" \")\n");

        array5Algo = new String("1.\tInput size and elements in array, store in some variable say n and arr[n].\n" +
                "2.\tTo store sum of array elements, initialize a variable sum = 0. Note: sum must be initialized only with 0.\n" +
                "3.\tTo find sum of all elements, iterate through each element and add the current element to the sum. Which is run a loop from 0 to n. The loop structure should look like for(i=0; i<n; i++).\n" +
                "4.\tInside the loop add the current array element to sum i.e. sum = sum + arr[i] or even you can do sum += arr[i].\n");

        array5c = new String("#include <stdio.h>\n" +
                "#define MAX_SIZE 100\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE];\n" +
                "    int i, n, sum=0;\n" +
                "\n" +
                "    /* Input size of the array */\n" +
                "    printf(\"Enter size of the array: \");\n" +
                "    scanf(\"%d\", &n);\n" +
                "\n" +
                "    /* Input elements in array */\n" +
                "    printf(\"Enter %d elements in the array: \", n);\n" +
                "    for(i=0; i<n; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &arr[i]);\n" +
                "    }\n" +
                "\n" +
                "    /*\n" +
                "     * Add each array element to sum\n" +
                "     */\n" +
                "    for(i=0; i<n; i++)\n" +
                "    {\n" +
                "        sum = sum + arr[i];\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    printf(\"Sum of all elements of array = %d\", sum);\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array5Cpp = new String("/* C++ Program to find sum of elements\n" +
                "in a given array */\n" +
                "#include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "// function to return sum of elements\n" +
                "// in an array of size n\n" +
                "int sum(int arr[], int n)\n" +
                "{\n" +
                "\tint sum = 0; // initialize sum\n" +
                "\n" +
                "\t// Iterate through all elements\n" +
                "\t// and add them to sum\n" +
                "\tfor (int i = 0; i < n; i++)\n" +
                "\tsum += arr[i];\n" +
                "\n" +
                "\treturn sum;\n" +
                "}\n" +
                "\n" +
                "// Driver code\n" +
                "int main()\n" +
                "{\n" +
                "\tint arr[] = {12, 3, 4, 15};\n" +
                "\tint n = sizeof(arr) / sizeof(arr[0]);\n" +
                "\tcout << \"Sum of given array is \" << sum(arr, n);\n" +
                "\treturn 0;\n" +
                "}\n");

        array5Java = new String("class Test\n" +
                "{\n" +
                "\tstatic int arr[] = {12,3,4,15};\n" +
                "\t\n" +
                "\t// method for sum of elements in an array\n" +
                "\tstatic int sum()\n" +
                "\t{\n" +
                "\t\tint sum = 0; // initialize sum\n" +
                "\t\tint i;\n" +
                "\t\n" +
                "\t\t// Iterate through all elements and add them to sum\n" +
                "\t\tfor (i = 0; i < arr.length; i++)\n" +
                "\t\t\tsum += arr[i];\n" +
                "\t\n" +
                "\t\treturn sum;\n" +
                "\t}\n" +
                "\t\n" +
                "\t// Driver method\n" +
                "\tpublic static void main(String[] args)\n" +
                "\t{\n" +
                "\t\tSystem.out.println(\"Sum of given array is \" + sum());\n" +
                "\t\t}\n" +
                "}\n");

        array5Python = new String("def _sum(arr,n):\n" +
                "\t\n" +
                "\t# return sum using sum\n" +
                "\t# inbuilt sum() function\n" +
                "\treturn(sum(arr))\n" +
                "\n" +
                "# driver function\n" +
                "arr=[]\n" +
                "# input values to list\n" +
                "arr = [12, 3, 4, 15]\n" +
                "\n" +
                "# calculating length of array\n" +
                "n = len(arr)\n" +
                "\n" +
                "ans = _sum(arr,n)\n" +
                "\n" +
                "# display sum\n" +
                "print ('Sum of the array is ',ans)\n");

        array6Algo = new String("1.\tInput size and elements in array, store it in some variable say size and arr.\n" +
                "2.\tDeclare two variables max1 and max2 to store first and second largest elements. Store minimum integer value in both i.e. max1 = max2 = INT_MIN.\n" +
                "3.\tIterate though all array elements, run a loop from 0 to size - 1. Loop structure should look like for(i=0; i<size; i++).\n" +
                "4.\tInside loop, check if current array element is greater than max1, then make largest element as second largest and current array element as largest. Say, max2 = max1 and max1 = arr[i].\n" +
                "5.\tElse if the current array element is greater than max2 but less than max1 then make current array element as second largest i.e. max2 = arr[i].\n");

        array6c = new String("#include <stdio.h>\n" +
                "#include <limits.h> // For INT_MIN\n" +
                "\n" +
                "#define MAX_SIZE 1000     // Maximum array size \n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE], size, i;\n" +
                "    int max1, max2;\n" +
                "\n" +
                "    /* Input size of the array */\n" +
                "    printf(\"Enter size of the array (1-1000): \");\n" +
                "    scanf(\"%d\", &size);\n" +
                "\n" +
                "    /* Input array elements */ \n" +
                "    printf(\"Enter elements in the array: \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &arr[i]);\n" +
                "    }\n" +
                "\n" +
                "    max1 = max2 = INT_MIN;\n" +
                "\n" +
                "\n" +
                "    /*\n" +
                "     * Check for first largest and second\n" +
                "     */\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        if(arr[i] > max1)\n" +
                "        {\n" +
                "            /*\n" +
                "             * If current element of the array is first largest\n" +
                "             * then make current max as second max\n" +
                "             * and then max as current array element\n" +
                "             */\n" +
                "            max2 = max1;\n" +
                "            max1 = arr[i];\n" +
                "        }\n" +
                "        else if(arr[i] > max2 && arr[i] < max1)\n" +
                "        {\n" +
                "            /*\n" +
                "             * If current array element is less than first largest\n" +
                "             * but is greater than second largest then make it\n" +
                "             * second largest\n" +
                "             */\n" +
                "            max2 = arr[i];\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    printf(\"First largest = %d\\n\", max1);\n" +
                "    printf(\"Second largest = %d\", max2);\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array6Cpp = new String("#include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "/* Function to print the second largest elements */\n" +
                "void print2largest(int arr[], int arr_size)\n" +
                "{\n" +
                "\tint i, first, second;\n" +
                "\n" +
                "\t/* There should be atleast two elements */\n" +
                "\tif (arr_size < 2) {\n" +
                "\t\tprintf(\" Invalid Input \");\n" +
                "\t\treturn;\n" +
                "\t}\n" +
                "\n" +
                "\t// sort the array\n" +
                "\tsort(arr, arr + arr_size);\n" +
                "\n" +
                "\t// start from second last element\n" +
                "\t// as the largest element is at last\n" +
                "\tfor (i = arr_size - 2; i >= 0; i--) {\n" +
                "\t\t// if the element is not\n" +
                "\t\t// equal to largest element\n" +
                "\t\tif (arr[i] != arr[arr_size - 1]) {\n" +
                "\t\t\tprintf(\"The second largest element is %d\\n\", arr[i]);\n" +
                "\t\t\treturn;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\n" +
                "\tprintf(\"There is no second largest element\\n\");\n" +
                "}\n" +
                "\n" +
                "/* Driver program to test above function */\n" +
                "int main()\n" +
                "{\n" +
                "\tint arr[] = { 12, 35, 1, 10, 34, 1 };\n" +
                "\tint n = sizeof(arr) / sizeof(arr[0]);\n" +
                "\tprint2largest(arr, n);\n" +
                "\treturn 0;\n" +
                "}\n");

        array6Java = new String("import java.util.*;\n" +
                "class GFG{\n" +
                "\n" +
                "// Function to print the\n" +
                "// second largest elements\n" +
                "static void print2largest(int arr[],\n" +
                "\t\t\t\t\t\tint arr_size)\n" +
                "{\n" +
                "int i, first, second;\n" +
                "\n" +
                "// There should be\n" +
                "// atleast two elements\n" +
                "if (arr_size < 2)\n" +
                "{\n" +
                "\tSystem.out.printf(\" Invalid Input \");\n" +
                "\treturn;\n" +
                "}\n" +
                "\n" +
                "// Sort the array\n" +
                "Arrays.sort(arr);\n" +
                "\n" +
                "// Start from second last element\n" +
                "// as the largest element is at last\n" +
                "for (i = arr_size - 2; i >= 0; i--)\n" +
                "{\n" +
                "\t// If the element is not\n" +
                "\t// equal to largest element\n" +
                "\tif (arr[i] != arr[arr_size - 1])\n" +
                "\t{\n" +
                "\tSystem.out.printf(\"The second largest \" +\n" +
                "\t\t\t\t\t\t\"element is %d\\n\", arr[i]);\n" +
                "\treturn;\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "System.out.printf(\"There is no second \" +\n" +
                "\t\t\t\t\t\"largest element\\n\");\n" +
                "}\n" +
                "\n" +
                "// Driver code\n" +
                "public static void main(String[] args)\n" +
                "{\n" +
                "int arr[] = {12, 35, 1, 10, 34, 1};\n" +
                "int n = arr.length;\n" +
                "print2largest(arr, n);\n" +
                "}\n" +
                "}\n");

        array6Python = new String("def print2largest(arr,\n" +
                "\t\t\t\tarr_size):\n" +
                "\n" +
                "# There should be\n" +
                "# atleast two elements\n" +
                "if (arr_size < 2):\n" +
                "\tprint(\" Invalid Input \")\n" +
                "\treturn\n" +
                "\n" +
                "# Sort the array\n" +
                "arr.sort\n" +
                "\n" +
                "# Start from second last\n" +
                "# element as the largest\n" +
                "# element is at last\n" +
                "for i in range(arr_size-2,\n" +
                "\t\t\t\t-1, -1):\n" +
                "\n" +
                "\t# If the element is not\n" +
                "\t# equal to largest element\n" +
                "\tif (arr[i] != arr[arr_size - 1]) :\n" +
                "\t\n" +
                "\tprint(\"The second largest element is\",\n" +
                "\t\t\tarr[i])\n" +
                "\treturn\n" +
                "\n" +
                "print(\"There is no second largest element\")\n" +
                "\n" +
                "# Driver code\n" +
                "arr = [12, 35, 1, 10, 34, 1]\n" +
                "n = len(arr)\n" +
                "print2largest(arr, n)\n");

        array7Algo = new String("1.\tInput size and elements in array from user. Store it in some variable say size and arr.\n" +
                "2.\tDeclare and initialize two variables with zero to store even and odd count. Say even = 0 and odd = 0.\n" +
                "3.\tIterate through each array element. Run a loop from 0 to size - 1. Loop structure should look like for(i=0; i<size; i++).\n" +
                "4.\tInside loop increment even count by 1 if current array element is even. Otherwise increment the odd count.\n" +
                "5.\tPrint the values of even and odd count after the termination of loop.\n" +
                "\n");

        array7c = new String("#include <stdio.h>\n" +
                "\n" +
                "#define MAX_SIZE 100 //Maximum size of the array\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE];\n" +
                "    int i, size, even, odd;\n" +
                "\n" +
                "    /* Input size of the array */\n" +
                "    printf(\"Enter size of the array: \");\n" +
                "    scanf(\"%d\", &size);\n" +
                "\n" +
                "    /* Input array elements */\n" +
                "    printf(\"Enter %d elements in array: \", size);\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &arr[i]);\n" +
                "    }\n" +
                "\n" +
                "    /* Assuming that there are 0 even and odd elements */\n" +
                "    even = 0;\n" +
                "    odd  = 0;\n" +
                "\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        /* If the current element of array is even then increment even count */\n" +
                "        if(arr[i]%2 == 0)\n" +
                "        {\n" +
                "            even++;\n" +
                "        }\n" +
                "        else\n" +
                "        {\n" +
                "            odd++;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    printf(\"Total even elements: %d\\n\", even);\n" +
                "    printf(\"Total odd elements: %d\", odd);\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array7Cpp = new String("#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "void CountingEvenOdd(int arr[], int arr_size)\n" +
                "{\n" +
                "\tint even_count = 0;\n" +
                "\tint odd_count = 0;\n" +
                "\n" +
                "\t// loop to read all the values in the array\n" +
                "\tfor (int i = 0; i < arr_size; i++) {\n" +
                "\t\t\n" +
                "\t\t// checking if a number is completely\n" +
                "\t\t// divisible by 2\n" +
                "\t\tif (arr[i] & 1 == 1)\n" +
                "\t\t\todd_count++;\n" +
                "\t\telse\n" +
                "\t\t\teven_count++;\n" +
                "\t}\n" +
                "\n" +
                "\tcout << \"Number of even elements = \" << even_count\n" +
                "\t\t<< \"\\nNumber of odd elements = \" << odd_count;\n" +
                "}\n" +
                "\n" +
                "// Driver Code\n" +
                "int main()\n" +
                "{\n" +
                "\tint arr[] = { 2, 3, 4, 5, 6 };\n" +
                "\tint n = sizeof(arr) / sizeof(arr[0]);\n" +
                "\t\n" +
                "\t// Function Call\n" +
                "\tCountingEvenOdd(arr, n);\n" +
                "}\n");

        array7Java = new String("import java.io.*;\n" +
                "\n" +
                "class GFG {\n" +
                "\n" +
                "\tstatic void CountingEvenOdd(int arr[], int arr_size)\n" +
                "\t{\n" +
                "\t\tint even_count = 0;\n" +
                "\t\tint odd_count = 0;\n" +
                "\n" +
                "\t\t// loop to read all the values in\n" +
                "\t\t// the array\n" +
                "\t\tfor (int i = 0; i < arr_size; i++) {\n" +
                "\t\t\t\n" +
                "\t\t\t// checking if a number is\n" +
                "\t\t\t// completely divisible by 2\n" +
                "\t\t\tif ((arr[i] & 1) == 1)\n" +
                "\t\t\t\todd_count++;\n" +
                "\t\t\telse\n" +
                "\t\t\t\teven_count++;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\tSystem.out.println(\"Number of even\"\n" +
                "\t\t\t\t\t\t+ \" elements = \" + even_count\n" +
                "\t\t\t\t\t\t+ \" Number of odd elements = \"\n" +
                "\t\t\t\t\t\t+ odd_count);\n" +
                "\t}\n" +
                "\n" +
                "\t// Driver Code\n" +
                "\tpublic static void main(String[] args)\n" +
                "\t{\n" +
                "\t\tint arr[] = { 2, 3, 4, 5, 6 };\n" +
                "\t\tint n = arr.length;\n" +
                "\t\t\n" +
                "\t\t// Function Call\n" +
                "\t\tCountingEvenOdd(arr, n);\n" +
                "\t}\n" +
                "}\n");

        array7Python = new String("def CountingEvenOdd(arr, arr_size):\n" +
                "\teven_count = 0\n" +
                "\todd_count = 0\n" +
                "\n" +
                "\t# loop to read all the values\n" +
                "\t# in the array\n" +
                "\tfor i in range(arr_size):\n" +
                "\n" +
                "\t\t# checking if a number is\n" +
                "\t\t# completely divisible by 2\n" +
                "\t\tif (arr[i] & 1 == 1):\n" +
                "\t\t\todd_count += 1\n" +
                "\t\telse:\n" +
                "\t\t\teven_count += 1\n" +
                "\n" +
                "\tprint(\"Number of even elements = \",\n" +
                "\t\teven_count)\n" +
                "\tprint(\"Number of odd elements = \",\n" +
                "\t\todd_count)\n" +
                "\n" +
                "\n" +
                "# Driver Code\n" +
                "arr = [2, 3, 4, 5, 6]\n" +
                "n = len(arr)\n" +
                "\n" +
                "# Function Call\n" +
                "CountingEvenOdd(arr, n)\n");

        array8Algo = new String("1.\tInput size and array elements from user. Store it in some variable say size and arr.\n" +
                "2.\tDeclare and initialize a variable count with zero, to store count of negative elements.\n" +
                "3.\tIterate through each element in array, run a loop from 0 to size. Loop structure should look like for(i=0; i<size; i++).\n" +
                "4.\tInside loop check if current number is negative, then increment count by 1.\n" +
                "5.\tFinally, after loop you are left with total negative element count.\n");

        array8c = new String("#include <stdio.h>\n" +
                "\n" +
                "#define MAX_SIZE 100    // Maximum array size\n" +
                "\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE];  // Declares array of size 100\n" +
                "    int i, size, count = 0;\n" +
                "\n" +
                "    /* Input size of array */\n" +
                "    printf(\"Enter size of the array : \");\n" +
                "    scanf(\"%d\", &size);\n" +
                "\n" +
                "\n" +
                "    /* Input array elements */\n" +
                "    printf(\"Enter elements in array : \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &arr[i]);\n" +
                "    }\n" +
                "\n" +
                "    /*\n" +
                "     * Count total negative elements in array\n" +
                "     */\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        /* Increment count if current array element is negative */\n" +
                "        if(arr[i] < 0)\n" +
                "        {\n" +
                "            count++;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    printf(\"\\nTotal negative elements in array = %d\", count);\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array8Cpp = new String("#include <iostream>\n" +
                "#define MAX_SIZE 100 //Maximum size of the array\n" +
                "using namespace std;\n" +
                "int main()\n" +
                "{\n" +
                "   int arr[100]; //Declaring size of an array as 100\n" +
                "   int i, num, count=0;\n" +
                "    //Reads size and elements of array\n" +
                "    cout<<\"Enter size of the array : \";\n" +
                "    cin>>num;\n" +
                "    cout<<\"Enter elements in array : \";\n" +
                "    for(i=0; i<num; i++)\n" +
                "    {\n" +
                "        cin>>arr[i];\n" +
                "    }\n" +
                "    //Counts total number of negative elements\n" +
                "    for(i=0; i<num; i++)\n" +
                "    {\n" +
                "        if(arr[i]<0)\n" +
                "        {\n" +
                "            count++; //couting negative elements\n" +
                "        }\n" +
                "    }\n" +
                "    cout<<\"Total number of negative elements: \"<<count;\n" +
                "    return 0;\n" +
                "}\n");

        array8Java = new String("package ArrayPrograms;\n" +
                "public class CountNegativeArrayItems {\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t\tint i = 0, count = 0;\n" +
                "\t\tint[] count_NegArr = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -60};\n" +
                "\t\twhile(i < count_NegArr.length) \n" +
                "\t\t{\n" +
                "\t\t\tif(count_NegArr[i] < 0) {\n" +
                "\t\t\t\tcount++;\n" +
                "\t\t\t}\n" +
                "\t\t\ti++;\n" +
                "\t\t}\n" +
                "\t\tSystem.out.println(\"\\nThe Total Number of Negative Array Items = \" + count);\n" +
                "\t}\n" +
                "}\n");

        array8Python = new String("list1 = [10, -21, 4, -45, 66, -93, 1]\n" +
                "\n" +
                "neg_count = 0\n" +
                "\n" +
                "# iterating each number in list\n" +
                "for num in list1:\n" +
                "\t\n" +
                "\t# checking condition\n" +
                "\tif num <= 0:\n" +
                "\t\tneg_count += 1\n" +
                "\t\t\n" +
                "print(\"Negative numbers in the list: \", neg_count)\n");

        array9Algo = new String("1.\tInput size and elements in array, store it in some variable say size and source.\n" +
                "2.\tDeclare another array dest to store copy of source.\n" +
                "3.\tNow, to copy all elements from source to dest array, you just need to iterate through each element of source.\n" +
                "Run a loop from 0 to size. The loop structure should look like for(i=0; i<size; i++).\n" +
                "4.\tInside loop assign current array element of source to dest i.e. dest[i] = source[i].\n");

        array9c = new String("#include <stdio.h>\n" +
                "#define MAX_SIZE 100\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int source[MAX_SIZE], dest[MAX_SIZE];\n" +
                "    int i, size;\n" +
                "\n" +
                "    /* Input size of the array */\n" +
                "    printf(\"Enter the size of the array : \");\n" +
                "    scanf(\"%d\", &size);\n" +
                "    \n" +
                "    /* Input array elements */\n" +
                "    printf(\"Enter elements of source array : \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &source[i]);\n" +
                "    }\n" +
                "\n" +
                "    /*\n" +
                "     * Copy all elements from source array to dest array\n" +
                "     */\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        dest[i] = source[i];\n" +
                "    }\n" +
                "\n" +
                "    /* \n" +
                "     * Print all elements of source array\n" +
                "     */\n" +
                "    printf(\"\\nElements of source array are : \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        printf(\"%d\\t\", source[i]);\n" +
                "    }\n" +
                "\n" +
                "    /*\n" +
                "     * Print all elements of dest array\n" +
                "     */\n" +
                "    printf(\"\\nElements of dest array are : \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        printf(\"%d\\t\", dest[i]);\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array9Cpp = new String("#include<iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main() {\n" +
                "\n" +
                "    int arr1[10], arr2[10], i, n;\n" +
                "\n" +
                "    cout << \"Enter size of an array:\";\n" +
                "    cin>>n;\n" +
                "\n" +
                "    cout << \"Enter array elements:\";\n" +
                "    for (i = 0; i < n; i++) {\n" +
                "        cin >> arr1[i];\n" +
                "    }\n" +
                "\n" +
                "    for (i = 0; i < n; i++) {\n" +
                "        arr2[i] = arr1[i];\n" +
                "    }\n" +
                "    cout << \"Copy Array List is:\";\n" +
                "    for (i = 0; i < n; i++) {\n" +
                "        cout << arr2[i] << \" \";\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array9Java = new String("public class CopyArray {    \n" +
                "    public static void main(String[] args) {        \n" +
                "             //Initialize array     \n" +
                "        int [] arr1 = new int [] {1, 2, 3, 4, 5};     \n" +
                "         //Create another array arr2 with size of arr1    \n" +
                "        int arr2[] = new int[arr1.length];    \n" +
                "        //Copying all elements of one array into another    \n" +
                "        for (int i = 0; i < arr1.length; i++) {     \n" +
                "            arr2[i] = arr1[i];     \n" +
                "        }      \n" +
                "         //Displaying elements of array arr1     \n" +
                "        System.out.println(\"Elements of original array: \");    \n" +
                "        for (int i = 0; i < arr1.length; i++) {     \n" +
                "           System.out.print(arr1[i] + \" \");    \n" +
                "        }     \n" +
                "            \n" +
                "        System.out.println();    \n" +
                "            \n" +
                "        //Displaying elements of array arr2     \n" +
                "        System.out.println(\"Elements of new array: \");    \n" +
                "        for (int i = 0; i < arr2.length; i++) {     \n" +
                "           System.out.print(arr2[i] + \" \");    \n" +
                "        }     \n" +
                "    }    \n" +
                "}    \n");

        array9Python = new String("#Initialize array     \n" +
                "arr1 = [1, 2, 3, 4, 5];     \n" +
                "     \n" +
                "#Create another array arr2 with size of arr1    \n" +
                "arr2 = [None] * len(arr1);    \n" +
                "     \n" +
                "#Copying all elements of one array into another    \n" +
                "for i in range(0, len(arr1)):    \n" +
                "    arr2[i] = arr1[i];     \n" +
                "     \n" +
                "#Displaying elements of array arr1     \n" +
                "print(\"Elements of original array: \");    \n" +
                "for i in range(0, len(arr1)):    \n" +
                "   print(arr1[i]),    \n" +
                "     \n" +
                "print();    \n" +
                "     \n" +
                "#Displaying elements of array arr2     \n" +
                "print(\"Elements of new array: \");    \n" +
                "for i in range(0, len(arr2)):    \n" +
                "   print(arr2[i]),  \n");

        array10Algo = new String("1.\tInput size and elements in array. Store it in some variable say size and arr.\n" +
                "2.\tInput new element and position to insert in array. Store it in some variable say num and pos.\n" +
                "3.\tTo insert new element in array, shift elements from the given insert position to one position right. Hence, run a loop in descending order from size to pos to insert. The loop structure should look like for(i=size; i>=pos; i--).\n" +
                "Inside the loop copy previous element to current element by arr[i] = arr[i - 1];.\n" +
                "4.\tFinally, after performing shift operation. Copy the new element at its specified position i.e. arr[pos-1]=num;.\n");

        array10c = new String("#include <stdio.h>\n" +
                "#define MAX_SIZE 100\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE];\n" +
                "    int i, size, num, pos;\n" +
                "\n" +
                "    /* Input size of the array */\n" +
                "    printf(\"Enter size of the array : \");\n" +
                "    scanf(\"%d\", &size);\n" +
                "\n" +
                "    /* Input elements in array */\n" +
                "    printf(\"Enter elements in array : \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &arr[i]);\n" +
                "    }\n" +
                "\n" +
                "    /* Input new element and position to insert */\n" +
                "    printf(\"Enter element to insert : \");\n" +
                "    scanf(\"%d\", &num);\n" +
                "    printf(\"Enter the element position : \");\n" +
                "    scanf(\"%d\", &pos);\n" +
                "\n" +
                "    /* If position of element is not valid */\n" +
                "    if(pos > size+1 || pos <= 0)\n" +
                "    {\n" +
                "        printf(\"Invalid position! Please enter position between 1 to %d\", size);\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "        /* Make room for new array element by shifting to right */\n" +
                "        for(i=size; i>=pos; i--)\n" +
                "        {\n" +
                "            arr[i] = arr[i-1];\n" +
                "        }\n" +
                "        \n" +
                "        /* Insert new element at given position and increment size */\n" +
                "        arr[pos-1] = num;\n" +
                "        size++; \n" +
                "\n" +
                "        /* Print array after insert operation */\n" +
                "        printf(\"Array elements after insertion : \");\n" +
                "        for(i=0; i<size; i++)\n" +
                "        {\n" +
                "            printf(\"%d\\t\", arr[i]);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array10Cpp = new String("#include<iostream>\n" +
                "using namespace std;\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[50], i, elem, pos, tot;\n" +
                "    cout<<\"Enter the Size for Array: \";\n" +
                "    cin>>tot;\n" +
                "    cout<<\"Enter \"<<tot<<\" Array Elements: \";\n" +
                "    for(i=0; i<tot; i++)\n" +
                "        cin>>arr[i];\n" +
                "    cout<<\"\\nEnter Element to Insert: \";\n" +
                "    cin>>elem;\n" +
                "    cout<<\"At What Position ? \";\n" +
                "    cin>>pos;\n" +
                "    for(i=tot; i>=pos; i--)\n" +
                "        arr[i] = arr[i-1];\n" +
                "    arr[i] = elem;\n" +
                "    tot++;\n" +
                "    cout<<\"\\nThe New Array is:\\n\";\n" +
                "    for(i=0; i<tot; i++)\n" +
                "        cout<<arr[i]<<\"  \";\n" +
                "    cout<<endl;\n" +
                "    return 0;\n" +
                "}\n");

        array10Java = new String("import java.io.*;\n" +
                "import java.lang.*;\n" +
                "import java.util.*;\n" +
                "\n" +
                "class GFG {\n" +
                "\n" +
                "\t// Function to insert x in arr at position pos\n" +
                "\tpublic static int[] insertX(int n, int arr[],int x, int pos)\n" +
                "\t{\n" +
                "\t\tint i;\n" +
                "\n" +
                "\t\tint newarr[] = new int[n + 1];\n" +
                "\n" +
                "\t\tfor (i = 0; i < n + 1; i++) {\n" +
                "\t\t\tif (i < pos - 1)\n" +
                "\t\t\t\tnewarr[i] = arr[i];\n" +
                "\t\t\telse if (i == pos - 1)\n" +
                "\t\t\t\tnewarr[i] = x;\n" +
                "\t\t\telse\n" +
                "\t\t\t\tnewarr[i] = arr[i - 1];\n" +
                "\t\t}\n" +
                "\t\treturn newarr;\n" +
                "\t}\n" +
                "\n" +
                "\t// Driver code\n" +
                "\tpublic static void main(String[] args)\n" +
                "\t{\n" +
                "\n" +
                "\t\tint n = 10;\n" +
                "\t\tint i;\n" +
                "\n" +
                "\t\t// initial array of size 10\n" +
                "\t\tint arr[]= { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };\n" +
                "\n" +
                "\t\t// print the original array\n" +
                "\t\tSystem.out.println(\"Initial Array:\\n\"+ Arrays.toString(arr));\n" +
                "\n" +
                "\t\t// element to be inserted\n" +
                "\t\tint x = 50;\n" +
                "\n" +
                "\t\t// position at which element\n" +
                "\t\t// is to be inserted\n" +
                "\t\tint pos = 5;\n" +
                "\n" +
                "\t\t// call the method to insert x\n" +
                "\t\t// in arr at position pos\n" +
                "\t\tarr = insertX(n, arr, x, pos);\n" +
                "\n" +
                "\t\t// print the updated array\n" +
                "\t\tSystem.out.println(\"\\nArray with \" + x + \" inserted at position \" + pos + \":\\n\" + Arrays.toString(arr));\n" +
                "\n" +
                "\t}\n" +
                "}\n");

        array10Python = new String("nums = []\n" +
                "print(end=\"Enter the Size: \")\n" +
                "numsSize = int(input())\n" +
                "print(end=\"Enter \" +str(numsSize)+ \" Elements: \")\n" +
                "for i in range(numsSize):\n" +
                "    nums.append(input())\n" +
                "print(\"\\nEnter an Element to Insert: \")\n" +
                "elem = input()\n" +
                "print(end=\"At what index ? \")\n" +
                "pos = int(input())\n" +
                "nums.insert(pos, elem)\n" +
                "numsSize = numsSize+1\n" +
                "print(\"\\nThe New List is: \")\n" +
                "for i in range(numsSize):\n" +
                "    print(end=nums[i] + \" \")\n" +
                "print()\n");

        array11Algo = new String("1.\tMove to the specified location which you want to remove in given array.\n" +
                "2.\tCopy the next element to the current element of array. Which is you need to perform array[i] = array[i + 1].\n" +
                "3.\tRepeat above steps till last element of array.\n" +
                "4.\tFinally decrement the size of array by one.\n");

        array11c = new String("#include <stdio.h>\n" +
                "#define MAX_SIZE 100\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE];\n" +
                "    int i, size, pos;\n" +
                "\n" +
                "    /* Input size and element in array */\n" +
                "    printf(\"Enter size of the array : \");\n" +
                "    scanf(\"%d\", &size);\n" +
                "    printf(\"Enter elements in array : \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &arr[i]);\n" +
                "    }\n" +
                "\n" +
                "    /* Input element position to delete */\n" +
                "    printf(\"Enter the element position to delete : \");\n" +
                "    scanf(\"%d\", &pos);\n" +
                "\n" +
                "\n" +
                "    /* Invalid delete position */\n" +
                "    if(pos < 0 || pos > size)\n" +
                "    {\n" +
                "        printf(\"Invalid position! Please enter position between 1 to %d\", size);\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "        /* Copy next element value to current element */\n" +
                "        for(i=pos-1; i<size-1; i++)\n" +
                "        {\n" +
                "            arr[i] = arr[i + 1];\n" +
                "        }\n" +
                "\n" +
                "        /* Decrement array size by 1 */\n" +
                "        size--;\n" +
                "\n" +
                "        /* Print array after deletion */\n" +
                "        printf(\"\\nElements of array after delete are : \");\n" +
                "        for(i=0; i<size; i++)\n" +
                "        {\n" +
                "            printf(\"%d\\t\", arr[i]);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array11Cpp = new String("#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main() {\n" +
                " \n" +
                "   \n" +
                "   int a[100], size, pos, i, count = 0;\n" +
                "\n" +
                "   cout << \"Enter the size of an array \\n\";\n" +
                "   cin  >> size;\n" +
                "   \n" +
                "   cout << \"Enter the value in an array \\n\";\n" +
                "   \n" +
                "   // Take an input array\n" +
                "   for (i = 0; i < size; i++) {\n" +
                "    cin >> a[i];\n" +
                "   }\n" +
                "   \n" +
                "   //Input position where we delete an element \n" +
                "   cout << \"Enter the position \\n\";\n" +
                "   cin  >> pos;\n" +
                "\n" +
                "   //Shift element from i+1 to i\n" +
                "   for(i = pos-1; i < size; i++) {\n" +
                "\n" +
                "      arr[i] = arr[i+1];\n" +
                "   }\n" +
                "\n" +
                "   // Reduce the size of an array\n" +
                "   size--;            \n" +
                "\n" +
                "  // Print an array after deleting an element\n" +
                "  for(i = 0; i < size; i++) {\n" +
                "   \n" +
                "    cout<<\"   \"<<a[i];\n" +
                "    \n" +
                "  }\n" +
                "\n" +
                "  return 0;\n" +
                "}\n");

        array11Java = new String("import java.util.Arrays;\n" +
                "\n" +
                "class GFG {\n" +
                "\n" +
                "\t// Function to remove the element\n" +
                "\tpublic static int[] removeTheElement(int[] arr, int index)\n" +
                "\t{\n" +
                "\n" +
                "\t\t// If the array is empty\n" +
                "\t\t// or the index is not in array range\n" +
                "\t\t// return the original array\n" +
                "\t\tif (arr == null || index < 0\n" +
                "\t\t\t|| index >= arr.length) {\n" +
                "\n" +
                "\t\t\treturn arr;\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t// Create another array of size one less\n" +
                "\t\tint[] anotherArray = new int[arr.length - 1];\n" +
                "\n" +
                "\t\t// Copy the elements except the index\n" +
                "\t\t// from original array to the other array\n" +
                "\t\tfor (int i = 0, k = 0; i < arr.length; i++) {\n" +
                "\n" +
                "\t\t\t// if the index is\n" +
                "\t\t\t// the removal element index\n" +
                "\t\t\tif (i == index) {\n" +
                "\t\t\t\tcontinue;\n" +
                "\t\t\t}\n" +
                "\n" +
                "\t\t\t// if the index is not\n" +
                "\t\t\t// the removal element index\n" +
                "\t\t\tanotherArray[k++] = arr[i];\n" +
                "\t\t}\n" +
                "\n" +
                "\t\t// return the resultant array\n" +
                "\t\treturn anotherArray;\n" +
                "\t}\n" +
                "\n" +
                "\t// Driver Code\n" +
                "\tpublic static void main(String[] args)\n" +
                "\t{\n" +
                "\n" +
                "\t\t// Get the array\n" +
                "\t\tint[] arr = { 1, 2, 3, 4, 5 };\n" +
                "\n" +
                "\t\t// Print the resultant array\n" +
                "\t\tSystem.out.println(\"Original Array: \"\n" +
                "\t\t\t\t\t\t+ Arrays.toString(arr));\n" +
                "\n" +
                "\t\t// Get the specific index\n" +
                "\t\tint index = 2;\n" +
                "\n" +
                "\t\t// Print the index\n" +
                "\t\tSystem.out.println(\"Index to be removed: \" + index);\n" +
                "\n" +
                "\t\t// Remove the element\n" +
                "\t\tarr = removeTheElement(arr, index);\n" +
                "\n" +
                "\t\t// Print the resultant array\n" +
                "\t\tSystem.out.println(\"Resultant Array: \"\n" +
                "\t\t\t\t\t\t+ Arrays.toString(arr));\n" +
                "\t}\n" +
                "}\n");

        array11Python = new String("a_list = [\"a\", \"b\", \"c\"]\n" +
                "\n" +
                "a_list.pop(1)\n" +
                "\n" +
                "print(a_list)\n");

        array12Algo = new String("1.\tInput size and elements in array from user. Store it in some variable say size and arr.\n" +
                "2.\tDeclare another array with same size as of input array size to store frequency of each array elements. Say freq will store frequencies of all array elements.\n" +
                "3.\tTo count frequency of each element we require two loops. One outer loop to select an array element. Second inner loop to find first duplicate element of the currently selected array element by outer loop. Run an outer loop from 0 to size. The loop structure must look like for(i=0; i<size; i++).\n" +
                "4.\tInside outer loop, initialize count variable with 1 to count total frequency of the currently selected array element.\n" +
                "5.\tRun an inner loop to count total duplicates of currently selected array element. Run an inner loop from i + 1 to size. The loop structure should look like for(j = i + 1; j < N; j++).\n" +
                "6.\tInside inner loop, if duplicate element is found increment the frequency count of current array element. Which is if(arr[i] == arr[j]) then count++.\n" +
                "7.\tAfter all duplicates has been counted. Store total duplicate count of current element in frequency array. Which is say freq[i] = count.\n" +
                "8.\tFinally print freq array to get frequencies of each array element.\n");

        array12c = new String("#include <stdio.h>\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[100], freq[100];\n" +
                "    int size, i, j, count;\n" +
                "\n" +
                "    /* Input size of array */\n" +
                "    printf(\"Enter size of array: \");\n" +
                "    scanf(\"%d\", &size);\n" +
                "\n" +
                "    /* Input elements in array */\n" +
                "    printf(\"Enter elements in array: \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &arr[i]);\n" +
                "\n" +
                "        /* Initially initialize frequencies to -1 */\n" +
                "        freq[i] = -1;\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        count = 1;\n" +
                "        for(j=i+1; j<size; j++)\n" +
                "        {\n" +
                "            /* If duplicate element is found */\n" +
                "            if(arr[i]==arr[j])\n" +
                "            {\n" +
                "                count++;\n" +
                "\n" +
                "                /* Make sure not to count frequency of same element again */\n" +
                "                freq[j] = 0;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        /* If frequency of current element is not counted */\n" +
                "        if(freq[i] != 0)\n" +
                "        {\n" +
                "            freq[i] = count;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    /*\n" +
                "     * Print frequency of each element\n" +
                "     */\n" +
                "    printf(\"\\nFrequency of all elements of array : \\n\");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        if(freq[i] != 0)\n" +
                "        {\n" +
                "            printf(\"%d occurs %d times\\n\", arr[i], freq[i]);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array12Cpp = new String("#include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "void countFreq(int arr[], int n)\n" +
                "{\n" +
                "\t// Mark all array elements as not visited\n" +
                "\tvector<bool> visited(n, false);\n" +
                "\n" +
                "\t// Traverse through array elements and\n" +
                "\t// count frequencies\n" +
                "\tfor (int i = 0; i < n; i++) {\n" +
                "\n" +
                "\t\t// Skip this element if already processed\n" +
                "\t\tif (visited[i] == true)\n" +
                "\t\t\tcontinue;\n" +
                "\n" +
                "\t\t// Count frequency\n" +
                "\t\tint count = 1;\n" +
                "\t\tfor (int j = i + 1; j < n; j++) {\n" +
                "\t\t\tif (arr[i] == arr[j]) {\n" +
                "\t\t\t\tvisited[j] = true;\n" +
                "\t\t\t\tcount++;\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t\tcout << arr[i] << \" \" << count << endl;\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "\tint arr[] = { 10, 20, 20, 10, 10, 20, 5, 20 };\n" +
                "\tint n = sizeof(arr) / sizeof(arr[0]);\n" +
                "\tcountFreq(arr, n);\n" +
                "\treturn 0;\n" +
                "}\n");

        array12Java = new String("import java.util.Arrays;\n" +
                "\n" +
                "class GFG\n" +
                "{\n" +
                "public static void countFreq(int arr[], int n)\n" +
                "{\n" +
                "\tboolean visited[] = new boolean[n];\n" +
                "\t\n" +
                "\tArrays.fill(visited, false);\n" +
                "\n" +
                "\t// Traverse through array elements and\n" +
                "\t// count frequencies\n" +
                "\tfor (int i = 0; i < n; i++) {\n" +
                "\n" +
                "\t\t// Skip this element if already processed\n" +
                "\t\tif (visited[i] == true)\n" +
                "\t\t\tcontinue;\n" +
                "\n" +
                "\t\t// Count frequency\n" +
                "\t\tint count = 1;\n" +
                "\t\tfor (int j = i + 1; j < n; j++) {\n" +
                "\t\t\tif (arr[i] == arr[j]) {\n" +
                "\t\t\t\tvisited[j] = true;\n" +
                "\t\t\t\tcount++;\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t\tSystem.out.println(arr[i] + \" \" + count);\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "// Driver code\n" +
                "public static void main(String []args)\n" +
                "{\n" +
                "\tint arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };\n" +
                "\tint n = arr.length;\n" +
                "\tcountFreq(arr, n);\n" +
                "}\n" +
                "}\n");

        array12Python = new String("# Python 3 program to count frequencies\n" +
                "# of array items\n" +
                "def countFreq(arr, n):\n" +
                "\t\n" +
                "\t# Mark all array elements as not visited\n" +
                "\tvisited = [False for i in range(n)]\n" +
                "\n" +
                "\t# Traverse through array elements\n" +
                "\t# and count frequencies\n" +
                "\tfor i in range(n):\n" +
                "\t\t\n" +
                "\t\t# Skip this element if already\n" +
                "\t\t# processed\n" +
                "\t\tif (visited[i] == True):\n" +
                "\t\t\tcontinue\n" +
                "\n" +
                "\t\t# Count frequency\n" +
                "\t\tcount = 1\n" +
                "\t\tfor j in range(i + 1, n, 1):\n" +
                "\t\t\tif (arr[i] == arr[j]):\n" +
                "\t\t\t\tvisited[j] = True\n" +
                "\t\t\t\tcount += 1\n" +
                "\t\t\n" +
                "\t\tprint(arr[i], count)\n" +
                "\n" +
                "# Driver Code\n" +
                "if __name__ == '__main__':\n" +
                "\tarr = [10, 20, 20, 10, 10, 20, 5, 20]\n" +
                "\tn = len(arr)\n" +
                "\tcountFreq(arr, n)\n");

        array13Algo = new String("1.\tInput size and elements in array Store it in some variable say size and arr.\n" +
                "2.\tFind frequency of each element and store it in an array say freq.\n" +
                "3.\tPrint array elements with frequency 1 which is our required unique elements.\n");

        array13c = new String("#include <stdio.h>\n" +
                "#define MAX_SIZE 100\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE], freq[MAX_SIZE];\n" +
                "    int size, i, j, count;\n" +
                " \n" +
                "    /* Input size of array and elements in array */\n" +
                "    printf(\"Enter size of array: \");\n" +
                "    scanf(\"%d\", &size);\n" +
                "    printf(\"Enter elements in array: \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &arr[i]);\n" +
                "        freq[i] = -1;\n" +
                "    }\n" +
                " \n" +
                "    /* Find frequency of each element */\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        count = 1;\n" +
                "        for(j=i+1; j<size; j++)\n" +
                "        {\n" +
                "            if(arr[i] == arr[j])\n" +
                "            {\n" +
                "                count++;\n" +
                "                freq[j] = 0;\n" +
                "            }\n" +
                "        }\n" +
                " \n" +
                "        if(freq[i] != 0)\n" +
                "        {\n" +
                "            freq[i] = count;\n" +
                "        }\n" +
                "    }\n" +
                " \n" +
                "    /* Print all unique elements of array */\n" +
                "    printf(\"\\nUnique elements in the array are: \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        if(freq[i] == 1)\n" +
                "        {\n" +
                "            printf(\"%d \", arr[i]);\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array13Cpp = new String("#include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "void printDistinct(int arr[], int n)\n" +
                "{\n" +
                "\t// Pick all elements one by one\n" +
                "\tfor (int i=0; i<n; i++)\n" +
                "\t{\n" +
                "\t\t// Check if the picked element is already printed\n" +
                "\t\tint j;\n" +
                "\t\tfor (j=0; j<i; j++)\n" +
                "\t\tif (arr[i] == arr[j])\n" +
                "\t\t\tbreak;\n" +
                "\n" +
                "\t\t// If not printed earlier, then print it\n" +
                "\t\tif (i == j)\n" +
                "\t\tcout << arr[i] << \" \";\n" +
                "\t}\n" +
                "}\n" +
                "\n" +
                "// Driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "\tint arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};\n" +
                "\tint n = sizeof(arr)/sizeof(arr[0]);\n" +
                "\tprintDistinct(arr, n);\n" +
                "\treturn 0;\n" +
                "}\n");

        array13Java = new String("import java.io.*;\n" +
                "\n" +
                "class GFG {\n" +
                "\n" +
                "\tstatic void printDistinct(int arr[], int n)\n" +
                "\t{\n" +
                "\t\t// Pick all elements one by one\n" +
                "\t\tfor (int i = 0; i < n; i++)\n" +
                "\t\t{\n" +
                "\t\t\t// Check if the picked element\n" +
                "\t\t\t// is already printed\n" +
                "\t\t\tint j;\n" +
                "\t\t\tfor (j = 0; j < i; j++)\n" +
                "\t\t\tif (arr[i] == arr[j])\n" +
                "\t\t\t\tbreak;\n" +
                "\t\n" +
                "\t\t\t// If not printed earlier,\n" +
                "\t\t\t// then print it\n" +
                "\t\t\tif (i == j)\n" +
                "\t\t\tSystem.out.print( arr[i] + \" \");\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\t\n" +
                "\t// Driver program\n" +
                "\tpublic static void main (String[] args)\n" +
                "\t{\n" +
                "\t\tint arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};\n" +
                "\t\tint n = arr.length;\n" +
                "\t\tprintDistinct(arr, n);\n" +
                "\n" +
                "\t}\n" +
                "}\n");

        array13Python = new String("# python program to print all distinct\n" +
                "# elements in a given array\n" +
                "\n" +
                "def printDistinct(arr, n):\n" +
                "\n" +
                "\t# Pick all elements one by one\n" +
                "\tfor i in range(0, n):\n" +
                "\n" +
                "\t\t# Check if the picked element\n" +
                "\t\t# is already printed\n" +
                "\t\td = 0\n" +
                "\t\tfor j in range(0, i):\n" +
                "\t\t\tif (arr[i] == arr[j]):\n" +
                "\t\t\t\td = 1\n" +
                "\t\t\t\tbreak\n" +
                "\n" +
                "\t\t# If not printed earlier,\n" +
                "\t\t# then print it\n" +
                "\t\tif (d == 0):\n" +
                "\t\t\tprint(arr[i])\n" +
                "\t\n" +
                "# Driver program to test above function\n" +
                "arr = [6, 10, 5, 4, 9, 120, 4, 6, 10]\n" +
                "n = len(arr)\n" +
                "printDistinct(arr, n)\n");

        array14Algo = new String("1.\tInput size and elements in array from user. Store it in some variable say size and arr.\n" +
                "\n" +
                "2.\tInitialize another variable count with 0 to store duplicate count.\n" +
                "\n" +
                "3.\tTo count total duplicate elements in given array we need two loops. Run an outer loop loop from 0 to size. Loop structure must look like for(i=0; i<size; i++). This loop is used to select each element of array and check next subsequent elements for duplicates elements using another nested loop.\n" +
                "\n" +
                "4.\tRun another inner loop to find first duplicate of current array element. Run an inner loop from i + 1 to size, the loop structure should look like for(j=i+1; j<size; j++). Now, why run a loop from i + 1. Because we need to search for duplicate elements in next subsequent elements, from current element.\n" +
                "\n" +
                "5.\tInside inner loop check for duplicate element. If duplicate element is found then increment duplicate count. Which is if(arr[i] == arr[j]) then, count++. Also terminate inner loop if duplicate element is found.\n");

        array14c = new String("#include <stdio.h>\n" +
                "\n" +
                "#define MAX_SIZE 100  // Maximum array size\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE];\n" +
                "    int i, j, size, count = 0;\n" +
                "\n" +
                "    /* Input size of array */\n" +
                "    printf(\"Enter size of the array : \");\n" +
                "    scanf(\"%d\", &size);\n" +
                "\n" +
                "    /* Input elements in array */\n" +
                "    printf(\"Enter elements in array : \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &arr[i]);\n" +
                "    }\n" +
                "\n" +
                "    /*\n" +
                "     * Find all duplicate elements in array\n" +
                "     */\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        for(j=i+1; j<size; j++)\n" +
                "        {\n" +
                "            /* If duplicate found then increment count by 1 */\n" +
                "            if(arr[i] == arr[j])\n" +
                "            {\n" +
                "                count++;\n" +
                "                break;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    printf(\"\\nTotal number of duplicate elements found in array = %d\", count);\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array14Cpp = new String("#include <iostream>\n" +
                "using namespace std;\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[100];\n" +
                "    int i, j, n, count = 0;\n" +
                "    // Readinng size of the array\n" +
                "    cout<<\"Enter size of the array : \";\n" +
                "    cin>>n;\n" +
                "    //Reading elements of array\n" +
                "    cout<<\"Enter elements in array : \";\n" +
                "    for(i=0; i<n; i++)\n" +
                "    {\n" +
                "        cin>>arr[i];\n" +
                "    }\n" +
                "    //Find all duplicate elements in array\n" +
                "    for(i=0; i<n; i++)\n" +
                "    {\n" +
                "        for(j=i+1; j<n; j++)\n" +
                "        {\n" +
                "        // If duplicate element found then increment count by 1\n" +
                "        if(arr[i] == arr[j])\n" +
                "            {\n" +
                "                count++;\n" +
                "                break;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    cout<<\"\\nTotal number of duplicate elements found in array: \"<<count;\n" +
                "    return 0;\n" +
                "}\n");

        array14Java = new String("package ArrayPrograms;\n" +
                "public class CountArrayDuplicates {\n" +
                "\tpublic static void main(String[] args) {\t\n" +
                "\t\tint i = 0, j, dup_count = 0;\n" +
                "\t\tint[] Dup_Count_arr = {10, 15, 25, 10, 8, 12, 10, 15, 55, 10, 60};\n" +
                "\t\twhile(i < Dup_Count_arr.length) \n" +
                "\t\t{\n" +
                "\t\t\tj = i + 1;\n" +
                "\t\t\twhile(j < Dup_Count_arr.length)\n" +
                "\t\t\t{\t\t\n" +
                "\t\t\t\tif(Dup_Count_arr[i] == Dup_Count_arr[j]) {\n" +
                "\t\t\t\t\tdup_count++;\n" +
                "\t\t\t\t\tbreak;\n" +
                "\t\t\t\t}\n" +
                "\t\t\t\tj++;\n" +
                "\t\t\t}\n" +
                "\t\t\ti++;\n" +
                "\t\t}\n" +
                "\t\tSystem.out.println(\"\\nThe Total Number of Duplicates  = \" + dup_count);\n" +
                "\t}\n" +
                "}\n");

        array14Python = new String("# Python program to print\n" +
                "# duplicates from a list\n" +
                "# of integers\n" +
                "def Repeat(x):\n" +
                "\t_size = len(x)\n" +
                "\trepeated = []\n" +
                "\tfor i in range(_size):\n" +
                "\t\tk = i + 1\n" +
                "\t\tfor j in range(k, _size):\n" +
                "\t\t\tif x[i] == x[j] and x[i] not in repeated:\n" +
                "\t\t\t\trepeated.append(x[i])\n" +
                "\treturn repeated\n" +
                "\n" +
                "# Driver Code\n" +
                "list1 = [10, 20, 30, 20, 20, 30, 40,\n" +
                "\t\t50, -20, 60, 60, -20, -20]\n" +
                "print (Repeat(list1))\n" +
                "\t\n" +
                "# This code is contributed\n" +
                "# by Sandeep_anand\n");

        array15Algo = new String("1.\tInput size and elements in array from user. Store it in some variable say size and arr.\n" +
                "2.\tTo find duplicate elements in given array we need two loops. Run an outer loop from 0 to size. Loop structure must look like for(i=0; i<size; i++). This loop is used to select each element of array and check next subsequent elements for duplicates using another nested loop.\n" +
                "3.\tRun another inner loop to find first duplicate of current element. Run an inner loop from i + 1 to size. The loop structure should look like for(j=i+1; j<size; j++).\n" +
                "4.\tInside the inner loop check for duplicate element. If a duplicate element is found then delete that array element. Also if a duplicate element is found then decrement size of array i.e. size = size - 1.\n");

        array15c = new String("#include <stdio.h>\n" +
                "\n" +
                "#define MAX_SIZE 100 // Maximum size of the array\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE]; // Declares an array of size 100\n" +
                "    int size;          // Total number of elements in array\n" +
                "    int i, j, k;       // Loop control variables\n" +
                "\n" +
                "    /* Input size of the array */\n" +
                "    printf(\"Enter size of the array : \");\n" +
                "    scanf(\"%d\", &size);\n" +
                "\n" +
                "    /* Input elements in the array */\n" +
                "    printf(\"Enter elements in array : \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\", &arr[i]);\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    /*\n" +
                "     * Find duplicate elements in array\n" +
                "     */\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        for(j=i+1; j<size; j++)\n" +
                "        {\n" +
                "            /* If any duplicate found */\n" +
                "            if(arr[i] == arr[j])\n" +
                "            {\n" +
                "                /* Delete the current duplicate element */\n" +
                "                for(k=j; k < size - 1; k++)\n" +
                "                {\n" +
                "                    arr[k] = arr[k + 1];\n" +
                "                }\n" +
                "\n" +
                "                /* Decrement size after removing duplicate element */\n" +
                "                size--;\n" +
                "\n" +
                "                /* If shifting of elements occur then don't increment j */\n" +
                "                j--;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "    /*\n" +
                "     * Print array after deleting duplicate elements\n" +
                "     */\n" +
                "    printf(\"\\nArray elements after deleting duplicates : \");\n" +
                "    for(i=0; i<size; i++)\n" +
                "    {\n" +
                "        printf(\"%d\\t\", arr[i]);\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        array15Cpp = new String("#include <iostream>\n" +
                "#define MAX_SIZE 100 // Maximum size of the array\n" +
                "using namespace std;\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[MAX_SIZE]; // Declares an array of size 100\n" +
                "    int num; // Total number of elements in array\n" +
                "    int i, j, k;\n" +
                "    //Enter size of array\n" +
                "    cout<<\"Enter size of the array : \";\n" +
                "    cin>>num;\n" +
                "    //Reading elements of array\n" +
                "    cout<<\"Enter elements in array : \";\n" +
                "    for(i=0; i<num; i++)\n" +
                "    {\n" +
                "        cin>>arr[i];\n" +
                "    }\n" +
                "    // Finding all duplicate elements in array\n" +
                "    for(i=0; i<num; i++)\n" +
                "    {\n" +
                "        for(j=i+1; j<num; j++)\n" +
                "        {\n" +
                "            //If any duplicate found */\n" +
                "            if(arr[i] == arr[j])\n" +
                "            {\n" +
                "                // Delete the current duplicate element\n" +
                "                for(k=j; k<num; k++)\n" +
                "                {\n" +
                "                    arr[k] = arr[k + 1];\n" +
                "                }\n" +
                "                //Decrement size after removing duplicate element\n" +
                "                num--;\n" +
                "                // If shifting of elements occur then don't increment j\n" +
                "                j--;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    // Print array after deleting duplicate elements\n" +
                "    cout<<\"\\nArray elements after deleting duplicates : \";\n" +
                "    for(i=0; i<num; i++)\n" +
                "    {\n" +
                "        cout<<\"\\t\"<<arr[i];\n" +
                "    }\n" +
                "    return 0;\n" +
                "}\n");

        array15Java = new String("public class RemoveDuplicateInArrayExample{  \n" +
                "public static int removeDuplicateElements(int arr[], int n){  \n" +
                "        if (n==0 || n==1){  \n" +
                "            return n;  \n" +
                "        }  \n" +
                "        int[] temp = new int[n];  \n" +
                "        int j = 0;  \n" +
                "        for (int i=0; i<n-1; i++){  \n" +
                "            if (arr[i] != arr[i+1]){  \n" +
                "                temp[j++] = arr[i];  \n" +
                "            }  \n" +
                "         }  \n" +
                "        temp[j++] = arr[n-1];     \n" +
                "        // Changing original array  \n" +
                "        for (int i=0; i<j; i++){  \n" +
                "            arr[i] = temp[i];  \n" +
                "        }  \n" +
                "        return j;  \n" +
                "    }  \n" +
                "       \n" +
                "    public static void main (String[] args) {  \n" +
                "        int arr[] = {10,20,20,30,30,40,50,50};  \n" +
                "        int length = arr.length;  \n" +
                "        length = removeDuplicateElements(arr, length);  \n" +
                "        //printing array elements  \n" +
                "        for (int i=0; i<length; i++)  \n" +
                "           System.out.print(arr[i]+\" \");  \n" +
                "    }  \n" +
                "}  \n");

        array15Python = new String("# Python code to remove duplicate elements\n" +
                "def Remove(duplicate):\n" +
                "\tfinal_list = []\n" +
                "\tfor num in duplicate:\n" +
                "\t\tif num not in final_list:\n" +
                "\t\t\tfinal_list.append(num)\n" +
                "\treturn final_list\n" +
                "\t\n" +
                "# Driver Code\n" +
                "duplicate = [2, 4, 10, 20, 5, 2, 20, 4]\n" +
                "print(Remove(duplicate))\n");

        function1Algo = new String("1.\tFirst assign a meaningful name to the function, say cube().\n" +
                "2.\tThe function should accept a number whose cube is to be calculated. Hence, function definition is cube(double num).\n" +
                "3.\tFinally, the function should return cube of num passed. Hence, return type of function should be double.\n");

        function1c = new String("#include <stdio.h>\n" +
                "\n" +
                "/* Function declaration */\n" +
                "double cube(double num);\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int num;\n" +
                "    double c;\n" +
                "    \n" +
                "    /* Input number to find cube from user */\n" +
                "    printf(\"Enter any number: \");\n" +
                "    scanf(\"%d\", &num);\n" +
                "    \n" +
                "    c = cube(num);\n" +
                "\n" +
                "    printf(\"Cube of %d is %.2f\", num, c); \n" +
                "    \n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Function to find cube of any number\n" +
                " */\n" +
                "double cube(double num)\n" +
                "{\n" +
                "    return (num * num * num);\n" +
                "}\n");

        function1Cpp = new String("#include <iostream>\n" +
                "using namespace std; \n" +
                "// Function declaration\n" +
                "double cube(double num);\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int num;\n" +
                "    double c; \n" +
                "    //Inputting number from user\n" +
                "    cout<<\"Enter any number: \"<<endl;\n" +
                "    cin>>num; \n" +
                "    c = cube(num); \n" +
                "    cout<<\"Cube of \" <<num << \" is \"<<c;\n" +
                " \n" +
                "    return 0;\n" +
                "}\n" +
                "//Function to find cube of any number\n" +
                "double cube(double num)\n" +
                "{\n" +
                "    return (num * num * num);\n" +
                "}\n");

        function1Java = new String("import java.util.Scanner;\n" +
                "\n" +
                "public class CubeCalculation {\n" +
                "\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t   Scanner scan = new Scanner(System.in);\n" +
                "\n" +
                "\t     System.out.println(\"Enter number\");\n" +
                "\t     int number = scan.nextInt();//accept number\n" +
                "\t     scan.close();\n" +
                "\t\t\n" +
                "\t     //call method to find cube\n" +
                "\t      int cube = CalculateCube(number);\n" +
                "\t      System.out.println(\"Cube of \"+ number+ \" is \"+ cube);\n" +
                "\n" +
                "\t}\n" +
                "\t\n" +
                "\t//method implementation to get cube\n" +
                "\tpublic static int CalculateCube(int num) {\n" +
                "\t\t\n" +
                "\t\treturn num*num*num;\n" +
                "\t}\n" +
                "\n" +
                "}\n");

        function1Python = new String("def cube(a):\n" +
                "print(\"The Cube of given number\", a*a*a)\n" +
                "b = int(input(\" Enter any number : \"))\n" +
                "cube(b)\n");

        function2Algo = new String("1.\tFirst assign a meaningful name to all the three functions. Say function to calculate diameter, circumference and area are - getDiameter(), getCircumference() and getArea() respectively.\n" +
                "\n" +
                "2.\tAll the above three functions uses one input i.e. radius of circle to calculate output. Hence all the three function must accept a parameter of double or int type.\n" +
                "\n" +
                "3.\tFinally, all the three functions returns either double or int as output. Hence, return type of the function must be either double or int.\n");

        function2c = new String("#include <stdio.h>\n" +
                "#include <math.h> // Used for constant PI referred as M_PI\n" +
                "\n" +
                "\n" +
                "/* Function declaration */\n" +
                "double getDiameter(double radius);\n" +
                "double getCircumference(double radius);\n" +
                "double getArea(double radius);\n" +
                "\n" +
                "\n" +
                "int main() \n" +
                "{\n" +
                "    float radius, dia, circ, area;\n" +
                "    \n" +
                "    /* Input radius of circle from user */\n" +
                "    printf(\"Enter radius of circle: \");\n" +
                "    scanf(\"%f\", &radius);\n" +
                "    \n" +
                "    dia  = getDiameter(radius);       // Call getDiameter function\n" +
                "    circ = getCircumference(radius);  // Call getCircumference function\n" +
                "    area = getArea(radius);           // Call getArea function\n" +
                "    \n" +
                "    printf(\"Diameter of the circle = %.2f units\\n\", dia);\n" +
                "    printf(\"Circumference of the circle = %.2f units\\n\", circ);\n" +
                "    printf(\"Area of the circle = %.2f sq. units\", area);\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Calculate diameter of circle whose radius is given\n" +
                " */\n" +
                "double getDiameter(double radius) \n" +
                "{\n" +
                "    return (2 * radius);\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Calculate circumference of circle whose radius is given\n" +
                " */\n" +
                "double getCircumference(double radius) \n" +
                "{\n" +
                "    return (2 * M_PI * radius); // M_PI = PI = 3.14 ... \n" +
                "}\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Find area of circle whose radius is given\n" +
                " */\n" +
                "double getArea(double radius)\n" +
                "{\n" +
                "    return (M_PI * radius * radius); // M_PI = PI = 3.14 ...\n" +
                "}\n");

        function2Cpp = new String("#include <iostream>\n" +
                "#include <math.h>\n" +
                "using namespace std;\n" +
                "//All Function declaration\n" +
                "double getDiameter(double radius);\n" +
                "double getCircumference(double radius);\n" +
                "double getArea(double radius);\n" +
                "int main()\n" +
                "{\n" +
                "float radius, diameter, circle, area;\n" +
                "// Inputting radius of circle from user\n" +
                "cout<<\"Enter radius of circle: \";\n" +
                "cin>>radius;\n" +
                "diameter = getDiameter(radius); // Calling getDiameter function\n" +
                "circle = getCircumference(radius); // Calling getCircumference function\n" +
                "area = getArea(radius); // Calling getArea function\n" +
                "cout<<\"Diameter of the circle: \"<<diameter <<\" units\"<<endl;\n" +
                "cout<<\"Circumference of the circle: \"<< circle<<\" units\"<<endl;\n" +
                "cout<<\"Area of the circle:\"<< area<<\" sq. units\"<<endl;\n" +
                "return 0;\n" +
                "}\n" +
                "// Calculating diameter of circle whose radius is given\n" +
                "double getDiameter(double radius)\n" +
                "{\n" +
                "return (2 * radius);\n" +
                "}\n" +
                "//Calculating circumference of circle whose radius is given\n" +
                "double getCircumference(double radius)\n" +
                "{\n" +
                "return (2 * M_PI * radius); // PI = 3.14\n" +
                "}\n" +
                "//Finding area of circle whose radius is given\n" +
                "double getArea(double radius)\n" +
                "{\n" +
                "return (M_PI * radius * radius); // PI = 3.14\n" +
                "}\n");

        function2Java = new String("package Area;\n" +
                "import java.util.Scanner;\n" +
                "public class DCAOfCricle2 {\n" +
                "\tprivate static Scanner sc;\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t\tsc = new Scanner(System.in);\t\t\n" +
                "\t\tdouble radius, diameter, area, circumference;\t\t\n" +
                "\t\tSystem.out.print(\"Please Enter the Circle radius = \");\n" +
                "\t\tradius = sc.nextDouble();\t\t\n" +
                "\t\tdiameter = calcDiameter(radius);\n" +
                "\t\tarea = calcArea(radius); \n" +
                "\t\tcircumference = calCircumference(radius);\n" +
                "\t\tSystem.out.println(\"\\nArea of a Circle        = \" + area);\n" +
                "\t\tSystem.out.println(\"Diameter of a Circle      = \" + diameter);\n" +
                "\t\tSystem.out.println(\"Circumference of a Circle = \" + circumference);\n" +
                "\t}\n" +
                "\t\n" +
                "\tpublic static double calcDiameter(double radius) {\n" +
                "\t\treturn 2 * radius;\n" +
                "\t}\n" +
                "\tpublic static double calcArea(double radius) {\n" +
                "\t\treturn Math.PI * radius * radius;\n" +
                "\t}\n" +
                "\tpublic static double calCircumference(double radius) {\n" +
                "\t\treturn 2 * Math.PI * radius;\n" +
                "\t}\n" +
                "}\n");

        function2Python = new String("import math\n" +
                "def find_Diameter(radius):\n" +
                "    return 2 * radius\n" +
                "def find_Circumference(radius):\n" +
                "    return 2 * math.pi * radius\n" +
                "def find_Area(radius):\n" +
                "    return math.pi * radius * radius\n" +
                "r = float(input(' Please Enter the radius of a circle: ')) \n" +
                "diameter = find_Diameter(r)\n" +
                "circumference = find_Circumference(r)\n" +
                "area = find_Area(r) \n" +
                "print(\"\\n Diameter Of a Circle = %.2f\" %diameter)\n" +
                "print(\" Circumference Of a Circle = %.2f\" %circumference)\n" +
                "print(\" Area Of a Circle = %.2f\" %area)\n");

        function3Algo = new String("1.\tFirst give a meaningful name to our function. Say max() function is used to find maximum between two numbers.\n" +
                "2.\tSecond, we need to find maximum between two numbers. Hence, the function must accept two parameters of int type say, max(int num1, int num2).\n" +
                "3.\tFinally, the function should return maximum among given two numbers. Hence, the return type of the function must be same as parameters type i.e. int in our case.\n");

        function3c = new String("#include <stdio.h>\n" +
                "\n" +
                "/* Function declarations */\n" +
                "int max(int num1, int num2);\n" +
                "int min(int num1, int num2);\n" +
                "\n" +
                "\n" +
                "\n" +
                "int main() \n" +
                "{\n" +
                "    int num1, num2, maximum, minimum;\n" +
                "    \n" +
                "    /* Input two numbers from user */\n" +
                "    printf(\"Enter any two numbers: \");\n" +
                "    scanf(\"%d%d\", &num1, &num2);\n" +
                "    \n" +
                "    maximum = max(num1, num2);  // Call maximum function\n" +
                "    minimum = min(num1, num2);  // Call minimum function\n" +
                "    \n" +
                "    printf(\"\\nMaximum = %d\\n\", maximum);\n" +
                "    printf(\"Minimum = %d\", minimum);\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Find maximum between two numbers.\n" +
                " */\n" +
                "int max(int num1, int num2)\n" +
                "{\n" +
                "    return (num1 > num2 ) ? num1 : num2;\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Find minimum between two numbers.\n" +
                " */\n" +
                "int min(int num1, int num2) \n" +
                "{\n" +
                "    return (num1 > num2 ) ? num2 : num1;\n" +
                "}\n");

        function3Cpp = new String("#include <iostream>\n" +
                "\n" +
                "Using namespace std;\n" +
                "\n" +
                "int max(int num1, int num2);\n" +
                "int min(int num1, int num2);\n" +
                "\n" +
                "\n" +
                "int main() \n" +
                "{\n" +
                "    int num1, num2, maximum, minimum;\n" +
                "    \n" +
                "    /* Input two numbers from user */\n" +
                "    Cout<<”Enter any two numbers: \";\n" +
                "    cin>>num1>>num2;\n" +
                "    \n" +
                "    maximum = max(num1, num2);  // Call maximum function\n" +
                "    minimum = min(num1, num2);  // Call minimum function\n" +
                "    \n" +
                "    cout<<“Maximum = “<< maximum;\n" +
                "    cout<< “Minimum = “<< minimum);\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Find maximum between two numbers.\n" +
                " */\n" +
                "int max(int num1, int num2)\n" +
                "{\n" +
                "    return (num1 > num2 ) ? num1 : num2;\n" +
                "}\n" +
                "\n" +
                "/**\n" +
                " * Find minimum between two numbers.\n" +
                " */\n" +
                "int min(int num1, int num2) \n" +
                "{\n" +
                "    return (num1 > num2 ) ? num2 : num1;\n" +
                "}\n");

        function3Java = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        function3Python = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        function4Algo = new String("1.\tFirst give a meaningful name to our function, say isEven().\n" +
                "2.\tNext, the function must accept one integer which is to be validated for even condition, say isEven(int num).\n" +
                "3.\tFinally as per name, the function must return true if given integer is even otherwise false. However, C does not supports boolean values. In C programming, 0 is represented as false and 1 (any non-zero integer) as true. Hence, isEven() we must return an integer from function.\n");

        function4c = new String("#include <stdio.h>\n" +
                "\n" +
                "int isEven(int num)\n" +
                "{\n" +
                "    return !(num & 1);\n" +
                "}\n" +
                "\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int num;\n" +
                "    \n" +
                "    /* Input number from user */\n" +
                "    printf(\"Enter any number: \");\n" +
                "    scanf(\"%d\", &num);\n" +
                "    \n" +
                "    if(isEven(num))\n" +
                "    {\n" +
                "        printf(\"The number is even.\");\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "        printf(\"The number is odd.\");\n" +
                "    }\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n");

        function4Cpp = new String("#include <iostream>\n" +
                "#include <conio.h>\n" +
                "using namespace std;\n" +
                "int find_Oddeven(int);//function prototype\n" +
                "int main()\n" +
                "{\n" +
                "int num;\n" +
                "cout << \"Enter a number to ceck odd or even\" << endl;\n" +
                "cin>>num;//get input from user\n" +
                "find_Oddeven(num);//calling the function\n" +
                "getch();\n" +
                "return 0;\n" +
                "}\n" +
                "//create function\n" +
                "int find_Oddeven(int num){//function definition\n" +
                "if(num%2==0)\n" +
                "cout<<num<<\"is an even\";\n" +
                "else\n" +
                "cout<<num<<\"is an odd\";\n" +
                "}\n");

        function4Java = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        function4Python = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        function5Algo = new String("1.\tFirst give a meaningful name to our prime checking function say isPrime() function will check a number for prime.\n" +
                "2.\tNext, since our function checks a number for prime condition. Hence, it must accept a number, say isPrime(int num);.\n" +
                "3.\tFinally, the function should return a value to the caller, so that the caller can know whether the integer passed to the function is prime or not. For this we must return boolean true or false depending on the prime check result. Therefore return an integer from function either 1 or 0.\n");

        function5c = new String("#include <stdio.h>\n" +
                "#include <math.h>\n" +
                "\n" +
                "\n" +
                "/* Function declarations */\n" +
                "int isPrime(int num);\n" +
                "int isArmstrong(int num);\n" +
                "int isPerfect(int num);\n" +
                "\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int num;\n" +
                "    \n" +
                "    printf(\"Enter any number: \");\n" +
                "    scanf(\"%d\", &num);\n" +
                "    \n" +
                "    // Call isPrime() functions\n" +
                "    if(isPrime(num))\n" +
                "    {\n" +
                "        printf(\"%d is Prime number.\\n\", num);\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "        printf(\"%d is not Prime number.\\n\", num);\n" +
                "    }\n" +
                "    \n" +
                "    // Call isArmstrong() function\n" +
                "    if(isArmstrong(num))\n" +
                "    {\n" +
                "        printf(\"%d is Armstrong number.\\n\", num);\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "        printf(\"%d is not Armstrong number.\\n\", num);\n" +
                "    }\n" +
                "    \n" +
                "    // Call isPerfect() function\n" +
                "    if(isPerfect(num))\n" +
                "    {\n" +
                "        printf(\"%d is Perfect number.\\n\", num);\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "        printf(\"%d is not Perfect number.\\n\", num);\n" +
                "    }\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Check whether a number is prime or not. \n" +
                " * Returns 1 if the number is prime otherwise 0.\n" +
                " */\n" +
                "int isPrime(int num) \n" +
                "{\n" +
                "    int i;\n" +
                "    \n" +
                "    for(i=2; i<=num/2; i++)  \n" +
                "    {  \n" +
                "        /*  \n" +
                "         * If the number is divisible by any number  \n" +
                "         * other than 1 and self then it is not prime \n" +
                "         */  \n" +
                "        if(num%i == 0)  \n" +
                "        {\n" +
                "            return 0;\n" +
                "        }  \n" +
                "    } \n" +
                "    \n" +
                "    return 1; \n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Check whether a number is Armstrong number or not. \n" +
                " * Returns 1 if the number is Armstrong number otherwise 0.\n" +
                " */\n" +
                "int isArmstrong(int num) \n" +
                "{\n" +
                "    int lastDigit, sum, originalNum, digits;\n" +
                "    sum = 0;\n" +
                "    \n" +
                "    originalNum = num;\n" +
                "\n" +
                "    /* Find total digits in num */\n" +
                "    digits = (int) log10(num) + 1;\n" +
                "\n" +
                "    /*\n" +
                "     * Calculate sum of power of digits\n" +
                "     */\n" +
                "    while(num > 0)\n" +
                "    {\n" +
                "        // Extract the last digit\n" +
                "        lastDigit = num % 10;\n" +
                "\n" +
                "        // Compute sum of power of last digit\n" +
                "        sum = sum + round(pow(lastDigit, digits));\n" +
                "\n" +
                "        // Remove the last digit\n" +
                "        num = num / 10;\n" +
                "    }\n" +
                "    \n" +
                "    return (originalNum == sum);\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Check whether the number is perfect number or not. \n" +
                " * Returns 1 if the number is perfect otherwise 0.\n" +
                " */\n" +
                "int isPerfect(int num) \n" +
                "{\n" +
                "    int i, sum, n;\n" +
                "    sum = 0;\n" +
                "    n = num;\n" +
                "    \n" +
                "    for(i=1; i<n; i++)  \n" +
                "    {  \n" +
                "        /* If i is a divisor of num */  \n" +
                "        if(n%i == 0)  \n" +
                "        {  \n" +
                "            sum += i;  \n" +
                "        }  \n" +
                "    }\n" +
                "    \n" +
                "    return (num == sum);\n" +
                "}\n");

        function5Cpp = new String("#include <iostream>\n" +
                "#include <math.h>\n" +
                "using namespace std;\n" +
                " \n" +
                "int checkPrimeNumber(int n);\n" +
                "int checkArmstrongNumber(int n);\n" +
                " \n" +
                "int main(){\n" +
                " \n" +
                "    int num, flag;\n" +
                " \n" +
                "    cout<<\"Enter a positive integer: \";\n" +
                "    cin>>num;\n" +
                " \n" +
                "     // Checking prime number\n" +
                "    flag = checkPrimeNumber(num);\n" +
                "    if (flag == 1)\n" +
                "        cout<<num<<\" is a prime number\"<<endl;\n" +
                "    else\n" +
                "        cout<<num<<\" is not a prime number\"<<endl;\n" +
                " \n" +
                "    // Checking Armstrong number\n" +
                "    flag = checkArmstrongNumber(num);\n" +
                "    if (flag == 1)\n" +
                "        cout<<num<<\" is a Armstrong number\"<<endl;\n" +
                "    else\n" +
                "        cout<<num<<\" is a not an Armstrong number\"<<endl;\n" +
                "    return 0;\n" +
                "}\n" +
                "//function to check prime number\n" +
                "int checkPrimeNumber(int num)\n" +
                "{\n" +
                "    int i, flag = 1;\n" +
                " \n" +
                "    for(i=2; i<=num/2; ++i)\n" +
                "    {\n" +
                " \n" +
                "    // condition for non-prime number\n" +
                "        if(num%i == 0)\n" +
                "        {\n" +
                "            flag = 0;\n" +
                "            break;\n" +
                "        }\n" +
                "    }\n" +
                "    return flag;\n" +
                "}\n" +
                " \n" +
                "//function to check Armstrong Number\n" +
                "int checkArmstrongNumber(int number)\n" +
                "{\n" +
                "    int originalNumber, remainder, result = 0, num = 0, flag;\n" +
                " \n" +
                "    originalNumber = number;\n" +
                " \n" +
                "    while (originalNumber != 0)\n" +
                "    {\n" +
                "        originalNumber /= 10;\n" +
                "        ++num;\n" +
                "    }\n" +
                " \n" +
                "    originalNumber = number;\n" +
                " \n" +
                "    while (originalNumber != 0)\n" +
                "    {\n" +
                "        remainder = originalNumber%10;\n" +
                "        result += pow(remainder, num);\n" +
                "        originalNumber /= 10;\n" +
                "    }\n" +
                " \n" +
                "    // condition for Armstrong number\n" +
                "    if(result == number)\n" +
                "        flag = 1;\n" +
                "    else\n" +
                "        flag = 0;\n" +
                " \n" +
                "    return flag;\n" +
                "}\n");

        function5Java = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        function5Python = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        function6Algo = new String("1.\tFirst give a meaningful name to our prime checking function say isPrime() function will check a number for prime.\n" +
                "2.\tNext, since our function checks a number for prime condition. Hence, it must accept a number, say isPrime(int num);.\n" +
                "3.\tFinally, the function should return a value to the caller, so that the caller can know whether the integer passed to the function is prime or not. For this we must return boolean true or false depending on the prime check result. Therefore return an integer from function either 1 or 0.\n");

        function6c = new String("#include <stdio.h>\n" +
                "int checkPrimeNumber(int n);\n" +
                "int main() {\n" +
                "    int n1, n2, i, flag;\n" +
                "    printf(\"Enter two positive integers: \");\n" +
                "    scanf(\"%d %d\", &n1, &n2);\n" +
                "    printf(\"Prime numbers between %d and %d are: \", n1, n2);\n" +
                "    for (i = n1 + 1; i < n2; ++i) {\n" +
                "\n" +
                "        // flag will be equal to 1 if i is prime\n" +
                "        flag = checkPrimeNumber(i);\n" +
                "\n" +
                "        if (flag == 1)\n" +
                "            printf(\"%d \", i);\n" +
                "    }\n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                "// user-defined function to check prime number\n" +
                "int checkPrimeNumber(int n) {\n" +
                "    int j, flag = 1;\n" +
                "    for (j = 2; j <= n / 2; ++j) {\n" +
                "        if (n % j == 0) {\n" +
                "            flag = 0;\n" +
                "            break;\n" +
                "        }\n" +
                "    }\n" +
                "    return flag;\n" +
                "}\n");

        function6Cpp = new String("#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "int checkPrimeNumber(int);\n" +
                "\n" +
                "int main() {\n" +
                "    int n1, n2;\n" +
                "    bool flag;\n" +
                "\n" +
                "    cout << \"Enter two positive integers: \";\n" +
                "    cin >> n1 >> n2;\n" +
                "\n" +
                "    // swapping n1 and n2 if n1 is greater than n2\n" +
                "    if (n1 > n2) {\n" +
                "      n2 = n1 + n2;\n" +
                "      n1 = n2 - n1;\n" +
                "      n2 = n2 - n1;\n" +
                "    }\n" +
                "\n" +
                "    cout << \"Prime numbers between \" << n1 << \" and \" << n2 << \" are: \";\n" +
                "\n" +
                "    for(int i = n1+1; i < n2; ++i) {\n" +
                "        // If i is a prime number, flag will be equal to 1\n" +
                "        flag = checkPrimeNumber(i);\n" +
                "\n" +
                "        if(flag)\n" +
                "            cout << i << \" \";\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                "// user-defined function to check prime number\n" +
                "int checkPrimeNumber(int n) {\n" +
                "    bool isPrime = true;\n" +
                "\n" +
                "    // 0 and 1 are not prime numbers\n" +
                "    if (n == 0 || n == 1) {\n" +
                "        isPrime = false;\n" +
                "    }\n" +
                "    else {\n" +
                "        for(int j = 2; j <= n/2; ++j) {\n" +
                "            if (n%j == 0) {\n" +
                "                isPrime = false;\n" +
                "                break;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    return isPrime;\n" +
                "}\n");

        function6Java = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        function6Python = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        function7Algo = new String("1.\tFirst give a meaningful name to our function, say printStrongNumbers(). Along with this we must define function to find factorial of a number, say long long fact(int num);.\n" +
                "2.\tNext we need to print strong numbers in range. Therefore, the function must accept two integer parameters start and end limit of strong numbers.\n" +
                "3.\tFinally the function simply prints strong numbers in range and returns nothing.\n");

        function7c = new String("#include <stdio.h>\n" +
                "\n" +
                "/* Function declaration */\n" +
                "long long fact(int num);\n" +
                "void printStrongNumbers(int start, int end);\n" +
                "\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int start, end;\n" +
                "    \n" +
                "    /* Input start and end range */\n" +
                "    printf(\"Enter the lower limit to find strong number: \");\n" +
                "    scanf(\"%d\", &start);\n" +
                "    printf(\"Enter the upper limit to find strong number: \");\n" +
                "    scanf(\"%d\", &end);\n" +
                "    \n" +
                "    printf(\"All strong numbers between %d to %d are: \\n\", start, end);\n" +
                "    printStrongNumbers(start, end);\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Print all strong numbers in a given range\n" +
                " */\n" +
                "void printStrongNumbers(int start, int end)\n" +
                "{\n" +
                "    long long sum;\n" +
                "    int num;\n" +
                "    \n" +
                "    // Iterates from start to end\n" +
                "    while(start != end)\n" +
                "    {\n" +
                "        sum = 0;\n" +
                "        num = start;\n" +
                "        \n" +
                "        // Calculate sum of factorial of digits\n" +
                "        while(num != 0)\n" +
                "        {\n" +
                "            sum += fact(num % 10);\n" +
                "            num /= 10; \n" +
                "        }\n" +
                "        \n" +
                "        // If sum of factorial of digits equal to current number\n" +
                "        if(start == sum)\n" +
                "        {\n" +
                "            printf(\"%d, \", start);\n" +
                "        }\n" +
                "        \n" +
                "        start++;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Recursively find factorial of any number\n" +
                " */\n" +
                "long long fact(int num)\n" +
                "{\n" +
                "    if(num == 0)\n" +
                "        return 1;\n" +
                "    else\n" +
                "        return (num * fact(num-1));\n" +
                "}\n");

        function7Cpp = new String("#include <iostream>\n" +
                "using namespace std;\n" +
                " \n" +
                "// Function declarations\n" +
                "long long fact(int num);\n" +
                "void printStrongNumbers(int start, int end);\n" +
                " \n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "    int start, end;\n" +
                " \n" +
                "    /* Input start and end range */\n" +
                "    cout<<\"Enter the lower limit: \";\n" +
                "    cin>>start;\n" +
                "    cout<<\"Enter the upper limit: \";\n" +
                "    cin>>end;\n" +
                " \n" +
                "    cout<<\"List of strong numbers between\"<<start<<\"to \"<<end << \" are: \"<<endl;\n" +
                "    printStrongNumbers(start, end);\n" +
                " \n" +
                "    return 0;\n" +
                "}\n" +
                "//Printing all strong numbers in a given range\n" +
                "void printStrongNumbers(int start, int end)\n" +
                "{\n" +
                "    long long sum;\n" +
                "    int num;\n" +
                " \n" +
                "    // Iterates from start to end\n" +
                "    while(start != end)\n" +
                "    {\n" +
                "        sum = 0;\n" +
                "        num = start;\n" +
                " \n" +
                "        // Calculating sum of factorial of digits\n" +
                "        while(num != 0)\n" +
                "        {\n" +
                "            sum += fact(num % 10);\n" +
                "            num /= 10;\n" +
                "        }\n" +
                " \n" +
                "        // If sum of factorial of digits equal to current number\n" +
                "        if(start == sum)\n" +
                "        {\n" +
                "           cout<<start<<endl;\n" +
                "        }\n" +
                " \n" +
                "        start++;\n" +
                "    }\n" +
                "}\n" +
                " \n" +
                "//Recursively find factorial of any number\n" +
                "long long fact(int num)\n" +
                "{\n" +
                "    if(num == 0)\n" +
                "        return 1;\n" +
                "    else\n" +
                "        return (num * fact(num-1));\n" +
                "}\n");

        function7Java = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        function7Python = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        function8Algo = new String("1.\tFirst give a meaningful name to function. Say printArmstrong() function prints all Armstrong numbers in given range.\n" +
                "2.\tNext the function prints Armstrong number in given range. Hence, we must pass two integer parameters to the function, say printArmstrong(int start, int end);.\n" +
                "3.\tFinally the function prints all Armstrong numbers in given range returning nothing. Therefore, return type of the function must be void.\n");

        function8c = new String("#include <stdio.h>\n" +
                "\n" +
                "/* Function declarations */ \n" +
                "int isArmstrong(int num);\n" +
                "void printArmstrong(int start, int end);\n" +
                "\n" +
                "\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int start, end;\n" +
                "    \n" +
                "    /* Input lower and upper limit to of armstrong numbers */\n" +
                "    printf(\"Enter lower limit to print armstrong numbers: \");\n" +
                "    scanf(\"%d\", &start);\n" +
                "    printf(\"Enter upper limit to print armstrong numbers: \");\n" +
                "    scanf(\"%d\", &end);\n" +
                "    \n" +
                "    printf(\"All armstrong numbers between %d to %d are: \\n\", start, end);\n" +
                "    printArmstrong(start, end);\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Check whether the given number is armstrong number or not.\n" +
                " * Returns 1 if the number is armstrong otherwise 0.\n" +
                " */\n" +
                "int isArmstrong(int num)\n" +
                "{\n" +
                "    int temp, lastDigit, sum;\n" +
                "    \n" +
                "    temp = num;\n" +
                "    sum = 0;\n" +
                "    \n" +
                "    /* Calculate sum of cube of digits */\n" +
                "    while(temp != 0)\n" +
                "    {\n" +
                "        lastDigit = temp % 10;\n" +
                "        sum += lastDigit * lastDigit * lastDigit;\n" +
                "        temp /= 10;\n" +
                "    }\n" +
                "    \n" +
                "    /* \n" +
                "     * Check if sum of cube of digits equals\n" +
                "     * to original number.\n" +
                "     */\n" +
                "    if(num == sum)\n" +
                "        return 1;\n" +
                "    else \n" +
                "        return 0;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Print all armstrong numbers between start and end. \n" +
                " */\n" +
                "void printArmstrong(int start, int end)\n" +
                "{\n" +
                "    /* \n" +
                "     * Iterates from start to end and print the current number \n" +
                "     * if it is armstrong\n" +
                "     */\n" +
                "    while(start <= end)\n" +
                "    {\n" +
                "        if(isArmstrong(start)) \n" +
                "        {\n" +
                "            printf(\"%d, \", start);\n" +
                "        }\n" +
                "        \n" +
                "        start++;\n" +
                "    }\n" +
                "}\n");

        function8Cpp = new String("#include <iostream>\n" +
                "using namespace std;\n" +
                "  int getCubicSumOfDigits(int number){\n" +
                "    int lastDigit, sum = 0;\n" +
                "    while(number != 0){\n" +
                "        lastDigit = number%10;\n" +
                "        sum = sum + lastDigit*lastDigit*lastDigit;\n" +
                "        number = number/10;\n" +
                "    }\n" +
                "    return sum;\n" +
                "}\n" +
                " \n" +
                "int main(){\n" +
                "    int x, y, sum, i;\n" +
                "     \n" +
                "    cout << \"Enter two integers\\n\";\n" +
                "    cin >> x >> y;\n" +
                "     \n" +
                " cout << \"Armstrong numbers between \" << x <<\" and \"<< y << endl;\n" +
                "    // Iterate from x till y, and check for Armstrong number\n" +
                "    for(i = x; i <= y; i++){\n" +
                "        sum = getCubicSumOfDigits(i);\n" +
                "        if(sum == i){\n" +
                "            cout << i << endl;\n" +
                "        }\n" +
                "    }\n" +
                " \n" +
                "    return 0;\n" +
                "}\n");

        function8Java = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        function8Python = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        function9Algo = new String("1.\tFirst give meaningful name to the function. Say printPerfect() will print all perfect numbers in given range. Along with this declare and define one more function int isPerfect(int num); to check perfect number.\n" +
                "2.\tNext the function must accept two parameters i.e. start and end limit to print perfect numbers in range. Hence, the function declaration should look like printPerfect(int start, int end);\n" +
                "3.\tFinally the function prints all perfect numbers in given range returning nothing. Hence, return type of the function must be void.\n");

        function9c = new String("#include <stdio.h>\n" +
                "\n" +
                "\n" +
                "/* Function declarations */\n" +
                "int isPerfect(int num);\n" +
                "void printPerfect(int start, int end);\n" +
                "\n" +
                "\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int start, end;\n" +
                "    \n" +
                "    /* Input lower and upper limit to print perfect numbers */\n" +
                "    printf(\"Enter lower limit to print perfect numbers: \");\n" +
                "    scanf(\"%d\", &start);\n" +
                "    printf(\"Enter upper limit to print perfect numbers: \");\n" +
                "    scanf(\"%d\", &end);\n" +
                "    \n" +
                "    printf(\"All perfect numbers between %d to %d are: \\n\", start, end);\n" +
                "    printPerfect(start, end);\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Check whether the given number is perfect or not.\n" +
                " * Returns 1 if the number is perfect otherwise 0.\n" +
                " */\n" +
                "int isPerfect(int num)\n" +
                "{\n" +
                "    int i, sum;\n" +
                "    \n" +
                "    /* Finds sum of all proper divisors */\n" +
                "    sum = 0;\n" +
                "    for(i=1; i<num; i++)\n" +
                "    {\n" +
                "        if(num % i == 0)\n" +
                "        {\n" +
                "            sum += i;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    /* \n" +
                "     * If sum of proper positive divisors equals to given number \n" +
                "     * then the number is perfect number\n" +
                "     */\n" +
                "    if(sum == num)\n" +
                "        return 1;\n" +
                "    else\n" +
                "        return 0;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "/**\n" +
                " * Print all perfect numbers between given range start and end.\n" +
                " */\n" +
                "void printPerfect(int start, int end)\n" +
                "{\n" +
                "    /* Iterates from start to end */\n" +
                "    while(start <= end)\n" +
                "    {\n" +
                "        if(isPerfect(start))\n" +
                "        {\n" +
                "            printf(\"%d, \", start);\n" +
                "        }\n" +
                "        \n" +
                "        start++;\n" +
                "    }   \n" +
                "}\n");

        function9Cpp = new String("#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "bool isPerfect(int no)\n" +
                "{\n" +
                "\tint i = 0;\n" +
                "\tint sum = 0;\n" +
                "\n" +
                "\twhile (i++ < no)\n" +
                "\t{\n" +
                "\t\tif (no % i == 0 && i < no)\n" +
                "\t\t{\n" +
                "\t\t\tsum += i;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\treturn sum == no;\n" +
                "}\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "\tfloat first;\n" +
                "\tfloat second;\n" +
                "\tcout << \"Enter the first number of the range : \" << endl; cin >> first;\n" +
                "\tcout << \"Enter the second number of the range : \" << endl; cin >> second;\n" +
                "\n" +
                "\tcout << \"Perfect numbers between \" << first << \" and \" << second << \" :\" << endl;\n" +
                "\tfor (int i = first; i <= second; i++)\n" +
                "\t{\n" +
                "\t\tif (isPerfect(i))\n" +
                "\t\t{\n" +
                "\t\t\tcout << i << endl;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\n" +
                "\treturn 0;\n" +
                "}\n");

        function9Java = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        function9Python = new String("Research has not yet been completed…\n" +
                "Thank You for using our App…\n" +
                "keep supporting us…\n");

        intent = getIntent();
        condition = intent.getIntExtra("condition", 0);

        switch (condition) {
            case 1:
                ifElseProblems();
                break;
            case 2:
                arrayProblems();
                break;
            case 3:
                functionProblems();
                break;
            case 4:
                pointerProblems();
                break;
            case 5:
                loopingProblems();
                break;
            case 6:
                patternProblems();
                break;
        }

        customAdapterForRecyclerView = new CustomAdapterForRecyclerView(MainActivity.this, problemsTitleList);
        recyclerView.setAdapter(customAdapterForRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void ifElseProblems() {
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.ifElseProbOne), ifElse1c, ifElse1cpp, ifElse1Java, ifElse1Python, ifElseAlgo1));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.ifElseProbTwo), ifElse2c, ifElse2cpp, ifElse2Java, ifElse2Python, ifElseAlgo2));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.ifElseProbThree), ifElse3c, ifElse3cpp, ifElse3Java, ifElse3Python, ifElseAlgo3));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.ifElseProbFour), ifElse4c, ifElse4cpp, ifElse4Java, ifElse4Python, ifElseAlgo4));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.ifElseProbFive), ifElse5c, ifElse5cpp, ifElse5Java, ifElse5Python, ifElseAlgo5));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.ifElseProbSix), ifElse6c, ifElse6cpp, ifElse6Java, ifElse6Python, ifElseAlgo6));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.ifElseProbSeven), ifElse7c, ifElse7cpp, ifElse7Java, ifElse7Python, ifElseAlgo7));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.ifElseProbEight), ifElse8c, ifElse8cpp, ifElse8Java, ifElse8Python, ifElseAlgo8));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.ifElseProbNine), ifElse9c, ifElse9cpp, ifElse9Java, ifElse9Python, ifElseAlgo9));
    }

    private void arrayProblems() {
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbOne), array1c, array1Cpp, array1Java, array1Python, array1Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbTwo), array2c, array2Cpp, array2Java, array2Python, array2Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbThree), array3c, array3Cpp, array3Java, array3Python, array3Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbFour), array4c, array4Cpp, array4Java, array4Python, array4Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbFive), array5c, array5Cpp, array5Java, array5Python, array5Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbSix), array6c, array6Cpp, array6Java, array6Python, array6Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbSeven), array7c, array7Cpp, array7Java, array7Python, array7Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbEight), array8c, array8Cpp, array8Java, array8Python, array8Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbNine), array9c, array9Cpp, array9Java, array9Python, array9Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbTen), array10c, array10Cpp, array10Java, array10Python, array10Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbEleven), array11c, array11Cpp, array11Java, array11Python, array11Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbTwelve), array12c, array12Cpp, array12Java, array12Python, array12Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbThirteen), array13c, array13Cpp, array13Java, array13Python, array13Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbFourteen), array14c, array14Cpp, array14Java, array14Python, array14Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.arrayProbFifteen), array15c, array15Cpp, array15Java, array15Python, array15Algo));
    }

    private void functionProblems() {
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.functionProbOne), function1c, function1Cpp, function1Java, function1Python, function1Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.functionProbTwo), function2c, function2Cpp, function2Java, function2Python, function2Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.functionProbThree), function3c, function3Cpp, function3Java, function3Python, function3Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.functionProbFour), function4c, function4Cpp, function4Java, function4Python, function4Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.functionProbFive), function5c, function5Cpp, function5Java, function5Python, function5Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.functionProbSix), function6c, function6Cpp, function6Java, function6Python, function6Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.functionProbSeven), function7c, function7Cpp, function7Java, function7Python, function7Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.functionProbEight), function8c, function8Cpp, function8Java, function8Python, function8Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.functionProbNine), function9c, function9Cpp, function9Java, function9Python, function9Algo));
    }

    private void pointerProblems() {
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbOne), array1c, array1Cpp, array1Java, array1Python, array1Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbTwo), array2c, array2Cpp, array2Java, array2Python, array2Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbThree), array3c, array3Cpp, array3Java, array3Python, array3Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbFour), array4c, array4Cpp, array4Java, array4Python, array4Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbFive), array5c, array5Cpp, array5Java, array5Python, array5Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbSix), array6c, array6Cpp, array6Java, array6Python, array6Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbSeven), array7c, array7Cpp, array7Java, array7Python, array7Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbEight), array8c, array8Cpp, array8Java, array8Python, array8Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbNine), array9c, array9Cpp, array9Java, array9Python, array9Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbTen), array10c, array10Cpp, array10Java, array10Python, array10Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbEleven), array11c, array11Cpp, array11Java, array11Python, array11Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbTwelve), array12c, array12Cpp, array12Java, array12Python, array12Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbThirteen), array13c, array13Cpp, array13Java, array13Python, array13Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbFourteen), array14c, array14Cpp, array14Java, array14Python, array14Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbFifteen), array15c, array15Cpp, array15Java, array15Python, array15Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbSixteen), array15c, array15Cpp, array15Java, array15Python, array15Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbSeventeen), array15c, array15Cpp, array15Java, array15Python, array15Algo));
    }

    private void loopingProblems () {
        problemsTitle = getResources().getStringArray(R.array.loop_related_problems);

        for (String s : problemsTitle)
            problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(s, array15c, array15Cpp, array15Java, array15Python, array15Algo));
        }
    private void patternProblems () {
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbThree), array3c, array3Cpp, array3Java, array3Python, array3Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbFour), array4c, array4Cpp, array4Java, array4Python, array4Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbFive), array5c, array5Cpp, array5Java, array5Python, array5Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbSix), array6c, array6Cpp, array6Java, array6Python, array6Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbSeven), array7c, array7Cpp, array7Java, array7Python, array7Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbEight), array8c, array8Cpp, array8Java, array8Python, array8Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbNine), array9c, array9Cpp, array9Java, array9Python, array9Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbTen), array10c, array10Cpp, array10Java, array10Python, array10Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbEleven), array11c, array11Cpp, array11Java, array11Python, array11Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbTwelve), array12c, array12Cpp, array12Java, array12Python, array12Algo));
        problemsTitleList.add(new ProblemsTitleAndSolutionsModelClass(getResources().getString(R.string.pointerProbThirteen), array13c, array13Cpp, array13Java, array13Python, array13Algo));
    }
}