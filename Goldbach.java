import java.util.*;
class Goldbach
{int n;
    boolean Isprime(int n, int i)
    {if(i==n)
        {return true;

        }
        else{ if (n%i== 0)
            {return false;}
            else{return Isprime(n,i+1);
            }
        } 
    }

    void CheckNo(int num)
    {int i,j;
        for (i=3; i<num/2; i= i+2)
        {if (Isprime(i,2) == true && Isprime(num-i,2))
            {System.out.print("("+i+","+(num-i)+")");
                    }
                }
            }
        
        public static void main()
    {Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter a number");
        x = sc.nextInt();
        if (x%2 != 0 || x<=4)
        {System.out.println("It is not a Goldbach Number");}
        Goldbach ob = new Goldbach();
        ob.CheckNo(x);
    }
}

