This is my solution to the problem "Another Candies" from Kattis, the entire problem can be found at:
https://open.kattis.com/problems/anothercandies

The solution is pretty straightforward, the tricky part was to figure out exactly how to approach the problem.
After reading through the problem a few times I realized that I only needed to check if the total amount of
candies could be evenly divided by the amount of children. If the modulo operation returned 0, that
would mean that every child would get exactly 1 candy each.

The total number of candies is represented by a BigInteger instance because each child has less than
2^63 candies, meaning an integer would not be big enough. The program did not pass all the tests
when I used the long data type to represent the total candies, so I used BigInteger instead and it passed all the tests.