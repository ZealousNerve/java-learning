/* in this package there are three files first move the main file outside the folder and rest of the files should be insde a folder
named PackgJava, until then it will show an error */


import PackgJava.AdvCalc;
import PackgJava.Calc;
// import PackgJava.*;

//now lets import some standard libraries
import java.util.ArrayList;
// in the above line, folder in our main directory is java, inside which there is util folder and inside that we have ArrayList Class
//thats why at each step a period(.) is there.

/* generally in folder structure we use slash / but in this java we use dot to show folder */


//by default every java files has one line or one package imported and that is
import java.util.*;
//star represents that all the files inside java.util is imported

public class PackagesInJava{
    public static void main(String[] args) {

        AdvCalc obj = new AdvCalc();
        ArrayList obj1 = new ArrayList();
        obj.show();
        obj.show1();
        System.out.println("hi");

        //this is a main files and all the other files for this is stored in a package
        //named PackgJava, 

        /* it is always good practice to store the class files in one folder or package, and the main file
        outside that folder or package*/

        /* in inheritance folder all the files were in the same package including main also, and thats why only one statement at the very start of the codes 
        were enough i.e. package inheritance */

        /* but here in this case that line would be written in only those files which are there in the package inside it
        as the main is not inside that packgjava in order to use those class files or any files in our main we have to import that files in our main
        
        the statement to import is 
        import PackageName.ClassName 
        as show in the very first line of our code*/
    }
}