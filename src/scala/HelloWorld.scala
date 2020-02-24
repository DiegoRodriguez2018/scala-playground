object HelloWorld {
   /* This is my first java program.
   * This will print 'Hello World' as the output
   */
   def main(args: Array[String]) {
       var counter: Int = 0;
       var message : String = "Hola Mundo";
       counter = counter +  1;
       counter +=2;

       var bigDecimal = BigDecimal("4.56398239084239432942377363264236234239329409840923849")
       var bigInt = BigInt("456398239084239432942377363264236234239329409840923849")

      var num: Int= 1000;


      println(message); // prints Hello World
      println(counter);
      println(bigDecimal)
      mathStuff();

      println(canVote(19))

      var i = 0;
      while (i<=10){
         println(i)
         i +=1;
      }

      println(getSum(2,2))
   }

   def mathStuff(){
      import scala.math._;
      println(abs(-9));
   }


   def getSum (num1: Int, num2:Int): Int = {
      num1+num2;
   }


   def canVote(age:Int): Boolean = {
      // conditionals return a value

      if (age>18) true else false;

   }
}
