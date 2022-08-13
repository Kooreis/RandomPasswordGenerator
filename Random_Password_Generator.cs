```CSharp
using System;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter the length of the password: ");
        int length = int.Parse(Console.ReadLine());
        Console.WriteLine(GeneratePassword(length));
    }

    static string GeneratePassword(int length)
    {
        const string valid = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        return new string(Enumerable.Repeat(valid, length)
          .Select(s => s[new Random().Next(s.Length)]).ToArray());
    }
}
```