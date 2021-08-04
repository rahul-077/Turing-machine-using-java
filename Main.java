package main;
import tm.*;
public class Main
{
public static void main(String[] args)
{
TuringMachine TM1 = MachinesLibrary.EqualBinaryWords();
boolean done = TM1.Run("10#11", false);
if (done==true)
{
System.out.println("The input was accepted.");
}
else
{
System.out.println("The input was rejected.");
}
}
}