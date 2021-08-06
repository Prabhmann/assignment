1. Can you implement the sing() method for the bird? -> Implemented the sing method for bird
1. How did you unit test it? -> Unit test cases for testing fly and sing for bird.
2. How did you optimize the code for maintainability? (Ask yourself the same
question for all following exercises ) -> For maintainability, made interfaces for fly and sing functionality as there can be a chance that a bird can't fly.

2. Now, we have 2 special kinds of birds: the Duck and the Chicken ... Can you
implement them to make their own special sound? -> created duck sound and chicken sound classes which implements Sound interface and implements there own functionality

3. Now how would you model a rooster?  Rooster is a type of chicken with a different sound. Chicken has a method now to set if its a rooster. -> Rooster is a special kind of chicken, so rooster object of type chicken with a special sound property. Modeled rooster without inheritance and enhanced chicken to support rooster as well.

4. Can you model a parrot? We are specifically interested in three parrots, one that lived
in a house with dogs one in a house with cats , the other lived on a farm next to
the rooster -> Modeled parrot such that it takes sound property from the animal parrot is living with. Added unit test cases to test the same.

B
1. In addition to the birds, can you model a fish?
1. Fish es don’t sing
2. Fish es don’t walk
3. Fish es can swim   -> Fish extends Animal and defines a swim behaviour.

2. Can you specialize the fish as a Shark and as a Clownfish?
1. Sharks are large and grey
2. Clownfish are small and colourful (orange)
3. Clownfish make jokes
4. Sharks eat other fish -> Special type fishes extends Fish and define there properties of color, size and eating habits.

3. Dolphin s are not exactly f ish, yet, they are good swimmers
1. Can you model a dolphin that swims without inheriting from a fish class?
2. How do you avoid duplicating code or introducing unneeded overhead? ->  Dolphin is a special class that only defines swim behavior. 

1. Can you model a butterfly?
1. A butterfly can fly
2. A butterfly does not make a sound
2. Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?
1. A caterpillar cannot fly
2. A caterpillar can walk (crawl)  -> Catterpillar has walk behaviour and has a method to evolve to butterfly. In that case it can change its fly property.
