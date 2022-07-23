class Main {
//                Methods: 
//Its written inside a class.
// Using of void method:
  // static void lol(){
  // System.out.println("bro i return nothing, which is void XD") ; 
  // }
/* static int logic(int x, int y){
    int z;
    if(x>y){
      z = x+y;
    }
    else {
      z = (x + y) * 5;
    }
    return z;
  } */
  
  // static void change(int [] arr){
  //   arr[0]= 87;
  // }

 //           Method Overloading:
  // same name can be used to make methods but can still work as differnet.
  // static void foo(){
  //   System.out.printf("good morning bro!\n\n");
  // }
  // static void foo(int a){
  //   System.out.printf("good morning\t" +a+ "\tbro!");
  // }


//               VarArgs:
 // static int sum(int ...arr){
 //   int result = 0;
 //   for(int a: arr){
 //     result += a;
 //   }
 //   return result;
 // }

  
public static void main(String[] args) {
  
  //way 1 to call methods:
 /*  int a = 3, b = 6;
  int c = logic(a, b);
  int a1=3, b1= 2;
  int c1 = logic(a1, b1);
  System.out.println(c);
  System.out.println(c1); */

  
//way 2 to call methods:if we ain't using static.
 /* int a = 3, b = 6;
  Main obj = new Main();
  int c = obj.logic(a, b);
  int a1=3, b1= 2;
  int c1 = obj.logic(a1, b1);
  System.out.println(c);
  System.out.println(c1); */
// lol();

  //changing the array
  
  // int [] arr= {12,44,22,66,88};
  // change(arr);
  // System.out.println(arr[0]);

  // foo();
  // int c = 1000;
  // foo(c);

  // System.out.printf("value of 2, 3, 5, 6:\t" + sum(2, 3, 5, 6));
  }
}

